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
 * CreateAuthorizedUser - Fields for identifying an authorized individual.
 */

public class CreateAuthorizedUser {

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("birthDate")
    private Optional<? extends BirthDate> birthDate;

    @JsonCreator
    public CreateAuthorizedUser(
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName,
            @JsonProperty("birthDate") Optional<? extends BirthDate> birthDate) {
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(birthDate, "birthDate");
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    
    public CreateAuthorizedUser(
            String firstName,
            String lastName) {
        this(firstName, lastName, Optional.empty());
    }

    @JsonIgnore
    public String firstName() {
        return firstName;
    }

    @JsonIgnore
    public String lastName() {
        return lastName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BirthDate> birthDate() {
        return (Optional<BirthDate>) birthDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateAuthorizedUser withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public CreateAuthorizedUser withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public CreateAuthorizedUser withBirthDate(BirthDate birthDate) {
        Utils.checkNotNull(birthDate, "birthDate");
        this.birthDate = Optional.ofNullable(birthDate);
        return this;
    }

    public CreateAuthorizedUser withBirthDate(Optional<? extends BirthDate> birthDate) {
        Utils.checkNotNull(birthDate, "birthDate");
        this.birthDate = birthDate;
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
        CreateAuthorizedUser other = (CreateAuthorizedUser) o;
        return 
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.birthDate, other.birthDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            firstName,
            lastName,
            birthDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAuthorizedUser.class,
                "firstName", firstName,
                "lastName", lastName,
                "birthDate", birthDate);
    }
    
    public final static class Builder {
 
        private String firstName;
 
        private String lastName;
 
        private Optional<? extends BirthDate> birthDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder birthDate(BirthDate birthDate) {
            Utils.checkNotNull(birthDate, "birthDate");
            this.birthDate = Optional.ofNullable(birthDate);
            return this;
        }

        public Builder birthDate(Optional<? extends BirthDate> birthDate) {
            Utils.checkNotNull(birthDate, "birthDate");
            this.birthDate = birthDate;
            return this;
        }
        
        public CreateAuthorizedUser build() {
            return new CreateAuthorizedUser(
                firstName,
                lastName,
                birthDate);
        }
    }
}

