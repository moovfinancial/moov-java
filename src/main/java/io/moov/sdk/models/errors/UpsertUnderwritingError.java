/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.models.components.CardVolumeDistributionError;
import io.moov.sdk.models.components.CollectFundsError;
import io.moov.sdk.models.components.FulfillmentDetailsError;
import io.moov.sdk.models.components.MoneyTransferError;
import io.moov.sdk.models.components.SendFundsError;
import io.moov.sdk.models.components.VolumeByCustomerTypeError;
import io.moov.sdk.models.components.VolumeShareByCustomerTypeError;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Optional;


@SuppressWarnings("serial")
public class UpsertUnderwritingError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("geographicReach")
    private Optional<String> geographicReach;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("businessPresence")
    private Optional<String> businessPresence;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pendingLitigation")
    private Optional<String> pendingLitigation;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("volumeShareByCustomerType")
    private Optional<? extends VolumeShareByCustomerTypeError> volumeShareByCustomerType;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collectFunds")
    private Optional<? extends CollectFundsError> collectFunds;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("moneyTransfer")
    private Optional<? extends MoneyTransferError> moneyTransfer;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sendFunds")
    private Optional<? extends SendFundsError> sendFunds;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("averageMonthlyTransactionVolume")
    private Optional<String> averageMonthlyTransactionVolume;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("averageTransactionSize")
    private Optional<String> averageTransactionSize;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maxTransactionSize")
    private Optional<String> maxTransactionSize;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("volumeByCustomerType")
    private Optional<? extends VolumeByCustomerTypeError> volumeByCustomerType;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardVolumeDistribution")
    private Optional<? extends CardVolumeDistributionError> cardVolumeDistribution;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fulfillment")
    private Optional<? extends FulfillmentDetailsError> fulfillment;

    @JsonCreator
    public UpsertUnderwritingError(
            @JsonProperty("geographicReach") Optional<String> geographicReach,
            @JsonProperty("businessPresence") Optional<String> businessPresence,
            @JsonProperty("pendingLitigation") Optional<String> pendingLitigation,
            @JsonProperty("volumeShareByCustomerType") Optional<? extends VolumeShareByCustomerTypeError> volumeShareByCustomerType,
            @JsonProperty("collectFunds") Optional<? extends CollectFundsError> collectFunds,
            @JsonProperty("moneyTransfer") Optional<? extends MoneyTransferError> moneyTransfer,
            @JsonProperty("sendFunds") Optional<? extends SendFundsError> sendFunds,
            @JsonProperty("averageMonthlyTransactionVolume") Optional<String> averageMonthlyTransactionVolume,
            @JsonProperty("averageTransactionSize") Optional<String> averageTransactionSize,
            @JsonProperty("maxTransactionSize") Optional<String> maxTransactionSize,
            @JsonProperty("volumeByCustomerType") Optional<? extends VolumeByCustomerTypeError> volumeByCustomerType,
            @JsonProperty("cardVolumeDistribution") Optional<? extends CardVolumeDistributionError> cardVolumeDistribution,
            @JsonProperty("fulfillment") Optional<? extends FulfillmentDetailsError> fulfillment) {
        super("API error occurred");
        Utils.checkNotNull(geographicReach, "geographicReach");
        Utils.checkNotNull(businessPresence, "businessPresence");
        Utils.checkNotNull(pendingLitigation, "pendingLitigation");
        Utils.checkNotNull(volumeShareByCustomerType, "volumeShareByCustomerType");
        Utils.checkNotNull(collectFunds, "collectFunds");
        Utils.checkNotNull(moneyTransfer, "moneyTransfer");
        Utils.checkNotNull(sendFunds, "sendFunds");
        Utils.checkNotNull(averageMonthlyTransactionVolume, "averageMonthlyTransactionVolume");
        Utils.checkNotNull(averageTransactionSize, "averageTransactionSize");
        Utils.checkNotNull(maxTransactionSize, "maxTransactionSize");
        Utils.checkNotNull(volumeByCustomerType, "volumeByCustomerType");
        Utils.checkNotNull(cardVolumeDistribution, "cardVolumeDistribution");
        Utils.checkNotNull(fulfillment, "fulfillment");
        this.geographicReach = geographicReach;
        this.businessPresence = businessPresence;
        this.pendingLitigation = pendingLitigation;
        this.volumeShareByCustomerType = volumeShareByCustomerType;
        this.collectFunds = collectFunds;
        this.moneyTransfer = moneyTransfer;
        this.sendFunds = sendFunds;
        this.averageMonthlyTransactionVolume = averageMonthlyTransactionVolume;
        this.averageTransactionSize = averageTransactionSize;
        this.maxTransactionSize = maxTransactionSize;
        this.volumeByCustomerType = volumeByCustomerType;
        this.cardVolumeDistribution = cardVolumeDistribution;
        this.fulfillment = fulfillment;
    }
    
    public UpsertUnderwritingError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    @JsonIgnore
    public Optional<String> geographicReach() {
        return geographicReach;
    }

    @JsonIgnore
    public Optional<String> businessPresence() {
        return businessPresence;
    }

    @JsonIgnore
    public Optional<String> pendingLitigation() {
        return pendingLitigation;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VolumeShareByCustomerTypeError> volumeShareByCustomerType() {
        return (Optional<VolumeShareByCustomerTypeError>) volumeShareByCustomerType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CollectFundsError> collectFunds() {
        return (Optional<CollectFundsError>) collectFunds;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MoneyTransferError> moneyTransfer() {
        return (Optional<MoneyTransferError>) moneyTransfer;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SendFundsError> sendFunds() {
        return (Optional<SendFundsError>) sendFunds;
    }

    @JsonIgnore
    public Optional<String> averageMonthlyTransactionVolume() {
        return averageMonthlyTransactionVolume;
    }

    @JsonIgnore
    public Optional<String> averageTransactionSize() {
        return averageTransactionSize;
    }

    @JsonIgnore
    public Optional<String> maxTransactionSize() {
        return maxTransactionSize;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VolumeByCustomerTypeError> volumeByCustomerType() {
        return (Optional<VolumeByCustomerTypeError>) volumeByCustomerType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardVolumeDistributionError> cardVolumeDistribution() {
        return (Optional<CardVolumeDistributionError>) cardVolumeDistribution;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FulfillmentDetailsError> fulfillment() {
        return (Optional<FulfillmentDetailsError>) fulfillment;
    }

    public static Builder builder() {
        return new Builder();
    }


    public UpsertUnderwritingError withGeographicReach(String geographicReach) {
        Utils.checkNotNull(geographicReach, "geographicReach");
        this.geographicReach = Optional.ofNullable(geographicReach);
        return this;
    }


    public UpsertUnderwritingError withGeographicReach(Optional<String> geographicReach) {
        Utils.checkNotNull(geographicReach, "geographicReach");
        this.geographicReach = geographicReach;
        return this;
    }

    public UpsertUnderwritingError withBusinessPresence(String businessPresence) {
        Utils.checkNotNull(businessPresence, "businessPresence");
        this.businessPresence = Optional.ofNullable(businessPresence);
        return this;
    }


    public UpsertUnderwritingError withBusinessPresence(Optional<String> businessPresence) {
        Utils.checkNotNull(businessPresence, "businessPresence");
        this.businessPresence = businessPresence;
        return this;
    }

    public UpsertUnderwritingError withPendingLitigation(String pendingLitigation) {
        Utils.checkNotNull(pendingLitigation, "pendingLitigation");
        this.pendingLitigation = Optional.ofNullable(pendingLitigation);
        return this;
    }


    public UpsertUnderwritingError withPendingLitigation(Optional<String> pendingLitigation) {
        Utils.checkNotNull(pendingLitigation, "pendingLitigation");
        this.pendingLitigation = pendingLitigation;
        return this;
    }

    public UpsertUnderwritingError withVolumeShareByCustomerType(VolumeShareByCustomerTypeError volumeShareByCustomerType) {
        Utils.checkNotNull(volumeShareByCustomerType, "volumeShareByCustomerType");
        this.volumeShareByCustomerType = Optional.ofNullable(volumeShareByCustomerType);
        return this;
    }


    public UpsertUnderwritingError withVolumeShareByCustomerType(Optional<? extends VolumeShareByCustomerTypeError> volumeShareByCustomerType) {
        Utils.checkNotNull(volumeShareByCustomerType, "volumeShareByCustomerType");
        this.volumeShareByCustomerType = volumeShareByCustomerType;
        return this;
    }

    public UpsertUnderwritingError withCollectFunds(CollectFundsError collectFunds) {
        Utils.checkNotNull(collectFunds, "collectFunds");
        this.collectFunds = Optional.ofNullable(collectFunds);
        return this;
    }


    public UpsertUnderwritingError withCollectFunds(Optional<? extends CollectFundsError> collectFunds) {
        Utils.checkNotNull(collectFunds, "collectFunds");
        this.collectFunds = collectFunds;
        return this;
    }

    public UpsertUnderwritingError withMoneyTransfer(MoneyTransferError moneyTransfer) {
        Utils.checkNotNull(moneyTransfer, "moneyTransfer");
        this.moneyTransfer = Optional.ofNullable(moneyTransfer);
        return this;
    }


    public UpsertUnderwritingError withMoneyTransfer(Optional<? extends MoneyTransferError> moneyTransfer) {
        Utils.checkNotNull(moneyTransfer, "moneyTransfer");
        this.moneyTransfer = moneyTransfer;
        return this;
    }

    public UpsertUnderwritingError withSendFunds(SendFundsError sendFunds) {
        Utils.checkNotNull(sendFunds, "sendFunds");
        this.sendFunds = Optional.ofNullable(sendFunds);
        return this;
    }


    public UpsertUnderwritingError withSendFunds(Optional<? extends SendFundsError> sendFunds) {
        Utils.checkNotNull(sendFunds, "sendFunds");
        this.sendFunds = sendFunds;
        return this;
    }

    public UpsertUnderwritingError withAverageMonthlyTransactionVolume(String averageMonthlyTransactionVolume) {
        Utils.checkNotNull(averageMonthlyTransactionVolume, "averageMonthlyTransactionVolume");
        this.averageMonthlyTransactionVolume = Optional.ofNullable(averageMonthlyTransactionVolume);
        return this;
    }


    public UpsertUnderwritingError withAverageMonthlyTransactionVolume(Optional<String> averageMonthlyTransactionVolume) {
        Utils.checkNotNull(averageMonthlyTransactionVolume, "averageMonthlyTransactionVolume");
        this.averageMonthlyTransactionVolume = averageMonthlyTransactionVolume;
        return this;
    }

    public UpsertUnderwritingError withAverageTransactionSize(String averageTransactionSize) {
        Utils.checkNotNull(averageTransactionSize, "averageTransactionSize");
        this.averageTransactionSize = Optional.ofNullable(averageTransactionSize);
        return this;
    }


    public UpsertUnderwritingError withAverageTransactionSize(Optional<String> averageTransactionSize) {
        Utils.checkNotNull(averageTransactionSize, "averageTransactionSize");
        this.averageTransactionSize = averageTransactionSize;
        return this;
    }

    public UpsertUnderwritingError withMaxTransactionSize(String maxTransactionSize) {
        Utils.checkNotNull(maxTransactionSize, "maxTransactionSize");
        this.maxTransactionSize = Optional.ofNullable(maxTransactionSize);
        return this;
    }


    public UpsertUnderwritingError withMaxTransactionSize(Optional<String> maxTransactionSize) {
        Utils.checkNotNull(maxTransactionSize, "maxTransactionSize");
        this.maxTransactionSize = maxTransactionSize;
        return this;
    }

    public UpsertUnderwritingError withVolumeByCustomerType(VolumeByCustomerTypeError volumeByCustomerType) {
        Utils.checkNotNull(volumeByCustomerType, "volumeByCustomerType");
        this.volumeByCustomerType = Optional.ofNullable(volumeByCustomerType);
        return this;
    }


    public UpsertUnderwritingError withVolumeByCustomerType(Optional<? extends VolumeByCustomerTypeError> volumeByCustomerType) {
        Utils.checkNotNull(volumeByCustomerType, "volumeByCustomerType");
        this.volumeByCustomerType = volumeByCustomerType;
        return this;
    }

    public UpsertUnderwritingError withCardVolumeDistribution(CardVolumeDistributionError cardVolumeDistribution) {
        Utils.checkNotNull(cardVolumeDistribution, "cardVolumeDistribution");
        this.cardVolumeDistribution = Optional.ofNullable(cardVolumeDistribution);
        return this;
    }


    public UpsertUnderwritingError withCardVolumeDistribution(Optional<? extends CardVolumeDistributionError> cardVolumeDistribution) {
        Utils.checkNotNull(cardVolumeDistribution, "cardVolumeDistribution");
        this.cardVolumeDistribution = cardVolumeDistribution;
        return this;
    }

    public UpsertUnderwritingError withFulfillment(FulfillmentDetailsError fulfillment) {
        Utils.checkNotNull(fulfillment, "fulfillment");
        this.fulfillment = Optional.ofNullable(fulfillment);
        return this;
    }


    public UpsertUnderwritingError withFulfillment(Optional<? extends FulfillmentDetailsError> fulfillment) {
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
        UpsertUnderwritingError other = (UpsertUnderwritingError) o;
        return 
            Utils.enhancedDeepEquals(this.geographicReach, other.geographicReach) &&
            Utils.enhancedDeepEquals(this.businessPresence, other.businessPresence) &&
            Utils.enhancedDeepEquals(this.pendingLitigation, other.pendingLitigation) &&
            Utils.enhancedDeepEquals(this.volumeShareByCustomerType, other.volumeShareByCustomerType) &&
            Utils.enhancedDeepEquals(this.collectFunds, other.collectFunds) &&
            Utils.enhancedDeepEquals(this.moneyTransfer, other.moneyTransfer) &&
            Utils.enhancedDeepEquals(this.sendFunds, other.sendFunds) &&
            Utils.enhancedDeepEquals(this.averageMonthlyTransactionVolume, other.averageMonthlyTransactionVolume) &&
            Utils.enhancedDeepEquals(this.averageTransactionSize, other.averageTransactionSize) &&
            Utils.enhancedDeepEquals(this.maxTransactionSize, other.maxTransactionSize) &&
            Utils.enhancedDeepEquals(this.volumeByCustomerType, other.volumeByCustomerType) &&
            Utils.enhancedDeepEquals(this.cardVolumeDistribution, other.cardVolumeDistribution) &&
            Utils.enhancedDeepEquals(this.fulfillment, other.fulfillment);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            geographicReach, businessPresence, pendingLitigation,
            volumeShareByCustomerType, collectFunds, moneyTransfer,
            sendFunds, averageMonthlyTransactionVolume, averageTransactionSize,
            maxTransactionSize, volumeByCustomerType, cardVolumeDistribution,
            fulfillment);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpsertUnderwritingError.class,
                "geographicReach", geographicReach,
                "businessPresence", businessPresence,
                "pendingLitigation", pendingLitigation,
                "volumeShareByCustomerType", volumeShareByCustomerType,
                "collectFunds", collectFunds,
                "moneyTransfer", moneyTransfer,
                "sendFunds", sendFunds,
                "averageMonthlyTransactionVolume", averageMonthlyTransactionVolume,
                "averageTransactionSize", averageTransactionSize,
                "maxTransactionSize", maxTransactionSize,
                "volumeByCustomerType", volumeByCustomerType,
                "cardVolumeDistribution", cardVolumeDistribution,
                "fulfillment", fulfillment);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> geographicReach = Optional.empty();

        private Optional<String> businessPresence = Optional.empty();

        private Optional<String> pendingLitigation = Optional.empty();

        private Optional<? extends VolumeShareByCustomerTypeError> volumeShareByCustomerType = Optional.empty();

        private Optional<? extends CollectFundsError> collectFunds = Optional.empty();

        private Optional<? extends MoneyTransferError> moneyTransfer = Optional.empty();

        private Optional<? extends SendFundsError> sendFunds = Optional.empty();

        private Optional<String> averageMonthlyTransactionVolume = Optional.empty();

        private Optional<String> averageTransactionSize = Optional.empty();

        private Optional<String> maxTransactionSize = Optional.empty();

        private Optional<? extends VolumeByCustomerTypeError> volumeByCustomerType = Optional.empty();

        private Optional<? extends CardVolumeDistributionError> cardVolumeDistribution = Optional.empty();

        private Optional<? extends FulfillmentDetailsError> fulfillment = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder geographicReach(String geographicReach) {
            Utils.checkNotNull(geographicReach, "geographicReach");
            this.geographicReach = Optional.ofNullable(geographicReach);
            return this;
        }

        public Builder geographicReach(Optional<String> geographicReach) {
            Utils.checkNotNull(geographicReach, "geographicReach");
            this.geographicReach = geographicReach;
            return this;
        }


        public Builder businessPresence(String businessPresence) {
            Utils.checkNotNull(businessPresence, "businessPresence");
            this.businessPresence = Optional.ofNullable(businessPresence);
            return this;
        }

        public Builder businessPresence(Optional<String> businessPresence) {
            Utils.checkNotNull(businessPresence, "businessPresence");
            this.businessPresence = businessPresence;
            return this;
        }


        public Builder pendingLitigation(String pendingLitigation) {
            Utils.checkNotNull(pendingLitigation, "pendingLitigation");
            this.pendingLitigation = Optional.ofNullable(pendingLitigation);
            return this;
        }

        public Builder pendingLitigation(Optional<String> pendingLitigation) {
            Utils.checkNotNull(pendingLitigation, "pendingLitigation");
            this.pendingLitigation = pendingLitigation;
            return this;
        }


        public Builder volumeShareByCustomerType(VolumeShareByCustomerTypeError volumeShareByCustomerType) {
            Utils.checkNotNull(volumeShareByCustomerType, "volumeShareByCustomerType");
            this.volumeShareByCustomerType = Optional.ofNullable(volumeShareByCustomerType);
            return this;
        }

        public Builder volumeShareByCustomerType(Optional<? extends VolumeShareByCustomerTypeError> volumeShareByCustomerType) {
            Utils.checkNotNull(volumeShareByCustomerType, "volumeShareByCustomerType");
            this.volumeShareByCustomerType = volumeShareByCustomerType;
            return this;
        }


        public Builder collectFunds(CollectFundsError collectFunds) {
            Utils.checkNotNull(collectFunds, "collectFunds");
            this.collectFunds = Optional.ofNullable(collectFunds);
            return this;
        }

        public Builder collectFunds(Optional<? extends CollectFundsError> collectFunds) {
            Utils.checkNotNull(collectFunds, "collectFunds");
            this.collectFunds = collectFunds;
            return this;
        }


        public Builder moneyTransfer(MoneyTransferError moneyTransfer) {
            Utils.checkNotNull(moneyTransfer, "moneyTransfer");
            this.moneyTransfer = Optional.ofNullable(moneyTransfer);
            return this;
        }

        public Builder moneyTransfer(Optional<? extends MoneyTransferError> moneyTransfer) {
            Utils.checkNotNull(moneyTransfer, "moneyTransfer");
            this.moneyTransfer = moneyTransfer;
            return this;
        }


        public Builder sendFunds(SendFundsError sendFunds) {
            Utils.checkNotNull(sendFunds, "sendFunds");
            this.sendFunds = Optional.ofNullable(sendFunds);
            return this;
        }

        public Builder sendFunds(Optional<? extends SendFundsError> sendFunds) {
            Utils.checkNotNull(sendFunds, "sendFunds");
            this.sendFunds = sendFunds;
            return this;
        }


        public Builder averageMonthlyTransactionVolume(String averageMonthlyTransactionVolume) {
            Utils.checkNotNull(averageMonthlyTransactionVolume, "averageMonthlyTransactionVolume");
            this.averageMonthlyTransactionVolume = Optional.ofNullable(averageMonthlyTransactionVolume);
            return this;
        }

        public Builder averageMonthlyTransactionVolume(Optional<String> averageMonthlyTransactionVolume) {
            Utils.checkNotNull(averageMonthlyTransactionVolume, "averageMonthlyTransactionVolume");
            this.averageMonthlyTransactionVolume = averageMonthlyTransactionVolume;
            return this;
        }


        public Builder averageTransactionSize(String averageTransactionSize) {
            Utils.checkNotNull(averageTransactionSize, "averageTransactionSize");
            this.averageTransactionSize = Optional.ofNullable(averageTransactionSize);
            return this;
        }

        public Builder averageTransactionSize(Optional<String> averageTransactionSize) {
            Utils.checkNotNull(averageTransactionSize, "averageTransactionSize");
            this.averageTransactionSize = averageTransactionSize;
            return this;
        }


        public Builder maxTransactionSize(String maxTransactionSize) {
            Utils.checkNotNull(maxTransactionSize, "maxTransactionSize");
            this.maxTransactionSize = Optional.ofNullable(maxTransactionSize);
            return this;
        }

        public Builder maxTransactionSize(Optional<String> maxTransactionSize) {
            Utils.checkNotNull(maxTransactionSize, "maxTransactionSize");
            this.maxTransactionSize = maxTransactionSize;
            return this;
        }


        public Builder volumeByCustomerType(VolumeByCustomerTypeError volumeByCustomerType) {
            Utils.checkNotNull(volumeByCustomerType, "volumeByCustomerType");
            this.volumeByCustomerType = Optional.ofNullable(volumeByCustomerType);
            return this;
        }

        public Builder volumeByCustomerType(Optional<? extends VolumeByCustomerTypeError> volumeByCustomerType) {
            Utils.checkNotNull(volumeByCustomerType, "volumeByCustomerType");
            this.volumeByCustomerType = volumeByCustomerType;
            return this;
        }


        public Builder cardVolumeDistribution(CardVolumeDistributionError cardVolumeDistribution) {
            Utils.checkNotNull(cardVolumeDistribution, "cardVolumeDistribution");
            this.cardVolumeDistribution = Optional.ofNullable(cardVolumeDistribution);
            return this;
        }

        public Builder cardVolumeDistribution(Optional<? extends CardVolumeDistributionError> cardVolumeDistribution) {
            Utils.checkNotNull(cardVolumeDistribution, "cardVolumeDistribution");
            this.cardVolumeDistribution = cardVolumeDistribution;
            return this;
        }


        public Builder fulfillment(FulfillmentDetailsError fulfillment) {
            Utils.checkNotNull(fulfillment, "fulfillment");
            this.fulfillment = Optional.ofNullable(fulfillment);
            return this;
        }

        public Builder fulfillment(Optional<? extends FulfillmentDetailsError> fulfillment) {
            Utils.checkNotNull(fulfillment, "fulfillment");
            this.fulfillment = fulfillment;
            return this;
        }

        public UpsertUnderwritingError build() {

            return new UpsertUnderwritingError(
                geographicReach, businessPresence, pendingLitigation,
                volumeShareByCustomerType, collectFunds, moneyTransfer,
                sendFunds, averageMonthlyTransactionVolume, averageTransactionSize,
                maxTransactionSize, volumeByCustomerType, cardVolumeDistribution,
                fulfillment);
        }

    }
}

