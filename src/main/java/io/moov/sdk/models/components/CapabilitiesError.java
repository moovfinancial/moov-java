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

public class CapabilitiesError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("capabilities")
    private Optional<? extends Map<String, String>> capabilities;

    @JsonCreator
    public CapabilitiesError(
            @JsonProperty("capabilities") Optional<? extends Map<String, String>> capabilities) {
        Utils.checkNotNull(capabilities, "capabilities");
        this.capabilities = capabilities;
    }
    
    public CapabilitiesError() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> capabilities() {
        return (Optional<Map<String, String>>) capabilities;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public CapabilitiesError withCapabilities(Map<String, String> capabilities) {
        Utils.checkNotNull(capabilities, "capabilities");
        this.capabilities = Optional.ofNullable(capabilities);
        return this;
    }

    public CapabilitiesError withCapabilities(Optional<? extends Map<String, String>> capabilities) {
        Utils.checkNotNull(capabilities, "capabilities");
        this.capabilities = capabilities;
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
        CapabilitiesError other = (CapabilitiesError) o;
        return 
            Objects.deepEquals(this.capabilities, other.capabilities);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            capabilities);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CapabilitiesError.class,
                "capabilities", capabilities);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, String>> capabilities = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder capabilities(Map<String, String> capabilities) {
            Utils.checkNotNull(capabilities, "capabilities");
            this.capabilities = Optional.ofNullable(capabilities);
            return this;
        }

        public Builder capabilities(Optional<? extends Map<String, String>> capabilities) {
            Utils.checkNotNull(capabilities, "capabilities");
            this.capabilities = capabilities;
            return this;
        }
        
        public CapabilitiesError build() {
            return new CapabilitiesError(
                capabilities);
        }
    }
}
