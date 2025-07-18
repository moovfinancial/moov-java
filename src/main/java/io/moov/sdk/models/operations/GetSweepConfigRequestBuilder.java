/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.operations.GetSweepConfigOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class GetSweepConfigRequestBuilder {

    private String accountID;
    private String sweepConfigID;
    private final SDKConfiguration sdkConfiguration;

    public GetSweepConfigRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetSweepConfigRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetSweepConfigRequestBuilder sweepConfigID(String sweepConfigID) {
        Utils.checkNotNull(sweepConfigID, "sweepConfigID");
        this.sweepConfigID = sweepConfigID;
        return this;
    }


    private GetSweepConfigRequest buildRequest() {

        GetSweepConfigRequest request = new GetSweepConfigRequest(accountID,
            sweepConfigID);

        return request;
    }

    public GetSweepConfigResponse call() throws Exception {
        
        RequestOperation<GetSweepConfigRequest, GetSweepConfigResponse> operation
              = new GetSweepConfigOperation(sdkConfiguration);
        GetSweepConfigRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
