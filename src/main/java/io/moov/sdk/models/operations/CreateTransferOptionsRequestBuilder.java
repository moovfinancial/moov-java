/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.CreateTransferOptions;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class CreateTransferOptionsRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private CreateTransferOptions createTransferOptions;
    private final SDKMethodInterfaces.MethodCallCreateTransferOptions sdk;

    public CreateTransferOptionsRequestBuilder(SDKMethodInterfaces.MethodCallCreateTransferOptions sdk) {
        this.sdk = sdk;
    }
                
    public CreateTransferOptionsRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public CreateTransferOptionsRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public CreateTransferOptionsRequestBuilder createTransferOptions(CreateTransferOptions createTransferOptions) {
        Utils.checkNotNull(createTransferOptions, "createTransferOptions");
        this.createTransferOptions = createTransferOptions;
        return this;
    }

    public CreateTransferOptionsResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.generateOptions(
            xMoovVersion,
            createTransferOptions);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
