/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.UpdateCard;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class UpdateCardRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;


    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=cardID")
    private String cardID;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private UpdateCard updateCard;

    @JsonCreator
    public UpdateCardRequest(
            String accountID,
            String cardID,
            UpdateCard updateCard) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(cardID, "cardID");
        Utils.checkNotNull(updateCard, "updateCard");
        this.accountID = accountID;
        this.cardID = cardID;
        this.updateCard = updateCard;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public String cardID() {
        return cardID;
    }

    @JsonIgnore
    public UpdateCard updateCard() {
        return updateCard;
    }

    public static Builder builder() {
        return new Builder();
    }


    public UpdateCardRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdateCardRequest withCardID(String cardID) {
        Utils.checkNotNull(cardID, "cardID");
        this.cardID = cardID;
        return this;
    }

    public UpdateCardRequest withUpdateCard(UpdateCard updateCard) {
        Utils.checkNotNull(updateCard, "updateCard");
        this.updateCard = updateCard;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCardRequest other = (UpdateCardRequest) o;
        return 
            Utils.enhancedDeepEquals(this.accountID, other.accountID) &&
            Utils.enhancedDeepEquals(this.cardID, other.cardID) &&
            Utils.enhancedDeepEquals(this.updateCard, other.updateCard);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountID, cardID, updateCard);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateCardRequest.class,
                "accountID", accountID,
                "cardID", cardID,
                "updateCard", updateCard);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String accountID;

        private String cardID;

        private UpdateCard updateCard;

        private Builder() {
          // force use of static builder() method
        }


        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }


        public Builder cardID(String cardID) {
            Utils.checkNotNull(cardID, "cardID");
            this.cardID = cardID;
            return this;
        }


        public Builder updateCard(UpdateCard updateCard) {
            Utils.checkNotNull(updateCard, "updateCard");
            this.updateCard = updateCard;
            return this;
        }

        public UpdateCardRequest build() {

            return new UpdateCardRequest(
                accountID, cardID, updateCard);
        }

    }
}
