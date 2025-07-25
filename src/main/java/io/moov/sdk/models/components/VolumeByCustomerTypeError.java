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


public class VolumeByCustomerTypeError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("businessToBusinessPercentage")
    private Optional<String> businessToBusinessPercentage;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("consumerToBusinessPercentage")
    private Optional<String> consumerToBusinessPercentage;

    @JsonCreator
    public VolumeByCustomerTypeError(
            @JsonProperty("businessToBusinessPercentage") Optional<String> businessToBusinessPercentage,
            @JsonProperty("consumerToBusinessPercentage") Optional<String> consumerToBusinessPercentage) {
        Utils.checkNotNull(businessToBusinessPercentage, "businessToBusinessPercentage");
        Utils.checkNotNull(consumerToBusinessPercentage, "consumerToBusinessPercentage");
        this.businessToBusinessPercentage = businessToBusinessPercentage;
        this.consumerToBusinessPercentage = consumerToBusinessPercentage;
    }
    
    public VolumeByCustomerTypeError() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> businessToBusinessPercentage() {
        return businessToBusinessPercentage;
    }

    @JsonIgnore
    public Optional<String> consumerToBusinessPercentage() {
        return consumerToBusinessPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }


    public VolumeByCustomerTypeError withBusinessToBusinessPercentage(String businessToBusinessPercentage) {
        Utils.checkNotNull(businessToBusinessPercentage, "businessToBusinessPercentage");
        this.businessToBusinessPercentage = Optional.ofNullable(businessToBusinessPercentage);
        return this;
    }


    public VolumeByCustomerTypeError withBusinessToBusinessPercentage(Optional<String> businessToBusinessPercentage) {
        Utils.checkNotNull(businessToBusinessPercentage, "businessToBusinessPercentage");
        this.businessToBusinessPercentage = businessToBusinessPercentage;
        return this;
    }

    public VolumeByCustomerTypeError withConsumerToBusinessPercentage(String consumerToBusinessPercentage) {
        Utils.checkNotNull(consumerToBusinessPercentage, "consumerToBusinessPercentage");
        this.consumerToBusinessPercentage = Optional.ofNullable(consumerToBusinessPercentage);
        return this;
    }


    public VolumeByCustomerTypeError withConsumerToBusinessPercentage(Optional<String> consumerToBusinessPercentage) {
        Utils.checkNotNull(consumerToBusinessPercentage, "consumerToBusinessPercentage");
        this.consumerToBusinessPercentage = consumerToBusinessPercentage;
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
        VolumeByCustomerTypeError other = (VolumeByCustomerTypeError) o;
        return 
            Utils.enhancedDeepEquals(this.businessToBusinessPercentage, other.businessToBusinessPercentage) &&
            Utils.enhancedDeepEquals(this.consumerToBusinessPercentage, other.consumerToBusinessPercentage);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            businessToBusinessPercentage, consumerToBusinessPercentage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VolumeByCustomerTypeError.class,
                "businessToBusinessPercentage", businessToBusinessPercentage,
                "consumerToBusinessPercentage", consumerToBusinessPercentage);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> businessToBusinessPercentage = Optional.empty();

        private Optional<String> consumerToBusinessPercentage = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder businessToBusinessPercentage(String businessToBusinessPercentage) {
            Utils.checkNotNull(businessToBusinessPercentage, "businessToBusinessPercentage");
            this.businessToBusinessPercentage = Optional.ofNullable(businessToBusinessPercentage);
            return this;
        }

        public Builder businessToBusinessPercentage(Optional<String> businessToBusinessPercentage) {
            Utils.checkNotNull(businessToBusinessPercentage, "businessToBusinessPercentage");
            this.businessToBusinessPercentage = businessToBusinessPercentage;
            return this;
        }


        public Builder consumerToBusinessPercentage(String consumerToBusinessPercentage) {
            Utils.checkNotNull(consumerToBusinessPercentage, "consumerToBusinessPercentage");
            this.consumerToBusinessPercentage = Optional.ofNullable(consumerToBusinessPercentage);
            return this;
        }

        public Builder consumerToBusinessPercentage(Optional<String> consumerToBusinessPercentage) {
            Utils.checkNotNull(consumerToBusinessPercentage, "consumerToBusinessPercentage");
            this.consumerToBusinessPercentage = consumerToBusinessPercentage;
            return this;
        }

        public VolumeByCustomerTypeError build() {

            return new VolumeByCustomerTypeError(
                businessToBusinessPercentage, consumerToBusinessPercentage);
        }

    }
}
