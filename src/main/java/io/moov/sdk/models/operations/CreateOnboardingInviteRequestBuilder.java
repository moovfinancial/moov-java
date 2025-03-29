/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.OnboardingInviteRequest;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class CreateOnboardingInviteRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private OnboardingInviteRequest onboardingInviteRequest;
    private final SDKMethodInterfaces.MethodCallCreateOnboardingInvite sdk;

    public CreateOnboardingInviteRequestBuilder(SDKMethodInterfaces.MethodCallCreateOnboardingInvite sdk) {
        this.sdk = sdk;
    }
                
    public CreateOnboardingInviteRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public CreateOnboardingInviteRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public CreateOnboardingInviteRequestBuilder onboardingInviteRequest(OnboardingInviteRequest onboardingInviteRequest) {
        Utils.checkNotNull(onboardingInviteRequest, "onboardingInviteRequest");
        this.onboardingInviteRequest = onboardingInviteRequest;
        return this;
    }

    public CreateOnboardingInviteResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.createInvite(
            xMoovVersion,
            onboardingInviteRequest);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
