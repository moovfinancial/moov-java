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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Transfer
 * 
 * <p>Details of a Transfer.
 */
public class Transfer {

    @JsonProperty("transferID")
    private String transferID;

    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;

    @JsonProperty("source")
    private TransferSource source;

    @JsonProperty("destination")
    private TransferDestination destination;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completedOn")
    private Optional<OffsetDateTime> completedOn;

    /**
     * Status of a transfer.
     */
    @JsonProperty("status")
    private TransferStatus status;

    /**
     * Reason for a transfer's failure.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failureReason")
    private Optional<? extends TransferFailureReason> failureReason;

    @JsonProperty("amount")
    private Amount amount;

    /**
     * An optional description of the transfer for your own internal use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    /**
     * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Map<String, String>> metadata;

    /**
     * Total or markup fee.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("facilitatorFee")
    private Optional<? extends FacilitatorFee> facilitatorFee;

    /**
     * Fees charged to your platform account for transfers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("moovFee")
    private Optional<Long> moovFee;

    /**
     * Same as `moovFee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("moovFeeDecimal")
    private Optional<String> moovFeeDecimal;

    /**
     * Processing and pass-through costs that add up to the moovFee.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("moovFeeDetails")
    private Optional<? extends MoovFeeDetails> moovFeeDetails;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("groupID")
    private Optional<String> groupID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cancellations")
    private Optional<? extends List<Cancellation>> cancellations;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refundedAmount")
    private Optional<? extends Amount> refundedAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refunds")
    private Optional<? extends List<CardAcquiringRefund>> refunds;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disputedAmount")
    private Optional<? extends Amount> disputedAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disputes")
    private Optional<? extends List<CardAcquiringDispute>> disputes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sweepID")
    private Optional<String> sweepID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduleID")
    private Optional<String> scheduleID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("occurrenceID")
    private Optional<String> occurrenceID;

    /**
     * Optional sales tax amount. `transfer.amount.value` should be inclusive of any sales tax and represents the total amount charged.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("salesTaxAmount")
    private Optional<? extends Amount> salesTaxAmount;

    @JsonCreator
    public Transfer(
            @JsonProperty("transferID") String transferID,
            @JsonProperty("createdOn") OffsetDateTime createdOn,
            @JsonProperty("source") TransferSource source,
            @JsonProperty("destination") TransferDestination destination,
            @JsonProperty("completedOn") Optional<OffsetDateTime> completedOn,
            @JsonProperty("status") TransferStatus status,
            @JsonProperty("failureReason") Optional<? extends TransferFailureReason> failureReason,
            @JsonProperty("amount") Amount amount,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("metadata") Optional<? extends Map<String, String>> metadata,
            @JsonProperty("facilitatorFee") Optional<? extends FacilitatorFee> facilitatorFee,
            @JsonProperty("moovFee") Optional<Long> moovFee,
            @JsonProperty("moovFeeDecimal") Optional<String> moovFeeDecimal,
            @JsonProperty("moovFeeDetails") Optional<? extends MoovFeeDetails> moovFeeDetails,
            @JsonProperty("groupID") Optional<String> groupID,
            @JsonProperty("cancellations") Optional<? extends List<Cancellation>> cancellations,
            @JsonProperty("refundedAmount") Optional<? extends Amount> refundedAmount,
            @JsonProperty("refunds") Optional<? extends List<CardAcquiringRefund>> refunds,
            @JsonProperty("disputedAmount") Optional<? extends Amount> disputedAmount,
            @JsonProperty("disputes") Optional<? extends List<CardAcquiringDispute>> disputes,
            @JsonProperty("sweepID") Optional<String> sweepID,
            @JsonProperty("scheduleID") Optional<String> scheduleID,
            @JsonProperty("occurrenceID") Optional<String> occurrenceID,
            @JsonProperty("salesTaxAmount") Optional<? extends Amount> salesTaxAmount) {
        Utils.checkNotNull(transferID, "transferID");
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(destination, "destination");
        Utils.checkNotNull(completedOn, "completedOn");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(failureReason, "failureReason");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(facilitatorFee, "facilitatorFee");
        Utils.checkNotNull(moovFee, "moovFee");
        Utils.checkNotNull(moovFeeDecimal, "moovFeeDecimal");
        Utils.checkNotNull(moovFeeDetails, "moovFeeDetails");
        Utils.checkNotNull(groupID, "groupID");
        Utils.checkNotNull(cancellations, "cancellations");
        Utils.checkNotNull(refundedAmount, "refundedAmount");
        Utils.checkNotNull(refunds, "refunds");
        Utils.checkNotNull(disputedAmount, "disputedAmount");
        Utils.checkNotNull(disputes, "disputes");
        Utils.checkNotNull(sweepID, "sweepID");
        Utils.checkNotNull(scheduleID, "scheduleID");
        Utils.checkNotNull(occurrenceID, "occurrenceID");
        Utils.checkNotNull(salesTaxAmount, "salesTaxAmount");
        this.transferID = transferID;
        this.createdOn = createdOn;
        this.source = source;
        this.destination = destination;
        this.completedOn = completedOn;
        this.status = status;
        this.failureReason = failureReason;
        this.amount = amount;
        this.description = description;
        this.metadata = metadata;
        this.facilitatorFee = facilitatorFee;
        this.moovFee = moovFee;
        this.moovFeeDecimal = moovFeeDecimal;
        this.moovFeeDetails = moovFeeDetails;
        this.groupID = groupID;
        this.cancellations = cancellations;
        this.refundedAmount = refundedAmount;
        this.refunds = refunds;
        this.disputedAmount = disputedAmount;
        this.disputes = disputes;
        this.sweepID = sweepID;
        this.scheduleID = scheduleID;
        this.occurrenceID = occurrenceID;
        this.salesTaxAmount = salesTaxAmount;
    }
    
    public Transfer(
            String transferID,
            OffsetDateTime createdOn,
            TransferSource source,
            TransferDestination destination,
            TransferStatus status,
            Amount amount) {
        this(transferID, createdOn, source, destination, Optional.empty(), status, Optional.empty(), amount, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String transferID() {
        return transferID;
    }

    @JsonIgnore
    public OffsetDateTime createdOn() {
        return createdOn;
    }

    @JsonIgnore
    public TransferSource source() {
        return source;
    }

    @JsonIgnore
    public TransferDestination destination() {
        return destination;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> completedOn() {
        return completedOn;
    }

    /**
     * Status of a transfer.
     */
    @JsonIgnore
    public TransferStatus status() {
        return status;
    }

    /**
     * Reason for a transfer's failure.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TransferFailureReason> failureReason() {
        return (Optional<TransferFailureReason>) failureReason;
    }

    @JsonIgnore
    public Amount amount() {
        return amount;
    }

    /**
     * An optional description of the transfer for your own internal use.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> metadata() {
        return (Optional<Map<String, String>>) metadata;
    }

    /**
     * Total or markup fee.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FacilitatorFee> facilitatorFee() {
        return (Optional<FacilitatorFee>) facilitatorFee;
    }

    /**
     * Fees charged to your platform account for transfers.
     */
    @JsonIgnore
    public Optional<Long> moovFee() {
        return moovFee;
    }

    /**
     * Same as `moovFee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision.
     */
    @JsonIgnore
    public Optional<String> moovFeeDecimal() {
        return moovFeeDecimal;
    }

    /**
     * Processing and pass-through costs that add up to the moovFee.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MoovFeeDetails> moovFeeDetails() {
        return (Optional<MoovFeeDetails>) moovFeeDetails;
    }

    @JsonIgnore
    public Optional<String> groupID() {
        return groupID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Cancellation>> cancellations() {
        return (Optional<List<Cancellation>>) cancellations;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Amount> refundedAmount() {
        return (Optional<Amount>) refundedAmount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CardAcquiringRefund>> refunds() {
        return (Optional<List<CardAcquiringRefund>>) refunds;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Amount> disputedAmount() {
        return (Optional<Amount>) disputedAmount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CardAcquiringDispute>> disputes() {
        return (Optional<List<CardAcquiringDispute>>) disputes;
    }

    @JsonIgnore
    public Optional<String> sweepID() {
        return sweepID;
    }

    @JsonIgnore
    public Optional<String> scheduleID() {
        return scheduleID;
    }

    @JsonIgnore
    public Optional<String> occurrenceID() {
        return occurrenceID;
    }

    /**
     * Optional sales tax amount. `transfer.amount.value` should be inclusive of any sales tax and represents the total amount charged.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Amount> salesTaxAmount() {
        return (Optional<Amount>) salesTaxAmount;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Transfer withTransferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
        return this;
    }

    public Transfer withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    public Transfer withSource(TransferSource source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    public Transfer withDestination(TransferDestination destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = destination;
        return this;
    }

    public Transfer withCompletedOn(OffsetDateTime completedOn) {
        Utils.checkNotNull(completedOn, "completedOn");
        this.completedOn = Optional.ofNullable(completedOn);
        return this;
    }

    public Transfer withCompletedOn(Optional<OffsetDateTime> completedOn) {
        Utils.checkNotNull(completedOn, "completedOn");
        this.completedOn = completedOn;
        return this;
    }

    /**
     * Status of a transfer.
     */
    public Transfer withStatus(TransferStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Reason for a transfer's failure.
     */
    public Transfer withFailureReason(TransferFailureReason failureReason) {
        Utils.checkNotNull(failureReason, "failureReason");
        this.failureReason = Optional.ofNullable(failureReason);
        return this;
    }

    /**
     * Reason for a transfer's failure.
     */
    public Transfer withFailureReason(Optional<? extends TransferFailureReason> failureReason) {
        Utils.checkNotNull(failureReason, "failureReason");
        this.failureReason = failureReason;
        return this;
    }

    public Transfer withAmount(Amount amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * An optional description of the transfer for your own internal use.
     */
    public Transfer withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * An optional description of the transfer for your own internal use.
     */
    public Transfer withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
     */
    public Transfer withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
     */
    public Transfer withMetadata(Optional<? extends Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Total or markup fee.
     */
    public Transfer withFacilitatorFee(FacilitatorFee facilitatorFee) {
        Utils.checkNotNull(facilitatorFee, "facilitatorFee");
        this.facilitatorFee = Optional.ofNullable(facilitatorFee);
        return this;
    }

    /**
     * Total or markup fee.
     */
    public Transfer withFacilitatorFee(Optional<? extends FacilitatorFee> facilitatorFee) {
        Utils.checkNotNull(facilitatorFee, "facilitatorFee");
        this.facilitatorFee = facilitatorFee;
        return this;
    }

    /**
     * Fees charged to your platform account for transfers.
     */
    public Transfer withMoovFee(long moovFee) {
        Utils.checkNotNull(moovFee, "moovFee");
        this.moovFee = Optional.ofNullable(moovFee);
        return this;
    }

    /**
     * Fees charged to your platform account for transfers.
     */
    public Transfer withMoovFee(Optional<Long> moovFee) {
        Utils.checkNotNull(moovFee, "moovFee");
        this.moovFee = moovFee;
        return this;
    }

    /**
     * Same as `moovFee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision.
     */
    public Transfer withMoovFeeDecimal(String moovFeeDecimal) {
        Utils.checkNotNull(moovFeeDecimal, "moovFeeDecimal");
        this.moovFeeDecimal = Optional.ofNullable(moovFeeDecimal);
        return this;
    }

    /**
     * Same as `moovFee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision.
     */
    public Transfer withMoovFeeDecimal(Optional<String> moovFeeDecimal) {
        Utils.checkNotNull(moovFeeDecimal, "moovFeeDecimal");
        this.moovFeeDecimal = moovFeeDecimal;
        return this;
    }

    /**
     * Processing and pass-through costs that add up to the moovFee.
     */
    public Transfer withMoovFeeDetails(MoovFeeDetails moovFeeDetails) {
        Utils.checkNotNull(moovFeeDetails, "moovFeeDetails");
        this.moovFeeDetails = Optional.ofNullable(moovFeeDetails);
        return this;
    }

    /**
     * Processing and pass-through costs that add up to the moovFee.
     */
    public Transfer withMoovFeeDetails(Optional<? extends MoovFeeDetails> moovFeeDetails) {
        Utils.checkNotNull(moovFeeDetails, "moovFeeDetails");
        this.moovFeeDetails = moovFeeDetails;
        return this;
    }

    public Transfer withGroupID(String groupID) {
        Utils.checkNotNull(groupID, "groupID");
        this.groupID = Optional.ofNullable(groupID);
        return this;
    }

    public Transfer withGroupID(Optional<String> groupID) {
        Utils.checkNotNull(groupID, "groupID");
        this.groupID = groupID;
        return this;
    }

    public Transfer withCancellations(List<Cancellation> cancellations) {
        Utils.checkNotNull(cancellations, "cancellations");
        this.cancellations = Optional.ofNullable(cancellations);
        return this;
    }

    public Transfer withCancellations(Optional<? extends List<Cancellation>> cancellations) {
        Utils.checkNotNull(cancellations, "cancellations");
        this.cancellations = cancellations;
        return this;
    }

    public Transfer withRefundedAmount(Amount refundedAmount) {
        Utils.checkNotNull(refundedAmount, "refundedAmount");
        this.refundedAmount = Optional.ofNullable(refundedAmount);
        return this;
    }

    public Transfer withRefundedAmount(Optional<? extends Amount> refundedAmount) {
        Utils.checkNotNull(refundedAmount, "refundedAmount");
        this.refundedAmount = refundedAmount;
        return this;
    }

    public Transfer withRefunds(List<CardAcquiringRefund> refunds) {
        Utils.checkNotNull(refunds, "refunds");
        this.refunds = Optional.ofNullable(refunds);
        return this;
    }

    public Transfer withRefunds(Optional<? extends List<CardAcquiringRefund>> refunds) {
        Utils.checkNotNull(refunds, "refunds");
        this.refunds = refunds;
        return this;
    }

    public Transfer withDisputedAmount(Amount disputedAmount) {
        Utils.checkNotNull(disputedAmount, "disputedAmount");
        this.disputedAmount = Optional.ofNullable(disputedAmount);
        return this;
    }

    public Transfer withDisputedAmount(Optional<? extends Amount> disputedAmount) {
        Utils.checkNotNull(disputedAmount, "disputedAmount");
        this.disputedAmount = disputedAmount;
        return this;
    }

    public Transfer withDisputes(List<CardAcquiringDispute> disputes) {
        Utils.checkNotNull(disputes, "disputes");
        this.disputes = Optional.ofNullable(disputes);
        return this;
    }

    public Transfer withDisputes(Optional<? extends List<CardAcquiringDispute>> disputes) {
        Utils.checkNotNull(disputes, "disputes");
        this.disputes = disputes;
        return this;
    }

    public Transfer withSweepID(String sweepID) {
        Utils.checkNotNull(sweepID, "sweepID");
        this.sweepID = Optional.ofNullable(sweepID);
        return this;
    }

    public Transfer withSweepID(Optional<String> sweepID) {
        Utils.checkNotNull(sweepID, "sweepID");
        this.sweepID = sweepID;
        return this;
    }

    public Transfer withScheduleID(String scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = Optional.ofNullable(scheduleID);
        return this;
    }

    public Transfer withScheduleID(Optional<String> scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = scheduleID;
        return this;
    }

    public Transfer withOccurrenceID(String occurrenceID) {
        Utils.checkNotNull(occurrenceID, "occurrenceID");
        this.occurrenceID = Optional.ofNullable(occurrenceID);
        return this;
    }

    public Transfer withOccurrenceID(Optional<String> occurrenceID) {
        Utils.checkNotNull(occurrenceID, "occurrenceID");
        this.occurrenceID = occurrenceID;
        return this;
    }

    /**
     * Optional sales tax amount. `transfer.amount.value` should be inclusive of any sales tax and represents the total amount charged.
     */
    public Transfer withSalesTaxAmount(Amount salesTaxAmount) {
        Utils.checkNotNull(salesTaxAmount, "salesTaxAmount");
        this.salesTaxAmount = Optional.ofNullable(salesTaxAmount);
        return this;
    }

    /**
     * Optional sales tax amount. `transfer.amount.value` should be inclusive of any sales tax and represents the total amount charged.
     */
    public Transfer withSalesTaxAmount(Optional<? extends Amount> salesTaxAmount) {
        Utils.checkNotNull(salesTaxAmount, "salesTaxAmount");
        this.salesTaxAmount = salesTaxAmount;
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
        Transfer other = (Transfer) o;
        return 
            Objects.deepEquals(this.transferID, other.transferID) &&
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.destination, other.destination) &&
            Objects.deepEquals(this.completedOn, other.completedOn) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.failureReason, other.failureReason) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.facilitatorFee, other.facilitatorFee) &&
            Objects.deepEquals(this.moovFee, other.moovFee) &&
            Objects.deepEquals(this.moovFeeDecimal, other.moovFeeDecimal) &&
            Objects.deepEquals(this.moovFeeDetails, other.moovFeeDetails) &&
            Objects.deepEquals(this.groupID, other.groupID) &&
            Objects.deepEquals(this.cancellations, other.cancellations) &&
            Objects.deepEquals(this.refundedAmount, other.refundedAmount) &&
            Objects.deepEquals(this.refunds, other.refunds) &&
            Objects.deepEquals(this.disputedAmount, other.disputedAmount) &&
            Objects.deepEquals(this.disputes, other.disputes) &&
            Objects.deepEquals(this.sweepID, other.sweepID) &&
            Objects.deepEquals(this.scheduleID, other.scheduleID) &&
            Objects.deepEquals(this.occurrenceID, other.occurrenceID) &&
            Objects.deepEquals(this.salesTaxAmount, other.salesTaxAmount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            transferID,
            createdOn,
            source,
            destination,
            completedOn,
            status,
            failureReason,
            amount,
            description,
            metadata,
            facilitatorFee,
            moovFee,
            moovFeeDecimal,
            moovFeeDetails,
            groupID,
            cancellations,
            refundedAmount,
            refunds,
            disputedAmount,
            disputes,
            sweepID,
            scheduleID,
            occurrenceID,
            salesTaxAmount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Transfer.class,
                "transferID", transferID,
                "createdOn", createdOn,
                "source", source,
                "destination", destination,
                "completedOn", completedOn,
                "status", status,
                "failureReason", failureReason,
                "amount", amount,
                "description", description,
                "metadata", metadata,
                "facilitatorFee", facilitatorFee,
                "moovFee", moovFee,
                "moovFeeDecimal", moovFeeDecimal,
                "moovFeeDetails", moovFeeDetails,
                "groupID", groupID,
                "cancellations", cancellations,
                "refundedAmount", refundedAmount,
                "refunds", refunds,
                "disputedAmount", disputedAmount,
                "disputes", disputes,
                "sweepID", sweepID,
                "scheduleID", scheduleID,
                "occurrenceID", occurrenceID,
                "salesTaxAmount", salesTaxAmount);
    }
    
    public final static class Builder {
 
        private String transferID;
 
        private OffsetDateTime createdOn;
 
        private TransferSource source;
 
        private TransferDestination destination;
 
        private Optional<OffsetDateTime> completedOn = Optional.empty();
 
        private TransferStatus status;
 
        private Optional<? extends TransferFailureReason> failureReason = Optional.empty();
 
        private Amount amount;
 
        private Optional<String> description = Optional.empty();
 
        private Optional<? extends Map<String, String>> metadata = Optional.empty();
 
        private Optional<? extends FacilitatorFee> facilitatorFee = Optional.empty();
 
        private Optional<Long> moovFee = Optional.empty();
 
        private Optional<String> moovFeeDecimal = Optional.empty();
 
        private Optional<? extends MoovFeeDetails> moovFeeDetails = Optional.empty();
 
        private Optional<String> groupID = Optional.empty();
 
        private Optional<? extends List<Cancellation>> cancellations = Optional.empty();
 
        private Optional<? extends Amount> refundedAmount = Optional.empty();
 
        private Optional<? extends List<CardAcquiringRefund>> refunds = Optional.empty();
 
        private Optional<? extends Amount> disputedAmount = Optional.empty();
 
        private Optional<? extends List<CardAcquiringDispute>> disputes = Optional.empty();
 
        private Optional<String> sweepID = Optional.empty();
 
        private Optional<String> scheduleID = Optional.empty();
 
        private Optional<String> occurrenceID = Optional.empty();
 
        private Optional<? extends Amount> salesTaxAmount = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder transferID(String transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = transferID;
            return this;
        }

        public Builder createdOn(OffsetDateTime createdOn) {
            Utils.checkNotNull(createdOn, "createdOn");
            this.createdOn = createdOn;
            return this;
        }

        public Builder source(TransferSource source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        public Builder destination(TransferDestination destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = destination;
            return this;
        }

        public Builder completedOn(OffsetDateTime completedOn) {
            Utils.checkNotNull(completedOn, "completedOn");
            this.completedOn = Optional.ofNullable(completedOn);
            return this;
        }

        public Builder completedOn(Optional<OffsetDateTime> completedOn) {
            Utils.checkNotNull(completedOn, "completedOn");
            this.completedOn = completedOn;
            return this;
        }

        /**
         * Status of a transfer.
         */
        public Builder status(TransferStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Reason for a transfer's failure.
         */
        public Builder failureReason(TransferFailureReason failureReason) {
            Utils.checkNotNull(failureReason, "failureReason");
            this.failureReason = Optional.ofNullable(failureReason);
            return this;
        }

        /**
         * Reason for a transfer's failure.
         */
        public Builder failureReason(Optional<? extends TransferFailureReason> failureReason) {
            Utils.checkNotNull(failureReason, "failureReason");
            this.failureReason = failureReason;
            return this;
        }

        public Builder amount(Amount amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * An optional description of the transfer for your own internal use.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * An optional description of the transfer for your own internal use.
         */
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
         */
        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
         */
        public Builder metadata(Optional<? extends Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * Total or markup fee.
         */
        public Builder facilitatorFee(FacilitatorFee facilitatorFee) {
            Utils.checkNotNull(facilitatorFee, "facilitatorFee");
            this.facilitatorFee = Optional.ofNullable(facilitatorFee);
            return this;
        }

        /**
         * Total or markup fee.
         */
        public Builder facilitatorFee(Optional<? extends FacilitatorFee> facilitatorFee) {
            Utils.checkNotNull(facilitatorFee, "facilitatorFee");
            this.facilitatorFee = facilitatorFee;
            return this;
        }

        /**
         * Fees charged to your platform account for transfers.
         */
        public Builder moovFee(long moovFee) {
            Utils.checkNotNull(moovFee, "moovFee");
            this.moovFee = Optional.ofNullable(moovFee);
            return this;
        }

        /**
         * Fees charged to your platform account for transfers.
         */
        public Builder moovFee(Optional<Long> moovFee) {
            Utils.checkNotNull(moovFee, "moovFee");
            this.moovFee = moovFee;
            return this;
        }

        /**
         * Same as `moovFee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision.
         */
        public Builder moovFeeDecimal(String moovFeeDecimal) {
            Utils.checkNotNull(moovFeeDecimal, "moovFeeDecimal");
            this.moovFeeDecimal = Optional.ofNullable(moovFeeDecimal);
            return this;
        }

        /**
         * Same as `moovFee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision.
         */
        public Builder moovFeeDecimal(Optional<String> moovFeeDecimal) {
            Utils.checkNotNull(moovFeeDecimal, "moovFeeDecimal");
            this.moovFeeDecimal = moovFeeDecimal;
            return this;
        }

        /**
         * Processing and pass-through costs that add up to the moovFee.
         */
        public Builder moovFeeDetails(MoovFeeDetails moovFeeDetails) {
            Utils.checkNotNull(moovFeeDetails, "moovFeeDetails");
            this.moovFeeDetails = Optional.ofNullable(moovFeeDetails);
            return this;
        }

        /**
         * Processing and pass-through costs that add up to the moovFee.
         */
        public Builder moovFeeDetails(Optional<? extends MoovFeeDetails> moovFeeDetails) {
            Utils.checkNotNull(moovFeeDetails, "moovFeeDetails");
            this.moovFeeDetails = moovFeeDetails;
            return this;
        }

        public Builder groupID(String groupID) {
            Utils.checkNotNull(groupID, "groupID");
            this.groupID = Optional.ofNullable(groupID);
            return this;
        }

        public Builder groupID(Optional<String> groupID) {
            Utils.checkNotNull(groupID, "groupID");
            this.groupID = groupID;
            return this;
        }

        public Builder cancellations(List<Cancellation> cancellations) {
            Utils.checkNotNull(cancellations, "cancellations");
            this.cancellations = Optional.ofNullable(cancellations);
            return this;
        }

        public Builder cancellations(Optional<? extends List<Cancellation>> cancellations) {
            Utils.checkNotNull(cancellations, "cancellations");
            this.cancellations = cancellations;
            return this;
        }

        public Builder refundedAmount(Amount refundedAmount) {
            Utils.checkNotNull(refundedAmount, "refundedAmount");
            this.refundedAmount = Optional.ofNullable(refundedAmount);
            return this;
        }

        public Builder refundedAmount(Optional<? extends Amount> refundedAmount) {
            Utils.checkNotNull(refundedAmount, "refundedAmount");
            this.refundedAmount = refundedAmount;
            return this;
        }

        public Builder refunds(List<CardAcquiringRefund> refunds) {
            Utils.checkNotNull(refunds, "refunds");
            this.refunds = Optional.ofNullable(refunds);
            return this;
        }

        public Builder refunds(Optional<? extends List<CardAcquiringRefund>> refunds) {
            Utils.checkNotNull(refunds, "refunds");
            this.refunds = refunds;
            return this;
        }

        public Builder disputedAmount(Amount disputedAmount) {
            Utils.checkNotNull(disputedAmount, "disputedAmount");
            this.disputedAmount = Optional.ofNullable(disputedAmount);
            return this;
        }

        public Builder disputedAmount(Optional<? extends Amount> disputedAmount) {
            Utils.checkNotNull(disputedAmount, "disputedAmount");
            this.disputedAmount = disputedAmount;
            return this;
        }

        public Builder disputes(List<CardAcquiringDispute> disputes) {
            Utils.checkNotNull(disputes, "disputes");
            this.disputes = Optional.ofNullable(disputes);
            return this;
        }

        public Builder disputes(Optional<? extends List<CardAcquiringDispute>> disputes) {
            Utils.checkNotNull(disputes, "disputes");
            this.disputes = disputes;
            return this;
        }

        public Builder sweepID(String sweepID) {
            Utils.checkNotNull(sweepID, "sweepID");
            this.sweepID = Optional.ofNullable(sweepID);
            return this;
        }

        public Builder sweepID(Optional<String> sweepID) {
            Utils.checkNotNull(sweepID, "sweepID");
            this.sweepID = sweepID;
            return this;
        }

        public Builder scheduleID(String scheduleID) {
            Utils.checkNotNull(scheduleID, "scheduleID");
            this.scheduleID = Optional.ofNullable(scheduleID);
            return this;
        }

        public Builder scheduleID(Optional<String> scheduleID) {
            Utils.checkNotNull(scheduleID, "scheduleID");
            this.scheduleID = scheduleID;
            return this;
        }

        public Builder occurrenceID(String occurrenceID) {
            Utils.checkNotNull(occurrenceID, "occurrenceID");
            this.occurrenceID = Optional.ofNullable(occurrenceID);
            return this;
        }

        public Builder occurrenceID(Optional<String> occurrenceID) {
            Utils.checkNotNull(occurrenceID, "occurrenceID");
            this.occurrenceID = occurrenceID;
            return this;
        }

        /**
         * Optional sales tax amount. `transfer.amount.value` should be inclusive of any sales tax and represents the total amount charged.
         */
        public Builder salesTaxAmount(Amount salesTaxAmount) {
            Utils.checkNotNull(salesTaxAmount, "salesTaxAmount");
            this.salesTaxAmount = Optional.ofNullable(salesTaxAmount);
            return this;
        }

        /**
         * Optional sales tax amount. `transfer.amount.value` should be inclusive of any sales tax and represents the total amount charged.
         */
        public Builder salesTaxAmount(Optional<? extends Amount> salesTaxAmount) {
            Utils.checkNotNull(salesTaxAmount, "salesTaxAmount");
            this.salesTaxAmount = salesTaxAmount;
            return this;
        }
        
        public Transfer build() {
            return new Transfer(
                transferID,
                createdOn,
                source,
                destination,
                completedOn,
                status,
                failureReason,
                amount,
                description,
                metadata,
                facilitatorFee,
                moovFee,
                moovFeeDecimal,
                moovFeeDetails,
                groupID,
                cancellations,
                refundedAmount,
                refunds,
                disputedAmount,
                disputes,
                sweepID,
                scheduleID,
                occurrenceID,
                salesTaxAmount);
        }
    }
}
