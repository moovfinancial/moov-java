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


public class ACHException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<String> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reason")
    private Optional<String> reason;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonCreator
    public ACHException(
            @JsonProperty("code") Optional<String> code,
            @JsonProperty("reason") Optional<String> reason,
            @JsonProperty("description") Optional<String> description) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(reason, "reason");
        Utils.checkNotNull(description, "description");
        this.code = code;
        this.reason = reason;
        this.description = description;
    }
    
    public ACHException() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> code() {
        return code;
    }

    @JsonIgnore
    public Optional<String> reason() {
        return reason;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ACHException withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    public ACHException withCode(Optional<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public ACHException withReason(String reason) {
        Utils.checkNotNull(reason, "reason");
        this.reason = Optional.ofNullable(reason);
        return this;
    }

    public ACHException withReason(Optional<String> reason) {
        Utils.checkNotNull(reason, "reason");
        this.reason = reason;
        return this;
    }

    public ACHException withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public ACHException withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
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
        ACHException other = (ACHException) o;
        return 
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.reason, other.reason) &&
            Objects.deepEquals(this.description, other.description);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            reason,
            description);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ACHException.class,
                "code", code,
                "reason", reason,
                "description", description);
    }
    
    public final static class Builder {
 
        private Optional<String> code = Optional.empty();
 
        private Optional<String> reason = Optional.empty();
 
        private Optional<String> description = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        public Builder code(Optional<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        public Builder reason(String reason) {
            Utils.checkNotNull(reason, "reason");
            this.reason = Optional.ofNullable(reason);
            return this;
        }

        public Builder reason(Optional<String> reason) {
            Utils.checkNotNull(reason, "reason");
            this.reason = reason;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }
        
        public ACHException build() {
            return new ACHException(
                code,
                reason,
                description);
        }
    }
}

