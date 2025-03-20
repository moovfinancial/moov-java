/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.utils.Utils;
import java.lang.Exception;

public class ListIssuedCardsRequestBuilder {

    private ListIssuedCardsRequest request;
    private final SDKMethodInterfaces.MethodCallListIssuedCards sdk;

    public ListIssuedCardsRequestBuilder(SDKMethodInterfaces.MethodCallListIssuedCards sdk) {
        this.sdk = sdk;
    }

    public ListIssuedCardsRequestBuilder request(ListIssuedCardsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListIssuedCardsResponse call() throws Exception {

        return sdk.list(
            request);
    }
}
