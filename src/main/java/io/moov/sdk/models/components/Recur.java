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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

/**
 * Recur - Defines configuration for recurring transfers.
 */

public class Recur {

    /**
     *   RRule as defined by RFC 5545 (https://www.rfc-editor.org/rfc/rfc5545#section-3.3.10). 
     *   Generators available online at the following sites - https://freetools.textmagic.com/rrule-generator, https://jkbrzt.github.io/rrule/
     */
    @JsonProperty("recurrenceRule")
    private String recurrenceRule;

    /**
     * Defines the attributes of a transfer.
     */
    @JsonProperty("runTransfer")
    private RunTransfer runTransfer;

    /**
     * True if the RRule set runs indefinitely.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("indefinite")
    private Optional<Boolean> indefinite;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start")
    private Optional<OffsetDateTime> start;

    @JsonCreator
    public Recur(
            @JsonProperty("recurrenceRule") String recurrenceRule,
            @JsonProperty("runTransfer") RunTransfer runTransfer,
            @JsonProperty("indefinite") Optional<Boolean> indefinite,
            @JsonProperty("start") Optional<OffsetDateTime> start) {
        Utils.checkNotNull(recurrenceRule, "recurrenceRule");
        Utils.checkNotNull(runTransfer, "runTransfer");
        Utils.checkNotNull(indefinite, "indefinite");
        Utils.checkNotNull(start, "start");
        this.recurrenceRule = recurrenceRule;
        this.runTransfer = runTransfer;
        this.indefinite = indefinite;
        this.start = start;
    }
    
    public Recur(
            String recurrenceRule,
            RunTransfer runTransfer) {
        this(recurrenceRule, runTransfer, Optional.empty(), Optional.empty());
    }

    /**
     *   RRule as defined by RFC 5545 (https://www.rfc-editor.org/rfc/rfc5545#section-3.3.10). 
     *   Generators available online at the following sites - https://freetools.textmagic.com/rrule-generator, https://jkbrzt.github.io/rrule/
     */
    @JsonIgnore
    public String recurrenceRule() {
        return recurrenceRule;
    }

    /**
     * Defines the attributes of a transfer.
     */
    @JsonIgnore
    public RunTransfer runTransfer() {
        return runTransfer;
    }

    /**
     * True if the RRule set runs indefinitely.
     */
    @JsonIgnore
    public Optional<Boolean> indefinite() {
        return indefinite;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> start() {
        return start;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     *   RRule as defined by RFC 5545 (https://www.rfc-editor.org/rfc/rfc5545#section-3.3.10). 
     *   Generators available online at the following sites - https://freetools.textmagic.com/rrule-generator, https://jkbrzt.github.io/rrule/
     */
    public Recur withRecurrenceRule(String recurrenceRule) {
        Utils.checkNotNull(recurrenceRule, "recurrenceRule");
        this.recurrenceRule = recurrenceRule;
        return this;
    }

    /**
     * Defines the attributes of a transfer.
     */
    public Recur withRunTransfer(RunTransfer runTransfer) {
        Utils.checkNotNull(runTransfer, "runTransfer");
        this.runTransfer = runTransfer;
        return this;
    }

    /**
     * True if the RRule set runs indefinitely.
     */
    public Recur withIndefinite(boolean indefinite) {
        Utils.checkNotNull(indefinite, "indefinite");
        this.indefinite = Optional.ofNullable(indefinite);
        return this;
    }

    /**
     * True if the RRule set runs indefinitely.
     */
    public Recur withIndefinite(Optional<Boolean> indefinite) {
        Utils.checkNotNull(indefinite, "indefinite");
        this.indefinite = indefinite;
        return this;
    }

    public Recur withStart(OffsetDateTime start) {
        Utils.checkNotNull(start, "start");
        this.start = Optional.ofNullable(start);
        return this;
    }

    public Recur withStart(Optional<OffsetDateTime> start) {
        Utils.checkNotNull(start, "start");
        this.start = start;
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
        Recur other = (Recur) o;
        return 
            Objects.deepEquals(this.recurrenceRule, other.recurrenceRule) &&
            Objects.deepEquals(this.runTransfer, other.runTransfer) &&
            Objects.deepEquals(this.indefinite, other.indefinite) &&
            Objects.deepEquals(this.start, other.start);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            recurrenceRule,
            runTransfer,
            indefinite,
            start);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Recur.class,
                "recurrenceRule", recurrenceRule,
                "runTransfer", runTransfer,
                "indefinite", indefinite,
                "start", start);
    }
    
    public final static class Builder {
 
        private String recurrenceRule;
 
        private RunTransfer runTransfer;
 
        private Optional<Boolean> indefinite = Optional.empty();
 
        private Optional<OffsetDateTime> start = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         *   RRule as defined by RFC 5545 (https://www.rfc-editor.org/rfc/rfc5545#section-3.3.10). 
         *   Generators available online at the following sites - https://freetools.textmagic.com/rrule-generator, https://jkbrzt.github.io/rrule/
         */
        public Builder recurrenceRule(String recurrenceRule) {
            Utils.checkNotNull(recurrenceRule, "recurrenceRule");
            this.recurrenceRule = recurrenceRule;
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

        public Builder start(OffsetDateTime start) {
            Utils.checkNotNull(start, "start");
            this.start = Optional.ofNullable(start);
            return this;
        }

        public Builder start(Optional<OffsetDateTime> start) {
            Utils.checkNotNull(start, "start");
            this.start = start;
            return this;
        }
        
        public Recur build() {
            return new Recur(
                recurrenceRule,
                runTransfer,
                indefinite,
                start);
        }
    }
}

