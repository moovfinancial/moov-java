package io.moov.sdk.hooks;

// import dev.speakeasyapi.speakeasy.utils.Utils;
// import dev.speakeasyapi.speakeasy.utils.Hook.AfterError;
// import dev.speakeasyapi.speakeasy.utils.Hook.AfterErrorContext;
// import dev.speakeasyapi.speakeasy.utils.Hook.AfterSuccess;
// import dev.speakeasyapi.speakeasy.utils.Hook.AfterSuccessContext;
// import dev.speakeasyapi.speakeasy.utils.Hook.BeforeRequest;
// import dev.speakeasyapi.speakeasy.utils.Hook.BeforeRequestContext;
// import dev.speakeasyapi.speakeasy.utils.Hook.SdkInit;
// import dev.speakeasyapi.speakeasy.utils.Hook.SdkInitData;

import java.io.InputStream;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

import io.moov.sdk.utils.Helpers;
import io.moov.sdk.utils.Hook;
import io.moov.sdk.utils.Hook.BeforeRequestContext;

final class FixDoubleAuthHeader implements Hook.BeforeRequest {

    /**
     * Transforms the given {@link HttpRequest} before sending.
     * 
     * <p>Note that {@link HttpRequest} is immutable. To modify the request you can use
     * {@link HttpRequest#newBuilder(HttpRequest, BiPredicate<String, String>)} with 
     * JDK 16 and later (which will copy the request for modification in a builder). 
     * If that method is not available then use {@link Helpers#copy} (which also returns
     * a builder).
     * 
     * @param context context for the hook call
     * @param request request to be transformed
     * @return transformed request
     * @throws Exception on error
     */
    public HttpRequest beforeRequest(BeforeRequestContext context, HttpRequest request) throws Exception {
        if (request.headers().allValues("Authorization").size() > 1) {
            return request.newBuilder().header("Authorization", request.headers().firstValue("Authorization").get()).build();
        }
        return request;
    }
}