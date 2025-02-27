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
 * LinkApplePaymentMethod -   Provides information about the underlying card.
 * 
 *   Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken/1916113-paymentmethod) 
 *   for more information.
 */

public class LinkApplePaymentMethod {

    /**
     * A display-friendly discription of the card.
     */
    @JsonProperty("displayName")
    private String displayName;

    /**
     * The card's payment network.
     */
    @JsonProperty("network")
    private String network;

    /**
     * The type of card.
     */
    @JsonProperty("type")
    private String type;

    @JsonCreator
    public LinkApplePaymentMethod(
            @JsonProperty("displayName") String displayName,
            @JsonProperty("network") String network,
            @JsonProperty("type") String type) {
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(network, "network");
        Utils.checkNotNull(type, "type");
        this.displayName = displayName;
        this.network = network;
        this.type = type;
    }

    /**
     * A display-friendly discription of the card.
     */
    @JsonIgnore
    public String displayName() {
        return displayName;
    }

    /**
     * The card's payment network.
     */
    @JsonIgnore
    public String network() {
        return network;
    }

    /**
     * The type of card.
     */
    @JsonIgnore
    public String type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A display-friendly discription of the card.
     */
    public LinkApplePaymentMethod withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    /**
     * The card's payment network.
     */
    public LinkApplePaymentMethod withNetwork(String network) {
        Utils.checkNotNull(network, "network");
        this.network = network;
        return this;
    }

    /**
     * The type of card.
     */
    public LinkApplePaymentMethod withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        LinkApplePaymentMethod other = (LinkApplePaymentMethod) o;
        return 
            Objects.deepEquals(this.displayName, other.displayName) &&
            Objects.deepEquals(this.network, other.network) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            displayName,
            network,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkApplePaymentMethod.class,
                "displayName", displayName,
                "network", network,
                "type", type);
    }
    
    public final static class Builder {
 
        private String displayName;
 
        private String network;
 
        private String type;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A display-friendly discription of the card.
         */
        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }

        /**
         * The card's payment network.
         */
        public Builder network(String network) {
            Utils.checkNotNull(network, "network");
            this.network = network;
            return this;
        }

        /**
         * The type of card.
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public LinkApplePaymentMethod build() {
            return new LinkApplePaymentMethod(
                displayName,
                network,
                type);
        }
    }
}

