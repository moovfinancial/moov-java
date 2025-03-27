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
/**
 * CardPaymentSettings
 * 
 * <p>User provided settings to manage card payments. This data is only allowed on a business account.
 */

public class CardPaymentSettings {

    /**
     * The description that shows up on credit card transactions. This will default to the accounts display name on account creation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statementDescriptor")
    private Optional<String> statementDescriptor;

    @JsonCreator
    public CardPaymentSettings(
            @JsonProperty("statementDescriptor") Optional<String> statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = statementDescriptor;
    }
    
    public CardPaymentSettings() {
        this(Optional.empty());
    }

    /**
     * The description that shows up on credit card transactions. This will default to the accounts display name on account creation.
     */
    @JsonIgnore
    public Optional<String> statementDescriptor() {
        return statementDescriptor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The description that shows up on credit card transactions. This will default to the accounts display name on account creation.
     */
    public CardPaymentSettings withStatementDescriptor(String statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = Optional.ofNullable(statementDescriptor);
        return this;
    }

    /**
     * The description that shows up on credit card transactions. This will default to the accounts display name on account creation.
     */
    public CardPaymentSettings withStatementDescriptor(Optional<String> statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = statementDescriptor;
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
        CardPaymentSettings other = (CardPaymentSettings) o;
        return 
            Objects.deepEquals(this.statementDescriptor, other.statementDescriptor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            statementDescriptor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CardPaymentSettings.class,
                "statementDescriptor", statementDescriptor);
    }
    
    public final static class Builder {
 
        private Optional<String> statementDescriptor = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The description that shows up on credit card transactions. This will default to the accounts display name on account creation.
         */
        public Builder statementDescriptor(String statementDescriptor) {
            Utils.checkNotNull(statementDescriptor, "statementDescriptor");
            this.statementDescriptor = Optional.ofNullable(statementDescriptor);
            return this;
        }

        /**
         * The description that shows up on credit card transactions. This will default to the accounts display name on account creation.
         */
        public Builder statementDescriptor(Optional<String> statementDescriptor) {
            Utils.checkNotNull(statementDescriptor, "statementDescriptor");
            this.statementDescriptor = statementDescriptor;
            return this;
        }
        
        public CardPaymentSettings build() {
            return new CardPaymentSettings(
                statementDescriptor);
        }
    }
}

