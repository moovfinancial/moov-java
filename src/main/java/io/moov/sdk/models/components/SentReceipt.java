/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

public class SentReceipt {

    /**
     * Unique identifier for the receipt.
     */
    @JsonProperty("receiptID")
    private String receiptID;

    /**
     * The idempotency key used when creating the receipt.
     */
    @JsonProperty("idempotencyKey")
    private String idempotencyKey;

    /**
     * When the receipt was sent.
     */
    @JsonProperty("sentOn")
    private OffsetDateTime sentOn;

    @JsonCreator
    public SentReceipt(
            @JsonProperty("receiptID") String receiptID,
            @JsonProperty("idempotencyKey") String idempotencyKey,
            @JsonProperty("sentOn") OffsetDateTime sentOn) {
        Utils.checkNotNull(receiptID, "receiptID");
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        Utils.checkNotNull(sentOn, "sentOn");
        this.receiptID = receiptID;
        this.idempotencyKey = idempotencyKey;
        this.sentOn = sentOn;
    }

    /**
     * Unique identifier for the receipt.
     */
    @JsonIgnore
    public String receiptID() {
        return receiptID;
    }

    /**
     * The idempotency key used when creating the receipt.
     */
    @JsonIgnore
    public String idempotencyKey() {
        return idempotencyKey;
    }

    /**
     * When the receipt was sent.
     */
    @JsonIgnore
    public OffsetDateTime sentOn() {
        return sentOn;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the receipt.
     */
    public SentReceipt withReceiptID(String receiptID) {
        Utils.checkNotNull(receiptID, "receiptID");
        this.receiptID = receiptID;
        return this;
    }

    /**
     * The idempotency key used when creating the receipt.
     */
    public SentReceipt withIdempotencyKey(String idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    /**
     * When the receipt was sent.
     */
    public SentReceipt withSentOn(OffsetDateTime sentOn) {
        Utils.checkNotNull(sentOn, "sentOn");
        this.sentOn = sentOn;
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
        SentReceipt other = (SentReceipt) o;
        return 
            Objects.deepEquals(this.receiptID, other.receiptID) &&
            Objects.deepEquals(this.idempotencyKey, other.idempotencyKey) &&
            Objects.deepEquals(this.sentOn, other.sentOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            receiptID,
            idempotencyKey,
            sentOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SentReceipt.class,
                "receiptID", receiptID,
                "idempotencyKey", idempotencyKey,
                "sentOn", sentOn);
    }
    
    public final static class Builder {
 
        private String receiptID;
 
        private String idempotencyKey;
 
        private OffsetDateTime sentOn;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for the receipt.
         */
        public Builder receiptID(String receiptID) {
            Utils.checkNotNull(receiptID, "receiptID");
            this.receiptID = receiptID;
            return this;
        }

        /**
         * The idempotency key used when creating the receipt.
         */
        public Builder idempotencyKey(String idempotencyKey) {
            Utils.checkNotNull(idempotencyKey, "idempotencyKey");
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        /**
         * When the receipt was sent.
         */
        public Builder sentOn(OffsetDateTime sentOn) {
            Utils.checkNotNull(sentOn, "sentOn");
            this.sentOn = sentOn;
            return this;
        }
        
        public SentReceipt build() {
            return new SentReceipt(
                receiptID,
                idempotencyKey,
                sentOn);
        }
    }
}

