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


public class GetOnboardingInviteRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=code")
    private String code;

    @JsonCreator
    public GetOnboardingInviteRequest(
            String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
    }

    @JsonIgnore
    public String code() {
        return code;
    }

    public static Builder builder() {
        return new Builder();
    }


    public GetOnboardingInviteRequest withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
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
        GetOnboardingInviteRequest other = (GetOnboardingInviteRequest) o;
        return 
            Utils.enhancedDeepEquals(this.code, other.code);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            code);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetOnboardingInviteRequest.class,
                "code", code);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String code;

        private Builder() {
          // force use of static builder() method
        }


        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        public GetOnboardingInviteRequest build() {

            return new GetOnboardingInviteRequest(
                code);
        }

    }
}
