/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.PatchSweepConfig;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdateSweepConfigRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private String sweepConfigID;
    private PatchSweepConfig patchSweepConfig;
    private final SDKMethodInterfaces.MethodCallUpdateSweepConfig sdk;

    public UpdateSweepConfigRequestBuilder(SDKMethodInterfaces.MethodCallUpdateSweepConfig sdk) {
        this.sdk = sdk;
    }
                
    public UpdateSweepConfigRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public UpdateSweepConfigRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UpdateSweepConfigRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdateSweepConfigRequestBuilder sweepConfigID(String sweepConfigID) {
        Utils.checkNotNull(sweepConfigID, "sweepConfigID");
        this.sweepConfigID = sweepConfigID;
        return this;
    }

    public UpdateSweepConfigRequestBuilder patchSweepConfig(PatchSweepConfig patchSweepConfig) {
        Utils.checkNotNull(patchSweepConfig, "patchSweepConfig");
        this.patchSweepConfig = patchSweepConfig;
        return this;
    }

    public UpdateSweepConfigResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.updateConfig(
            xMoovVersion,
            accountID,
            sweepConfigID,
            patchSweepConfig);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
