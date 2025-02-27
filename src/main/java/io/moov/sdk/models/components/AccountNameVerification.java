/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
/**
 * AccountNameVerification - The results of submitting cardholder name to a card network for verification.
 */

public class AccountNameVerification {

    @JsonProperty("firstName")
    private CardVerificationResult firstName;

    @JsonProperty("lastName")
    private CardVerificationResult lastName;

    @JsonProperty("middleName")
    private CardVerificationResult middleName;

    @JsonProperty("fullName")
    private CardVerificationResult fullName;

    @JsonCreator
    public AccountNameVerification(
            @JsonProperty("firstName") CardVerificationResult firstName,
            @JsonProperty("lastName") CardVerificationResult lastName,
            @JsonProperty("middleName") CardVerificationResult middleName,
            @JsonProperty("fullName") CardVerificationResult fullName) {
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(middleName, "middleName");
        Utils.checkNotNull(fullName, "fullName");
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.fullName = fullName;
    }

    @JsonIgnore
    public CardVerificationResult firstName() {
        return firstName;
    }

    @JsonIgnore
    public CardVerificationResult lastName() {
        return lastName;
    }

    @JsonIgnore
    public CardVerificationResult middleName() {
        return middleName;
    }

    @JsonIgnore
    public CardVerificationResult fullName() {
        return fullName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccountNameVerification withFirstName(CardVerificationResult firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public AccountNameVerification withLastName(CardVerificationResult lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public AccountNameVerification withMiddleName(CardVerificationResult middleName) {
        Utils.checkNotNull(middleName, "middleName");
        this.middleName = middleName;
        return this;
    }

    public AccountNameVerification withFullName(CardVerificationResult fullName) {
        Utils.checkNotNull(fullName, "fullName");
        this.fullName = fullName;
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
        AccountNameVerification other = (AccountNameVerification) o;
        return 
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.middleName, other.middleName) &&
            Objects.deepEquals(this.fullName, other.fullName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            firstName,
            lastName,
            middleName,
            fullName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountNameVerification.class,
                "firstName", firstName,
                "lastName", lastName,
                "middleName", middleName,
                "fullName", fullName);
    }
    
    public final static class Builder {
 
        private CardVerificationResult firstName;
 
        private CardVerificationResult lastName;
 
        private CardVerificationResult middleName;
 
        private CardVerificationResult fullName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder firstName(CardVerificationResult firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(CardVerificationResult lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder middleName(CardVerificationResult middleName) {
            Utils.checkNotNull(middleName, "middleName");
            this.middleName = middleName;
            return this;
        }

        public Builder fullName(CardVerificationResult fullName) {
            Utils.checkNotNull(fullName, "fullName");
            this.fullName = fullName;
            return this;
        }
        
        public AccountNameVerification build() {
            return new AccountNameVerification(
                firstName,
                lastName,
                middleName,
                fullName);
        }
    }
}

