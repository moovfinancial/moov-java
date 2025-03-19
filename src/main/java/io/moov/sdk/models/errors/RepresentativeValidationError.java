/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

@SuppressWarnings("serial")
public class RepresentativeValidationError extends RuntimeException {

    @JsonProperty("error")
    private Error error;

    @JsonCreator
    public RepresentativeValidationError(
            @JsonProperty("error") Error error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
    }

    public Error error(){
        return error;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public RepresentativeValidationError withError(Error error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
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
        RepresentativeValidationError other = (RepresentativeValidationError) o;
        return
            Objects.deepEquals(this.error, other.error);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            error);
    }

    @Override
    public String toString() {
        return Utils.toString(RepresentativeValidationError.class,
                "error", error);
    }

    public final static class Builder {

        private Error error;

        private Builder() {
          // force use of static builder() method
        }

        public Builder error(Error error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public RepresentativeValidationError build() {
            return new RepresentativeValidationError(
                error);
        }
    }
}
