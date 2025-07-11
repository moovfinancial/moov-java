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

/**
 * AuthorizedUser
 * 
 * <p>Fields for identifying an authorized individual.
 */
public class AuthorizedUser {

    @JsonProperty("firstName")
    private String firstName;


    @JsonProperty("lastName")
    private String lastName;

    @JsonCreator
    public AuthorizedUser(
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName) {
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @JsonIgnore
    public String firstName() {
        return firstName;
    }

    @JsonIgnore
    public String lastName() {
        return lastName;
    }

    public static Builder builder() {
        return new Builder();
    }


    public AuthorizedUser withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public AuthorizedUser withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
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
        AuthorizedUser other = (AuthorizedUser) o;
        return 
            Utils.enhancedDeepEquals(this.firstName, other.firstName) &&
            Utils.enhancedDeepEquals(this.lastName, other.lastName);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            firstName, lastName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AuthorizedUser.class,
                "firstName", firstName,
                "lastName", lastName);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String firstName;

        private String lastName;

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

        public AuthorizedUser build() {

            return new AuthorizedUser(
                firstName, lastName);
        }

    }
}
