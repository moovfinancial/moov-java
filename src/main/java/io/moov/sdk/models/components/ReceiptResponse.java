/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ReceiptResponse {

    /**
     * Unique identifier for the receipt request.
     */
    @JsonProperty("receiptID")
    private String receiptID;

    /**
     * AccountID for which the receipt request was created.
     */
    @JsonProperty("createdBy")
    private String createdBy;

    /**
     * The date and time the receipt was disabled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disabledOn")
    private Optional<OffsetDateTime> disabledOn;

    /**
     * The type of receipt.
     */
    @JsonProperty("kind")
    private ReceiptKind kind;

    /**
     * The email address the receipt is sent to.
     * Either email or emailAccountID will be in the response, but not both.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    /**
     * The accountID the receipt is sent to.
     * Either email or emailAccountID will be in the response, but not both.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailAccountID")
    private Optional<String> emailAccountID;

    /**
     * The ID of the transfer associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("forTransferID")
    private Optional<String> forTransferID;

    /**
     * The ID of the schedule associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("forScheduleID")
    private Optional<String> forScheduleID;

    /**
     * The ID of the schedule occurrence associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("forOccurrenceID")
    private Optional<String> forOccurrenceID;

    /**
     * The list of receipts that have been sent.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sentFor")
    private Optional<? extends List<SentReceipt>> sentFor;

    @JsonCreator
    public ReceiptResponse(
            @JsonProperty("receiptID") String receiptID,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("disabledOn") Optional<OffsetDateTime> disabledOn,
            @JsonProperty("kind") ReceiptKind kind,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("emailAccountID") Optional<String> emailAccountID,
            @JsonProperty("forTransferID") Optional<String> forTransferID,
            @JsonProperty("forScheduleID") Optional<String> forScheduleID,
            @JsonProperty("forOccurrenceID") Optional<String> forOccurrenceID,
            @JsonProperty("sentFor") Optional<? extends List<SentReceipt>> sentFor) {
        Utils.checkNotNull(receiptID, "receiptID");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(disabledOn, "disabledOn");
        Utils.checkNotNull(kind, "kind");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(emailAccountID, "emailAccountID");
        Utils.checkNotNull(forTransferID, "forTransferID");
        Utils.checkNotNull(forScheduleID, "forScheduleID");
        Utils.checkNotNull(forOccurrenceID, "forOccurrenceID");
        Utils.checkNotNull(sentFor, "sentFor");
        this.receiptID = receiptID;
        this.createdBy = createdBy;
        this.disabledOn = disabledOn;
        this.kind = kind;
        this.email = email;
        this.emailAccountID = emailAccountID;
        this.forTransferID = forTransferID;
        this.forScheduleID = forScheduleID;
        this.forOccurrenceID = forOccurrenceID;
        this.sentFor = sentFor;
    }
    
    public ReceiptResponse(
            String receiptID,
            String createdBy,
            ReceiptKind kind) {
        this(receiptID, createdBy, Optional.empty(), kind, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for the receipt request.
     */
    @JsonIgnore
    public String receiptID() {
        return receiptID;
    }

    /**
     * AccountID for which the receipt request was created.
     */
    @JsonIgnore
    public String createdBy() {
        return createdBy;
    }

    /**
     * The date and time the receipt was disabled.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> disabledOn() {
        return disabledOn;
    }

    /**
     * The type of receipt.
     */
    @JsonIgnore
    public ReceiptKind kind() {
        return kind;
    }

    /**
     * The email address the receipt is sent to.
     * Either email or emailAccountID will be in the response, but not both.
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    /**
     * The accountID the receipt is sent to.
     * Either email or emailAccountID will be in the response, but not both.
     */
    @JsonIgnore
    public Optional<String> emailAccountID() {
        return emailAccountID;
    }

    /**
     * The ID of the transfer associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    @JsonIgnore
    public Optional<String> forTransferID() {
        return forTransferID;
    }

    /**
     * The ID of the schedule associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    @JsonIgnore
    public Optional<String> forScheduleID() {
        return forScheduleID;
    }

    /**
     * The ID of the schedule occurrence associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    @JsonIgnore
    public Optional<String> forOccurrenceID() {
        return forOccurrenceID;
    }

    /**
     * The list of receipts that have been sent.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SentReceipt>> sentFor() {
        return (Optional<List<SentReceipt>>) sentFor;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Unique identifier for the receipt request.
     */
    public ReceiptResponse withReceiptID(String receiptID) {
        Utils.checkNotNull(receiptID, "receiptID");
        this.receiptID = receiptID;
        return this;
    }

    /**
     * AccountID for which the receipt request was created.
     */
    public ReceiptResponse withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * The date and time the receipt was disabled.
     */
    public ReceiptResponse withDisabledOn(OffsetDateTime disabledOn) {
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.disabledOn = Optional.ofNullable(disabledOn);
        return this;
    }

    /**
     * The date and time the receipt was disabled.
     */
    public ReceiptResponse withDisabledOn(Optional<OffsetDateTime> disabledOn) {
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.disabledOn = disabledOn;
        return this;
    }

    /**
     * The type of receipt.
     */
    public ReceiptResponse withKind(ReceiptKind kind) {
        Utils.checkNotNull(kind, "kind");
        this.kind = kind;
        return this;
    }

    /**
     * The email address the receipt is sent to.
     * Either email or emailAccountID will be in the response, but not both.
     */
    public ReceiptResponse withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * The email address the receipt is sent to.
     * Either email or emailAccountID will be in the response, but not both.
     */
    public ReceiptResponse withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * The accountID the receipt is sent to.
     * Either email or emailAccountID will be in the response, but not both.
     */
    public ReceiptResponse withEmailAccountID(String emailAccountID) {
        Utils.checkNotNull(emailAccountID, "emailAccountID");
        this.emailAccountID = Optional.ofNullable(emailAccountID);
        return this;
    }

    /**
     * The accountID the receipt is sent to.
     * Either email or emailAccountID will be in the response, but not both.
     */
    public ReceiptResponse withEmailAccountID(Optional<String> emailAccountID) {
        Utils.checkNotNull(emailAccountID, "emailAccountID");
        this.emailAccountID = emailAccountID;
        return this;
    }

    /**
     * The ID of the transfer associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    public ReceiptResponse withForTransferID(String forTransferID) {
        Utils.checkNotNull(forTransferID, "forTransferID");
        this.forTransferID = Optional.ofNullable(forTransferID);
        return this;
    }

    /**
     * The ID of the transfer associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    public ReceiptResponse withForTransferID(Optional<String> forTransferID) {
        Utils.checkNotNull(forTransferID, "forTransferID");
        this.forTransferID = forTransferID;
        return this;
    }

    /**
     * The ID of the schedule associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    public ReceiptResponse withForScheduleID(String forScheduleID) {
        Utils.checkNotNull(forScheduleID, "forScheduleID");
        this.forScheduleID = Optional.ofNullable(forScheduleID);
        return this;
    }

    /**
     * The ID of the schedule associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    public ReceiptResponse withForScheduleID(Optional<String> forScheduleID) {
        Utils.checkNotNull(forScheduleID, "forScheduleID");
        this.forScheduleID = forScheduleID;
        return this;
    }

    /**
     * The ID of the schedule occurrence associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    public ReceiptResponse withForOccurrenceID(String forOccurrenceID) {
        Utils.checkNotNull(forOccurrenceID, "forOccurrenceID");
        this.forOccurrenceID = Optional.ofNullable(forOccurrenceID);
        return this;
    }

    /**
     * The ID of the schedule occurrence associated with this receipt.
     * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
     */
    public ReceiptResponse withForOccurrenceID(Optional<String> forOccurrenceID) {
        Utils.checkNotNull(forOccurrenceID, "forOccurrenceID");
        this.forOccurrenceID = forOccurrenceID;
        return this;
    }

    /**
     * The list of receipts that have been sent.
     */
    public ReceiptResponse withSentFor(List<SentReceipt> sentFor) {
        Utils.checkNotNull(sentFor, "sentFor");
        this.sentFor = Optional.ofNullable(sentFor);
        return this;
    }

    /**
     * The list of receipts that have been sent.
     */
    public ReceiptResponse withSentFor(Optional<? extends List<SentReceipt>> sentFor) {
        Utils.checkNotNull(sentFor, "sentFor");
        this.sentFor = sentFor;
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
        ReceiptResponse other = (ReceiptResponse) o;
        return 
            Objects.deepEquals(this.receiptID, other.receiptID) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.disabledOn, other.disabledOn) &&
            Objects.deepEquals(this.kind, other.kind) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.emailAccountID, other.emailAccountID) &&
            Objects.deepEquals(this.forTransferID, other.forTransferID) &&
            Objects.deepEquals(this.forScheduleID, other.forScheduleID) &&
            Objects.deepEquals(this.forOccurrenceID, other.forOccurrenceID) &&
            Objects.deepEquals(this.sentFor, other.sentFor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            receiptID,
            createdBy,
            disabledOn,
            kind,
            email,
            emailAccountID,
            forTransferID,
            forScheduleID,
            forOccurrenceID,
            sentFor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReceiptResponse.class,
                "receiptID", receiptID,
                "createdBy", createdBy,
                "disabledOn", disabledOn,
                "kind", kind,
                "email", email,
                "emailAccountID", emailAccountID,
                "forTransferID", forTransferID,
                "forScheduleID", forScheduleID,
                "forOccurrenceID", forOccurrenceID,
                "sentFor", sentFor);
    }
    
    public final static class Builder {
 
        private String receiptID;
 
        private String createdBy;
 
        private Optional<OffsetDateTime> disabledOn = Optional.empty();
 
        private ReceiptKind kind;
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> emailAccountID = Optional.empty();
 
        private Optional<String> forTransferID = Optional.empty();
 
        private Optional<String> forScheduleID = Optional.empty();
 
        private Optional<String> forOccurrenceID = Optional.empty();
 
        private Optional<? extends List<SentReceipt>> sentFor = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for the receipt request.
         */
        public Builder receiptID(String receiptID) {
            Utils.checkNotNull(receiptID, "receiptID");
            this.receiptID = receiptID;
            return this;
        }

        /**
         * AccountID for which the receipt request was created.
         */
        public Builder createdBy(String createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        /**
         * The date and time the receipt was disabled.
         */
        public Builder disabledOn(OffsetDateTime disabledOn) {
            Utils.checkNotNull(disabledOn, "disabledOn");
            this.disabledOn = Optional.ofNullable(disabledOn);
            return this;
        }

        /**
         * The date and time the receipt was disabled.
         */
        public Builder disabledOn(Optional<OffsetDateTime> disabledOn) {
            Utils.checkNotNull(disabledOn, "disabledOn");
            this.disabledOn = disabledOn;
            return this;
        }

        /**
         * The type of receipt.
         */
        public Builder kind(ReceiptKind kind) {
            Utils.checkNotNull(kind, "kind");
            this.kind = kind;
            return this;
        }

        /**
         * The email address the receipt is sent to.
         * Either email or emailAccountID will be in the response, but not both.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * The email address the receipt is sent to.
         * Either email or emailAccountID will be in the response, but not both.
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * The accountID the receipt is sent to.
         * Either email or emailAccountID will be in the response, but not both.
         */
        public Builder emailAccountID(String emailAccountID) {
            Utils.checkNotNull(emailAccountID, "emailAccountID");
            this.emailAccountID = Optional.ofNullable(emailAccountID);
            return this;
        }

        /**
         * The accountID the receipt is sent to.
         * Either email or emailAccountID will be in the response, but not both.
         */
        public Builder emailAccountID(Optional<String> emailAccountID) {
            Utils.checkNotNull(emailAccountID, "emailAccountID");
            this.emailAccountID = emailAccountID;
            return this;
        }

        /**
         * The ID of the transfer associated with this receipt.
         * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
         */
        public Builder forTransferID(String forTransferID) {
            Utils.checkNotNull(forTransferID, "forTransferID");
            this.forTransferID = Optional.ofNullable(forTransferID);
            return this;
        }

        /**
         * The ID of the transfer associated with this receipt.
         * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
         */
        public Builder forTransferID(Optional<String> forTransferID) {
            Utils.checkNotNull(forTransferID, "forTransferID");
            this.forTransferID = forTransferID;
            return this;
        }

        /**
         * The ID of the schedule associated with this receipt.
         * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
         */
        public Builder forScheduleID(String forScheduleID) {
            Utils.checkNotNull(forScheduleID, "forScheduleID");
            this.forScheduleID = Optional.ofNullable(forScheduleID);
            return this;
        }

        /**
         * The ID of the schedule associated with this receipt.
         * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
         */
        public Builder forScheduleID(Optional<String> forScheduleID) {
            Utils.checkNotNull(forScheduleID, "forScheduleID");
            this.forScheduleID = forScheduleID;
            return this;
        }

        /**
         * The ID of the schedule occurrence associated with this receipt.
         * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
         */
        public Builder forOccurrenceID(String forOccurrenceID) {
            Utils.checkNotNull(forOccurrenceID, "forOccurrenceID");
            this.forOccurrenceID = Optional.ofNullable(forOccurrenceID);
            return this;
        }

        /**
         * The ID of the schedule occurrence associated with this receipt.
         * Exactly one of forTransferID, forScheduleID, or forOccurrenceID must be provided.
         */
        public Builder forOccurrenceID(Optional<String> forOccurrenceID) {
            Utils.checkNotNull(forOccurrenceID, "forOccurrenceID");
            this.forOccurrenceID = forOccurrenceID;
            return this;
        }

        /**
         * The list of receipts that have been sent.
         */
        public Builder sentFor(List<SentReceipt> sentFor) {
            Utils.checkNotNull(sentFor, "sentFor");
            this.sentFor = Optional.ofNullable(sentFor);
            return this;
        }

        /**
         * The list of receipts that have been sent.
         */
        public Builder sentFor(Optional<? extends List<SentReceipt>> sentFor) {
            Utils.checkNotNull(sentFor, "sentFor");
            this.sentFor = sentFor;
            return this;
        }
        
        public ReceiptResponse build() {
            return new ReceiptResponse(
                receiptID,
                createdBy,
                disabledOn,
                kind,
                email,
                emailAccountID,
                forTransferID,
                forScheduleID,
                forOccurrenceID,
                sentFor);
        }
    }
}
