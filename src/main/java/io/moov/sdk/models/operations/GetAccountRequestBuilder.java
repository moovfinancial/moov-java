/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetAccountRequestBuilder {

    private GetAccountSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private final SDKMethodInterfaces.MethodCallGetAccount sdk;

    public GetAccountRequestBuilder(SDKMethodInterfaces.MethodCallGetAccount sdk) {
        this.sdk = sdk;
    }

    public GetAccountRequestBuilder security(GetAccountSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public GetAccountRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetAccountRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetAccountRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetAccountResponse call() throws Exception {

        return sdk.get(
            security,
            xMoovVersion,
            accountID);
    }
}
