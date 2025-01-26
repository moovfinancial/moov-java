/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.UpdateIssuedCard;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdateIssuedCardRequestBuilder {

    private UpdateIssuedCardSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String issuedCardID;
    private UpdateIssuedCard updateIssuedCard;
    private final SDKMethodInterfaces.MethodCallUpdateIssuedCard sdk;

    public UpdateIssuedCardRequestBuilder(SDKMethodInterfaces.MethodCallUpdateIssuedCard sdk) {
        this.sdk = sdk;
    }

    public UpdateIssuedCardRequestBuilder security(UpdateIssuedCardSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public UpdateIssuedCardRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public UpdateIssuedCardRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UpdateIssuedCardRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdateIssuedCardRequestBuilder issuedCardID(String issuedCardID) {
        Utils.checkNotNull(issuedCardID, "issuedCardID");
        this.issuedCardID = issuedCardID;
        return this;
    }

    public UpdateIssuedCardRequestBuilder updateIssuedCard(UpdateIssuedCard updateIssuedCard) {
        Utils.checkNotNull(updateIssuedCard, "updateIssuedCard");
        this.updateIssuedCard = updateIssuedCard;
        return this;
    }

    public UpdateIssuedCardResponse call() throws Exception {

        return sdk.update(
            security,
            xMoovVersion,
            accountID,
            issuedCardID,
            updateIssuedCard);
    }
}
