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
import java.util.Optional;


public class ScheduleResponse {
    /**
     * Simple description to place on the transfer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;


    @JsonProperty("destinationAccountID")
    private String destinationAccountID;

    /**
     * The operating mode for an account.
     */
    @JsonProperty("mode")
    private Mode mode;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("occurrences")
    private Optional<? extends List<OccurrencesResponse>> occurrences;


    @JsonProperty("ownerAccountID")
    private String ownerAccountID;


    @JsonProperty("partnerAccountID")
    private String partnerAccountID;

    /**
     * Defines configuration for recurring transfers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recur")
    private Optional<? extends Recur> recur;


    @JsonProperty("scheduleID")
    private String scheduleID;


    @JsonProperty("sourceAccountID")
    private String sourceAccountID;


    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;


    @JsonProperty("updatedOn")
    private OffsetDateTime updatedOn;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disabledOn")
    private Optional<OffsetDateTime> disabledOn;

    @JsonCreator
    public ScheduleResponse(
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("destinationAccountID") String destinationAccountID,
            @JsonProperty("mode") Mode mode,
            @JsonProperty("occurrences") Optional<? extends List<OccurrencesResponse>> occurrences,
            @JsonProperty("ownerAccountID") String ownerAccountID,
            @JsonProperty("partnerAccountID") String partnerAccountID,
            @JsonProperty("recur") Optional<? extends Recur> recur,
            @JsonProperty("scheduleID") String scheduleID,
            @JsonProperty("sourceAccountID") String sourceAccountID,
            @JsonProperty("createdOn") OffsetDateTime createdOn,
            @JsonProperty("updatedOn") OffsetDateTime updatedOn,
            @JsonProperty("disabledOn") Optional<OffsetDateTime> disabledOn) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        Utils.checkNotNull(mode, "mode");
        Utils.checkNotNull(occurrences, "occurrences");
        Utils.checkNotNull(ownerAccountID, "ownerAccountID");
        Utils.checkNotNull(partnerAccountID, "partnerAccountID");
        Utils.checkNotNull(recur, "recur");
        Utils.checkNotNull(scheduleID, "scheduleID");
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(updatedOn, "updatedOn");
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.description = description;
        this.destinationAccountID = destinationAccountID;
        this.mode = mode;
        this.occurrences = occurrences;
        this.ownerAccountID = ownerAccountID;
        this.partnerAccountID = partnerAccountID;
        this.recur = recur;
        this.scheduleID = scheduleID;
        this.sourceAccountID = sourceAccountID;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.disabledOn = disabledOn;
    }
    
    public ScheduleResponse(
            String destinationAccountID,
            Mode mode,
            String ownerAccountID,
            String partnerAccountID,
            String scheduleID,
            String sourceAccountID,
            OffsetDateTime createdOn,
            OffsetDateTime updatedOn) {
        this(Optional.empty(), destinationAccountID, mode,
            Optional.empty(), ownerAccountID, partnerAccountID,
            Optional.empty(), scheduleID, sourceAccountID,
            createdOn, updatedOn, Optional.empty());
    }

    /**
     * Simple description to place on the transfer.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public String destinationAccountID() {
        return destinationAccountID;
    }

    /**
     * The operating mode for an account.
     */
    @JsonIgnore
    public Mode mode() {
        return mode;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<OccurrencesResponse>> occurrences() {
        return (Optional<List<OccurrencesResponse>>) occurrences;
    }

    @JsonIgnore
    public String ownerAccountID() {
        return ownerAccountID;
    }

    @JsonIgnore
    public String partnerAccountID() {
        return partnerAccountID;
    }

    /**
     * Defines configuration for recurring transfers.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Recur> recur() {
        return (Optional<Recur>) recur;
    }

    @JsonIgnore
    public String scheduleID() {
        return scheduleID;
    }

    @JsonIgnore
    public String sourceAccountID() {
        return sourceAccountID;
    }

    @JsonIgnore
    public OffsetDateTime createdOn() {
        return createdOn;
    }

    @JsonIgnore
    public OffsetDateTime updatedOn() {
        return updatedOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> disabledOn() {
        return disabledOn;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Simple description to place on the transfer.
     */
    public ScheduleResponse withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }


    /**
     * Simple description to place on the transfer.
     */
    public ScheduleResponse withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public ScheduleResponse withDestinationAccountID(String destinationAccountID) {
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        this.destinationAccountID = destinationAccountID;
        return this;
    }

    /**
     * The operating mode for an account.
     */
    public ScheduleResponse withMode(Mode mode) {
        Utils.checkNotNull(mode, "mode");
        this.mode = mode;
        return this;
    }

    public ScheduleResponse withOccurrences(List<OccurrencesResponse> occurrences) {
        Utils.checkNotNull(occurrences, "occurrences");
        this.occurrences = Optional.ofNullable(occurrences);
        return this;
    }


    public ScheduleResponse withOccurrences(Optional<? extends List<OccurrencesResponse>> occurrences) {
        Utils.checkNotNull(occurrences, "occurrences");
        this.occurrences = occurrences;
        return this;
    }

    public ScheduleResponse withOwnerAccountID(String ownerAccountID) {
        Utils.checkNotNull(ownerAccountID, "ownerAccountID");
        this.ownerAccountID = ownerAccountID;
        return this;
    }

    public ScheduleResponse withPartnerAccountID(String partnerAccountID) {
        Utils.checkNotNull(partnerAccountID, "partnerAccountID");
        this.partnerAccountID = partnerAccountID;
        return this;
    }

    /**
     * Defines configuration for recurring transfers.
     */
    public ScheduleResponse withRecur(Recur recur) {
        Utils.checkNotNull(recur, "recur");
        this.recur = Optional.ofNullable(recur);
        return this;
    }


    /**
     * Defines configuration for recurring transfers.
     */
    public ScheduleResponse withRecur(Optional<? extends Recur> recur) {
        Utils.checkNotNull(recur, "recur");
        this.recur = recur;
        return this;
    }

    public ScheduleResponse withScheduleID(String scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = scheduleID;
        return this;
    }

    public ScheduleResponse withSourceAccountID(String sourceAccountID) {
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        this.sourceAccountID = sourceAccountID;
        return this;
    }

    public ScheduleResponse withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    public ScheduleResponse withUpdatedOn(OffsetDateTime updatedOn) {
        Utils.checkNotNull(updatedOn, "updatedOn");
        this.updatedOn = updatedOn;
        return this;
    }

    public ScheduleResponse withDisabledOn(OffsetDateTime disabledOn) {
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.disabledOn = Optional.ofNullable(disabledOn);
        return this;
    }


    public ScheduleResponse withDisabledOn(Optional<OffsetDateTime> disabledOn) {
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.disabledOn = disabledOn;
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
        ScheduleResponse other = (ScheduleResponse) o;
        return 
            Utils.enhancedDeepEquals(this.description, other.description) &&
            Utils.enhancedDeepEquals(this.destinationAccountID, other.destinationAccountID) &&
            Utils.enhancedDeepEquals(this.mode, other.mode) &&
            Utils.enhancedDeepEquals(this.occurrences, other.occurrences) &&
            Utils.enhancedDeepEquals(this.ownerAccountID, other.ownerAccountID) &&
            Utils.enhancedDeepEquals(this.partnerAccountID, other.partnerAccountID) &&
            Utils.enhancedDeepEquals(this.recur, other.recur) &&
            Utils.enhancedDeepEquals(this.scheduleID, other.scheduleID) &&
            Utils.enhancedDeepEquals(this.sourceAccountID, other.sourceAccountID) &&
            Utils.enhancedDeepEquals(this.createdOn, other.createdOn) &&
            Utils.enhancedDeepEquals(this.updatedOn, other.updatedOn) &&
            Utils.enhancedDeepEquals(this.disabledOn, other.disabledOn);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            description, destinationAccountID, mode,
            occurrences, ownerAccountID, partnerAccountID,
            recur, scheduleID, sourceAccountID,
            createdOn, updatedOn, disabledOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ScheduleResponse.class,
                "description", description,
                "destinationAccountID", destinationAccountID,
                "mode", mode,
                "occurrences", occurrences,
                "ownerAccountID", ownerAccountID,
                "partnerAccountID", partnerAccountID,
                "recur", recur,
                "scheduleID", scheduleID,
                "sourceAccountID", sourceAccountID,
                "createdOn", createdOn,
                "updatedOn", updatedOn,
                "disabledOn", disabledOn);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> description = Optional.empty();

        private String destinationAccountID;

        private Mode mode;

        private Optional<? extends List<OccurrencesResponse>> occurrences = Optional.empty();

        private String ownerAccountID;

        private String partnerAccountID;

        private Optional<? extends Recur> recur = Optional.empty();

        private String scheduleID;

        private String sourceAccountID;

        private OffsetDateTime createdOn;

        private OffsetDateTime updatedOn;

        private Optional<OffsetDateTime> disabledOn = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Simple description to place on the transfer.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * Simple description to place on the transfer.
         */
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }


        public Builder destinationAccountID(String destinationAccountID) {
            Utils.checkNotNull(destinationAccountID, "destinationAccountID");
            this.destinationAccountID = destinationAccountID;
            return this;
        }


        /**
         * The operating mode for an account.
         */
        public Builder mode(Mode mode) {
            Utils.checkNotNull(mode, "mode");
            this.mode = mode;
            return this;
        }


        public Builder occurrences(List<OccurrencesResponse> occurrences) {
            Utils.checkNotNull(occurrences, "occurrences");
            this.occurrences = Optional.ofNullable(occurrences);
            return this;
        }

        public Builder occurrences(Optional<? extends List<OccurrencesResponse>> occurrences) {
            Utils.checkNotNull(occurrences, "occurrences");
            this.occurrences = occurrences;
            return this;
        }


        public Builder ownerAccountID(String ownerAccountID) {
            Utils.checkNotNull(ownerAccountID, "ownerAccountID");
            this.ownerAccountID = ownerAccountID;
            return this;
        }


        public Builder partnerAccountID(String partnerAccountID) {
            Utils.checkNotNull(partnerAccountID, "partnerAccountID");
            this.partnerAccountID = partnerAccountID;
            return this;
        }


        /**
         * Defines configuration for recurring transfers.
         */
        public Builder recur(Recur recur) {
            Utils.checkNotNull(recur, "recur");
            this.recur = Optional.ofNullable(recur);
            return this;
        }

        /**
         * Defines configuration for recurring transfers.
         */
        public Builder recur(Optional<? extends Recur> recur) {
            Utils.checkNotNull(recur, "recur");
            this.recur = recur;
            return this;
        }


        public Builder scheduleID(String scheduleID) {
            Utils.checkNotNull(scheduleID, "scheduleID");
            this.scheduleID = scheduleID;
            return this;
        }


        public Builder sourceAccountID(String sourceAccountID) {
            Utils.checkNotNull(sourceAccountID, "sourceAccountID");
            this.sourceAccountID = sourceAccountID;
            return this;
        }


        public Builder createdOn(OffsetDateTime createdOn) {
            Utils.checkNotNull(createdOn, "createdOn");
            this.createdOn = createdOn;
            return this;
        }


        public Builder updatedOn(OffsetDateTime updatedOn) {
            Utils.checkNotNull(updatedOn, "updatedOn");
            this.updatedOn = updatedOn;
            return this;
        }


        public Builder disabledOn(OffsetDateTime disabledOn) {
            Utils.checkNotNull(disabledOn, "disabledOn");
            this.disabledOn = Optional.ofNullable(disabledOn);
            return this;
        }

        public Builder disabledOn(Optional<OffsetDateTime> disabledOn) {
            Utils.checkNotNull(disabledOn, "disabledOn");
            this.disabledOn = disabledOn;
            return this;
        }

        public ScheduleResponse build() {

            return new ScheduleResponse(
                description, destinationAccountID, mode,
                occurrences, ownerAccountID, partnerAccountID,
                recur, scheduleID, sourceAccountID,
                createdOn, updatedOn, disabledOn);
        }

    }
}
