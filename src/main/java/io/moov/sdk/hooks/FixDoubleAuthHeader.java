package io.moov.sdk.hooks;

import java.io.InputStream;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
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

        Optional<String> authHeader = request.headers().firstValue("Authorization");
        
        if (authHeader.isPresent()) {
            HttpRequest.Builder builder = Helpers.copy(request, (name, value) -> !name.equalsIgnoreCase("Authorization"));
            builder.header("Authorization", authHeader.get());
            request = builder.build();
        }
        return request;
    }
}