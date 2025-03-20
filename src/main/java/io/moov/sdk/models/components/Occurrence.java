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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
/**
 * Occurrence - Occurrences to either create or modify.
 */

public class Occurrence {

    /**
     * If set to true, will cancel the occurrence. If set false will resume the occurrence. If unset leaves the value unchanged.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("canceled")
    private Optional<Boolean> canceled;

    /**
     *   If set this defines what occurrence to modify, if invalid will fail the request. 
     *   If null or "" it defines to add a new occurrence.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("occurrenceID")
    private Optional<String> occurrenceID;

    /**
     * Timestamp to run the transfer after. Value must be into the future.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("runOn")
    private Optional<OffsetDateTime> runOn;

    /**
     * Defines the attributes of a transfer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("runTransfer")
    private Optional<? extends RunTransfer> runTransfer;

    @JsonCreator
    public Occurrence(
            @JsonProperty("canceled") Optional<Boolean> canceled,
            @JsonProperty("occurrenceID") Optional<String> occurrenceID,
            @JsonProperty("runOn") Optional<OffsetDateTime> runOn,
            @JsonProperty("runTransfer") Optional<? extends RunTransfer> runTransfer) {
        Utils.checkNotNull(canceled, "canceled");
        Utils.checkNotNull(occurrenceID, "occurrenceID");
        Utils.checkNotNull(runOn, "runOn");
        Utils.checkNotNull(runTransfer, "runTransfer");
        this.canceled = canceled;
        this.occurrenceID = occurrenceID;
        this.runOn = runOn;
        this.runTransfer = runTransfer;
    }
    
    public Occurrence() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * If set to true, will cancel the occurrence. If set false will resume the occurrence. If unset leaves the value unchanged.
     */
    @JsonIgnore
    public Optional<Boolean> canceled() {
        return canceled;
    }

    /**
     *   If set this defines what occurrence to modify, if invalid will fail the request. 
     *   If null or "" it defines to add a new occurrence.
     */
    @JsonIgnore
    public Optional<String> occurrenceID() {
        return occurrenceID;
    }

    /**
     * Timestamp to run the transfer after. Value must be into the future.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> runOn() {
        return runOn;
    }

    /**
     * Defines the attributes of a transfer.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RunTransfer> runTransfer() {
        return (Optional<RunTransfer>) runTransfer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * If set to true, will cancel the occurrence. If set false will resume the occurrence. If unset leaves the value unchanged.
     */
    public Occurrence withCanceled(boolean canceled) {
        Utils.checkNotNull(canceled, "canceled");
        this.canceled = Optional.ofNullable(canceled);
        return this;
    }

    /**
     * If set to true, will cancel the occurrence. If set false will resume the occurrence. If unset leaves the value unchanged.
     */
    public Occurrence withCanceled(Optional<Boolean> canceled) {
        Utils.checkNotNull(canceled, "canceled");
        this.canceled = canceled;
        return this;
    }

    /**
     *   If set this defines what occurrence to modify, if invalid will fail the request. 
     *   If null or "" it defines to add a new occurrence.
     */
    public Occurrence withOccurrenceID(String occurrenceID) {
        Utils.checkNotNull(occurrenceID, "occurrenceID");
        this.occurrenceID = Optional.ofNullable(occurrenceID);
        return this;
    }

    /**
     *   If set this defines what occurrence to modify, if invalid will fail the request. 
     *   If null or "" it defines to add a new occurrence.
     */
    public Occurrence withOccurrenceID(Optional<String> occurrenceID) {
        Utils.checkNotNull(occurrenceID, "occurrenceID");
        this.occurrenceID = occurrenceID;
        return this;
    }

    /**
     * Timestamp to run the transfer after. Value must be into the future.
     */
    public Occurrence withRunOn(OffsetDateTime runOn) {
        Utils.checkNotNull(runOn, "runOn");
        this.runOn = Optional.ofNullable(runOn);
        return this;
    }

    /**
     * Timestamp to run the transfer after. Value must be into the future.
     */
    public Occurrence withRunOn(Optional<OffsetDateTime> runOn) {
        Utils.checkNotNull(runOn, "runOn");
        this.runOn = runOn;
        return this;
    }

    /**
     * Defines the attributes of a transfer.
     */
    public Occurrence withRunTransfer(RunTransfer runTransfer) {
        Utils.checkNotNull(runTransfer, "runTransfer");
        this.runTransfer = Optional.ofNullable(runTransfer);
        return this;
    }

    /**
     * Defines the attributes of a transfer.
     */
    public Occurrence withRunTransfer(Optional<? extends RunTransfer> runTransfer) {
        Utils.checkNotNull(runTransfer, "runTransfer");
        this.runTransfer = runTransfer;
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
        Occurrence other = (Occurrence) o;
        return 
            Objects.deepEquals(this.canceled, other.canceled) &&
            Objects.deepEquals(this.occurrenceID, other.occurrenceID) &&
            Objects.deepEquals(this.runOn, other.runOn) &&
            Objects.deepEquals(this.runTransfer, other.runTransfer);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            canceled,
            occurrenceID,
            runOn,
            runTransfer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Occurrence.class,
                "canceled", canceled,
                "occurrenceID", occurrenceID,
                "runOn", runOn,
                "runTransfer", runTransfer);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> canceled = Optional.empty();
 
        private Optional<String> occurrenceID = Optional.empty();
 
        private Optional<OffsetDateTime> runOn = Optional.empty();
 
        private Optional<? extends RunTransfer> runTransfer = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * If set to true, will cancel the occurrence. If set false will resume the occurrence. If unset leaves the value unchanged.
         */
        public Builder canceled(boolean canceled) {
            Utils.checkNotNull(canceled, "canceled");
            this.canceled = Optional.ofNullable(canceled);
            return this;
        }

        /**
         * If set to true, will cancel the occurrence. If set false will resume the occurrence. If unset leaves the value unchanged.
         */
        public Builder canceled(Optional<Boolean> canceled) {
            Utils.checkNotNull(canceled, "canceled");
            this.canceled = canceled;
            return this;
        }

        /**
         *   If set this defines what occurrence to modify, if invalid will fail the request. 
         *   If null or "" it defines to add a new occurrence.
         */
        public Builder occurrenceID(String occurrenceID) {
            Utils.checkNotNull(occurrenceID, "occurrenceID");
            this.occurrenceID = Optional.ofNullable(occurrenceID);
            return this;
        }

        /**
         *   If set this defines what occurrence to modify, if invalid will fail the request. 
         *   If null or "" it defines to add a new occurrence.
         */
        public Builder occurrenceID(Optional<String> occurrenceID) {
            Utils.checkNotNull(occurrenceID, "occurrenceID");
            this.occurrenceID = occurrenceID;
            return this;
        }

        /**
         * Timestamp to run the transfer after. Value must be into the future.
         */
        public Builder runOn(OffsetDateTime runOn) {
            Utils.checkNotNull(runOn, "runOn");
            this.runOn = Optional.ofNullable(runOn);
            return this;
        }

        /**
         * Timestamp to run the transfer after. Value must be into the future.
         */
        public Builder runOn(Optional<OffsetDateTime> runOn) {
            Utils.checkNotNull(runOn, "runOn");
            this.runOn = runOn;
            return this;
        }

        /**
         * Defines the attributes of a transfer.
         */
        public Builder runTransfer(RunTransfer runTransfer) {
            Utils.checkNotNull(runTransfer, "runTransfer");
            this.runTransfer = Optional.ofNullable(runTransfer);
            return this;
        }

        /**
         * Defines the attributes of a transfer.
         */
        public Builder runTransfer(Optional<? extends RunTransfer> runTransfer) {
            Utils.checkNotNull(runTransfer, "runTransfer");
            this.runTransfer = runTransfer;
            return this;
        }
        
        public Occurrence build() {
            return new Occurrence(
                canceled,
                occurrenceID,
                runOn,
                runTransfer);
        }
    }
}

