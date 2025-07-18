/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.AddCapabilities;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class RequestCapabilitiesRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private AddCapabilities addCapabilities;

    @JsonCreator
    public RequestCapabilitiesRequest(
            String accountID,
            AddCapabilities addCapabilities) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(addCapabilities, "addCapabilities");
        this.accountID = accountID;
        this.addCapabilities = addCapabilities;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public AddCapabilities addCapabilities() {
        return addCapabilities;
    }

    public static Builder builder() {
        return new Builder();
    }


    public RequestCapabilitiesRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public RequestCapabilitiesRequest withAddCapabilities(AddCapabilities addCapabilities) {
        Utils.checkNotNull(addCapabilities, "addCapabilities");
        this.addCapabilities = addCapabilities;
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
        RequestCapabilitiesRequest other = (RequestCapabilitiesRequest) o;
        return 
            Utils.enhancedDeepEquals(this.accountID, other.accountID) &&
            Utils.enhancedDeepEquals(this.addCapabilities, other.addCapabilities);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountID, addCapabilities);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestCapabilitiesRequest.class,
                "accountID", accountID,
                "addCapabilities", addCapabilities);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String accountID;

        private AddCapabilities addCapabilities;

        private Builder() {
          // force use of static builder() method
        }


        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }


        public Builder addCapabilities(AddCapabilities addCapabilities) {
            Utils.checkNotNull(addCapabilities, "addCapabilities");
            this.addCapabilities = addCapabilities;
            return this;
        }

        public RequestCapabilitiesRequest build() {

            return new RequestCapabilitiesRequest(
                accountID, addCapabilities);
        }

    }
}
