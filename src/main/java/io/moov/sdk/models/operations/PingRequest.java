/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class PingRequest {
    @JsonCreator
    public PingRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(PingRequest.class);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Builder() {
          // force use of static builder() method
        }

        public PingRequest build() {

            return new PingRequest(
                );
        }

    }
}
