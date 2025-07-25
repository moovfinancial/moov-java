/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.operations.GetWalletOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class GetWalletRequestBuilder {

    private String accountID;
    private String walletID;
    private final SDKConfiguration sdkConfiguration;

    public GetWalletRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetWalletRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetWalletRequestBuilder walletID(String walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = walletID;
        return this;
    }


    private GetWalletRequest buildRequest() {

        GetWalletRequest request = new GetWalletRequest(accountID,
            walletID);

        return request;
    }

    public GetWalletResponse call() throws Exception {
        
        RequestOperation<GetWalletRequest, GetWalletResponse> operation
              = new GetWalletOperation(sdkConfiguration);
        GetWalletRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
