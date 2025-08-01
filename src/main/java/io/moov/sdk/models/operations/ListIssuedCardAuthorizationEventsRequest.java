/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;


public class ListIssuedCardAuthorizationEventsRequest {
    /**
     * The Moov business account for which cards have been issued.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;


    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=authorizationID")
    private String authorizationID;


    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=skip")
    private Optional<Long> skip;


    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=count")
    private Optional<Long> count;

    @JsonCreator
    public ListIssuedCardAuthorizationEventsRequest(
            String accountID,
            String authorizationID,
            Optional<Long> skip,
            Optional<Long> count) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(authorizationID, "authorizationID");
        Utils.checkNotNull(skip, "skip");
        Utils.checkNotNull(count, "count");
        this.accountID = accountID;
        this.authorizationID = authorizationID;
        this.skip = skip;
        this.count = count;
    }
    
    public ListIssuedCardAuthorizationEventsRequest(
            String accountID,
            String authorizationID) {
        this(accountID, authorizationID, Optional.empty(),
            Optional.empty());
    }

    /**
     * The Moov business account for which cards have been issued.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public String authorizationID() {
        return authorizationID;
    }

    @JsonIgnore
    public Optional<Long> skip() {
        return skip;
    }

    @JsonIgnore
    public Optional<Long> count() {
        return count;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The Moov business account for which cards have been issued.
     */
    public ListIssuedCardAuthorizationEventsRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public ListIssuedCardAuthorizationEventsRequest withAuthorizationID(String authorizationID) {
        Utils.checkNotNull(authorizationID, "authorizationID");
        this.authorizationID = authorizationID;
        return this;
    }

    public ListIssuedCardAuthorizationEventsRequest withSkip(long skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = Optional.ofNullable(skip);
        return this;
    }


    public ListIssuedCardAuthorizationEventsRequest withSkip(Optional<Long> skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = skip;
        return this;
    }

    public ListIssuedCardAuthorizationEventsRequest withCount(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }


    public ListIssuedCardAuthorizationEventsRequest withCount(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
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
        ListIssuedCardAuthorizationEventsRequest other = (ListIssuedCardAuthorizationEventsRequest) o;
        return 
            Utils.enhancedDeepEquals(this.accountID, other.accountID) &&
            Utils.enhancedDeepEquals(this.authorizationID, other.authorizationID) &&
            Utils.enhancedDeepEquals(this.skip, other.skip) &&
            Utils.enhancedDeepEquals(this.count, other.count);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountID, authorizationID, skip,
            count);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListIssuedCardAuthorizationEventsRequest.class,
                "accountID", accountID,
                "authorizationID", authorizationID,
                "skip", skip,
                "count", count);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String accountID;

        private String authorizationID;

        private Optional<Long> skip = Optional.empty();

        private Optional<Long> count = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The Moov business account for which cards have been issued.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }


        public Builder authorizationID(String authorizationID) {
            Utils.checkNotNull(authorizationID, "authorizationID");
            this.authorizationID = authorizationID;
            return this;
        }


        public Builder skip(long skip) {
            Utils.checkNotNull(skip, "skip");
            this.skip = Optional.ofNullable(skip);
            return this;
        }

        public Builder skip(Optional<Long> skip) {
            Utils.checkNotNull(skip, "skip");
            this.skip = skip;
            return this;
        }


        public Builder count(long count) {
            Utils.checkNotNull(count, "count");
            this.count = Optional.ofNullable(count);
            return this;
        }

        public Builder count(Optional<Long> count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }

        public ListIssuedCardAuthorizationEventsRequest build() {

            return new ListIssuedCardAuthorizationEventsRequest(
                accountID, authorizationID, skip,
                count);
        }

    }
}
