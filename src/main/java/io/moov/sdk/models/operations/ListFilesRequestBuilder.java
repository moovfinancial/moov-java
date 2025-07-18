/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.operations.ListFilesOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class ListFilesRequestBuilder {

    private String accountID;
    private final SDKConfiguration sdkConfiguration;

    public ListFilesRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListFilesRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }


    private ListFilesRequest buildRequest() {

        ListFilesRequest request = new ListFilesRequest(accountID);

        return request;
    }

    public ListFilesResponse call() throws Exception {
        
        RequestOperation<ListFilesRequest, ListFilesResponse> operation
              = new ListFilesOperation(sdkConfiguration);
        ListFilesRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
