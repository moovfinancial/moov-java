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
 * OnboardingPartnerAccount
 * 
 * <p>The account that created the onboarding invite.
 */

public class OnboardingPartnerAccount {

    /**
     * The account ID of the partner that created the invite.
     */
    @JsonProperty("accountID")
    private String accountID;

    /**
     * The operating mode for an account.
     */
    @JsonProperty("accountMode")
    private Mode accountMode;

    /**
     * The name of the Moov account used to create the onboarding invite.
     */
    @JsonProperty("displayName")
    private String displayName;

    @JsonCreator
    public OnboardingPartnerAccount(
            @JsonProperty("accountID") String accountID,
            @JsonProperty("accountMode") Mode accountMode,
            @JsonProperty("displayName") String displayName) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(accountMode, "accountMode");
        Utils.checkNotNull(displayName, "displayName");
        this.accountID = accountID;
        this.accountMode = accountMode;
        this.displayName = displayName;
    }

    /**
     * The account ID of the partner that created the invite.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    /**
     * The operating mode for an account.
     */
    @JsonIgnore
    public Mode accountMode() {
        return accountMode;
    }

    /**
     * The name of the Moov account used to create the onboarding invite.
     */
    @JsonIgnore
    public String displayName() {
        return displayName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account ID of the partner that created the invite.
     */
    public OnboardingPartnerAccount withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * The operating mode for an account.
     */
    public OnboardingPartnerAccount withAccountMode(Mode accountMode) {
        Utils.checkNotNull(accountMode, "accountMode");
        this.accountMode = accountMode;
        return this;
    }

    /**
     * The name of the Moov account used to create the onboarding invite.
     */
    public OnboardingPartnerAccount withDisplayName(String displayName) {
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
        OnboardingPartnerAccount other = (OnboardingPartnerAccount) o;
        return 
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.accountMode, other.accountMode) &&
            Objects.deepEquals(this.displayName, other.displayName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountID,
            accountMode,
            displayName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OnboardingPartnerAccount.class,
                "accountID", accountID,
                "accountMode", accountMode,
                "displayName", displayName);
    }
    
    public final static class Builder {
 
        private String accountID;
 
        private Mode accountMode;
 
        private String displayName;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The account ID of the partner that created the invite.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        /**
         * The operating mode for an account.
         */
        public Builder accountMode(Mode accountMode) {
            Utils.checkNotNull(accountMode, "accountMode");
            this.accountMode = accountMode;
            return this;
        }

        /**
         * The name of the Moov account used to create the onboarding invite.
         */
        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }
        
        public OnboardingPartnerAccount build() {
            return new OnboardingPartnerAccount(
                accountID,
                accountMode,
                displayName);
        }
    }
}

