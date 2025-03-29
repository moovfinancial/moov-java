/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.utils.HasSecurity;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class Security implements HasSecurity {

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=basic,name=username")
    private String username;

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=basic,name=password")
    private String password;

    @JsonCreator
    public Security(
            String username,
            String password) {
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(password, "password");
        this.username = username;
        this.password = password;
    }

    @JsonIgnore
    public String username() {
        return username;
    }

    @JsonIgnore
    public String password() {
        return password;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Security withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    public Security withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
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
        Security other = (Security) o;
        return 
            Objects.deepEquals(this.username, other.username) &&
            Objects.deepEquals(this.password, other.password);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            username,
            password);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Security.class,
                "username", username,
                "password", password);
    }
    
    public final static class Builder {
 
        private String username;
 
        private String password;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }
        
        public Security build() {
            return new Security(
                username,
                password);
        }
    }
}
