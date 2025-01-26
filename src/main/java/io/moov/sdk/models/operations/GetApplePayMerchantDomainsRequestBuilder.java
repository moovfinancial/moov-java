/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetApplePayMerchantDomainsRequestBuilder {

    private GetApplePayMerchantDomainsSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private final SDKMethodInterfaces.MethodCallGetApplePayMerchantDomains sdk;

    public GetApplePayMerchantDomainsRequestBuilder(SDKMethodInterfaces.MethodCallGetApplePayMerchantDomains sdk) {
        this.sdk = sdk;
    }

    public GetApplePayMerchantDomainsRequestBuilder security(GetApplePayMerchantDomainsSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public GetApplePayMerchantDomainsRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetApplePayMerchantDomainsRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetApplePayMerchantDomainsRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetApplePayMerchantDomainsResponse call() throws Exception {

        return sdk.getMerchantDomains(
            security,
            xMoovVersion,
            accountID);
    }
}
