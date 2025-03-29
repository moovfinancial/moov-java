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

public class UpdateRepresentativeGovernmentID {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssn")
    private Optional<? extends UpdateRepresentativeSsn> ssn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itin")
    private Optional<? extends UpdateRepresentativeItin> itin;

    @JsonCreator
    public UpdateRepresentativeGovernmentID(
            @JsonProperty("ssn") Optional<? extends UpdateRepresentativeSsn> ssn,
            @JsonProperty("itin") Optional<? extends UpdateRepresentativeItin> itin) {
        Utils.checkNotNull(ssn, "ssn");
        Utils.checkNotNull(itin, "itin");
        this.ssn = ssn;
        this.itin = itin;
    }
    
    public UpdateRepresentativeGovernmentID() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateRepresentativeSsn> ssn() {
        return (Optional<UpdateRepresentativeSsn>) ssn;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateRepresentativeItin> itin() {
        return (Optional<UpdateRepresentativeItin>) itin;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public UpdateRepresentativeGovernmentID withSsn(UpdateRepresentativeSsn ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = Optional.ofNullable(ssn);
        return this;
    }

    public UpdateRepresentativeGovernmentID withSsn(Optional<? extends UpdateRepresentativeSsn> ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = ssn;
        return this;
    }

    public UpdateRepresentativeGovernmentID withItin(UpdateRepresentativeItin itin) {
        Utils.checkNotNull(itin, "itin");
        this.itin = Optional.ofNullable(itin);
        return this;
    }

    public UpdateRepresentativeGovernmentID withItin(Optional<? extends UpdateRepresentativeItin> itin) {
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
        UpdateRepresentativeGovernmentID other = (UpdateRepresentativeGovernmentID) o;
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
        return Utils.toString(UpdateRepresentativeGovernmentID.class,
                "ssn", ssn,
                "itin", itin);
    }
    
    public final static class Builder {
 
        private Optional<? extends UpdateRepresentativeSsn> ssn = Optional.empty();
 
        private Optional<? extends UpdateRepresentativeItin> itin = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ssn(UpdateRepresentativeSsn ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = Optional.ofNullable(ssn);
            return this;
        }

        public Builder ssn(Optional<? extends UpdateRepresentativeSsn> ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = ssn;
            return this;
        }

        public Builder itin(UpdateRepresentativeItin itin) {
            Utils.checkNotNull(itin, "itin");
            this.itin = Optional.ofNullable(itin);
            return this;
        }

        public Builder itin(Optional<? extends UpdateRepresentativeItin> itin) {
            Utils.checkNotNull(itin, "itin");
            this.itin = itin;
            return this;
        }
        
        public UpdateRepresentativeGovernmentID build() {
            return new UpdateRepresentativeGovernmentID(
                ssn,
                itin);
        }
    }
}
