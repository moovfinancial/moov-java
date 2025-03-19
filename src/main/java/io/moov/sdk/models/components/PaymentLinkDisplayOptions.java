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
 * PaymentLinkDisplayOptions - Customizable display options for a payment link.
 */

public class PaymentLinkDisplayOptions {

    /**
     * The payment page title displayed to the user.
     */
    @JsonProperty("title")
    private String title;

    /**
     * A payment description displayed to the user.
     */
    @JsonProperty("description")
    private String description;

    /**
     * The text to be displayed on web form's submit button.
     * 
     * If set to "auto" the UI will automatically select between 
     * "pay" and "confirm" for payments and payouts respectively.
     */
    @JsonProperty("callToAction")
    private CallToAction callToAction;

    @JsonCreator
    public PaymentLinkDisplayOptions(
            @JsonProperty("title") String title,
            @JsonProperty("description") String description,
            @JsonProperty("callToAction") CallToAction callToAction) {
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(callToAction, "callToAction");
        this.title = title;
        this.description = description;
        this.callToAction = callToAction;
    }

    /**
     * The payment page title displayed to the user.
     */
    @JsonIgnore
    public String title() {
        return title;
    }

    /**
     * A payment description displayed to the user.
     */
    @JsonIgnore
    public String description() {
        return description;
    }

    /**
     * The text to be displayed on web form's submit button.
     * 
     * If set to "auto" the UI will automatically select between 
     * "pay" and "confirm" for payments and payouts respectively.
     */
    @JsonIgnore
    public CallToAction callToAction() {
        return callToAction;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The payment page title displayed to the user.
     */
    public PaymentLinkDisplayOptions withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * A payment description displayed to the user.
     */
    public PaymentLinkDisplayOptions withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The text to be displayed on web form's submit button.
     * 
     * If set to "auto" the UI will automatically select between 
     * "pay" and "confirm" for payments and payouts respectively.
     */
    public PaymentLinkDisplayOptions withCallToAction(CallToAction callToAction) {
        Utils.checkNotNull(callToAction, "callToAction");
        this.callToAction = callToAction;
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
        PaymentLinkDisplayOptions other = (PaymentLinkDisplayOptions) o;
        return 
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.callToAction, other.callToAction);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            title,
            description,
            callToAction);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentLinkDisplayOptions.class,
                "title", title,
                "description", description,
                "callToAction", callToAction);
    }
    
    public final static class Builder {
 
        private String title;
 
        private String description;
 
        private CallToAction callToAction;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The payment page title displayed to the user.
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * A payment description displayed to the user.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The text to be displayed on web form's submit button.
         * 
         * If set to "auto" the UI will automatically select between 
         * "pay" and "confirm" for payments and payouts respectively.
         */
        public Builder callToAction(CallToAction callToAction) {
            Utils.checkNotNull(callToAction, "callToAction");
            this.callToAction = callToAction;
            return this;
        }
        
        public PaymentLinkDisplayOptions build() {
            return new PaymentLinkDisplayOptions(
                title,
                description,
                callToAction);
        }
    }
}

