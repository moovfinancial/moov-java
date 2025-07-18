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

/**
 * TerminalConfiguration
 * 
 * <p>Describes a terminal configuration.
 */
public class TerminalConfiguration {

    @JsonProperty("configuration")
    private String configuration;

    @JsonCreator
    public TerminalConfiguration(
            @JsonProperty("configuration") String configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = configuration;
    }

    @JsonIgnore
    public String configuration() {
        return configuration;
    }

    public static Builder builder() {
        return new Builder();
    }


    public TerminalConfiguration withConfiguration(String configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = configuration;
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
        TerminalConfiguration other = (TerminalConfiguration) o;
        return 
            Utils.enhancedDeepEquals(this.configuration, other.configuration);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            configuration);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TerminalConfiguration.class,
                "configuration", configuration);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String configuration;

        private Builder() {
          // force use of static builder() method
        }


        public Builder configuration(String configuration) {
            Utils.checkNotNull(configuration, "configuration");
            this.configuration = configuration;
            return this;
        }

        public TerminalConfiguration build() {

            return new TerminalConfiguration(
                configuration);
        }

    }
}
