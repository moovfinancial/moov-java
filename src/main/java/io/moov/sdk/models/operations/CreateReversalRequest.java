/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.CreateReversal;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Optional;


public class CreateReversalRequest {
    /**
     * Prevents duplicate reversals from being created.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-idempotency-key")
    private String xIdempotencyKey;

    /**
     * The Moov account ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    /**
     * The transfer ID to reverse.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transferID")
    private String transferID;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CreateReversal> createReversal;

    @JsonCreator
    public CreateReversalRequest(
            String xIdempotencyKey,
            String accountID,
            String transferID,
            Optional<? extends CreateReversal> createReversal) {
        Utils.checkNotNull(xIdempotencyKey, "xIdempotencyKey");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(transferID, "transferID");
        Utils.checkNotNull(createReversal, "createReversal");
        this.xIdempotencyKey = xIdempotencyKey;
        this.accountID = accountID;
        this.transferID = transferID;
        this.createReversal = createReversal;
    }
    
    public CreateReversalRequest(
            String xIdempotencyKey,
            String accountID,
            String transferID) {
        this(xIdempotencyKey, accountID, transferID,
            Optional.empty());
    }

    /**
     * Prevents duplicate reversals from being created.
     */
    @JsonIgnore
    public String xIdempotencyKey() {
        return xIdempotencyKey;
    }

    /**
     * The Moov account ID.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    /**
     * The transfer ID to reverse.
     */
    @JsonIgnore
    public String transferID() {
        return transferID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateReversal> createReversal() {
        return (Optional<CreateReversal>) createReversal;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Prevents duplicate reversals from being created.
     */
    public CreateReversalRequest withXIdempotencyKey(String xIdempotencyKey) {
        Utils.checkNotNull(xIdempotencyKey, "xIdempotencyKey");
        this.xIdempotencyKey = xIdempotencyKey;
        return this;
    }

    /**
     * The Moov account ID.
     */
    public CreateReversalRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * The transfer ID to reverse.
     */
    public CreateReversalRequest withTransferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
        return this;
    }

    public CreateReversalRequest withCreateReversal(CreateReversal createReversal) {
        Utils.checkNotNull(createReversal, "createReversal");
        this.createReversal = Optional.ofNullable(createReversal);
        return this;
    }


    public CreateReversalRequest withCreateReversal(Optional<? extends CreateReversal> createReversal) {
        Utils.checkNotNull(createReversal, "createReversal");
        this.createReversal = createReversal;
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
        CreateReversalRequest other = (CreateReversalRequest) o;
        return 
            Utils.enhancedDeepEquals(this.xIdempotencyKey, other.xIdempotencyKey) &&
            Utils.enhancedDeepEquals(this.accountID, other.accountID) &&
            Utils.enhancedDeepEquals(this.transferID, other.transferID) &&
            Utils.enhancedDeepEquals(this.createReversal, other.createReversal);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            xIdempotencyKey, accountID, transferID,
            createReversal);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateReversalRequest.class,
                "xIdempotencyKey", xIdempotencyKey,
                "accountID", accountID,
                "transferID", transferID,
                "createReversal", createReversal);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String xIdempotencyKey;

        private String accountID;

        private String transferID;

        private Optional<? extends CreateReversal> createReversal = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Prevents duplicate reversals from being created.
         */
        public Builder xIdempotencyKey(String xIdempotencyKey) {
            Utils.checkNotNull(xIdempotencyKey, "xIdempotencyKey");
            this.xIdempotencyKey = xIdempotencyKey;
            return this;
        }


        /**
         * The Moov account ID.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }


        /**
         * The transfer ID to reverse.
         */
        public Builder transferID(String transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = transferID;
            return this;
        }


        public Builder createReversal(CreateReversal createReversal) {
            Utils.checkNotNull(createReversal, "createReversal");
            this.createReversal = Optional.ofNullable(createReversal);
            return this;
        }

        public Builder createReversal(Optional<? extends CreateReversal> createReversal) {
            Utils.checkNotNull(createReversal, "createReversal");
            this.createReversal = createReversal;
            return this;
        }

        public CreateReversalRequest build() {

            return new CreateReversalRequest(
                xIdempotencyKey, accountID, transferID,
                createReversal);
        }

    }
}
