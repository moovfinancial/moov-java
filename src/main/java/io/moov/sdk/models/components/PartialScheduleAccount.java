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

public class PartialScheduleAccount {

    @JsonProperty("accountID")
    private String accountID;

    @JsonProperty("displayName")
    private String displayName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonCreator
    public PartialScheduleAccount(
            @JsonProperty("accountID") String accountID,
            @JsonProperty("displayName") String displayName,
            @JsonProperty("email") Optional<String> email) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(email, "email");
        this.accountID = accountID;
        this.displayName = displayName;
        this.email = email;
    }
    
    public PartialScheduleAccount(
            String accountID,
            String displayName) {
        this(accountID, displayName, Optional.empty());
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public String displayName() {
        return displayName;
    }

    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public PartialScheduleAccount withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public PartialScheduleAccount withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    public PartialScheduleAccount withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public PartialScheduleAccount withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
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
        PartialScheduleAccount other = (PartialScheduleAccount) o;
        return 
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.displayName, other.displayName) &&
            Objects.deepEquals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountID,
            displayName,
            email);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PartialScheduleAccount.class,
                "accountID", accountID,
                "displayName", displayName,
                "email", email);
    }
    
    public final static class Builder {
 
        private String accountID;
 
        private String displayName;
 
        private Optional<String> email = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
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
        
        public PartialScheduleAccount build() {
            return new PartialScheduleAccount(
                accountID,
                displayName,
                email);
        }
    }
}
