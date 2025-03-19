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


public class CreateBusinessErrorTaxID {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ein")
    private Optional<? extends CreateBusinessErrorEin> ein;

    @JsonCreator
    public CreateBusinessErrorTaxID(
            @JsonProperty("ein") Optional<? extends CreateBusinessErrorEin> ein) {
        Utils.checkNotNull(ein, "ein");
        this.ein = ein;
    }
    
    public CreateBusinessErrorTaxID() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateBusinessErrorEin> ein() {
        return (Optional<CreateBusinessErrorEin>) ein;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateBusinessErrorTaxID withEin(CreateBusinessErrorEin ein) {
        Utils.checkNotNull(ein, "ein");
        this.ein = Optional.ofNullable(ein);
        return this;
    }

    public CreateBusinessErrorTaxID withEin(Optional<? extends CreateBusinessErrorEin> ein) {
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
        CreateBusinessErrorTaxID other = (CreateBusinessErrorTaxID) o;
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
        return Utils.toString(CreateBusinessErrorTaxID.class,
                "ein", ein);
    }
    
    public final static class Builder {
 
        private Optional<? extends CreateBusinessErrorEin> ein = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ein(CreateBusinessErrorEin ein) {
            Utils.checkNotNull(ein, "ein");
            this.ein = Optional.ofNullable(ein);
            return this;
        }

        public Builder ein(Optional<? extends CreateBusinessErrorEin> ein) {
            Utils.checkNotNull(ein, "ein");
            this.ein = ein;
            return this;
        }
        
        public CreateBusinessErrorTaxID build() {
            return new CreateBusinessErrorTaxID(
                ein);
        }
    }
}

