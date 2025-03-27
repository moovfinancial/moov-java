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
/**
 * TaxIDUpdate
 * 
 * <p>An EIN (employer identification number) for the business. For sole proprietors, an SSN can be used as the EIN.
 */

public class TaxIDUpdate {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ein")
    private Optional<? extends TaxIDUpdateEin> ein;

    @JsonCreator
    public TaxIDUpdate(
            @JsonProperty("ein") Optional<? extends TaxIDUpdateEin> ein) {
        Utils.checkNotNull(ein, "ein");
        this.ein = ein;
    }
    
    public TaxIDUpdate() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaxIDUpdateEin> ein() {
        return (Optional<TaxIDUpdateEin>) ein;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TaxIDUpdate withEin(TaxIDUpdateEin ein) {
        Utils.checkNotNull(ein, "ein");
        this.ein = Optional.ofNullable(ein);
        return this;
    }

    public TaxIDUpdate withEin(Optional<? extends TaxIDUpdateEin> ein) {
        Utils.checkNotNull(ein, "ein");
        this.ein = ein;
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
        TaxIDUpdate other = (TaxIDUpdate) o;
        return 
            Objects.deepEquals(this.ein, other.ein);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ein);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxIDUpdate.class,
                "ein", ein);
    }
    
    public final static class Builder {
 
        private Optional<? extends TaxIDUpdateEin> ein = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ein(TaxIDUpdateEin ein) {
            Utils.checkNotNull(ein, "ein");
            this.ein = Optional.ofNullable(ein);
            return this;
        }

        public Builder ein(Optional<? extends TaxIDUpdateEin> ein) {
            Utils.checkNotNull(ein, "ein");
            this.ein = ein;
            return this;
        }
        
        public TaxIDUpdate build() {
            return new TaxIDUpdate(
                ein);
        }
    }
}

