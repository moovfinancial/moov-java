/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;


public class VolumeByCustomerType {

    @JsonProperty("businessToBusinessPercentage")
    private int businessToBusinessPercentage;


    @JsonProperty("consumerToBusinessPercentage")
    private int consumerToBusinessPercentage;

    @JsonCreator
    public VolumeByCustomerType(
            @JsonProperty("businessToBusinessPercentage") int businessToBusinessPercentage,
            @JsonProperty("consumerToBusinessPercentage") int consumerToBusinessPercentage) {
        Utils.checkNotNull(businessToBusinessPercentage, "businessToBusinessPercentage");
        Utils.checkNotNull(consumerToBusinessPercentage, "consumerToBusinessPercentage");
        this.businessToBusinessPercentage = businessToBusinessPercentage;
        this.consumerToBusinessPercentage = consumerToBusinessPercentage;
    }

    @JsonIgnore
    public int businessToBusinessPercentage() {
        return businessToBusinessPercentage;
    }

    @JsonIgnore
    public int consumerToBusinessPercentage() {
        return consumerToBusinessPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }


    public VolumeByCustomerType withBusinessToBusinessPercentage(int businessToBusinessPercentage) {
        Utils.checkNotNull(businessToBusinessPercentage, "businessToBusinessPercentage");
        this.businessToBusinessPercentage = businessToBusinessPercentage;
        return this;
    }

    public VolumeByCustomerType withConsumerToBusinessPercentage(int consumerToBusinessPercentage) {
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
        VolumeByCustomerType other = (VolumeByCustomerType) o;
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
        return Utils.toString(VolumeByCustomerType.class,
                "businessToBusinessPercentage", businessToBusinessPercentage,
                "consumerToBusinessPercentage", consumerToBusinessPercentage);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Integer businessToBusinessPercentage;

        private Integer consumerToBusinessPercentage;

        private Builder() {
          // force use of static builder() method
        }


        public Builder businessToBusinessPercentage(int businessToBusinessPercentage) {
            Utils.checkNotNull(businessToBusinessPercentage, "businessToBusinessPercentage");
            this.businessToBusinessPercentage = businessToBusinessPercentage;
            return this;
        }


        public Builder consumerToBusinessPercentage(int consumerToBusinessPercentage) {
            Utils.checkNotNull(consumerToBusinessPercentage, "consumerToBusinessPercentage");
            this.consumerToBusinessPercentage = consumerToBusinessPercentage;
            return this;
        }

        public VolumeByCustomerType build() {

            return new VolumeByCustomerType(
                businessToBusinessPercentage, consumerToBusinessPercentage);
        }

    }
}
