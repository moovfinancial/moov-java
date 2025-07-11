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
import java.lang.SuppressWarnings;
import java.util.Optional;


public class CollectFundsCardPaymentsError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardAcceptanceMethods")
    private Optional<? extends CardAcceptanceMethodsError> cardAcceptanceMethods;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currentlyAcceptsCards")
    private Optional<String> currentlyAcceptsCards;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("estimatedActivity")
    private Optional<? extends EstimatedActivityError> estimatedActivity;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fulfillment")
    private Optional<? extends FulfillmentError> fulfillment;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refundPolicy")
    private Optional<String> refundPolicy;

    @JsonCreator
    public CollectFundsCardPaymentsError(
            @JsonProperty("cardAcceptanceMethods") Optional<? extends CardAcceptanceMethodsError> cardAcceptanceMethods,
            @JsonProperty("currentlyAcceptsCards") Optional<String> currentlyAcceptsCards,
            @JsonProperty("estimatedActivity") Optional<? extends EstimatedActivityError> estimatedActivity,
            @JsonProperty("fulfillment") Optional<? extends FulfillmentError> fulfillment,
            @JsonProperty("refundPolicy") Optional<String> refundPolicy) {
        Utils.checkNotNull(cardAcceptanceMethods, "cardAcceptanceMethods");
        Utils.checkNotNull(currentlyAcceptsCards, "currentlyAcceptsCards");
        Utils.checkNotNull(estimatedActivity, "estimatedActivity");
        Utils.checkNotNull(fulfillment, "fulfillment");
        Utils.checkNotNull(refundPolicy, "refundPolicy");
        this.cardAcceptanceMethods = cardAcceptanceMethods;
        this.currentlyAcceptsCards = currentlyAcceptsCards;
        this.estimatedActivity = estimatedActivity;
        this.fulfillment = fulfillment;
        this.refundPolicy = refundPolicy;
    }
    
    public CollectFundsCardPaymentsError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardAcceptanceMethodsError> cardAcceptanceMethods() {
        return (Optional<CardAcceptanceMethodsError>) cardAcceptanceMethods;
    }

    @JsonIgnore
    public Optional<String> currentlyAcceptsCards() {
        return currentlyAcceptsCards;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EstimatedActivityError> estimatedActivity() {
        return (Optional<EstimatedActivityError>) estimatedActivity;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FulfillmentError> fulfillment() {
        return (Optional<FulfillmentError>) fulfillment;
    }

    @JsonIgnore
    public Optional<String> refundPolicy() {
        return refundPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }


    public CollectFundsCardPaymentsError withCardAcceptanceMethods(CardAcceptanceMethodsError cardAcceptanceMethods) {
        Utils.checkNotNull(cardAcceptanceMethods, "cardAcceptanceMethods");
        this.cardAcceptanceMethods = Optional.ofNullable(cardAcceptanceMethods);
        return this;
    }


    public CollectFundsCardPaymentsError withCardAcceptanceMethods(Optional<? extends CardAcceptanceMethodsError> cardAcceptanceMethods) {
        Utils.checkNotNull(cardAcceptanceMethods, "cardAcceptanceMethods");
        this.cardAcceptanceMethods = cardAcceptanceMethods;
        return this;
    }

    public CollectFundsCardPaymentsError withCurrentlyAcceptsCards(String currentlyAcceptsCards) {
        Utils.checkNotNull(currentlyAcceptsCards, "currentlyAcceptsCards");
        this.currentlyAcceptsCards = Optional.ofNullable(currentlyAcceptsCards);
        return this;
    }


    public CollectFundsCardPaymentsError withCurrentlyAcceptsCards(Optional<String> currentlyAcceptsCards) {
        Utils.checkNotNull(currentlyAcceptsCards, "currentlyAcceptsCards");
        this.currentlyAcceptsCards = currentlyAcceptsCards;
        return this;
    }

    public CollectFundsCardPaymentsError withEstimatedActivity(EstimatedActivityError estimatedActivity) {
        Utils.checkNotNull(estimatedActivity, "estimatedActivity");
        this.estimatedActivity = Optional.ofNullable(estimatedActivity);
        return this;
    }


    public CollectFundsCardPaymentsError withEstimatedActivity(Optional<? extends EstimatedActivityError> estimatedActivity) {
        Utils.checkNotNull(estimatedActivity, "estimatedActivity");
        this.estimatedActivity = estimatedActivity;
        return this;
    }

    public CollectFundsCardPaymentsError withFulfillment(FulfillmentError fulfillment) {
        Utils.checkNotNull(fulfillment, "fulfillment");
        this.fulfillment = Optional.ofNullable(fulfillment);
        return this;
    }


    public CollectFundsCardPaymentsError withFulfillment(Optional<? extends FulfillmentError> fulfillment) {
        Utils.checkNotNull(fulfillment, "fulfillment");
        this.fulfillment = fulfillment;
        return this;
    }

    public CollectFundsCardPaymentsError withRefundPolicy(String refundPolicy) {
        Utils.checkNotNull(refundPolicy, "refundPolicy");
        this.refundPolicy = Optional.ofNullable(refundPolicy);
        return this;
    }


    public CollectFundsCardPaymentsError withRefundPolicy(Optional<String> refundPolicy) {
        Utils.checkNotNull(refundPolicy, "refundPolicy");
        this.refundPolicy = refundPolicy;
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
        CollectFundsCardPaymentsError other = (CollectFundsCardPaymentsError) o;
        return 
            Utils.enhancedDeepEquals(this.cardAcceptanceMethods, other.cardAcceptanceMethods) &&
            Utils.enhancedDeepEquals(this.currentlyAcceptsCards, other.currentlyAcceptsCards) &&
            Utils.enhancedDeepEquals(this.estimatedActivity, other.estimatedActivity) &&
            Utils.enhancedDeepEquals(this.fulfillment, other.fulfillment) &&
            Utils.enhancedDeepEquals(this.refundPolicy, other.refundPolicy);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            cardAcceptanceMethods, currentlyAcceptsCards, estimatedActivity,
            fulfillment, refundPolicy);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CollectFundsCardPaymentsError.class,
                "cardAcceptanceMethods", cardAcceptanceMethods,
                "currentlyAcceptsCards", currentlyAcceptsCards,
                "estimatedActivity", estimatedActivity,
                "fulfillment", fulfillment,
                "refundPolicy", refundPolicy);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends CardAcceptanceMethodsError> cardAcceptanceMethods = Optional.empty();

        private Optional<String> currentlyAcceptsCards = Optional.empty();

        private Optional<? extends EstimatedActivityError> estimatedActivity = Optional.empty();

        private Optional<? extends FulfillmentError> fulfillment = Optional.empty();

        private Optional<String> refundPolicy = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder cardAcceptanceMethods(CardAcceptanceMethodsError cardAcceptanceMethods) {
            Utils.checkNotNull(cardAcceptanceMethods, "cardAcceptanceMethods");
            this.cardAcceptanceMethods = Optional.ofNullable(cardAcceptanceMethods);
            return this;
        }

        public Builder cardAcceptanceMethods(Optional<? extends CardAcceptanceMethodsError> cardAcceptanceMethods) {
            Utils.checkNotNull(cardAcceptanceMethods, "cardAcceptanceMethods");
            this.cardAcceptanceMethods = cardAcceptanceMethods;
            return this;
        }


        public Builder currentlyAcceptsCards(String currentlyAcceptsCards) {
            Utils.checkNotNull(currentlyAcceptsCards, "currentlyAcceptsCards");
            this.currentlyAcceptsCards = Optional.ofNullable(currentlyAcceptsCards);
            return this;
        }

        public Builder currentlyAcceptsCards(Optional<String> currentlyAcceptsCards) {
            Utils.checkNotNull(currentlyAcceptsCards, "currentlyAcceptsCards");
            this.currentlyAcceptsCards = currentlyAcceptsCards;
            return this;
        }


        public Builder estimatedActivity(EstimatedActivityError estimatedActivity) {
            Utils.checkNotNull(estimatedActivity, "estimatedActivity");
            this.estimatedActivity = Optional.ofNullable(estimatedActivity);
            return this;
        }

        public Builder estimatedActivity(Optional<? extends EstimatedActivityError> estimatedActivity) {
            Utils.checkNotNull(estimatedActivity, "estimatedActivity");
            this.estimatedActivity = estimatedActivity;
            return this;
        }


        public Builder fulfillment(FulfillmentError fulfillment) {
            Utils.checkNotNull(fulfillment, "fulfillment");
            this.fulfillment = Optional.ofNullable(fulfillment);
            return this;
        }

        public Builder fulfillment(Optional<? extends FulfillmentError> fulfillment) {
            Utils.checkNotNull(fulfillment, "fulfillment");
            this.fulfillment = fulfillment;
            return this;
        }


        public Builder refundPolicy(String refundPolicy) {
            Utils.checkNotNull(refundPolicy, "refundPolicy");
            this.refundPolicy = Optional.ofNullable(refundPolicy);
            return this;
        }

        public Builder refundPolicy(Optional<String> refundPolicy) {
            Utils.checkNotNull(refundPolicy, "refundPolicy");
            this.refundPolicy = refundPolicy;
            return this;
        }

        public CollectFundsCardPaymentsError build() {

            return new CollectFundsCardPaymentsError(
                cardAcceptanceMethods, currentlyAcceptsCards, estimatedActivity,
                fulfillment, refundPolicy);
        }

    }
}
