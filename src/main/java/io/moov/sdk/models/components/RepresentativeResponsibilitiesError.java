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


public class RepresentativeResponsibilitiesError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isController")
    private Optional<String> isController;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isOwner")
    private Optional<String> isOwner;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ownershipPercentage")
    private Optional<String> ownershipPercentage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jobTitle")
    private Optional<String> jobTitle;

    @JsonCreator
    public RepresentativeResponsibilitiesError(
            @JsonProperty("isController") Optional<String> isController,
            @JsonProperty("isOwner") Optional<String> isOwner,
            @JsonProperty("ownershipPercentage") Optional<String> ownershipPercentage,
            @JsonProperty("jobTitle") Optional<String> jobTitle) {
        Utils.checkNotNull(isController, "isController");
        Utils.checkNotNull(isOwner, "isOwner");
        Utils.checkNotNull(ownershipPercentage, "ownershipPercentage");
        Utils.checkNotNull(jobTitle, "jobTitle");
        this.isController = isController;
        this.isOwner = isOwner;
        this.ownershipPercentage = ownershipPercentage;
        this.jobTitle = jobTitle;
    }
    
    public RepresentativeResponsibilitiesError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> isController() {
        return isController;
    }

    @JsonIgnore
    public Optional<String> isOwner() {
        return isOwner;
    }

    @JsonIgnore
    public Optional<String> ownershipPercentage() {
        return ownershipPercentage;
    }

    @JsonIgnore
    public Optional<String> jobTitle() {
        return jobTitle;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RepresentativeResponsibilitiesError withIsController(String isController) {
        Utils.checkNotNull(isController, "isController");
        this.isController = Optional.ofNullable(isController);
        return this;
    }

    public RepresentativeResponsibilitiesError withIsController(Optional<String> isController) {
        Utils.checkNotNull(isController, "isController");
        this.isController = isController;
        return this;
    }

    public RepresentativeResponsibilitiesError withIsOwner(String isOwner) {
        Utils.checkNotNull(isOwner, "isOwner");
        this.isOwner = Optional.ofNullable(isOwner);
        return this;
    }

    public RepresentativeResponsibilitiesError withIsOwner(Optional<String> isOwner) {
        Utils.checkNotNull(isOwner, "isOwner");
        this.isOwner = isOwner;
        return this;
    }

    public RepresentativeResponsibilitiesError withOwnershipPercentage(String ownershipPercentage) {
        Utils.checkNotNull(ownershipPercentage, "ownershipPercentage");
        this.ownershipPercentage = Optional.ofNullable(ownershipPercentage);
        return this;
    }

    public RepresentativeResponsibilitiesError withOwnershipPercentage(Optional<String> ownershipPercentage) {
        Utils.checkNotNull(ownershipPercentage, "ownershipPercentage");
        this.ownershipPercentage = ownershipPercentage;
        return this;
    }

    public RepresentativeResponsibilitiesError withJobTitle(String jobTitle) {
        Utils.checkNotNull(jobTitle, "jobTitle");
        this.jobTitle = Optional.ofNullable(jobTitle);
        return this;
    }

    public RepresentativeResponsibilitiesError withJobTitle(Optional<String> jobTitle) {
        Utils.checkNotNull(jobTitle, "jobTitle");
        this.jobTitle = jobTitle;
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
        RepresentativeResponsibilitiesError other = (RepresentativeResponsibilitiesError) o;
        return 
            Objects.deepEquals(this.isController, other.isController) &&
            Objects.deepEquals(this.isOwner, other.isOwner) &&
            Objects.deepEquals(this.ownershipPercentage, other.ownershipPercentage) &&
            Objects.deepEquals(this.jobTitle, other.jobTitle);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            isController,
            isOwner,
            ownershipPercentage,
            jobTitle);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RepresentativeResponsibilitiesError.class,
                "isController", isController,
                "isOwner", isOwner,
                "ownershipPercentage", ownershipPercentage,
                "jobTitle", jobTitle);
    }
    
    public final static class Builder {
 
        private Optional<String> isController = Optional.empty();
 
        private Optional<String> isOwner = Optional.empty();
 
        private Optional<String> ownershipPercentage = Optional.empty();
 
        private Optional<String> jobTitle = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder isController(String isController) {
            Utils.checkNotNull(isController, "isController");
            this.isController = Optional.ofNullable(isController);
            return this;
        }

        public Builder isController(Optional<String> isController) {
            Utils.checkNotNull(isController, "isController");
            this.isController = isController;
            return this;
        }

        public Builder isOwner(String isOwner) {
            Utils.checkNotNull(isOwner, "isOwner");
            this.isOwner = Optional.ofNullable(isOwner);
            return this;
        }

        public Builder isOwner(Optional<String> isOwner) {
            Utils.checkNotNull(isOwner, "isOwner");
            this.isOwner = isOwner;
            return this;
        }

        public Builder ownershipPercentage(String ownershipPercentage) {
            Utils.checkNotNull(ownershipPercentage, "ownershipPercentage");
            this.ownershipPercentage = Optional.ofNullable(ownershipPercentage);
            return this;
        }

        public Builder ownershipPercentage(Optional<String> ownershipPercentage) {
            Utils.checkNotNull(ownershipPercentage, "ownershipPercentage");
            this.ownershipPercentage = ownershipPercentage;
            return this;
        }

        public Builder jobTitle(String jobTitle) {
            Utils.checkNotNull(jobTitle, "jobTitle");
            this.jobTitle = Optional.ofNullable(jobTitle);
            return this;
        }

        public Builder jobTitle(Optional<String> jobTitle) {
            Utils.checkNotNull(jobTitle, "jobTitle");
            this.jobTitle = jobTitle;
            return this;
        }
        
        public RepresentativeResponsibilitiesError build() {
            return new RepresentativeResponsibilitiesError(
                isController,
                isOwner,
                ownershipPercentage,
                jobTitle);
        }
    }
}

