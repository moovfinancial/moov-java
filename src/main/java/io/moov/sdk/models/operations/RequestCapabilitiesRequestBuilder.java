/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.models.components.AddCapabilities;
import io.moov.sdk.operations.RequestCapabilitiesOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class RequestCapabilitiesRequestBuilder {

    private String accountID;
    private AddCapabilities addCapabilities;
    private final SDKConfiguration sdkConfiguration;

    public RequestCapabilitiesRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public RequestCapabilitiesRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public RequestCapabilitiesRequestBuilder addCapabilities(AddCapabilities addCapabilities) {
        Utils.checkNotNull(addCapabilities, "addCapabilities");
        this.addCapabilities = addCapabilities;
        return this;
    }


    private RequestCapabilitiesRequest buildRequest() {

        RequestCapabilitiesRequest request = new RequestCapabilitiesRequest(accountID,
            addCapabilities);

        return request;
    }

    public RequestCapabilitiesResponse call() throws Exception {
        
        RequestOperation<RequestCapabilitiesRequest, RequestCapabilitiesResponse> operation
              = new RequestCapabilitiesOperation(sdkConfiguration);
        RequestCapabilitiesRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
