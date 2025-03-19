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
import java.util.Objects;
import java.util.Optional;

/**
 * CreateTransferDestination - The final stage of a transfer and the ultimate recipient of the funds.
 */

public class CreateTransferDestination {

    @JsonProperty("paymentMethodID")
    private String paymentMethodID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardDetails")
    private Optional<? extends CreateTransferDestinationCard> cardDetails;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("achDetails")
    private Optional<? extends CreateTransferDestinationACH> achDetails;

    @JsonCreator
    public CreateTransferDestination(
            @JsonProperty("paymentMethodID") String paymentMethodID,
            @JsonProperty("cardDetails") Optional<? extends CreateTransferDestinationCard> cardDetails,
            @JsonProperty("achDetails") Optional<? extends CreateTransferDestinationACH> achDetails) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        Utils.checkNotNull(cardDetails, "cardDetails");
        Utils.checkNotNull(achDetails, "achDetails");
        this.paymentMethodID = paymentMethodID;
        this.cardDetails = cardDetails;
        this.achDetails = achDetails;
    }
    
    public CreateTransferDestination(
            String paymentMethodID) {
        this(paymentMethodID, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String paymentMethodID() {
        return paymentMethodID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateTransferDestinationCard> cardDetails() {
        return (Optional<CreateTransferDestinationCard>) cardDetails;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateTransferDestinationACH> achDetails() {
        return (Optional<CreateTransferDestinationACH>) achDetails;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateTransferDestination withPaymentMethodID(String paymentMethodID) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        this.paymentMethodID = paymentMethodID;
        return this;
    }

    public CreateTransferDestination withCardDetails(CreateTransferDestinationCard cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = Optional.ofNullable(cardDetails);
        return this;
    }

    public CreateTransferDestination withCardDetails(Optional<? extends CreateTransferDestinationCard> cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = cardDetails;
        return this;
    }

    public CreateTransferDestination withAchDetails(CreateTransferDestinationACH achDetails) {
        Utils.checkNotNull(achDetails, "achDetails");
        this.achDetails = Optional.ofNullable(achDetails);
        return this;
    }

    public CreateTransferDestination withAchDetails(Optional<? extends CreateTransferDestinationACH> achDetails) {
        Utils.checkNotNull(achDetails, "achDetails");
        this.achDetails = achDetails;
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
        CreateTransferDestination other = (CreateTransferDestination) o;
        return 
            Objects.deepEquals(this.paymentMethodID, other.paymentMethodID) &&
            Objects.deepEquals(this.cardDetails, other.cardDetails) &&
            Objects.deepEquals(this.achDetails, other.achDetails);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentMethodID,
            cardDetails,
            achDetails);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransferDestination.class,
                "paymentMethodID", paymentMethodID,
                "cardDetails", cardDetails,
                "achDetails", achDetails);
    }
    
    public final static class Builder {
 
        private String paymentMethodID;
 
        private Optional<? extends CreateTransferDestinationCard> cardDetails = Optional.empty();
 
        private Optional<? extends CreateTransferDestinationACH> achDetails = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder paymentMethodID(String paymentMethodID) {
            Utils.checkNotNull(paymentMethodID, "paymentMethodID");
            this.paymentMethodID = paymentMethodID;
            return this;
        }

        public Builder cardDetails(CreateTransferDestinationCard cardDetails) {
            Utils.checkNotNull(cardDetails, "cardDetails");
            this.cardDetails = Optional.ofNullable(cardDetails);
            return this;
        }

        public Builder cardDetails(Optional<? extends CreateTransferDestinationCard> cardDetails) {
            Utils.checkNotNull(cardDetails, "cardDetails");
            this.cardDetails = cardDetails;
            return this;
        }

        public Builder achDetails(CreateTransferDestinationACH achDetails) {
            Utils.checkNotNull(achDetails, "achDetails");
            this.achDetails = Optional.ofNullable(achDetails);
            return this;
        }

        public Builder achDetails(Optional<? extends CreateTransferDestinationACH> achDetails) {
            Utils.checkNotNull(achDetails, "achDetails");
            this.achDetails = achDetails;
            return this;
        }
        
        public CreateTransferDestination build() {
            return new CreateTransferDestination(
                paymentMethodID,
                cardDetails,
                achDetails);
        }
    }
}

