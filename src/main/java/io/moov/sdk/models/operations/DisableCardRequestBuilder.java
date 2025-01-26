/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class DisableCardRequestBuilder {

    private DisableCardSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String cardID;
    private final SDKMethodInterfaces.MethodCallDisableCard sdk;

    public DisableCardRequestBuilder(SDKMethodInterfaces.MethodCallDisableCard sdk) {
        this.sdk = sdk;
    }

    public DisableCardRequestBuilder security(DisableCardSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public DisableCardRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public DisableCardRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public DisableCardRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public DisableCardRequestBuilder cardID(String cardID) {
        Utils.checkNotNull(cardID, "cardID");
        this.cardID = cardID;
        return this;
    }

    public DisableCardResponse call() throws Exception {

        return sdk.disable(
            security,
            xMoovVersion,
            accountID,
            cardID);
    }
}
