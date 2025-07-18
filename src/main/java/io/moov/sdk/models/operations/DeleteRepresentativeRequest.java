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


public class DeleteRepresentativeRequest {
    /**
     * ID of the account.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    /**
     * ID of the representative.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=representativeID")
    private String representativeID;

    @JsonCreator
    public DeleteRepresentativeRequest(
            String accountID,
            String representativeID) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(representativeID, "representativeID");
        this.accountID = accountID;
        this.representativeID = representativeID;
    }

    /**
     * ID of the account.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    /**
     * ID of the representative.
     */
    @JsonIgnore
    public String representativeID() {
        return representativeID;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the account.
     */
    public DeleteRepresentativeRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * ID of the representative.
     */
    public DeleteRepresentativeRequest withRepresentativeID(String representativeID) {
        Utils.checkNotNull(representativeID, "representativeID");
        this.representativeID = representativeID;
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
        DeleteRepresentativeRequest other = (DeleteRepresentativeRequest) o;
        return 
            Utils.enhancedDeepEquals(this.accountID, other.accountID) &&
            Utils.enhancedDeepEquals(this.representativeID, other.representativeID);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountID, representativeID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteRepresentativeRequest.class,
                "accountID", accountID,
                "representativeID", representativeID);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String accountID;

        private String representativeID;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * ID of the account.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }


        /**
         * ID of the representative.
         */
        public Builder representativeID(String representativeID) {
            Utils.checkNotNull(representativeID, "representativeID");
            this.representativeID = representativeID;
            return this;
        }

        public DeleteRepresentativeRequest build() {

            return new DeleteRepresentativeRequest(
                accountID, representativeID);
        }

    }
}
