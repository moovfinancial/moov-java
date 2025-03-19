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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * CreateRefund - Specifies a partial amount to refund. 
 * 
 * This request body is optional, an empty body will issue a refund for the full amount of the original transfer.
 */

public class CreateRefund {

    /**
     * Amount to refund in cents. If null, the original transfer's full amount will be refunded.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<Long> amount;

    @JsonCreator
    public CreateRefund(
            @JsonProperty("amount") Optional<Long> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
    }
    
    public CreateRefund() {
        this(Optional.empty());
    }

    /**
     * Amount to refund in cents. If null, the original transfer's full amount will be refunded.
     */
    @JsonIgnore
    public Optional<Long> amount() {
        return amount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Amount to refund in cents. If null, the original transfer's full amount will be refunded.
     */
    public CreateRefund withAmount(long amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    /**
     * Amount to refund in cents. If null, the original transfer's full amount will be refunded.
     */
    public CreateRefund withAmount(Optional<Long> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
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
        CreateRefund other = (CreateRefund) o;
        return 
            Objects.deepEquals(this.amount, other.amount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRefund.class,
                "amount", amount);
    }
    
    public final static class Builder {
 
        private Optional<Long> amount = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Amount to refund in cents. If null, the original transfer's full amount will be refunded.
         */
        public Builder amount(long amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        /**
         * Amount to refund in cents. If null, the original transfer's full amount will be refunded.
         */
        public Builder amount(Optional<Long> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }
        
        public CreateRefund build() {
            return new CreateRefund(
                amount);
        }
    }
}

