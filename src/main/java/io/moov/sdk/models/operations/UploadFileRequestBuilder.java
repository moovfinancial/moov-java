/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.FileUploadRequestMultiPart;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class UploadFileRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private FileUploadRequestMultiPart fileUploadRequestMultiPart;
    private final SDKMethodInterfaces.MethodCallUploadFile sdk;

    public UploadFileRequestBuilder(SDKMethodInterfaces.MethodCallUploadFile sdk) {
        this.sdk = sdk;
    }
                
    public UploadFileRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public UploadFileRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UploadFileRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UploadFileRequestBuilder fileUploadRequestMultiPart(FileUploadRequestMultiPart fileUploadRequestMultiPart) {
        Utils.checkNotNull(fileUploadRequestMultiPart, "fileUploadRequestMultiPart");
        this.fileUploadRequestMultiPart = fileUploadRequestMultiPart;
        return this;
    }

    public UploadFileResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.upload(
            xMoovVersion,
            accountID,
            fileUploadRequestMultiPart);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
