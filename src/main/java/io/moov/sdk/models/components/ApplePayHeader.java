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
import java.util.Objects;
import java.util.Optional;
/**
 * ApplePayHeader - Information needed to decrypt Apple Pay payment data.
 * 
 * Refer to [Apple's documentation](https://developer.apple.com/documentation/passkit/payment-token-format-reference#Header-keys-and-values) 
 * for more information.
 */

public class ApplePayHeader {

    /**
     * Base64-encoded ephemeral public key, used for ECC-encrypted payment data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ephemeralPublicKey")
    private Optional<String> ephemeralPublicKey;

    /**
     * A base64-encoded, SHA-256 hash of the merchant's public key.
     */
    @JsonProperty("publicKeyHash")
    private String publicKeyHash;

    /**
     * A device-generated identifier for the transaction.
     */
    @JsonProperty("transactionId")
    private String transactionId;

    @JsonCreator
    public ApplePayHeader(
            @JsonProperty("ephemeralPublicKey") Optional<String> ephemeralPublicKey,
            @JsonProperty("publicKeyHash") String publicKeyHash,
            @JsonProperty("transactionId") String transactionId) {
        Utils.checkNotNull(ephemeralPublicKey, "ephemeralPublicKey");
        Utils.checkNotNull(publicKeyHash, "publicKeyHash");
        Utils.checkNotNull(transactionId, "transactionId");
        this.ephemeralPublicKey = ephemeralPublicKey;
        this.publicKeyHash = publicKeyHash;
        this.transactionId = transactionId;
    }
    
    public ApplePayHeader(
            String publicKeyHash,
            String transactionId) {
        this(Optional.empty(), publicKeyHash, transactionId);
    }

    /**
     * Base64-encoded ephemeral public key, used for ECC-encrypted payment data.
     */
    @JsonIgnore
    public Optional<String> ephemeralPublicKey() {
        return ephemeralPublicKey;
    }

    /**
     * A base64-encoded, SHA-256 hash of the merchant's public key.
     */
    @JsonIgnore
    public String publicKeyHash() {
        return publicKeyHash;
    }

    /**
     * A device-generated identifier for the transaction.
     */
    @JsonIgnore
    public String transactionId() {
        return transactionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Base64-encoded ephemeral public key, used for ECC-encrypted payment data.
     */
    public ApplePayHeader withEphemeralPublicKey(String ephemeralPublicKey) {
        Utils.checkNotNull(ephemeralPublicKey, "ephemeralPublicKey");
        this.ephemeralPublicKey = Optional.ofNullable(ephemeralPublicKey);
        return this;
    }

    /**
     * Base64-encoded ephemeral public key, used for ECC-encrypted payment data.
     */
    public ApplePayHeader withEphemeralPublicKey(Optional<String> ephemeralPublicKey) {
        Utils.checkNotNull(ephemeralPublicKey, "ephemeralPublicKey");
        this.ephemeralPublicKey = ephemeralPublicKey;
        return this;
    }

    /**
     * A base64-encoded, SHA-256 hash of the merchant's public key.
     */
    public ApplePayHeader withPublicKeyHash(String publicKeyHash) {
        Utils.checkNotNull(publicKeyHash, "publicKeyHash");
        this.publicKeyHash = publicKeyHash;
        return this;
    }

    /**
     * A device-generated identifier for the transaction.
     */
    public ApplePayHeader withTransactionId(String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = transactionId;
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
        ApplePayHeader other = (ApplePayHeader) o;
        return 
            Objects.deepEquals(this.ephemeralPublicKey, other.ephemeralPublicKey) &&
            Objects.deepEquals(this.publicKeyHash, other.publicKeyHash) &&
            Objects.deepEquals(this.transactionId, other.transactionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ephemeralPublicKey,
            publicKeyHash,
            transactionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplePayHeader.class,
                "ephemeralPublicKey", ephemeralPublicKey,
                "publicKeyHash", publicKeyHash,
                "transactionId", transactionId);
    }
    
    public final static class Builder {
 
        private Optional<String> ephemeralPublicKey = Optional.empty();
 
        private String publicKeyHash;
 
        private String transactionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Base64-encoded ephemeral public key, used for ECC-encrypted payment data.
         */
        public Builder ephemeralPublicKey(String ephemeralPublicKey) {
            Utils.checkNotNull(ephemeralPublicKey, "ephemeralPublicKey");
            this.ephemeralPublicKey = Optional.ofNullable(ephemeralPublicKey);
            return this;
        }

        /**
         * Base64-encoded ephemeral public key, used for ECC-encrypted payment data.
         */
        public Builder ephemeralPublicKey(Optional<String> ephemeralPublicKey) {
            Utils.checkNotNull(ephemeralPublicKey, "ephemeralPublicKey");
            this.ephemeralPublicKey = ephemeralPublicKey;
            return this;
        }

        /**
         * A base64-encoded, SHA-256 hash of the merchant's public key.
         */
        public Builder publicKeyHash(String publicKeyHash) {
            Utils.checkNotNull(publicKeyHash, "publicKeyHash");
            this.publicKeyHash = publicKeyHash;
            return this;
        }

        /**
         * A device-generated identifier for the transaction.
         */
        public Builder transactionId(String transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = transactionId;
            return this;
        }
        
        public ApplePayHeader build() {
            return new ApplePayHeader(
                ephemeralPublicKey,
                publicKeyHash,
                transactionId);
        }
    }
}

