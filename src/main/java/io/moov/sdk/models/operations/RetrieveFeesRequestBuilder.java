/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.utils.Utils;

public class RetrieveFeesRequestBuilder {

    private RetrieveFeesRequest request;
    private final SDKMethodInterfaces.MethodCallRetrieveFees sdk;

    public RetrieveFeesRequestBuilder(SDKMethodInterfaces.MethodCallRetrieveFees sdk) {
        this.sdk = sdk;
    }

    public RetrieveFeesRequestBuilder request(RetrieveFeesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RetrieveFeesResponse call() throws Exception {

        return sdk.retrieveFees(
            request);
    }
}
