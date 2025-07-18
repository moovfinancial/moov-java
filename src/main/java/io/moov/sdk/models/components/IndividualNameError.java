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
import java.util.Optional;


public class IndividualNameError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstName")
    private Optional<String> firstName;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("middleName")
    private Optional<String> middleName;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastName")
    private Optional<String> lastName;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("suffix")
    private Optional<String> suffix;

    @JsonCreator
    public IndividualNameError(
            @JsonProperty("firstName") Optional<String> firstName,
            @JsonProperty("middleName") Optional<String> middleName,
            @JsonProperty("lastName") Optional<String> lastName,
            @JsonProperty("suffix") Optional<String> suffix) {
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(middleName, "middleName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(suffix, "suffix");
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }
    
    public IndividualNameError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    @JsonIgnore
    public Optional<String> firstName() {
        return firstName;
    }

    @JsonIgnore
    public Optional<String> middleName() {
        return middleName;
    }

    @JsonIgnore
    public Optional<String> lastName() {
        return lastName;
    }

    @JsonIgnore
    public Optional<String> suffix() {
        return suffix;
    }

    public static Builder builder() {
        return new Builder();
    }


    public IndividualNameError withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }


    public IndividualNameError withFirstName(Optional<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public IndividualNameError withMiddleName(String middleName) {
        Utils.checkNotNull(middleName, "middleName");
        this.middleName = Optional.ofNullable(middleName);
        return this;
    }


    public IndividualNameError withMiddleName(Optional<String> middleName) {
        Utils.checkNotNull(middleName, "middleName");
        this.middleName = middleName;
        return this;
    }

    public IndividualNameError withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }


    public IndividualNameError withLastName(Optional<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public IndividualNameError withSuffix(String suffix) {
        Utils.checkNotNull(suffix, "suffix");
        this.suffix = Optional.ofNullable(suffix);
        return this;
    }


    public IndividualNameError withSuffix(Optional<String> suffix) {
        Utils.checkNotNull(suffix, "suffix");
        this.suffix = suffix;
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
        IndividualNameError other = (IndividualNameError) o;
        return 
            Utils.enhancedDeepEquals(this.firstName, other.firstName) &&
            Utils.enhancedDeepEquals(this.middleName, other.middleName) &&
            Utils.enhancedDeepEquals(this.lastName, other.lastName) &&
            Utils.enhancedDeepEquals(this.suffix, other.suffix);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            firstName, middleName, lastName,
            suffix);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IndividualNameError.class,
                "firstName", firstName,
                "middleName", middleName,
                "lastName", lastName,
                "suffix", suffix);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> firstName = Optional.empty();

        private Optional<String> middleName = Optional.empty();

        private Optional<String> lastName = Optional.empty();

        private Optional<String> suffix = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        public Builder firstName(Optional<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }


        public Builder middleName(String middleName) {
            Utils.checkNotNull(middleName, "middleName");
            this.middleName = Optional.ofNullable(middleName);
            return this;
        }

        public Builder middleName(Optional<String> middleName) {
            Utils.checkNotNull(middleName, "middleName");
            this.middleName = middleName;
            return this;
        }


        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        public Builder lastName(Optional<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }


        public Builder suffix(String suffix) {
            Utils.checkNotNull(suffix, "suffix");
            this.suffix = Optional.ofNullable(suffix);
            return this;
        }

        public Builder suffix(Optional<String> suffix) {
            Utils.checkNotNull(suffix, "suffix");
            this.suffix = suffix;
            return this;
        }

        public IndividualNameError build() {

            return new IndividualNameError(
                firstName, middleName, lastName,
                suffix);
        }

    }
}
