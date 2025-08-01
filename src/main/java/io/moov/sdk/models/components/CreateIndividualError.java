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
import java.util.Optional;


public class CreateIndividualError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends IndividualNameError> name;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private Optional<? extends PhoneNumberError> phone;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends AddressError> address;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("birthDate")
    private Optional<? extends BirthDateError> birthDate;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("governmentID")
    private Optional<? extends CreateIndividualErrorGovernmentID> governmentID;

    @JsonCreator
    public CreateIndividualError(
            @JsonProperty("name") Optional<? extends IndividualNameError> name,
            @JsonProperty("phone") Optional<? extends PhoneNumberError> phone,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("address") Optional<? extends AddressError> address,
            @JsonProperty("birthDate") Optional<? extends BirthDateError> birthDate,
            @JsonProperty("governmentID") Optional<? extends CreateIndividualErrorGovernmentID> governmentID) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(birthDate, "birthDate");
        Utils.checkNotNull(governmentID, "governmentID");
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.governmentID = governmentID;
    }
    
    public CreateIndividualError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IndividualNameError> name() {
        return (Optional<IndividualNameError>) name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PhoneNumberError> phone() {
        return (Optional<PhoneNumberError>) phone;
    }

    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AddressError> address() {
        return (Optional<AddressError>) address;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BirthDateError> birthDate() {
        return (Optional<BirthDateError>) birthDate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateIndividualErrorGovernmentID> governmentID() {
        return (Optional<CreateIndividualErrorGovernmentID>) governmentID;
    }

    public static Builder builder() {
        return new Builder();
    }


    public CreateIndividualError withName(IndividualNameError name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }


    public CreateIndividualError withName(Optional<? extends IndividualNameError> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CreateIndividualError withPhone(PhoneNumberError phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = Optional.ofNullable(phone);
        return this;
    }


    public CreateIndividualError withPhone(Optional<? extends PhoneNumberError> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    public CreateIndividualError withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }


    public CreateIndividualError withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public CreateIndividualError withAddress(AddressError address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }


    public CreateIndividualError withAddress(Optional<? extends AddressError> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public CreateIndividualError withBirthDate(BirthDateError birthDate) {
        Utils.checkNotNull(birthDate, "birthDate");
        this.birthDate = Optional.ofNullable(birthDate);
        return this;
    }


    public CreateIndividualError withBirthDate(Optional<? extends BirthDateError> birthDate) {
        Utils.checkNotNull(birthDate, "birthDate");
        this.birthDate = birthDate;
        return this;
    }

    public CreateIndividualError withGovernmentID(CreateIndividualErrorGovernmentID governmentID) {
        Utils.checkNotNull(governmentID, "governmentID");
        this.governmentID = Optional.ofNullable(governmentID);
        return this;
    }


    public CreateIndividualError withGovernmentID(Optional<? extends CreateIndividualErrorGovernmentID> governmentID) {
        Utils.checkNotNull(governmentID, "governmentID");
        this.governmentID = governmentID;
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
        CreateIndividualError other = (CreateIndividualError) o;
        return 
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.phone, other.phone) &&
            Utils.enhancedDeepEquals(this.email, other.email) &&
            Utils.enhancedDeepEquals(this.address, other.address) &&
            Utils.enhancedDeepEquals(this.birthDate, other.birthDate) &&
            Utils.enhancedDeepEquals(this.governmentID, other.governmentID);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            name, phone, email,
            address, birthDate, governmentID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateIndividualError.class,
                "name", name,
                "phone", phone,
                "email", email,
                "address", address,
                "birthDate", birthDate,
                "governmentID", governmentID);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends IndividualNameError> name = Optional.empty();

        private Optional<? extends PhoneNumberError> phone = Optional.empty();

        private Optional<String> email = Optional.empty();

        private Optional<? extends AddressError> address = Optional.empty();

        private Optional<? extends BirthDateError> birthDate = Optional.empty();

        private Optional<? extends CreateIndividualErrorGovernmentID> governmentID = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder name(IndividualNameError name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends IndividualNameError> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        public Builder phone(PhoneNumberError phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = Optional.ofNullable(phone);
            return this;
        }

        public Builder phone(Optional<? extends PhoneNumberError> phone) {
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


        public Builder address(AddressError address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends AddressError> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }


        public Builder birthDate(BirthDateError birthDate) {
            Utils.checkNotNull(birthDate, "birthDate");
            this.birthDate = Optional.ofNullable(birthDate);
            return this;
        }

        public Builder birthDate(Optional<? extends BirthDateError> birthDate) {
            Utils.checkNotNull(birthDate, "birthDate");
            this.birthDate = birthDate;
            return this;
        }


        public Builder governmentID(CreateIndividualErrorGovernmentID governmentID) {
            Utils.checkNotNull(governmentID, "governmentID");
            this.governmentID = Optional.ofNullable(governmentID);
            return this;
        }

        public Builder governmentID(Optional<? extends CreateIndividualErrorGovernmentID> governmentID) {
            Utils.checkNotNull(governmentID, "governmentID");
            this.governmentID = governmentID;
            return this;
        }

        public CreateIndividualError build() {

            return new CreateIndividualError(
                name, phone, email,
                address, birthDate, governmentID);
        }

    }
}
