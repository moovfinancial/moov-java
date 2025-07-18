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


public class Logo {

    @JsonProperty("name")
    private String name;


    @JsonProperty("url")
    private String url;

    @JsonCreator
    public Logo(
            @JsonProperty("name") String name,
            @JsonProperty("url") String url) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(url, "url");
        this.name = name;
        this.url = url;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String url() {
        return url;
    }

    public static Builder builder() {
        return new Builder();
    }


    public Logo withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Logo withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        Logo other = (Logo) o;
        return 
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            name, url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Logo.class,
                "name", name,
                "url", url);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String name;

        private String url;

        private Builder() {
          // force use of static builder() method
        }


        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        public Logo build() {

            return new Logo(
                name, url);
        }

    }
}
