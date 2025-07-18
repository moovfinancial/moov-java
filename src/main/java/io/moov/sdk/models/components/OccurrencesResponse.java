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
import java.util.Optional;


public class OccurrencesResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduleID")
    private Optional<String> scheduleID;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("occurrenceID")
    private Optional<String> occurrenceID;

    /**
     * Sandbox or production account mode of this schedule.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends Mode> mode;

    /**
     * True if this was generated by a RRule.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("generated")
    private Optional<Boolean> generated;

    /**
     * True if the RRule set runs indefinitely.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("indefinite")
    private Optional<Boolean> indefinite;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("canceledOn")
    private Optional<OffsetDateTime> canceledOn;


    @JsonProperty("runOn")
    private OffsetDateTime runOn;

    /**
     * Defines the attributes of a transfer.
     */
    @JsonProperty("runTransfer")
    private RunTransfer runTransfer;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ranOn")
    private Optional<OffsetDateTime> ranOn;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ranTransferID")
    private Optional<String> ranTransferID;

    /**
     * Status of the completed occurrence.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends OccurrenceStatus> status;

    /**
     * Contains details on why the occurrence errored.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<? extends Error> error;

    @JsonCreator
    public OccurrencesResponse(
            @JsonProperty("scheduleID") Optional<String> scheduleID,
            @JsonProperty("occurrenceID") Optional<String> occurrenceID,
            @JsonProperty("mode") Optional<? extends Mode> mode,
            @JsonProperty("generated") Optional<Boolean> generated,
            @JsonProperty("indefinite") Optional<Boolean> indefinite,
            @JsonProperty("canceledOn") Optional<OffsetDateTime> canceledOn,
            @JsonProperty("runOn") OffsetDateTime runOn,
            @JsonProperty("runTransfer") RunTransfer runTransfer,
            @JsonProperty("ranOn") Optional<OffsetDateTime> ranOn,
            @JsonProperty("ranTransferID") Optional<String> ranTransferID,
            @JsonProperty("status") Optional<? extends OccurrenceStatus> status,
            @JsonProperty("error") Optional<? extends Error> error) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        Utils.checkNotNull(occurrenceID, "occurrenceID");
        Utils.checkNotNull(mode, "mode");
        Utils.checkNotNull(generated, "generated");
        Utils.checkNotNull(indefinite, "indefinite");
        Utils.checkNotNull(canceledOn, "canceledOn");
        Utils.checkNotNull(runOn, "runOn");
        Utils.checkNotNull(runTransfer, "runTransfer");
        Utils.checkNotNull(ranOn, "ranOn");
        Utils.checkNotNull(ranTransferID, "ranTransferID");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(error, "error");
        this.scheduleID = scheduleID;
        this.occurrenceID = occurrenceID;
        this.mode = mode;
        this.generated = generated;
        this.indefinite = indefinite;
        this.canceledOn = canceledOn;
        this.runOn = runOn;
        this.runTransfer = runTransfer;
        this.ranOn = ranOn;
        this.ranTransferID = ranTransferID;
        this.status = status;
        this.error = error;
    }
    
    public OccurrencesResponse(
            OffsetDateTime runOn,
            RunTransfer runTransfer) {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            runOn, runTransfer, Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty());
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
     * Sandbox or production account mode of this schedule.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Mode> mode() {
        return (Optional<Mode>) mode;
    }

    /**
     * True if this was generated by a RRule.
     */
    @JsonIgnore
    public Optional<Boolean> generated() {
        return generated;
    }

    /**
     * True if the RRule set runs indefinitely.
     */
    @JsonIgnore
    public Optional<Boolean> indefinite() {
        return indefinite;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> canceledOn() {
        return canceledOn;
    }

    @JsonIgnore
    public OffsetDateTime runOn() {
        return runOn;
    }

    /**
     * Defines the attributes of a transfer.
     */
    @JsonIgnore
    public RunTransfer runTransfer() {
        return runTransfer;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> ranOn() {
        return ranOn;
    }

    @JsonIgnore
    public Optional<String> ranTransferID() {
        return ranTransferID;
    }

    /**
     * Status of the completed occurrence.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OccurrenceStatus> status() {
        return (Optional<OccurrenceStatus>) status;
    }

    /**
     * Contains details on why the occurrence errored.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Error> error() {
        return (Optional<Error>) error;
    }

    public static Builder builder() {
        return new Builder();
    }


    public OccurrencesResponse withScheduleID(String scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = Optional.ofNullable(scheduleID);
        return this;
    }


    public OccurrencesResponse withScheduleID(Optional<String> scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = scheduleID;
        return this;
    }

    public OccurrencesResponse withOccurrenceID(String occurrenceID) {
        Utils.checkNotNull(occurrenceID, "occurrenceID");
        this.occurrenceID = Optional.ofNullable(occurrenceID);
        return this;
    }


    public OccurrencesResponse withOccurrenceID(Optional<String> occurrenceID) {
        Utils.checkNotNull(occurrenceID, "occurrenceID");
        this.occurrenceID = occurrenceID;
        return this;
    }

    /**
     * Sandbox or production account mode of this schedule.
     */
    public OccurrencesResponse withMode(Mode mode) {
        Utils.checkNotNull(mode, "mode");
        this.mode = Optional.ofNullable(mode);
        return this;
    }


    /**
     * Sandbox or production account mode of this schedule.
     */
    public OccurrencesResponse withMode(Optional<? extends Mode> mode) {
        Utils.checkNotNull(mode, "mode");
        this.mode = mode;
        return this;
    }

    /**
     * True if this was generated by a RRule.
     */
    public OccurrencesResponse withGenerated(boolean generated) {
        Utils.checkNotNull(generated, "generated");
        this.generated = Optional.ofNullable(generated);
        return this;
    }


    /**
     * True if this was generated by a RRule.
     */
    public OccurrencesResponse withGenerated(Optional<Boolean> generated) {
        Utils.checkNotNull(generated, "generated");
        this.generated = generated;
        return this;
    }

    /**
     * True if the RRule set runs indefinitely.
     */
    public OccurrencesResponse withIndefinite(boolean indefinite) {
        Utils.checkNotNull(indefinite, "indefinite");
        this.indefinite = Optional.ofNullable(indefinite);
        return this;
    }


    /**
     * True if the RRule set runs indefinitely.
     */
    public OccurrencesResponse withIndefinite(Optional<Boolean> indefinite) {
        Utils.checkNotNull(indefinite, "indefinite");
        this.indefinite = indefinite;
        return this;
    }

    public OccurrencesResponse withCanceledOn(OffsetDateTime canceledOn) {
        Utils.checkNotNull(canceledOn, "canceledOn");
        this.canceledOn = Optional.ofNullable(canceledOn);
        return this;
    }


    public OccurrencesResponse withCanceledOn(Optional<OffsetDateTime> canceledOn) {
        Utils.checkNotNull(canceledOn, "canceledOn");
        this.canceledOn = canceledOn;
        return this;
    }

    public OccurrencesResponse withRunOn(OffsetDateTime runOn) {
        Utils.checkNotNull(runOn, "runOn");
        this.runOn = runOn;
        return this;
    }

    /**
     * Defines the attributes of a transfer.
     */
    public OccurrencesResponse withRunTransfer(RunTransfer runTransfer) {
        Utils.checkNotNull(runTransfer, "runTransfer");
        this.runTransfer = runTransfer;
        return this;
    }

    public OccurrencesResponse withRanOn(OffsetDateTime ranOn) {
        Utils.checkNotNull(ranOn, "ranOn");
        this.ranOn = Optional.ofNullable(ranOn);
        return this;
    }


    public OccurrencesResponse withRanOn(Optional<OffsetDateTime> ranOn) {
        Utils.checkNotNull(ranOn, "ranOn");
        this.ranOn = ranOn;
        return this;
    }

    public OccurrencesResponse withRanTransferID(String ranTransferID) {
        Utils.checkNotNull(ranTransferID, "ranTransferID");
        this.ranTransferID = Optional.ofNullable(ranTransferID);
        return this;
    }


    public OccurrencesResponse withRanTransferID(Optional<String> ranTransferID) {
        Utils.checkNotNull(ranTransferID, "ranTransferID");
        this.ranTransferID = ranTransferID;
        return this;
    }

    /**
     * Status of the completed occurrence.
     */
    public OccurrencesResponse withStatus(OccurrenceStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }


    /**
     * Status of the completed occurrence.
     */
    public OccurrencesResponse withStatus(Optional<? extends OccurrenceStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Contains details on why the occurrence errored.
     */
    public OccurrencesResponse withError(Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }


    /**
     * Contains details on why the occurrence errored.
     */
    public OccurrencesResponse withError(Optional<? extends Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
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
        OccurrencesResponse other = (OccurrencesResponse) o;
        return 
            Utils.enhancedDeepEquals(this.scheduleID, other.scheduleID) &&
            Utils.enhancedDeepEquals(this.occurrenceID, other.occurrenceID) &&
            Utils.enhancedDeepEquals(this.mode, other.mode) &&
            Utils.enhancedDeepEquals(this.generated, other.generated) &&
            Utils.enhancedDeepEquals(this.indefinite, other.indefinite) &&
            Utils.enhancedDeepEquals(this.canceledOn, other.canceledOn) &&
            Utils.enhancedDeepEquals(this.runOn, other.runOn) &&
            Utils.enhancedDeepEquals(this.runTransfer, other.runTransfer) &&
            Utils.enhancedDeepEquals(this.ranOn, other.ranOn) &&
            Utils.enhancedDeepEquals(this.ranTransferID, other.ranTransferID) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.error, other.error);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            scheduleID, occurrenceID, mode,
            generated, indefinite, canceledOn,
            runOn, runTransfer, ranOn,
            ranTransferID, status, error);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OccurrencesResponse.class,
                "scheduleID", scheduleID,
                "occurrenceID", occurrenceID,
                "mode", mode,
                "generated", generated,
                "indefinite", indefinite,
                "canceledOn", canceledOn,
                "runOn", runOn,
                "runTransfer", runTransfer,
                "ranOn", ranOn,
                "ranTransferID", ranTransferID,
                "status", status,
                "error", error);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> scheduleID = Optional.empty();

        private Optional<String> occurrenceID = Optional.empty();

        private Optional<? extends Mode> mode = Optional.empty();

        private Optional<Boolean> generated = Optional.empty();

        private Optional<Boolean> indefinite = Optional.empty();

        private Optional<OffsetDateTime> canceledOn = Optional.empty();

        private OffsetDateTime runOn;

        private RunTransfer runTransfer;

        private Optional<OffsetDateTime> ranOn = Optional.empty();

        private Optional<String> ranTransferID = Optional.empty();

        private Optional<? extends OccurrenceStatus> status = Optional.empty();

        private Optional<? extends Error> error = Optional.empty();

        private Builder() {
          // force use of static builder() method
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
         * Sandbox or production account mode of this schedule.
         */
        public Builder mode(Mode mode) {
            Utils.checkNotNull(mode, "mode");
            this.mode = Optional.ofNullable(mode);
            return this;
        }

        /**
         * Sandbox or production account mode of this schedule.
         */
        public Builder mode(Optional<? extends Mode> mode) {
            Utils.checkNotNull(mode, "mode");
            this.mode = mode;
            return this;
        }


        /**
         * True if this was generated by a RRule.
         */
        public Builder generated(boolean generated) {
            Utils.checkNotNull(generated, "generated");
            this.generated = Optional.ofNullable(generated);
            return this;
        }

        /**
         * True if this was generated by a RRule.
         */
        public Builder generated(Optional<Boolean> generated) {
            Utils.checkNotNull(generated, "generated");
            this.generated = generated;
            return this;
        }


        /**
         * True if the RRule set runs indefinitely.
         */
        public Builder indefinite(boolean indefinite) {
            Utils.checkNotNull(indefinite, "indefinite");
            this.indefinite = Optional.ofNullable(indefinite);
            return this;
        }

        /**
         * True if the RRule set runs indefinitely.
         */
        public Builder indefinite(Optional<Boolean> indefinite) {
            Utils.checkNotNull(indefinite, "indefinite");
            this.indefinite = indefinite;
            return this;
        }


        public Builder canceledOn(OffsetDateTime canceledOn) {
            Utils.checkNotNull(canceledOn, "canceledOn");
            this.canceledOn = Optional.ofNullable(canceledOn);
            return this;
        }

        public Builder canceledOn(Optional<OffsetDateTime> canceledOn) {
            Utils.checkNotNull(canceledOn, "canceledOn");
            this.canceledOn = canceledOn;
            return this;
        }


        public Builder runOn(OffsetDateTime runOn) {
            Utils.checkNotNull(runOn, "runOn");
            this.runOn = runOn;
            return this;
        }


        /**
         * Defines the attributes of a transfer.
         */
        public Builder runTransfer(RunTransfer runTransfer) {
            Utils.checkNotNull(runTransfer, "runTransfer");
            this.runTransfer = runTransfer;
            return this;
        }


        public Builder ranOn(OffsetDateTime ranOn) {
            Utils.checkNotNull(ranOn, "ranOn");
            this.ranOn = Optional.ofNullable(ranOn);
            return this;
        }

        public Builder ranOn(Optional<OffsetDateTime> ranOn) {
            Utils.checkNotNull(ranOn, "ranOn");
            this.ranOn = ranOn;
            return this;
        }


        public Builder ranTransferID(String ranTransferID) {
            Utils.checkNotNull(ranTransferID, "ranTransferID");
            this.ranTransferID = Optional.ofNullable(ranTransferID);
            return this;
        }

        public Builder ranTransferID(Optional<String> ranTransferID) {
            Utils.checkNotNull(ranTransferID, "ranTransferID");
            this.ranTransferID = ranTransferID;
            return this;
        }


        /**
         * Status of the completed occurrence.
         */
        public Builder status(OccurrenceStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Status of the completed occurrence.
         */
        public Builder status(Optional<? extends OccurrenceStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }


        /**
         * Contains details on why the occurrence errored.
         */
        public Builder error(Error error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * Contains details on why the occurrence errored.
         */
        public Builder error(Optional<? extends Error> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public OccurrencesResponse build() {

            return new OccurrencesResponse(
                scheduleID, occurrenceID, mode,
                generated, indefinite, canceledOn,
                runOn, runTransfer, ranOn,
                ranTransferID, status, error);
        }

    }
}
