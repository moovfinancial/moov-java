package io.moov.sdk.hooks;

//
// This file is written once by speakeasy code generation and 
// thereafter will not be overwritten by speakeasy updates. As a
// consequence any customization of this class will be preserved.
//

public final class SDKHooks {

    private SDKHooks() {
        // prevent instantiation
    }

    public static final void initialize(io.moov.sdk.utils.Hooks hooks) {
        // register hooks here
        FixDoubleAuthHeader exampleHook = new FixDoubleAuthHeader();
        hooks.registerBeforeRequest(exampleHook);
        
        // for more information see
        // https://www.speakeasy.com/docs/additional-features/sdk-hooks
    }
}
