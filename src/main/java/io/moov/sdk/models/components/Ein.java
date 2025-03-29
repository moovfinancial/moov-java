/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class Ein {

    @JsonProperty("number")
    private String number;

    @JsonCreator
    public Ein(
            @JsonProperty("number") String number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
    }

    @JsonIgnore
    public String number() {
        return number;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Ein withNumber(String number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
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
        Ein other = (Ein) o;
        return 
            Objects.deepEquals(this.number, other.number);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            number);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Ein.class,
                "number", number);
    }
    
    public final static class Builder {
 
        private String number;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder number(String number) {
            Utils.checkNotNull(number, "number");
            this.number = number;
            return this;
        }
        
        public Ein build() {
            return new Ein(
                number);
        }
    }
}
