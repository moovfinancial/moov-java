/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.errors;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.models.components.ColorsValidationError;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
@SuppressWarnings("serial")
public class BrandValidationError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("colors")
    private Optional<? extends ColorsValidationError> colors;

    @JsonCreator
    public BrandValidationError(
            @JsonProperty("colors") Optional<? extends ColorsValidationError> colors) {
        Utils.checkNotNull(colors, "colors");
        this.colors = colors;
    }
    
    public BrandValidationError() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    public Optional<ColorsValidationError> colors(){
        return (Optional<ColorsValidationError>) colors;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public BrandValidationError withColors(ColorsValidationError colors) {
        Utils.checkNotNull(colors, "colors");
        this.colors = Optional.ofNullable(colors);
        return this;
    }
    
    public BrandValidationError withColors(Optional<? extends ColorsValidationError> colors) {
        Utils.checkNotNull(colors, "colors");
        this.colors = colors;
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
        BrandValidationError other = (BrandValidationError) o;
        return
            Objects.deepEquals(this.colors, other.colors);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            colors);
    }

    @Override
    public String toString() {
        return Utils.toString(BrandValidationError.class,
                "colors", colors);
    }

    public final static class Builder {

        private Optional<? extends ColorsValidationError> colors = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder colors(ColorsValidationError colors) {
            Utils.checkNotNull(colors, "colors");
            this.colors = Optional.ofNullable(colors);
            return this;
        }
        
        public Builder colors(Optional<? extends ColorsValidationError> colors) {
            Utils.checkNotNull(colors, "colors");
            this.colors = colors;
            return this;
        }

        public BrandValidationError build() {
            return new BrandValidationError(
                colors);
        }
    }
}
