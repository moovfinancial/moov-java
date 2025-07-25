/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.operations.ListSweepConfigsOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class ListSweepConfigsRequestBuilder {

    private String accountID;
    private final SDKConfiguration sdkConfiguration;

    public ListSweepConfigsRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListSweepConfigsRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }


    private ListSweepConfigsRequest buildRequest() {

        ListSweepConfigsRequest request = new ListSweepConfigsRequest(accountID);

        return request;
    }

    public ListSweepConfigsResponse call() throws Exception {
        
        RequestOperation<ListSweepConfigsRequest, ListSweepConfigsResponse> operation
              = new ListSweepConfigsOperation(sdkConfiguration);
        ListSweepConfigsRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
