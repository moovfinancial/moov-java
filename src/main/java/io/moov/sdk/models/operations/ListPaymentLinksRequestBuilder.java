/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.operations.ListPaymentLinksOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class ListPaymentLinksRequestBuilder {

    private String accountID;
    private final SDKConfiguration sdkConfiguration;

    public ListPaymentLinksRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListPaymentLinksRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }


    private ListPaymentLinksRequest buildRequest() {

        ListPaymentLinksRequest request = new ListPaymentLinksRequest(accountID);

        return request;
    }

    public ListPaymentLinksResponse call() throws Exception {
        
        RequestOperation<ListPaymentLinksRequest, ListPaymentLinksResponse> operation
              = new ListPaymentLinksOperation(sdkConfiguration);
        ListPaymentLinksRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
