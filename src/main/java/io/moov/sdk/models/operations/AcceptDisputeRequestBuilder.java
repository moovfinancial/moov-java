/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.operations.AcceptDisputeOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class AcceptDisputeRequestBuilder {

    private String accountID;
    private String disputeID;
    private final SDKConfiguration sdkConfiguration;

    public AcceptDisputeRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public AcceptDisputeRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public AcceptDisputeRequestBuilder disputeID(String disputeID) {
        Utils.checkNotNull(disputeID, "disputeID");
        this.disputeID = disputeID;
        return this;
    }


    private AcceptDisputeRequest buildRequest() {

        AcceptDisputeRequest request = new AcceptDisputeRequest(accountID,
            disputeID);

        return request;
    }

    public AcceptDisputeResponse call() throws Exception {
        
        RequestOperation<AcceptDisputeRequest, AcceptDisputeResponse> operation
              = new AcceptDisputeOperation(sdkConfiguration);
        AcceptDisputeRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
