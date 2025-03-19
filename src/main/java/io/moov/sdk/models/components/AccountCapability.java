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

/**
 * AccountCapability - Describes an action or set of actions that an account is permitted to perform.
 */

public class AccountCapability {

    @JsonProperty("capability")
    private String capability;

    @JsonProperty("status")
    private String status;

    @JsonCreator
    public AccountCapability(
            @JsonProperty("capability") String capability,
            @JsonProperty("status") String status) {
        Utils.checkNotNull(capability, "capability");
        Utils.checkNotNull(status, "status");
        this.capability = capability;
        this.status = status;
    }

    @JsonIgnore
    public String capability() {
        return capability;
    }

    @JsonIgnore
    public String status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccountCapability withCapability(String capability) {
        Utils.checkNotNull(capability, "capability");
        this.capability = capability;
        return this;
    }

    public AccountCapability withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        AccountCapability other = (AccountCapability) o;
        return 
            Objects.deepEquals(this.capability, other.capability) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            capability,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountCapability.class,
                "capability", capability,
                "status", status);
    }
    
    public final static class Builder {
 
        private String capability;
 
        private String status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder capability(String capability) {
            Utils.checkNotNull(capability, "capability");
            this.capability = capability;
            return this;
        }

        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public AccountCapability build() {
            return new AccountCapability(
                capability,
                status);
        }
    }
}

