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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class CreateTransfer {

    /**
     * Where funds for a transfer originate. For the source, you must include either a `paymentMethodID` or a `transferID`.
     */
    @JsonProperty("source")
    private CreateTransferSource source;

    /**
     * The final stage of a transfer and the ultimate recipient of the funds.
     */
    @JsonProperty("destination")
    private CreateTransferDestination destination;

    @JsonProperty("amount")
    private Amount amount;

    /**
     * Total or markup fee.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("facilitatorFee")
    private Optional<? extends FacilitatorFee> facilitatorFee;

    /**
     * An optional description of the transfer for your own internal use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    /**
     * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Map<String, String>> metadata;

    @JsonCreator
    public CreateTransfer(
            @JsonProperty("source") CreateTransferSource source,
            @JsonProperty("destination") CreateTransferDestination destination,
            @JsonProperty("amount") Amount amount,
            @JsonProperty("facilitatorFee") Optional<? extends FacilitatorFee> facilitatorFee,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("metadata") Optional<? extends Map<String, String>> metadata) {
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(destination, "destination");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(facilitatorFee, "facilitatorFee");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(metadata, "metadata");
        this.source = source;
        this.destination = destination;
        this.amount = amount;
        this.facilitatorFee = facilitatorFee;
        this.description = description;
        this.metadata = metadata;
    }
    
    public CreateTransfer(
            CreateTransferSource source,
            CreateTransferDestination destination,
            Amount amount) {
        this(source, destination, amount, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Where funds for a transfer originate. For the source, you must include either a `paymentMethodID` or a `transferID`.
     */
    @JsonIgnore
    public CreateTransferSource source() {
        return source;
    }

    /**
     * The final stage of a transfer and the ultimate recipient of the funds.
     */
    @JsonIgnore
    public CreateTransferDestination destination() {
        return destination;
    }

    @JsonIgnore
    public Amount amount() {
        return amount;
    }

    /**
     * Total or markup fee.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FacilitatorFee> facilitatorFee() {
        return (Optional<FacilitatorFee>) facilitatorFee;
    }

    /**
     * An optional description of the transfer for your own internal use.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> metadata() {
        return (Optional<Map<String, String>>) metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Where funds for a transfer originate. For the source, you must include either a `paymentMethodID` or a `transferID`.
     */
    public CreateTransfer withSource(CreateTransferSource source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    /**
     * The final stage of a transfer and the ultimate recipient of the funds.
     */
    public CreateTransfer withDestination(CreateTransferDestination destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = destination;
        return this;
    }

    public CreateTransfer withAmount(Amount amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * Total or markup fee.
     */
    public CreateTransfer withFacilitatorFee(FacilitatorFee facilitatorFee) {
        Utils.checkNotNull(facilitatorFee, "facilitatorFee");
        this.facilitatorFee = Optional.ofNullable(facilitatorFee);
        return this;
    }

    /**
     * Total or markup fee.
     */
    public CreateTransfer withFacilitatorFee(Optional<? extends FacilitatorFee> facilitatorFee) {
        Utils.checkNotNull(facilitatorFee, "facilitatorFee");
        this.facilitatorFee = facilitatorFee;
        return this;
    }

    /**
     * An optional description of the transfer for your own internal use.
     */
    public CreateTransfer withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * An optional description of the transfer for your own internal use.
     */
    public CreateTransfer withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
     */
    public CreateTransfer withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
     */
    public CreateTransfer withMetadata(Optional<? extends Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
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
        CreateTransfer other = (CreateTransfer) o;
        return 
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.destination, other.destination) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.facilitatorFee, other.facilitatorFee) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            source,
            destination,
            amount,
            facilitatorFee,
            description,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransfer.class,
                "source", source,
                "destination", destination,
                "amount", amount,
                "facilitatorFee", facilitatorFee,
                "description", description,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private CreateTransferSource source;
 
        private CreateTransferDestination destination;
 
        private Amount amount;
 
        private Optional<? extends FacilitatorFee> facilitatorFee = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<? extends Map<String, String>> metadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Where funds for a transfer originate. For the source, you must include either a `paymentMethodID` or a `transferID`.
         */
        public Builder source(CreateTransferSource source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        /**
         * The final stage of a transfer and the ultimate recipient of the funds.
         */
        public Builder destination(CreateTransferDestination destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = destination;
            return this;
        }

        public Builder amount(Amount amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * Total or markup fee.
         */
        public Builder facilitatorFee(FacilitatorFee facilitatorFee) {
            Utils.checkNotNull(facilitatorFee, "facilitatorFee");
            this.facilitatorFee = Optional.ofNullable(facilitatorFee);
            return this;
        }

        /**
         * Total or markup fee.
         */
        public Builder facilitatorFee(Optional<? extends FacilitatorFee> facilitatorFee) {
            Utils.checkNotNull(facilitatorFee, "facilitatorFee");
            this.facilitatorFee = facilitatorFee;
            return this;
        }

        /**
         * An optional description of the transfer for your own internal use.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * An optional description of the transfer for your own internal use.
         */
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
         */
        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
         */
        public Builder metadata(Optional<? extends Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public CreateTransfer build() {
            return new CreateTransfer(
                source,
                destination,
                amount,
                facilitatorFee,
                description,
                metadata);
        }
    }
}

