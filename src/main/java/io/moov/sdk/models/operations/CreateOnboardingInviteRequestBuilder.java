/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.OnboardingInviteRequest;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.util.Optional;

public class CreateOnboardingInviteRequestBuilder {

    private CreateOnboardingInviteSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private OnboardingInviteRequest onboardingInviteRequest;
    private final SDKMethodInterfaces.MethodCallCreateOnboardingInvite sdk;

    public CreateOnboardingInviteRequestBuilder(SDKMethodInterfaces.MethodCallCreateOnboardingInvite sdk) {
        this.sdk = sdk;
    }

    public CreateOnboardingInviteRequestBuilder security(CreateOnboardingInviteSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public CreateOnboardingInviteRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public CreateOnboardingInviteRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
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

        return sdk.createInvite(
            security,
            xMoovVersion,
            onboardingInviteRequest);
    }
}
