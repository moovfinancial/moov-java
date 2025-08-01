/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;


public class RTPServices {
    /**
     * Can the institution receive payments
     */
    @JsonProperty("receivePayments")
    private boolean receivePayments;

    /**
     * Can the institution receive request for payment messages
     */
    @JsonProperty("receiveRequestForPayment")
    private boolean receiveRequestForPayment;

    @JsonCreator
    public RTPServices(
            @JsonProperty("receivePayments") boolean receivePayments,
            @JsonProperty("receiveRequestForPayment") boolean receiveRequestForPayment) {
        Utils.checkNotNull(receivePayments, "receivePayments");
        Utils.checkNotNull(receiveRequestForPayment, "receiveRequestForPayment");
        this.receivePayments = receivePayments;
        this.receiveRequestForPayment = receiveRequestForPayment;
    }

    /**
     * Can the institution receive payments
     */
    @JsonIgnore
    public boolean receivePayments() {
        return receivePayments;
    }

    /**
     * Can the institution receive request for payment messages
     */
    @JsonIgnore
    public boolean receiveRequestForPayment() {
        return receiveRequestForPayment;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Can the institution receive payments
     */
    public RTPServices withReceivePayments(boolean receivePayments) {
        Utils.checkNotNull(receivePayments, "receivePayments");
        this.receivePayments = receivePayments;
        return this;
    }

    /**
     * Can the institution receive request for payment messages
     */
    public RTPServices withReceiveRequestForPayment(boolean receiveRequestForPayment) {
        Utils.checkNotNull(receiveRequestForPayment, "receiveRequestForPayment");
        this.receiveRequestForPayment = receiveRequestForPayment;
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
        RTPServices other = (RTPServices) o;
        return 
            Utils.enhancedDeepEquals(this.receivePayments, other.receivePayments) &&
            Utils.enhancedDeepEquals(this.receiveRequestForPayment, other.receiveRequestForPayment);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            receivePayments, receiveRequestForPayment);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RTPServices.class,
                "receivePayments", receivePayments,
                "receiveRequestForPayment", receiveRequestForPayment);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Boolean receivePayments;

        private Boolean receiveRequestForPayment;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Can the institution receive payments
         */
        public Builder receivePayments(boolean receivePayments) {
            Utils.checkNotNull(receivePayments, "receivePayments");
            this.receivePayments = receivePayments;
            return this;
        }


        /**
         * Can the institution receive request for payment messages
         */
        public Builder receiveRequestForPayment(boolean receiveRequestForPayment) {
            Utils.checkNotNull(receiveRequestForPayment, "receiveRequestForPayment");
            this.receiveRequestForPayment = receiveRequestForPayment;
            return this;
        }

        public RTPServices build() {

            return new RTPServices(
                receivePayments, receiveRequestForPayment);
        }

    }
}
