/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.errors;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
@SuppressWarnings("serial")
public class TransferOptionsValidationError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<String> amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    private Optional<String> source;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    private Optional<String> destination;

    @JsonCreator
    public TransferOptionsValidationError(
            @JsonProperty("amount") Optional<String> amount,
            @JsonProperty("source") Optional<String> source,
            @JsonProperty("destination") Optional<String> destination) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(destination, "destination");
        this.amount = amount;
        this.source = source;
        this.destination = destination;
    }
    
    public TransferOptionsValidationError() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    public Optional<String> amount(){
        return amount;
    }

    public Optional<String> source(){
        return source;
    }

    public Optional<String> destination(){
        return destination;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public TransferOptionsValidationError withAmount(String amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }
    
    public TransferOptionsValidationError withAmount(Optional<String> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public TransferOptionsValidationError withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }
    
    public TransferOptionsValidationError withSource(Optional<String> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    public TransferOptionsValidationError withDestination(String destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = Optional.ofNullable(destination);
        return this;
    }
    
    public TransferOptionsValidationError withDestination(Optional<String> destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = destination;
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
        TransferOptionsValidationError other = (TransferOptionsValidationError) o;
        return
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.destination, other.destination);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amount,
            source,
            destination);
    }

    @Override
    public String toString() {
        return Utils.toString(TransferOptionsValidationError.class,
                "amount", amount,
                "source", source,
                "destination", destination);
    }

    public final static class Builder {

        private Optional<String> amount = Optional.empty();

        private Optional<String> source = Optional.empty();

        private Optional<String> destination = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(String amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }
        
        public Builder amount(Optional<String> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }
        
        public Builder source(Optional<String> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        public Builder destination(String destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = Optional.ofNullable(destination);
            return this;
        }
        
        public Builder destination(Optional<String> destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = destination;
            return this;
        }

        public TransferOptionsValidationError build() {
            return new TransferOptionsValidationError(
                amount,
                source,
                destination);
        }
    }
}
