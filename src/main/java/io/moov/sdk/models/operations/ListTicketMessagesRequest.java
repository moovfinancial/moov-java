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


public class ListTicketMessagesRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;


    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ticketID")
    private String ticketID;

    @JsonCreator
    public ListTicketMessagesRequest(
            String accountID,
            String ticketID) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(ticketID, "ticketID");
        this.accountID = accountID;
        this.ticketID = ticketID;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public String ticketID() {
        return ticketID;
    }

    public static Builder builder() {
        return new Builder();
    }


    public ListTicketMessagesRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public ListTicketMessagesRequest withTicketID(String ticketID) {
        Utils.checkNotNull(ticketID, "ticketID");
        this.ticketID = ticketID;
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
        ListTicketMessagesRequest other = (ListTicketMessagesRequest) o;
        return 
            Utils.enhancedDeepEquals(this.accountID, other.accountID) &&
            Utils.enhancedDeepEquals(this.ticketID, other.ticketID);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountID, ticketID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTicketMessagesRequest.class,
                "accountID", accountID,
                "ticketID", ticketID);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String accountID;

        private String ticketID;

        private Builder() {
          // force use of static builder() method
        }


        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }


        public Builder ticketID(String ticketID) {
            Utils.checkNotNull(ticketID, "ticketID");
            this.ticketID = ticketID;
            return this;
        }

        public ListTicketMessagesRequest build() {

            return new ListTicketMessagesRequest(
                accountID, ticketID);
        }

    }
}
