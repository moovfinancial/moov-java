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
import java.util.Objects;
import java.util.Optional;


public class RefundCardDetails {

    @JsonProperty("status")
    private RefundCardStatus status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failureCode")
    private Optional<? extends CardTransactionFailureCode> failureCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initiatedOn")
    private Optional<OffsetDateTime> initiatedOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("confirmedOn")
    private Optional<OffsetDateTime> confirmedOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settledOn")
    private Optional<OffsetDateTime> settledOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failedOn")
    private Optional<OffsetDateTime> failedOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completedOn")
    private Optional<OffsetDateTime> completedOn;

    @JsonCreator
    public RefundCardDetails(
            @JsonProperty("status") RefundCardStatus status,
            @JsonProperty("failureCode") Optional<? extends CardTransactionFailureCode> failureCode,
            @JsonProperty("initiatedOn") Optional<OffsetDateTime> initiatedOn,
            @JsonProperty("confirmedOn") Optional<OffsetDateTime> confirmedOn,
            @JsonProperty("settledOn") Optional<OffsetDateTime> settledOn,
            @JsonProperty("failedOn") Optional<OffsetDateTime> failedOn,
            @JsonProperty("completedOn") Optional<OffsetDateTime> completedOn) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(failureCode, "failureCode");
        Utils.checkNotNull(initiatedOn, "initiatedOn");
        Utils.checkNotNull(confirmedOn, "confirmedOn");
        Utils.checkNotNull(settledOn, "settledOn");
        Utils.checkNotNull(failedOn, "failedOn");
        Utils.checkNotNull(completedOn, "completedOn");
        this.status = status;
        this.failureCode = failureCode;
        this.initiatedOn = initiatedOn;
        this.confirmedOn = confirmedOn;
        this.settledOn = settledOn;
        this.failedOn = failedOn;
        this.completedOn = completedOn;
    }
    
    public RefundCardDetails(
            RefundCardStatus status) {
        this(status, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public RefundCardStatus status() {
        return status;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardTransactionFailureCode> failureCode() {
        return (Optional<CardTransactionFailureCode>) failureCode;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> initiatedOn() {
        return initiatedOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> confirmedOn() {
        return confirmedOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> settledOn() {
        return settledOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> failedOn() {
        return failedOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> completedOn() {
        return completedOn;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RefundCardDetails withStatus(RefundCardStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public RefundCardDetails withFailureCode(CardTransactionFailureCode failureCode) {
        Utils.checkNotNull(failureCode, "failureCode");
        this.failureCode = Optional.ofNullable(failureCode);
        return this;
    }

    public RefundCardDetails withFailureCode(Optional<? extends CardTransactionFailureCode> failureCode) {
        Utils.checkNotNull(failureCode, "failureCode");
        this.failureCode = failureCode;
        return this;
    }

    public RefundCardDetails withInitiatedOn(OffsetDateTime initiatedOn) {
        Utils.checkNotNull(initiatedOn, "initiatedOn");
        this.initiatedOn = Optional.ofNullable(initiatedOn);
        return this;
    }

    public RefundCardDetails withInitiatedOn(Optional<OffsetDateTime> initiatedOn) {
        Utils.checkNotNull(initiatedOn, "initiatedOn");
        this.initiatedOn = initiatedOn;
        return this;
    }

    public RefundCardDetails withConfirmedOn(OffsetDateTime confirmedOn) {
        Utils.checkNotNull(confirmedOn, "confirmedOn");
        this.confirmedOn = Optional.ofNullable(confirmedOn);
        return this;
    }

    public RefundCardDetails withConfirmedOn(Optional<OffsetDateTime> confirmedOn) {
        Utils.checkNotNull(confirmedOn, "confirmedOn");
        this.confirmedOn = confirmedOn;
        return this;
    }

    public RefundCardDetails withSettledOn(OffsetDateTime settledOn) {
        Utils.checkNotNull(settledOn, "settledOn");
        this.settledOn = Optional.ofNullable(settledOn);
        return this;
    }

    public RefundCardDetails withSettledOn(Optional<OffsetDateTime> settledOn) {
        Utils.checkNotNull(settledOn, "settledOn");
        this.settledOn = settledOn;
        return this;
    }

    public RefundCardDetails withFailedOn(OffsetDateTime failedOn) {
        Utils.checkNotNull(failedOn, "failedOn");
        this.failedOn = Optional.ofNullable(failedOn);
        return this;
    }

    public RefundCardDetails withFailedOn(Optional<OffsetDateTime> failedOn) {
        Utils.checkNotNull(failedOn, "failedOn");
        this.failedOn = failedOn;
        return this;
    }

    public RefundCardDetails withCompletedOn(OffsetDateTime completedOn) {
        Utils.checkNotNull(completedOn, "completedOn");
        this.completedOn = Optional.ofNullable(completedOn);
        return this;
    }

    public RefundCardDetails withCompletedOn(Optional<OffsetDateTime> completedOn) {
        Utils.checkNotNull(completedOn, "completedOn");
        this.completedOn = completedOn;
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
        RefundCardDetails other = (RefundCardDetails) o;
        return 
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.failureCode, other.failureCode) &&
            Objects.deepEquals(this.initiatedOn, other.initiatedOn) &&
            Objects.deepEquals(this.confirmedOn, other.confirmedOn) &&
            Objects.deepEquals(this.settledOn, other.settledOn) &&
            Objects.deepEquals(this.failedOn, other.failedOn) &&
            Objects.deepEquals(this.completedOn, other.completedOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status,
            failureCode,
            initiatedOn,
            confirmedOn,
            settledOn,
            failedOn,
            completedOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RefundCardDetails.class,
                "status", status,
                "failureCode", failureCode,
                "initiatedOn", initiatedOn,
                "confirmedOn", confirmedOn,
                "settledOn", settledOn,
                "failedOn", failedOn,
                "completedOn", completedOn);
    }
    
    public final static class Builder {
 
        private RefundCardStatus status;
 
        private Optional<? extends CardTransactionFailureCode> failureCode = Optional.empty();
 
        private Optional<OffsetDateTime> initiatedOn = Optional.empty();
 
        private Optional<OffsetDateTime> confirmedOn = Optional.empty();
 
        private Optional<OffsetDateTime> settledOn = Optional.empty();
 
        private Optional<OffsetDateTime> failedOn = Optional.empty();
 
        private Optional<OffsetDateTime> completedOn = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder status(RefundCardStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder failureCode(CardTransactionFailureCode failureCode) {
            Utils.checkNotNull(failureCode, "failureCode");
            this.failureCode = Optional.ofNullable(failureCode);
            return this;
        }

        public Builder failureCode(Optional<? extends CardTransactionFailureCode> failureCode) {
            Utils.checkNotNull(failureCode, "failureCode");
            this.failureCode = failureCode;
            return this;
        }

        public Builder initiatedOn(OffsetDateTime initiatedOn) {
            Utils.checkNotNull(initiatedOn, "initiatedOn");
            this.initiatedOn = Optional.ofNullable(initiatedOn);
            return this;
        }

        public Builder initiatedOn(Optional<OffsetDateTime> initiatedOn) {
            Utils.checkNotNull(initiatedOn, "initiatedOn");
            this.initiatedOn = initiatedOn;
            return this;
        }

        public Builder confirmedOn(OffsetDateTime confirmedOn) {
            Utils.checkNotNull(confirmedOn, "confirmedOn");
            this.confirmedOn = Optional.ofNullable(confirmedOn);
            return this;
        }

        public Builder confirmedOn(Optional<OffsetDateTime> confirmedOn) {
            Utils.checkNotNull(confirmedOn, "confirmedOn");
            this.confirmedOn = confirmedOn;
            return this;
        }

        public Builder settledOn(OffsetDateTime settledOn) {
            Utils.checkNotNull(settledOn, "settledOn");
            this.settledOn = Optional.ofNullable(settledOn);
            return this;
        }

        public Builder settledOn(Optional<OffsetDateTime> settledOn) {
            Utils.checkNotNull(settledOn, "settledOn");
            this.settledOn = settledOn;
            return this;
        }

        public Builder failedOn(OffsetDateTime failedOn) {
            Utils.checkNotNull(failedOn, "failedOn");
            this.failedOn = Optional.ofNullable(failedOn);
            return this;
        }

        public Builder failedOn(Optional<OffsetDateTime> failedOn) {
            Utils.checkNotNull(failedOn, "failedOn");
            this.failedOn = failedOn;
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
        
        public RefundCardDetails build() {
            return new RefundCardDetails(
                status,
                failureCode,
                initiatedOn,
                confirmedOn,
                settledOn,
                failedOn,
                completedOn);
        }
    }
}

