/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.operations.ListAccountsOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;

public class ListAccountsRequestBuilder {

    private ListAccountsRequest request;
    private final SDKConfiguration sdkConfiguration;

    public ListAccountsRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListAccountsRequestBuilder request(ListAccountsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListAccountsResponse call() throws Exception {
        
        RequestOperation<ListAccountsRequest, ListAccountsResponse> operation
              = new ListAccountsOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
