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


public class ScheduleListResponse {

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

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceAccount")
    private Optional<? extends PartialScheduleAccount> sourceAccount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destinationAccount")
    private Optional<? extends PartialScheduleAccount> destinationAccount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("partnerAccount")
    private Optional<? extends PartialScheduleAccount> partnerAccount;

    @JsonCreator
    public ScheduleListResponse(
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
            @JsonProperty("disabledOn") Optional<OffsetDateTime> disabledOn,
            @JsonProperty("sourceAccount") Optional<? extends PartialScheduleAccount> sourceAccount,
            @JsonProperty("destinationAccount") Optional<? extends PartialScheduleAccount> destinationAccount,
            @JsonProperty("partnerAccount") Optional<? extends PartialScheduleAccount> partnerAccount) {
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
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        Utils.checkNotNull(destinationAccount, "destinationAccount");
        Utils.checkNotNull(partnerAccount, "partnerAccount");
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
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.partnerAccount = partnerAccount;
    }
    
    public ScheduleListResponse(
            String destinationAccountID,
            Mode mode,
            String ownerAccountID,
            String partnerAccountID,
            String scheduleID,
            String sourceAccountID,
            OffsetDateTime createdOn,
            OffsetDateTime updatedOn) {
        this(Optional.empty(), destinationAccountID, mode, Optional.empty(), ownerAccountID, partnerAccountID, Optional.empty(), scheduleID, sourceAccountID, createdOn, updatedOn, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PartialScheduleAccount> sourceAccount() {
        return (Optional<PartialScheduleAccount>) sourceAccount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PartialScheduleAccount> destinationAccount() {
        return (Optional<PartialScheduleAccount>) destinationAccount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PartialScheduleAccount> partnerAccount() {
        return (Optional<PartialScheduleAccount>) partnerAccount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Simple description to place on the transfer.
     */
    public ScheduleListResponse withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Simple description to place on the transfer.
     */
    public ScheduleListResponse withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public ScheduleListResponse withDestinationAccountID(String destinationAccountID) {
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        this.destinationAccountID = destinationAccountID;
        return this;
    }

    /**
     * The operating mode for an account.
     */
    public ScheduleListResponse withMode(Mode mode) {
        Utils.checkNotNull(mode, "mode");
        this.mode = mode;
        return this;
    }

    public ScheduleListResponse withOccurrences(List<OccurrencesResponse> occurrences) {
        Utils.checkNotNull(occurrences, "occurrences");
        this.occurrences = Optional.ofNullable(occurrences);
        return this;
    }

    public ScheduleListResponse withOccurrences(Optional<? extends List<OccurrencesResponse>> occurrences) {
        Utils.checkNotNull(occurrences, "occurrences");
        this.occurrences = occurrences;
        return this;
    }

    public ScheduleListResponse withOwnerAccountID(String ownerAccountID) {
        Utils.checkNotNull(ownerAccountID, "ownerAccountID");
        this.ownerAccountID = ownerAccountID;
        return this;
    }

    public ScheduleListResponse withPartnerAccountID(String partnerAccountID) {
        Utils.checkNotNull(partnerAccountID, "partnerAccountID");
        this.partnerAccountID = partnerAccountID;
        return this;
    }

    /**
     * Defines configuration for recurring transfers.
     */
    public ScheduleListResponse withRecur(Recur recur) {
        Utils.checkNotNull(recur, "recur");
        this.recur = Optional.ofNullable(recur);
        return this;
    }

    /**
     * Defines configuration for recurring transfers.
     */
    public ScheduleListResponse withRecur(Optional<? extends Recur> recur) {
        Utils.checkNotNull(recur, "recur");
        this.recur = recur;
        return this;
    }

    public ScheduleListResponse withScheduleID(String scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = scheduleID;
        return this;
    }

    public ScheduleListResponse withSourceAccountID(String sourceAccountID) {
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        this.sourceAccountID = sourceAccountID;
        return this;
    }

    public ScheduleListResponse withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    public ScheduleListResponse withUpdatedOn(OffsetDateTime updatedOn) {
        Utils.checkNotNull(updatedOn, "updatedOn");
        this.updatedOn = updatedOn;
        return this;
    }

    public ScheduleListResponse withDisabledOn(OffsetDateTime disabledOn) {
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.disabledOn = Optional.ofNullable(disabledOn);
        return this;
    }

    public ScheduleListResponse withDisabledOn(Optional<OffsetDateTime> disabledOn) {
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.disabledOn = disabledOn;
        return this;
    }

    public ScheduleListResponse withSourceAccount(PartialScheduleAccount sourceAccount) {
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        this.sourceAccount = Optional.ofNullable(sourceAccount);
        return this;
    }

    public ScheduleListResponse withSourceAccount(Optional<? extends PartialScheduleAccount> sourceAccount) {
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        this.sourceAccount = sourceAccount;
        return this;
    }

    public ScheduleListResponse withDestinationAccount(PartialScheduleAccount destinationAccount) {
        Utils.checkNotNull(destinationAccount, "destinationAccount");
        this.destinationAccount = Optional.ofNullable(destinationAccount);
        return this;
    }

    public ScheduleListResponse withDestinationAccount(Optional<? extends PartialScheduleAccount> destinationAccount) {
        Utils.checkNotNull(destinationAccount, "destinationAccount");
        this.destinationAccount = destinationAccount;
        return this;
    }

    public ScheduleListResponse withPartnerAccount(PartialScheduleAccount partnerAccount) {
        Utils.checkNotNull(partnerAccount, "partnerAccount");
        this.partnerAccount = Optional.ofNullable(partnerAccount);
        return this;
    }

    public ScheduleListResponse withPartnerAccount(Optional<? extends PartialScheduleAccount> partnerAccount) {
        Utils.checkNotNull(partnerAccount, "partnerAccount");
        this.partnerAccount = partnerAccount;
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
        ScheduleListResponse other = (ScheduleListResponse) o;
        return 
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.destinationAccountID, other.destinationAccountID) &&
            Objects.deepEquals(this.mode, other.mode) &&
            Objects.deepEquals(this.occurrences, other.occurrences) &&
            Objects.deepEquals(this.ownerAccountID, other.ownerAccountID) &&
            Objects.deepEquals(this.partnerAccountID, other.partnerAccountID) &&
            Objects.deepEquals(this.recur, other.recur) &&
            Objects.deepEquals(this.scheduleID, other.scheduleID) &&
            Objects.deepEquals(this.sourceAccountID, other.sourceAccountID) &&
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.updatedOn, other.updatedOn) &&
            Objects.deepEquals(this.disabledOn, other.disabledOn) &&
            Objects.deepEquals(this.sourceAccount, other.sourceAccount) &&
            Objects.deepEquals(this.destinationAccount, other.destinationAccount) &&
            Objects.deepEquals(this.partnerAccount, other.partnerAccount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            destinationAccountID,
            mode,
            occurrences,
            ownerAccountID,
            partnerAccountID,
            recur,
            scheduleID,
            sourceAccountID,
            createdOn,
            updatedOn,
            disabledOn,
            sourceAccount,
            destinationAccount,
            partnerAccount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ScheduleListResponse.class,
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
                "disabledOn", disabledOn,
                "sourceAccount", sourceAccount,
                "destinationAccount", destinationAccount,
                "partnerAccount", partnerAccount);
    }
    
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
 
        private Optional<? extends PartialScheduleAccount> sourceAccount = Optional.empty();
 
        private Optional<? extends PartialScheduleAccount> destinationAccount = Optional.empty();
 
        private Optional<? extends PartialScheduleAccount> partnerAccount = Optional.empty();  
        
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

        public Builder sourceAccount(PartialScheduleAccount sourceAccount) {
            Utils.checkNotNull(sourceAccount, "sourceAccount");
            this.sourceAccount = Optional.ofNullable(sourceAccount);
            return this;
        }

        public Builder sourceAccount(Optional<? extends PartialScheduleAccount> sourceAccount) {
            Utils.checkNotNull(sourceAccount, "sourceAccount");
            this.sourceAccount = sourceAccount;
            return this;
        }

        public Builder destinationAccount(PartialScheduleAccount destinationAccount) {
            Utils.checkNotNull(destinationAccount, "destinationAccount");
            this.destinationAccount = Optional.ofNullable(destinationAccount);
            return this;
        }

        public Builder destinationAccount(Optional<? extends PartialScheduleAccount> destinationAccount) {
            Utils.checkNotNull(destinationAccount, "destinationAccount");
            this.destinationAccount = destinationAccount;
            return this;
        }

        public Builder partnerAccount(PartialScheduleAccount partnerAccount) {
            Utils.checkNotNull(partnerAccount, "partnerAccount");
            this.partnerAccount = Optional.ofNullable(partnerAccount);
            return this;
        }

        public Builder partnerAccount(Optional<? extends PartialScheduleAccount> partnerAccount) {
            Utils.checkNotNull(partnerAccount, "partnerAccount");
            this.partnerAccount = partnerAccount;
            return this;
        }
        
        public ScheduleListResponse build() {
            return new ScheduleListResponse(
                description,
                destinationAccountID,
                mode,
                occurrences,
                ownerAccountID,
                partnerAccountID,
                recur,
                scheduleID,
                sourceAccountID,
                createdOn,
                updatedOn,
                disabledOn,
                sourceAccount,
                destinationAccount,
                partnerAccount);
        }
    }
}

