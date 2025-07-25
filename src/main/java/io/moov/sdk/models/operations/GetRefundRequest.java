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


public class GetRefundRequest {
    /**
     * Identifier for the transfer.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transferID")
    private String transferID;


    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    /**
     * Identifier for the refund.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=refundID")
    private String refundID;

    @JsonCreator
    public GetRefundRequest(
            String transferID,
            String accountID,
            String refundID) {
        Utils.checkNotNull(transferID, "transferID");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(refundID, "refundID");
        this.transferID = transferID;
        this.accountID = accountID;
        this.refundID = refundID;
    }

    /**
     * Identifier for the transfer.
     */
    @JsonIgnore
    public String transferID() {
        return transferID;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    /**
     * Identifier for the refund.
     */
    @JsonIgnore
    public String refundID() {
        return refundID;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Identifier for the transfer.
     */
    public GetRefundRequest withTransferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
        return this;
    }

    public GetRefundRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * Identifier for the refund.
     */
    public GetRefundRequest withRefundID(String refundID) {
        Utils.checkNotNull(refundID, "refundID");
        this.refundID = refundID;
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
        GetRefundRequest other = (GetRefundRequest) o;
        return 
            Utils.enhancedDeepEquals(this.transferID, other.transferID) &&
            Utils.enhancedDeepEquals(this.accountID, other.accountID) &&
            Utils.enhancedDeepEquals(this.refundID, other.refundID);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            transferID, accountID, refundID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRefundRequest.class,
                "transferID", transferID,
                "accountID", accountID,
                "refundID", refundID);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String transferID;

        private String accountID;

        private String refundID;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Identifier for the transfer.
         */
        public Builder transferID(String transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = transferID;
            return this;
        }


        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }


        /**
         * Identifier for the refund.
         */
        public Builder refundID(String refundID) {
            Utils.checkNotNull(refundID, "refundID");
            this.refundID = refundID;
            return this;
        }

        public GetRefundRequest build() {

            return new GetRefundRequest(
                transferID, accountID, refundID);
        }

    }
}
