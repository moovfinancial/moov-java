package io.moov.sdk.hooks;

import io.moov.sdk.utils.Hook;
import io.moov.sdk.SDKConfiguration;

/**
 * SDK initialization hook that adds the x-moov-version header to all requests.
 * This hook sets the version from SDKConfiguration.OPENAPI_DOC_VERSION.
 */
final class MoovVersionHook implements Hook.SdkInit {

    @Override
    public SDKConfiguration sdkInit(SDKConfiguration config) {
        // Add the x-moov-version header to global headers
        config.globals.putParam("header", "X-Moov-Version", SDKConfiguration.OPENAPI_DOC_VERSION);

        return config;
    }
}