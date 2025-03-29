/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

@SuppressWarnings("serial")
public class UpdateUnderwritingError extends RuntimeException {

    @JsonProperty("error")
    private UpdateUnderwritingErrorError error;

    @JsonCreator
    public UpdateUnderwritingError(
            @JsonProperty("error") UpdateUnderwritingErrorError error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
    }

    @JsonIgnore
    public UpdateUnderwritingErrorError error() {
        return error;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public UpdateUnderwritingError withError(UpdateUnderwritingErrorError error) {
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
        UpdateUnderwritingError other = (UpdateUnderwritingError) o;
        return 
            Objects.deepEquals(this.error, other.error);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            error);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateUnderwritingError.class,
                "error", error);
    }
    
    public final static class Builder {
 
        private UpdateUnderwritingErrorError error;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder error(UpdateUnderwritingErrorError error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }
        
        public UpdateUnderwritingError build() {
            return new UpdateUnderwritingError(
                error);
        }
    }
}

