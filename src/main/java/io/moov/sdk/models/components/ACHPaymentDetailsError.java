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
import java.util.Objects;
import java.util.Optional;


public class ACHPaymentDetailsError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("companyEntryDescription")
    private Optional<String> companyEntryDescription;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("originatingCompanyName")
    private Optional<String> originatingCompanyName;

    @JsonCreator
    public ACHPaymentDetailsError(
            @JsonProperty("companyEntryDescription") Optional<String> companyEntryDescription,
            @JsonProperty("originatingCompanyName") Optional<String> originatingCompanyName) {
        Utils.checkNotNull(companyEntryDescription, "companyEntryDescription");
        Utils.checkNotNull(originatingCompanyName, "originatingCompanyName");
        this.companyEntryDescription = companyEntryDescription;
        this.originatingCompanyName = originatingCompanyName;
    }
    
    public ACHPaymentDetailsError() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> companyEntryDescription() {
        return companyEntryDescription;
    }

    @JsonIgnore
    public Optional<String> originatingCompanyName() {
        return originatingCompanyName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ACHPaymentDetailsError withCompanyEntryDescription(String companyEntryDescription) {
        Utils.checkNotNull(companyEntryDescription, "companyEntryDescription");
        this.companyEntryDescription = Optional.ofNullable(companyEntryDescription);
        return this;
    }

    public ACHPaymentDetailsError withCompanyEntryDescription(Optional<String> companyEntryDescription) {
        Utils.checkNotNull(companyEntryDescription, "companyEntryDescription");
        this.companyEntryDescription = companyEntryDescription;
        return this;
    }

    public ACHPaymentDetailsError withOriginatingCompanyName(String originatingCompanyName) {
        Utils.checkNotNull(originatingCompanyName, "originatingCompanyName");
        this.originatingCompanyName = Optional.ofNullable(originatingCompanyName);
        return this;
    }

    public ACHPaymentDetailsError withOriginatingCompanyName(Optional<String> originatingCompanyName) {
        Utils.checkNotNull(originatingCompanyName, "originatingCompanyName");
        this.originatingCompanyName = originatingCompanyName;
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
        ACHPaymentDetailsError other = (ACHPaymentDetailsError) o;
        return 
            Objects.deepEquals(this.companyEntryDescription, other.companyEntryDescription) &&
            Objects.deepEquals(this.originatingCompanyName, other.originatingCompanyName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyEntryDescription,
            originatingCompanyName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ACHPaymentDetailsError.class,
                "companyEntryDescription", companyEntryDescription,
                "originatingCompanyName", originatingCompanyName);
    }
    
    public final static class Builder {
 
        private Optional<String> companyEntryDescription = Optional.empty();
 
        private Optional<String> originatingCompanyName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder companyEntryDescription(String companyEntryDescription) {
            Utils.checkNotNull(companyEntryDescription, "companyEntryDescription");
            this.companyEntryDescription = Optional.ofNullable(companyEntryDescription);
            return this;
        }

        public Builder companyEntryDescription(Optional<String> companyEntryDescription) {
            Utils.checkNotNull(companyEntryDescription, "companyEntryDescription");
            this.companyEntryDescription = companyEntryDescription;
            return this;
        }

        public Builder originatingCompanyName(String originatingCompanyName) {
            Utils.checkNotNull(originatingCompanyName, "originatingCompanyName");
            this.originatingCompanyName = Optional.ofNullable(originatingCompanyName);
            return this;
        }

        public Builder originatingCompanyName(Optional<String> originatingCompanyName) {
            Utils.checkNotNull(originatingCompanyName, "originatingCompanyName");
            this.originatingCompanyName = originatingCompanyName;
            return this;
        }
        
        public ACHPaymentDetailsError build() {
            return new ACHPaymentDetailsError(
                companyEntryDescription,
                originatingCompanyName);
        }
    }
}

