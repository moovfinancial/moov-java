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


public class GetAvatarRequest {
    /**
     * Any unique ID associated with an account such as accountID, representativeID, routing number, or userID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uniqueID")
    private String uniqueID;

    @JsonCreator
    public GetAvatarRequest(
            String uniqueID) {
        Utils.checkNotNull(uniqueID, "uniqueID");
        this.uniqueID = uniqueID;
    }

    /**
     * Any unique ID associated with an account such as accountID, representativeID, routing number, or userID.
     */
    @JsonIgnore
    public String uniqueID() {
        return uniqueID;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Any unique ID associated with an account such as accountID, representativeID, routing number, or userID.
     */
    public GetAvatarRequest withUniqueID(String uniqueID) {
        Utils.checkNotNull(uniqueID, "uniqueID");
        this.uniqueID = uniqueID;
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
        GetAvatarRequest other = (GetAvatarRequest) o;
        return 
            Utils.enhancedDeepEquals(this.uniqueID, other.uniqueID);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            uniqueID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAvatarRequest.class,
                "uniqueID", uniqueID);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String uniqueID;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Any unique ID associated with an account such as accountID, representativeID, routing number, or userID.
         */
        public Builder uniqueID(String uniqueID) {
            Utils.checkNotNull(uniqueID, "uniqueID");
            this.uniqueID = uniqueID;
            return this;
        }

        public GetAvatarRequest build() {

            return new GetAvatarRequest(
                uniqueID);
        }

    }
}
