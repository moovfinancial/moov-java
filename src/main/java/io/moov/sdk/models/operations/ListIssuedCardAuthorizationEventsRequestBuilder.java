/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.operations.ListIssuedCardAuthorizationEventsOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class ListIssuedCardAuthorizationEventsRequestBuilder {

    private String accountID;
    private String authorizationID;
    private Optional<Long> skip = Optional.empty();
    private Optional<Long> count = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public ListIssuedCardAuthorizationEventsRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListIssuedCardAuthorizationEventsRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public ListIssuedCardAuthorizationEventsRequestBuilder authorizationID(String authorizationID) {
        Utils.checkNotNull(authorizationID, "authorizationID");
        this.authorizationID = authorizationID;
        return this;
    }
                
    public ListIssuedCardAuthorizationEventsRequestBuilder skip(long skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = Optional.of(skip);
        return this;
    }

    public ListIssuedCardAuthorizationEventsRequestBuilder skip(Optional<Long> skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = skip;
        return this;
    }
                
    public ListIssuedCardAuthorizationEventsRequestBuilder count(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.of(count);
        return this;
    }

    public ListIssuedCardAuthorizationEventsRequestBuilder count(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }


    private ListIssuedCardAuthorizationEventsRequest buildRequest() {

        ListIssuedCardAuthorizationEventsRequest request = new ListIssuedCardAuthorizationEventsRequest(accountID,
            authorizationID,
            skip,
            count);

        return request;
    }

    public ListIssuedCardAuthorizationEventsResponse call() throws Exception {
        
        RequestOperation<ListIssuedCardAuthorizationEventsRequest, ListIssuedCardAuthorizationEventsResponse> operation
              = new ListIssuedCardAuthorizationEventsOperation(sdkConfiguration);
        ListIssuedCardAuthorizationEventsRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
