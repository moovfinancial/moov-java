/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.utils.Utils;

public class ListIssuedCardAuthorizationEventsRequestBuilder {

    private ListIssuedCardAuthorizationEventsRequest request;
    private final SDKMethodInterfaces.MethodCallListIssuedCardAuthorizationEvents sdk;

    public ListIssuedCardAuthorizationEventsRequestBuilder(SDKMethodInterfaces.MethodCallListIssuedCardAuthorizationEvents sdk) {
        this.sdk = sdk;
    }

    public ListIssuedCardAuthorizationEventsRequestBuilder request(ListIssuedCardAuthorizationEventsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListIssuedCardAuthorizationEventsResponse call() throws Exception {

        return sdk.listAuthorizationEvents(
            request);
    }
}
