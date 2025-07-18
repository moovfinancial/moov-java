/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.operations.GetTerminalApplicationOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class GetTerminalApplicationRequestBuilder {

    private String terminalApplicationID;
    private final SDKConfiguration sdkConfiguration;

    public GetTerminalApplicationRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetTerminalApplicationRequestBuilder terminalApplicationID(String terminalApplicationID) {
        Utils.checkNotNull(terminalApplicationID, "terminalApplicationID");
        this.terminalApplicationID = terminalApplicationID;
        return this;
    }


    private GetTerminalApplicationRequest buildRequest() {

        GetTerminalApplicationRequest request = new GetTerminalApplicationRequest(terminalApplicationID);

        return request;
    }

    public GetTerminalApplicationResponse call() throws Exception {
        
        RequestOperation<GetTerminalApplicationRequest, GetTerminalApplicationResponse> operation
              = new GetTerminalApplicationOperation(sdkConfiguration);
        GetTerminalApplicationRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
