/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class GetEnrichmentProfileRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=email")
    private String email;

    @JsonCreator
    public GetEnrichmentProfileRequest(
            String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
    }

    @JsonIgnore
    public String email() {
        return email;
    }

    public static Builder builder() {
        return new Builder();
    }


    public GetEnrichmentProfileRequest withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
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
        GetEnrichmentProfileRequest other = (GetEnrichmentProfileRequest) o;
        return 
            Utils.enhancedDeepEquals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            email);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetEnrichmentProfileRequest.class,
                "email", email);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String email;

        private Builder() {
          // force use of static builder() method
        }


        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public GetEnrichmentProfileRequest build() {

            return new GetEnrichmentProfileRequest(
                email);
        }

    }
}
