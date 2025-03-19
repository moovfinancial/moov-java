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


public class CardPaymentDetailsError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dynamicDescriptor")
    private Optional<String> dynamicDescriptor;

    @JsonCreator
    public CardPaymentDetailsError(
            @JsonProperty("dynamicDescriptor") Optional<String> dynamicDescriptor) {
        Utils.checkNotNull(dynamicDescriptor, "dynamicDescriptor");
        this.dynamicDescriptor = dynamicDescriptor;
    }
    
    public CardPaymentDetailsError() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> dynamicDescriptor() {
        return dynamicDescriptor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CardPaymentDetailsError withDynamicDescriptor(String dynamicDescriptor) {
        Utils.checkNotNull(dynamicDescriptor, "dynamicDescriptor");
        this.dynamicDescriptor = Optional.ofNullable(dynamicDescriptor);
        return this;
    }

    public CardPaymentDetailsError withDynamicDescriptor(Optional<String> dynamicDescriptor) {
        Utils.checkNotNull(dynamicDescriptor, "dynamicDescriptor");
        this.dynamicDescriptor = dynamicDescriptor;
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
        CardPaymentDetailsError other = (CardPaymentDetailsError) o;
        return 
            Objects.deepEquals(this.dynamicDescriptor, other.dynamicDescriptor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dynamicDescriptor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CardPaymentDetailsError.class,
                "dynamicDescriptor", dynamicDescriptor);
    }
    
    public final static class Builder {
 
        private Optional<String> dynamicDescriptor = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dynamicDescriptor(String dynamicDescriptor) {
            Utils.checkNotNull(dynamicDescriptor, "dynamicDescriptor");
            this.dynamicDescriptor = Optional.ofNullable(dynamicDescriptor);
            return this;
        }

        public Builder dynamicDescriptor(Optional<String> dynamicDescriptor) {
            Utils.checkNotNull(dynamicDescriptor, "dynamicDescriptor");
            this.dynamicDescriptor = dynamicDescriptor;
            return this;
        }
        
        public CardPaymentDetailsError build() {
            return new CardPaymentDetailsError(
                dynamicDescriptor);
        }
    }
}

