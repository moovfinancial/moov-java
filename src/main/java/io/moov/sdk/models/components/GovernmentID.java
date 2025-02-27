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
import java.util.Objects;
import java.util.Optional;

public class GovernmentID {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssn")
    private Optional<? extends Ssn> ssn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itin")
    private Optional<? extends Itin> itin;

    @JsonCreator
    public GovernmentID(
            @JsonProperty("ssn") Optional<? extends Ssn> ssn,
            @JsonProperty("itin") Optional<? extends Itin> itin) {
        Utils.checkNotNull(ssn, "ssn");
        Utils.checkNotNull(itin, "itin");
        this.ssn = ssn;
        this.itin = itin;
    }
    
    public GovernmentID() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Ssn> ssn() {
        return (Optional<Ssn>) ssn;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Itin> itin() {
        return (Optional<Itin>) itin;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GovernmentID withSsn(Ssn ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = Optional.ofNullable(ssn);
        return this;
    }

    public GovernmentID withSsn(Optional<? extends Ssn> ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = ssn;
        return this;
    }

    public GovernmentID withItin(Itin itin) {
        Utils.checkNotNull(itin, "itin");
        this.itin = Optional.ofNullable(itin);
        return this;
    }

    public GovernmentID withItin(Optional<? extends Itin> itin) {
        Utils.checkNotNull(itin, "itin");
        this.itin = itin;
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
        GovernmentID other = (GovernmentID) o;
        return 
            Objects.deepEquals(this.ssn, other.ssn) &&
            Objects.deepEquals(this.itin, other.itin);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ssn,
            itin);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GovernmentID.class,
                "ssn", ssn,
                "itin", itin);
    }
    
    public final static class Builder {
 
        private Optional<? extends Ssn> ssn = Optional.empty();
 
        private Optional<? extends Itin> itin = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ssn(Ssn ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = Optional.ofNullable(ssn);
            return this;
        }

        public Builder ssn(Optional<? extends Ssn> ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = ssn;
            return this;
        }

        public Builder itin(Itin itin) {
            Utils.checkNotNull(itin, "itin");
            this.itin = Optional.ofNullable(itin);
            return this;
        }

        public Builder itin(Optional<? extends Itin> itin) {
            Utils.checkNotNull(itin, "itin");
            this.itin = itin;
            return this;
        }
        
        public GovernmentID build() {
            return new GovernmentID(
                ssn,
                itin);
        }
    }
}

