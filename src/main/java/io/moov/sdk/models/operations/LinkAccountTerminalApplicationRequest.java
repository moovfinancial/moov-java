/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.LinkAccountTerminalApplication;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class LinkAccountTerminalApplicationRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private LinkAccountTerminalApplication linkAccountTerminalApplication;

    @JsonCreator
    public LinkAccountTerminalApplicationRequest(
            String accountID,
            LinkAccountTerminalApplication linkAccountTerminalApplication) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(linkAccountTerminalApplication, "linkAccountTerminalApplication");
        this.accountID = accountID;
        this.linkAccountTerminalApplication = linkAccountTerminalApplication;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public LinkAccountTerminalApplication linkAccountTerminalApplication() {
        return linkAccountTerminalApplication;
    }

    public static Builder builder() {
        return new Builder();
    }


    public LinkAccountTerminalApplicationRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public LinkAccountTerminalApplicationRequest withLinkAccountTerminalApplication(LinkAccountTerminalApplication linkAccountTerminalApplication) {
        Utils.checkNotNull(linkAccountTerminalApplication, "linkAccountTerminalApplication");
        this.linkAccountTerminalApplication = linkAccountTerminalApplication;
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
        LinkAccountTerminalApplicationRequest other = (LinkAccountTerminalApplicationRequest) o;
        return 
            Utils.enhancedDeepEquals(this.accountID, other.accountID) &&
            Utils.enhancedDeepEquals(this.linkAccountTerminalApplication, other.linkAccountTerminalApplication);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountID, linkAccountTerminalApplication);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkAccountTerminalApplicationRequest.class,
                "accountID", accountID,
                "linkAccountTerminalApplication", linkAccountTerminalApplication);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String accountID;

        private LinkAccountTerminalApplication linkAccountTerminalApplication;

        private Builder() {
          // force use of static builder() method
        }


        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }


        public Builder linkAccountTerminalApplication(LinkAccountTerminalApplication linkAccountTerminalApplication) {
            Utils.checkNotNull(linkAccountTerminalApplication, "linkAccountTerminalApplication");
            this.linkAccountTerminalApplication = linkAccountTerminalApplication;
            return this;
        }

        public LinkAccountTerminalApplicationRequest build() {

            return new LinkAccountTerminalApplicationRequest(
                accountID, linkAccountTerminalApplication);
        }

    }
}
