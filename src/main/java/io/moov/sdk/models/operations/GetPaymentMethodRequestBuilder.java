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

public class GetPaymentMethodRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private String paymentMethodID;
    private final SDKMethodInterfaces.MethodCallGetPaymentMethod sdk;

    public GetPaymentMethodRequestBuilder(SDKMethodInterfaces.MethodCallGetPaymentMethod sdk) {
        this.sdk = sdk;
    }
                
    public GetPaymentMethodRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetPaymentMethodRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetPaymentMethodRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetPaymentMethodRequestBuilder paymentMethodID(String paymentMethodID) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        this.paymentMethodID = paymentMethodID;
        return this;
    }

    public GetPaymentMethodResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.get(
            xMoovVersion,
            accountID,
            paymentMethodID);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
