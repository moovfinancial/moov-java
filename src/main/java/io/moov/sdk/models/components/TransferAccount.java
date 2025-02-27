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

public class TransferAccount {

    @JsonProperty("accountID")
    private String accountID;

    @JsonProperty("email")
    private String email;

    @JsonProperty("displayName")
    private String displayName;

    @JsonCreator
    public TransferAccount(
            @JsonProperty("accountID") String accountID,
            @JsonProperty("email") String email,
            @JsonProperty("displayName") String displayName) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(displayName, "displayName");
        this.accountID = accountID;
        this.email = email;
        this.displayName = displayName;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public String email() {
        return email;
    }

    @JsonIgnore
    public String displayName() {
        return displayName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TransferAccount withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public TransferAccount withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public TransferAccount withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
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
        TransferAccount other = (TransferAccount) o;
        return 
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.displayName, other.displayName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountID,
            email,
            displayName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransferAccount.class,
                "accountID", accountID,
                "email", email,
                "displayName", displayName);
    }
    
    public final static class Builder {
 
        private String accountID;
 
        private String email;
 
        private String displayName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }
        
        public TransferAccount build() {
            return new TransferAccount(
                accountID,
                email,
                displayName);
        }
    }
}

