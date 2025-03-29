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
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

/**
 * Representative
 * 
 * <p>Describes a business representative.
 */
public class Representative {

    /**
     * Unique identifier for this representative.
     */
    @JsonProperty("representativeID")
    private String representativeID;

    @JsonProperty("name")
    private IndividualName name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private Optional<? extends PhoneNumber> phone;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends Address> address;

    /**
     * Indicates whether this representative's birth date has been provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("birthDateProvided")
    private Optional<Boolean> birthDateProvided;

    /**
     * Indicates whether a government ID (SSN, ITIN, etc.) has been provided for this representative.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("governmentIDProvided")
    private Optional<Boolean> governmentIDProvided;

    /**
     * Describes the job responsibilities of a business representative.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("responsibilities")
    private Optional<? extends RepresentativeResponsibilities> responsibilities;

    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;

    @JsonProperty("updatedOn")
    private OffsetDateTime updatedOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disabledOn")
    private Optional<OffsetDateTime> disabledOn;

    @JsonCreator
    public Representative(
            @JsonProperty("representativeID") String representativeID,
            @JsonProperty("name") IndividualName name,
            @JsonProperty("phone") Optional<? extends PhoneNumber> phone,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("address") Optional<? extends Address> address,
            @JsonProperty("birthDateProvided") Optional<Boolean> birthDateProvided,
            @JsonProperty("governmentIDProvided") Optional<Boolean> governmentIDProvided,
            @JsonProperty("responsibilities") Optional<? extends RepresentativeResponsibilities> responsibilities,
            @JsonProperty("createdOn") OffsetDateTime createdOn,
            @JsonProperty("updatedOn") OffsetDateTime updatedOn,
            @JsonProperty("disabledOn") Optional<OffsetDateTime> disabledOn) {
        Utils.checkNotNull(representativeID, "representativeID");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(birthDateProvided, "birthDateProvided");
        Utils.checkNotNull(governmentIDProvided, "governmentIDProvided");
        Utils.checkNotNull(responsibilities, "responsibilities");
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(updatedOn, "updatedOn");
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.representativeID = representativeID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.birthDateProvided = birthDateProvided;
        this.governmentIDProvided = governmentIDProvided;
        this.responsibilities = responsibilities;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.disabledOn = disabledOn;
    }
    
    public Representative(
            String representativeID,
            IndividualName name,
            OffsetDateTime createdOn,
            OffsetDateTime updatedOn) {
        this(representativeID, name, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), createdOn, updatedOn, Optional.empty());
    }

    /**
     * Unique identifier for this representative.
     */
    @JsonIgnore
    public String representativeID() {
        return representativeID;
    }

    @JsonIgnore
    public IndividualName name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PhoneNumber> phone() {
        return (Optional<PhoneNumber>) phone;
    }

    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Address> address() {
        return (Optional<Address>) address;
    }

    /**
     * Indicates whether this representative's birth date has been provided.
     */
    @JsonIgnore
    public Optional<Boolean> birthDateProvided() {
        return birthDateProvided;
    }

    /**
     * Indicates whether a government ID (SSN, ITIN, etc.) has been provided for this representative.
     */
    @JsonIgnore
    public Optional<Boolean> governmentIDProvided() {
        return governmentIDProvided;
    }

    /**
     * Describes the job responsibilities of a business representative.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RepresentativeResponsibilities> responsibilities() {
        return (Optional<RepresentativeResponsibilities>) responsibilities;
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

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Unique identifier for this representative.
     */
    public Representative withRepresentativeID(String representativeID) {
        Utils.checkNotNull(representativeID, "representativeID");
        this.representativeID = representativeID;
        return this;
    }

    public Representative withName(IndividualName name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Representative withPhone(PhoneNumber phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = Optional.ofNullable(phone);
        return this;
    }

    public Representative withPhone(Optional<? extends PhoneNumber> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    public Representative withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public Representative withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public Representative withAddress(Address address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public Representative withAddress(Optional<? extends Address> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * Indicates whether this representative's birth date has been provided.
     */
    public Representative withBirthDateProvided(boolean birthDateProvided) {
        Utils.checkNotNull(birthDateProvided, "birthDateProvided");
        this.birthDateProvided = Optional.ofNullable(birthDateProvided);
        return this;
    }

    /**
     * Indicates whether this representative's birth date has been provided.
     */
    public Representative withBirthDateProvided(Optional<Boolean> birthDateProvided) {
        Utils.checkNotNull(birthDateProvided, "birthDateProvided");
        this.birthDateProvided = birthDateProvided;
        return this;
    }

    /**
     * Indicates whether a government ID (SSN, ITIN, etc.) has been provided for this representative.
     */
    public Representative withGovernmentIDProvided(boolean governmentIDProvided) {
        Utils.checkNotNull(governmentIDProvided, "governmentIDProvided");
        this.governmentIDProvided = Optional.ofNullable(governmentIDProvided);
        return this;
    }

    /**
     * Indicates whether a government ID (SSN, ITIN, etc.) has been provided for this representative.
     */
    public Representative withGovernmentIDProvided(Optional<Boolean> governmentIDProvided) {
        Utils.checkNotNull(governmentIDProvided, "governmentIDProvided");
        this.governmentIDProvided = governmentIDProvided;
        return this;
    }

    /**
     * Describes the job responsibilities of a business representative.
     */
    public Representative withResponsibilities(RepresentativeResponsibilities responsibilities) {
        Utils.checkNotNull(responsibilities, "responsibilities");
        this.responsibilities = Optional.ofNullable(responsibilities);
        return this;
    }

    /**
     * Describes the job responsibilities of a business representative.
     */
    public Representative withResponsibilities(Optional<? extends RepresentativeResponsibilities> responsibilities) {
        Utils.checkNotNull(responsibilities, "responsibilities");
        this.responsibilities = responsibilities;
        return this;
    }

    public Representative withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    public Representative withUpdatedOn(OffsetDateTime updatedOn) {
        Utils.checkNotNull(updatedOn, "updatedOn");
        this.updatedOn = updatedOn;
        return this;
    }

    public Representative withDisabledOn(OffsetDateTime disabledOn) {
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.disabledOn = Optional.ofNullable(disabledOn);
        return this;
    }

    public Representative withDisabledOn(Optional<OffsetDateTime> disabledOn) {
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
        Representative other = (Representative) o;
        return 
            Objects.deepEquals(this.representativeID, other.representativeID) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.phone, other.phone) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.birthDateProvided, other.birthDateProvided) &&
            Objects.deepEquals(this.governmentIDProvided, other.governmentIDProvided) &&
            Objects.deepEquals(this.responsibilities, other.responsibilities) &&
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.updatedOn, other.updatedOn) &&
            Objects.deepEquals(this.disabledOn, other.disabledOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            representativeID,
            name,
            phone,
            email,
            address,
            birthDateProvided,
            governmentIDProvided,
            responsibilities,
            createdOn,
            updatedOn,
            disabledOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Representative.class,
                "representativeID", representativeID,
                "name", name,
                "phone", phone,
                "email", email,
                "address", address,
                "birthDateProvided", birthDateProvided,
                "governmentIDProvided", governmentIDProvided,
                "responsibilities", responsibilities,
                "createdOn", createdOn,
                "updatedOn", updatedOn,
                "disabledOn", disabledOn);
    }
    
    public final static class Builder {
 
        private String representativeID;
 
        private IndividualName name;
 
        private Optional<? extends PhoneNumber> phone = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private Optional<? extends Address> address = Optional.empty();
 
        private Optional<Boolean> birthDateProvided = Optional.empty();
 
        private Optional<Boolean> governmentIDProvided = Optional.empty();
 
        private Optional<? extends RepresentativeResponsibilities> responsibilities = Optional.empty();
 
        private OffsetDateTime createdOn;
 
        private OffsetDateTime updatedOn;
 
        private Optional<OffsetDateTime> disabledOn = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for this representative.
         */
        public Builder representativeID(String representativeID) {
            Utils.checkNotNull(representativeID, "representativeID");
            this.representativeID = representativeID;
            return this;
        }

        public Builder name(IndividualName name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder phone(PhoneNumber phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = Optional.ofNullable(phone);
            return this;
        }

        public Builder phone(Optional<? extends PhoneNumber> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder address(Address address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends Address> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * Indicates whether this representative's birth date has been provided.
         */
        public Builder birthDateProvided(boolean birthDateProvided) {
            Utils.checkNotNull(birthDateProvided, "birthDateProvided");
            this.birthDateProvided = Optional.ofNullable(birthDateProvided);
            return this;
        }

        /**
         * Indicates whether this representative's birth date has been provided.
         */
        public Builder birthDateProvided(Optional<Boolean> birthDateProvided) {
            Utils.checkNotNull(birthDateProvided, "birthDateProvided");
            this.birthDateProvided = birthDateProvided;
            return this;
        }

        /**
         * Indicates whether a government ID (SSN, ITIN, etc.) has been provided for this representative.
         */
        public Builder governmentIDProvided(boolean governmentIDProvided) {
            Utils.checkNotNull(governmentIDProvided, "governmentIDProvided");
            this.governmentIDProvided = Optional.ofNullable(governmentIDProvided);
            return this;
        }

        /**
         * Indicates whether a government ID (SSN, ITIN, etc.) has been provided for this representative.
         */
        public Builder governmentIDProvided(Optional<Boolean> governmentIDProvided) {
            Utils.checkNotNull(governmentIDProvided, "governmentIDProvided");
            this.governmentIDProvided = governmentIDProvided;
            return this;
        }

        /**
         * Describes the job responsibilities of a business representative.
         */
        public Builder responsibilities(RepresentativeResponsibilities responsibilities) {
            Utils.checkNotNull(responsibilities, "responsibilities");
            this.responsibilities = Optional.ofNullable(responsibilities);
            return this;
        }

        /**
         * Describes the job responsibilities of a business representative.
         */
        public Builder responsibilities(Optional<? extends RepresentativeResponsibilities> responsibilities) {
            Utils.checkNotNull(responsibilities, "responsibilities");
            this.responsibilities = responsibilities;
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
        
        public Representative build() {
            return new Representative(
                representativeID,
                name,
                phone,
                email,
                address,
                birthDateProvided,
                governmentIDProvided,
                responsibilities,
                createdOn,
                updatedOn,
                disabledOn);
        }
    }
}
