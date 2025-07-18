/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.models.components.TicketStatus;
import io.moov.sdk.operations.ListTicketsOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class ListTicketsRequestBuilder {

    private Optional<String> cursor = Optional.empty();
    private Optional<Long> count = Optional.empty();
    private Optional<? extends TicketStatus> status = Optional.empty();
    private String accountID;
    private final SDKConfiguration sdkConfiguration;

    public ListTicketsRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
                
    public ListTicketsRequestBuilder cursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.of(cursor);
        return this;
    }

    public ListTicketsRequestBuilder cursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }
                
    public ListTicketsRequestBuilder count(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.of(count);
        return this;
    }

    public ListTicketsRequestBuilder count(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }
                
    public ListTicketsRequestBuilder status(TicketStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.of(status);
        return this;
    }

    public ListTicketsRequestBuilder status(Optional<? extends TicketStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public ListTicketsRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }


    private ListTicketsRequest buildRequest() {

        ListTicketsRequest request = new ListTicketsRequest(cursor,
            count,
            status,
            accountID);

        return request;
    }

    public ListTicketsResponse call() throws Exception {
        
        RequestOperation<ListTicketsRequest, ListTicketsResponse> operation
              = new ListTicketsOperation(sdkConfiguration);
        ListTicketsRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
