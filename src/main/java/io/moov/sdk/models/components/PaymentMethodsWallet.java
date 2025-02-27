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

public class PaymentMethodsWallet {

    @JsonProperty("walletID")
    private String walletID;

    @JsonCreator
    public PaymentMethodsWallet(
            @JsonProperty("walletID") String walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = walletID;
    }

    @JsonIgnore
    public String walletID() {
        return walletID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaymentMethodsWallet withWalletID(String walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = walletID;
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
        PaymentMethodsWallet other = (PaymentMethodsWallet) o;
        return 
            Objects.deepEquals(this.walletID, other.walletID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            walletID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentMethodsWallet.class,
                "walletID", walletID);
    }
    
    public final static class Builder {
 
        private String walletID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder walletID(String walletID) {
            Utils.checkNotNull(walletID, "walletID");
            this.walletID = walletID;
            return this;
        }
        
        public PaymentMethodsWallet build() {
            return new PaymentMethodsWallet(
                walletID);
        }
    }
}

