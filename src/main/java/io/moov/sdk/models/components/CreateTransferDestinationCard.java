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


public class CreateTransferDestinationCard {

    /**
     * An optional override of the default card statement descriptor for a transfer. Accounts must be enabled by Moov to set this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dynamicDescriptor")
    private Optional<String> dynamicDescriptor;

    @JsonCreator
    public CreateTransferDestinationCard(
            @JsonProperty("dynamicDescriptor") Optional<String> dynamicDescriptor) {
        Utils.checkNotNull(dynamicDescriptor, "dynamicDescriptor");
        this.dynamicDescriptor = dynamicDescriptor;
    }
    
    public CreateTransferDestinationCard() {
        this(Optional.empty());
    }

    /**
     * An optional override of the default card statement descriptor for a transfer. Accounts must be enabled by Moov to set this field.
     */
    @JsonIgnore
    public Optional<String> dynamicDescriptor() {
        return dynamicDescriptor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An optional override of the default card statement descriptor for a transfer. Accounts must be enabled by Moov to set this field.
     */
    public CreateTransferDestinationCard withDynamicDescriptor(String dynamicDescriptor) {
        Utils.checkNotNull(dynamicDescriptor, "dynamicDescriptor");
        this.dynamicDescriptor = Optional.ofNullable(dynamicDescriptor);
        return this;
    }

    /**
     * An optional override of the default card statement descriptor for a transfer. Accounts must be enabled by Moov to set this field.
     */
    public CreateTransferDestinationCard withDynamicDescriptor(Optional<String> dynamicDescriptor) {
        Utils.checkNotNull(dynamicDescriptor, "dynamicDescriptor");
        this.dynamicDescriptor = dynamicDescriptor;
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
        CreateTransferDestinationCard other = (CreateTransferDestinationCard) o;
        return 
            Objects.deepEquals(this.dynamicDescriptor, other.dynamicDescriptor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dynamicDescriptor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransferDestinationCard.class,
                "dynamicDescriptor", dynamicDescriptor);
    }
    
    public final static class Builder {
 
        private Optional<String> dynamicDescriptor = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An optional override of the default card statement descriptor for a transfer. Accounts must be enabled by Moov to set this field.
         */
        public Builder dynamicDescriptor(String dynamicDescriptor) {
            Utils.checkNotNull(dynamicDescriptor, "dynamicDescriptor");
            this.dynamicDescriptor = Optional.ofNullable(dynamicDescriptor);
            return this;
        }

        /**
         * An optional override of the default card statement descriptor for a transfer. Accounts must be enabled by Moov to set this field.
         */
        public Builder dynamicDescriptor(Optional<String> dynamicDescriptor) {
            Utils.checkNotNull(dynamicDescriptor, "dynamicDescriptor");
            this.dynamicDescriptor = dynamicDescriptor;
            return this;
        }
        
        public CreateTransferDestinationCard build() {
            return new CreateTransferDestinationCard(
                dynamicDescriptor);
        }
    }
}

