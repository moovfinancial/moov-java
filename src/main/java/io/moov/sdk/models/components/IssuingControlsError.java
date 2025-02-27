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

public class IssuingControlsError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("velocityLimits")
    private Optional<? extends Map<String, IssuingVelocityLimitError>> velocityLimits;

    @JsonCreator
    public IssuingControlsError(
            @JsonProperty("velocityLimits") Optional<? extends Map<String, IssuingVelocityLimitError>> velocityLimits) {
        Utils.checkNotNull(velocityLimits, "velocityLimits");
        this.velocityLimits = velocityLimits;
    }
    
    public IssuingControlsError() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, IssuingVelocityLimitError>> velocityLimits() {
        return (Optional<Map<String, IssuingVelocityLimitError>>) velocityLimits;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public IssuingControlsError withVelocityLimits(Map<String, IssuingVelocityLimitError> velocityLimits) {
        Utils.checkNotNull(velocityLimits, "velocityLimits");
        this.velocityLimits = Optional.ofNullable(velocityLimits);
        return this;
    }

    public IssuingControlsError withVelocityLimits(Optional<? extends Map<String, IssuingVelocityLimitError>> velocityLimits) {
        Utils.checkNotNull(velocityLimits, "velocityLimits");
        this.velocityLimits = velocityLimits;
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
        IssuingControlsError other = (IssuingControlsError) o;
        return 
            Objects.deepEquals(this.velocityLimits, other.velocityLimits);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            velocityLimits);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IssuingControlsError.class,
                "velocityLimits", velocityLimits);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, IssuingVelocityLimitError>> velocityLimits = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder velocityLimits(Map<String, IssuingVelocityLimitError> velocityLimits) {
            Utils.checkNotNull(velocityLimits, "velocityLimits");
            this.velocityLimits = Optional.ofNullable(velocityLimits);
            return this;
        }

        public Builder velocityLimits(Optional<? extends Map<String, IssuingVelocityLimitError>> velocityLimits) {
            Utils.checkNotNull(velocityLimits, "velocityLimits");
            this.velocityLimits = velocityLimits;
            return this;
        }
        
        public IssuingControlsError build() {
            return new IssuingControlsError(
                velocityLimits);
        }
    }
}

