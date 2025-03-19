/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.PatchTransfer;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdateTransferRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String transferID;
    private String accountID;
    private PatchTransfer patchTransfer;
    private final SDKMethodInterfaces.MethodCallUpdateTransfer sdk;

    public UpdateTransferRequestBuilder(SDKMethodInterfaces.MethodCallUpdateTransfer sdk) {
        this.sdk = sdk;
    }
                
    public UpdateTransferRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public UpdateTransferRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UpdateTransferRequestBuilder transferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
        return this;
    }

    public UpdateTransferRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdateTransferRequestBuilder patchTransfer(PatchTransfer patchTransfer) {
        Utils.checkNotNull(patchTransfer, "patchTransfer");
        this.patchTransfer = patchTransfer;
        return this;
    }

    public UpdateTransferResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.update(
            xMoovVersion,
            transferID,
            accountID,
            patchTransfer);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
