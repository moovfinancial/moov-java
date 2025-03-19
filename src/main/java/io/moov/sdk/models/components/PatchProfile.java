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
 * PatchProfile - Describes the fields available when patching a profile.
 * Each object can be patched independent of patching the other fields.
 */

public class PatchProfile {

    /**
     * Describes the fields available when patching an individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("individual")
    private Optional<? extends PatchIndividual> individual;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("business")
    private Optional<? extends PatchBusiness> business;

    @JsonCreator
    public PatchProfile(
            @JsonProperty("individual") Optional<? extends PatchIndividual> individual,
            @JsonProperty("business") Optional<? extends PatchBusiness> business) {
        Utils.checkNotNull(individual, "individual");
        Utils.checkNotNull(business, "business");
        this.individual = individual;
        this.business = business;
    }
    
    public PatchProfile() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Describes the fields available when patching an individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PatchIndividual> individual() {
        return (Optional<PatchIndividual>) individual;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PatchBusiness> business() {
        return (Optional<PatchBusiness>) business;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Describes the fields available when patching an individual.
     */
    public PatchProfile withIndividual(PatchIndividual individual) {
        Utils.checkNotNull(individual, "individual");
        this.individual = Optional.ofNullable(individual);
        return this;
    }

    /**
     * Describes the fields available when patching an individual.
     */
    public PatchProfile withIndividual(Optional<? extends PatchIndividual> individual) {
        Utils.checkNotNull(individual, "individual");
        this.individual = individual;
        return this;
    }

    public PatchProfile withBusiness(PatchBusiness business) {
        Utils.checkNotNull(business, "business");
        this.business = Optional.ofNullable(business);
        return this;
    }

    public PatchProfile withBusiness(Optional<? extends PatchBusiness> business) {
        Utils.checkNotNull(business, "business");
        this.business = business;
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
        PatchProfile other = (PatchProfile) o;
        return 
            Objects.deepEquals(this.individual, other.individual) &&
            Objects.deepEquals(this.business, other.business);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            individual,
            business);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchProfile.class,
                "individual", individual,
                "business", business);
    }
    
    public final static class Builder {
 
        private Optional<? extends PatchIndividual> individual = Optional.empty();
 
        private Optional<? extends PatchBusiness> business = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Describes the fields available when patching an individual.
         */
        public Builder individual(PatchIndividual individual) {
            Utils.checkNotNull(individual, "individual");
            this.individual = Optional.ofNullable(individual);
            return this;
        }

        /**
         * Describes the fields available when patching an individual.
         */
        public Builder individual(Optional<? extends PatchIndividual> individual) {
            Utils.checkNotNull(individual, "individual");
            this.individual = individual;
            return this;
        }

        public Builder business(PatchBusiness business) {
            Utils.checkNotNull(business, "business");
            this.business = Optional.ofNullable(business);
            return this;
        }

        public Builder business(Optional<? extends PatchBusiness> business) {
            Utils.checkNotNull(business, "business");
            this.business = business;
            return this;
        }
        
        public PatchProfile build() {
            return new PatchProfile(
                individual,
                business);
        }
    }
}

