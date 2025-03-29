/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class UpdateUnderwriting {

    @JsonProperty("averageTransactionSize")
    private long averageTransactionSize;

    @JsonProperty("maxTransactionSize")
    private long maxTransactionSize;

    @JsonProperty("averageMonthlyTransactionVolume")
    private long averageMonthlyTransactionVolume;

    @JsonProperty("volumeByCustomerType")
    private VolumeByCustomerType volumeByCustomerType;

    @JsonProperty("cardVolumeDistribution")
    private CardVolumeDistribution cardVolumeDistribution;

    @JsonProperty("fulfillment")
    private FulfillmentDetails fulfillment;

    @JsonCreator
    public UpdateUnderwriting(
            @JsonProperty("averageTransactionSize") long averageTransactionSize,
            @JsonProperty("maxTransactionSize") long maxTransactionSize,
            @JsonProperty("averageMonthlyTransactionVolume") long averageMonthlyTransactionVolume,
            @JsonProperty("volumeByCustomerType") VolumeByCustomerType volumeByCustomerType,
            @JsonProperty("cardVolumeDistribution") CardVolumeDistribution cardVolumeDistribution,
            @JsonProperty("fulfillment") FulfillmentDetails fulfillment) {
        Utils.checkNotNull(averageTransactionSize, "averageTransactionSize");
        Utils.checkNotNull(maxTransactionSize, "maxTransactionSize");
        Utils.checkNotNull(averageMonthlyTransactionVolume, "averageMonthlyTransactionVolume");
        Utils.checkNotNull(volumeByCustomerType, "volumeByCustomerType");
        Utils.checkNotNull(cardVolumeDistribution, "cardVolumeDistribution");
        Utils.checkNotNull(fulfillment, "fulfillment");
        this.averageTransactionSize = averageTransactionSize;
        this.maxTransactionSize = maxTransactionSize;
        this.averageMonthlyTransactionVolume = averageMonthlyTransactionVolume;
        this.volumeByCustomerType = volumeByCustomerType;
        this.cardVolumeDistribution = cardVolumeDistribution;
        this.fulfillment = fulfillment;
    }

    @JsonIgnore
    public long averageTransactionSize() {
        return averageTransactionSize;
    }

    @JsonIgnore
    public long maxTransactionSize() {
        return maxTransactionSize;
    }

    @JsonIgnore
    public long averageMonthlyTransactionVolume() {
        return averageMonthlyTransactionVolume;
    }

    @JsonIgnore
    public VolumeByCustomerType volumeByCustomerType() {
        return volumeByCustomerType;
    }

    @JsonIgnore
    public CardVolumeDistribution cardVolumeDistribution() {
        return cardVolumeDistribution;
    }

    @JsonIgnore
    public FulfillmentDetails fulfillment() {
        return fulfillment;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public UpdateUnderwriting withAverageTransactionSize(long averageTransactionSize) {
        Utils.checkNotNull(averageTransactionSize, "averageTransactionSize");
        this.averageTransactionSize = averageTransactionSize;
        return this;
    }

    public UpdateUnderwriting withMaxTransactionSize(long maxTransactionSize) {
        Utils.checkNotNull(maxTransactionSize, "maxTransactionSize");
        this.maxTransactionSize = maxTransactionSize;
        return this;
    }

    public UpdateUnderwriting withAverageMonthlyTransactionVolume(long averageMonthlyTransactionVolume) {
        Utils.checkNotNull(averageMonthlyTransactionVolume, "averageMonthlyTransactionVolume");
        this.averageMonthlyTransactionVolume = averageMonthlyTransactionVolume;
        return this;
    }

    public UpdateUnderwriting withVolumeByCustomerType(VolumeByCustomerType volumeByCustomerType) {
        Utils.checkNotNull(volumeByCustomerType, "volumeByCustomerType");
        this.volumeByCustomerType = volumeByCustomerType;
        return this;
    }

    public UpdateUnderwriting withCardVolumeDistribution(CardVolumeDistribution cardVolumeDistribution) {
        Utils.checkNotNull(cardVolumeDistribution, "cardVolumeDistribution");
        this.cardVolumeDistribution = cardVolumeDistribution;
        return this;
    }

    public UpdateUnderwriting withFulfillment(FulfillmentDetails fulfillment) {
        Utils.checkNotNull(fulfillment, "fulfillment");
        this.fulfillment = fulfillment;
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
        UpdateUnderwriting other = (UpdateUnderwriting) o;
        return 
            Objects.deepEquals(this.averageTransactionSize, other.averageTransactionSize) &&
            Objects.deepEquals(this.maxTransactionSize, other.maxTransactionSize) &&
            Objects.deepEquals(this.averageMonthlyTransactionVolume, other.averageMonthlyTransactionVolume) &&
            Objects.deepEquals(this.volumeByCustomerType, other.volumeByCustomerType) &&
            Objects.deepEquals(this.cardVolumeDistribution, other.cardVolumeDistribution) &&
            Objects.deepEquals(this.fulfillment, other.fulfillment);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            averageTransactionSize,
            maxTransactionSize,
            averageMonthlyTransactionVolume,
            volumeByCustomerType,
            cardVolumeDistribution,
            fulfillment);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateUnderwriting.class,
                "averageTransactionSize", averageTransactionSize,
                "maxTransactionSize", maxTransactionSize,
                "averageMonthlyTransactionVolume", averageMonthlyTransactionVolume,
                "volumeByCustomerType", volumeByCustomerType,
                "cardVolumeDistribution", cardVolumeDistribution,
                "fulfillment", fulfillment);
    }
    
    public final static class Builder {
 
        private Long averageTransactionSize;
 
        private Long maxTransactionSize;
 
        private Long averageMonthlyTransactionVolume;
 
        private VolumeByCustomerType volumeByCustomerType;
 
        private CardVolumeDistribution cardVolumeDistribution;
 
        private FulfillmentDetails fulfillment;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder averageTransactionSize(long averageTransactionSize) {
            Utils.checkNotNull(averageTransactionSize, "averageTransactionSize");
            this.averageTransactionSize = averageTransactionSize;
            return this;
        }

        public Builder maxTransactionSize(long maxTransactionSize) {
            Utils.checkNotNull(maxTransactionSize, "maxTransactionSize");
            this.maxTransactionSize = maxTransactionSize;
            return this;
        }

        public Builder averageMonthlyTransactionVolume(long averageMonthlyTransactionVolume) {
            Utils.checkNotNull(averageMonthlyTransactionVolume, "averageMonthlyTransactionVolume");
            this.averageMonthlyTransactionVolume = averageMonthlyTransactionVolume;
            return this;
        }

        public Builder volumeByCustomerType(VolumeByCustomerType volumeByCustomerType) {
            Utils.checkNotNull(volumeByCustomerType, "volumeByCustomerType");
            this.volumeByCustomerType = volumeByCustomerType;
            return this;
        }

        public Builder cardVolumeDistribution(CardVolumeDistribution cardVolumeDistribution) {
            Utils.checkNotNull(cardVolumeDistribution, "cardVolumeDistribution");
            this.cardVolumeDistribution = cardVolumeDistribution;
            return this;
        }

        public Builder fulfillment(FulfillmentDetails fulfillment) {
            Utils.checkNotNull(fulfillment, "fulfillment");
            this.fulfillment = fulfillment;
            return this;
        }
        
        public UpdateUnderwriting build() {
            return new UpdateUnderwriting(
                averageTransactionSize,
                maxTransactionSize,
                averageMonthlyTransactionVolume,
                volumeByCustomerType,
                cardVolumeDistribution,
                fulfillment);
        }
    }
}
