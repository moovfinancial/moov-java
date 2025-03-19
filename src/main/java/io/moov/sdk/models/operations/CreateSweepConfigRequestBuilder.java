/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.CreateSweepConfig;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateSweepConfigRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private CreateSweepConfig createSweepConfig;
    private final SDKMethodInterfaces.MethodCallCreateSweepConfig sdk;

    public CreateSweepConfigRequestBuilder(SDKMethodInterfaces.MethodCallCreateSweepConfig sdk) {
        this.sdk = sdk;
    }
                
    public CreateSweepConfigRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public CreateSweepConfigRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public CreateSweepConfigRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public CreateSweepConfigRequestBuilder createSweepConfig(CreateSweepConfig createSweepConfig) {
        Utils.checkNotNull(createSweepConfig, "createSweepConfig");
        this.createSweepConfig = createSweepConfig;
        return this;
    }

    public CreateSweepConfigResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.createConfig(
            xMoovVersion,
            accountID,
            createSweepConfig);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
