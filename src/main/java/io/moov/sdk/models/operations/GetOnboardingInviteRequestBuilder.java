/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetOnboardingInviteRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String code;
    private final SDKMethodInterfaces.MethodCallGetOnboardingInvite sdk;

    public GetOnboardingInviteRequestBuilder(SDKMethodInterfaces.MethodCallGetOnboardingInvite sdk) {
        this.sdk = sdk;
    }
                
    public GetOnboardingInviteRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetOnboardingInviteRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetOnboardingInviteRequestBuilder code(String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public GetOnboardingInviteResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.getInvite(
            xMoovVersion,
            code);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
