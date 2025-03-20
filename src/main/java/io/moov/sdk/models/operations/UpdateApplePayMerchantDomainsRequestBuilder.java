/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.UpdateApplePayMerchantDomains;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class UpdateApplePayMerchantDomainsRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private UpdateApplePayMerchantDomains updateApplePayMerchantDomains;
    private final SDKMethodInterfaces.MethodCallUpdateApplePayMerchantDomains sdk;

    public UpdateApplePayMerchantDomainsRequestBuilder(SDKMethodInterfaces.MethodCallUpdateApplePayMerchantDomains sdk) {
        this.sdk = sdk;
    }
                
    public UpdateApplePayMerchantDomainsRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public UpdateApplePayMerchantDomainsRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UpdateApplePayMerchantDomainsRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdateApplePayMerchantDomainsRequestBuilder updateApplePayMerchantDomains(UpdateApplePayMerchantDomains updateApplePayMerchantDomains) {
        Utils.checkNotNull(updateApplePayMerchantDomains, "updateApplePayMerchantDomains");
        this.updateApplePayMerchantDomains = updateApplePayMerchantDomains;
        return this;
    }

    public UpdateApplePayMerchantDomainsResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.updateMerchantDomains(
            xMoovVersion,
            accountID,
            updateApplePayMerchantDomains);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
