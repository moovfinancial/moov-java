/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetBankAccountRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private String bankAccountID;
    private final SDKMethodInterfaces.MethodCallGetBankAccount sdk;

    public GetBankAccountRequestBuilder(SDKMethodInterfaces.MethodCallGetBankAccount sdk) {
        this.sdk = sdk;
    }
                
    public GetBankAccountRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetBankAccountRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetBankAccountRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetBankAccountRequestBuilder bankAccountID(String bankAccountID) {
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        this.bankAccountID = bankAccountID;
        return this;
    }

    public GetBankAccountResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.get(
            xMoovVersion,
            accountID,
            bankAccountID);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
