/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Flow;
import java.util.concurrent.TimeUnit;
import java.util.function.BiPredicate;

/**
 * Public helper methods for use by customers and end-users.
 *
 */
public final class Helpers {

    /**
     * Returns an {@link HttpRequest.Builder} which is initialized with the 
     * state of the given {@link HttpRequest}. 
     * 
     * <p>Note that headers can be added and modified but not removed. To 
     * remove headers use {@link #copy(HttpRequest, BiPredicate)} (which applies
     * a filter to the headers while copying).
     * 
     * <p>Note also that this method is redundant from JDK 16 because the 
     * method {@code HttpRequest.newBuilder(HttpRequest)} is available.
     * 
     * @param request request to copy
     * @return a builder initialized with values from {@code request}
     */
    public static HttpRequest.Builder copy(HttpRequest request) {
        return Utils.copy(request);
    }
    
    /**
     * Returns an {@link HttpRequest.Builder} which is initialized with the 
     * state of the given {@link HttpRequest}.
     *
     * <p>Note that this method is redundant from JDK 16 because the 
     * method {@code HttpRequest.newBuilder(HttpRequest, BiPredicate)} is available.
      
     * @param request request to copy
     * @param filter selects which header key-values to include in the copied request
     * @return a builder initialized with values from {@code request}
     */
    public static HttpRequest.Builder copy(HttpRequest request, BiPredicate<String, String> filter) {
        return Utils.copy(request, filter); 
    }
    
    
    /**
     * Returns the request body as a byte array.
     * 
     * @param request http request to extract from
     * @return byte array
     */
    public static byte[] bodyBytes(HttpRequest request) {
        return request.bodyPublisher() //
                .map(p -> {
                    ByteBufferSubscriber sub = new ByteBufferSubscriber();
                    p.subscribe(sub);
                    return sub.bytes();
                }).orElse(new byte[] {});
    }

    /**
     * Returns the request body as a String assuming that the bytes of the request
     * body are encoded with UTF-8.
     * 
     * @param request http request to extract from
     * @return request body as a String
     */
    public static String bodyUtf8(HttpRequest request) {
        return new String(bodyBytes(request), StandardCharsets.UTF_8);
    }

    private static final class ByteBufferSubscriber implements Flow.Subscriber<ByteBuffer> {

        private final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        private final CountDownLatch latch = new CountDownLatch(1);

        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            // Retrieve all parts
            subscription.request(Long.MAX_VALUE);
        }

        @Override
        public void onNext(ByteBuffer bb) {
            byte[] buffer = new byte[bb.remaining()];
            bb.get(buffer);
            try {
                bytes.write(buffer);
            } catch (IOException e) {
               onError(e);
            }
        }

        @Override
        public void onError(Throwable throwable) {
            latch.countDown();
            Utils.rethrow(throwable);
        }

        @Override
        public void onComplete() {
            latch.countDown();
        }

        public byte[] bytes() {
            try {
                if (!latch.await(30, TimeUnit.SECONDS)) {
                    throw new RuntimeException("timed out waiting for next byte array");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return bytes.toByteArray();
        }
    }

}
