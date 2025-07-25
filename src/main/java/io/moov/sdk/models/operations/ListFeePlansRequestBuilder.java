/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.operations.ListFeePlansOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class ListFeePlansRequestBuilder {

    private String accountID;
    private Optional<? extends List<String>> planIDs = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public ListFeePlansRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListFeePlansRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }
                
    public ListFeePlansRequestBuilder planIDs(List<String> planIDs) {
        Utils.checkNotNull(planIDs, "planIDs");
        this.planIDs = Optional.of(planIDs);
        return this;
    }

    public ListFeePlansRequestBuilder planIDs(Optional<? extends List<String>> planIDs) {
        Utils.checkNotNull(planIDs, "planIDs");
        this.planIDs = planIDs;
        return this;
    }


    private ListFeePlansRequest buildRequest() {

        ListFeePlansRequest request = new ListFeePlansRequest(accountID,
            planIDs);

        return request;
    }

    public ListFeePlansResponse call() throws Exception {
        
        RequestOperation<ListFeePlansRequest, ListFeePlansResponse> operation
              = new ListFeePlansOperation(sdkConfiguration);
        ListFeePlansRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
