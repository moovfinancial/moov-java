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

public class DisputeTransferDetails {

    /**
     * The disputed transfer's ID.
     */
    @JsonProperty("transferID")
    private String transferID;

    @JsonCreator
    public DisputeTransferDetails(
            @JsonProperty("transferID") String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
    }

    /**
     * The disputed transfer's ID.
     */
    @JsonIgnore
    public String transferID() {
        return transferID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The disputed transfer's ID.
     */
    public DisputeTransferDetails withTransferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
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
        DisputeTransferDetails other = (DisputeTransferDetails) o;
        return 
            Objects.deepEquals(this.transferID, other.transferID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            transferID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DisputeTransferDetails.class,
                "transferID", transferID);
    }
    
    public final static class Builder {
 
        private String transferID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The disputed transfer's ID.
         */
        public Builder transferID(String transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = transferID;
            return this;
        }
        
        public DisputeTransferDetails build() {
            return new DisputeTransferDetails(
                transferID);
        }
    }
}

