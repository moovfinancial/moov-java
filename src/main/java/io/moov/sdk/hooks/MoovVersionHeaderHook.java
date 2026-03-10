package io.moov.sdk.hooks;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.utils.Helpers;
import io.moov.sdk.utils.Hook;
import io.moov.sdk.utils.Hook.BeforeRequestContext;

import java.net.http.HttpRequest;

/**
 * Before-request hook that adds the X-Moov-Version header to all requests.
 * This hook sets the version from SDKConfiguration.OPENAPI_DOC_VERSION.
 */
final class MoovVersionHeaderHook implements Hook.BeforeRequest {

    @Override
    public HttpRequest beforeRequest(BeforeRequestContext context, HttpRequest request) throws Exception {
        HttpRequest.Builder builder = Helpers.copy(request);
        builder.header("X-Moov-Version", SDKConfiguration.OPENAPI_DOC_VERSION);
        return builder.build();
    }
}
