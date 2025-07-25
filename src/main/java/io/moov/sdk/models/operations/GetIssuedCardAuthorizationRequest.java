/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class GetIssuedCardAuthorizationRequest {
    /**
     * The Moov business account for which cards have been issued.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;


    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=authorizationID")
    private String authorizationID;

    @JsonCreator
    public GetIssuedCardAuthorizationRequest(
            String accountID,
            String authorizationID) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(authorizationID, "authorizationID");
        this.accountID = accountID;
        this.authorizationID = authorizationID;
    }

    /**
     * The Moov business account for which cards have been issued.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public String authorizationID() {
        return authorizationID;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The Moov business account for which cards have been issued.
     */
    public GetIssuedCardAuthorizationRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetIssuedCardAuthorizationRequest withAuthorizationID(String authorizationID) {
        Utils.checkNotNull(authorizationID, "authorizationID");
        this.authorizationID = authorizationID;
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
        GetIssuedCardAuthorizationRequest other = (GetIssuedCardAuthorizationRequest) o;
        return 
            Utils.enhancedDeepEquals(this.accountID, other.accountID) &&
            Utils.enhancedDeepEquals(this.authorizationID, other.authorizationID);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountID, authorizationID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetIssuedCardAuthorizationRequest.class,
                "accountID", accountID,
                "authorizationID", authorizationID);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String accountID;

        private String authorizationID;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The Moov business account for which cards have been issued.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }


        public Builder authorizationID(String authorizationID) {
            Utils.checkNotNull(authorizationID, "authorizationID");
            this.authorizationID = authorizationID;
            return this;
        }

        public GetIssuedCardAuthorizationRequest build() {

            return new GetIssuedCardAuthorizationRequest(
                accountID, authorizationID);
        }

    }
}
