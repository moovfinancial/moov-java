/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import io.moov.sdk.utils.Utils;
import java.lang.Exception;

public class ListSweepsRequestBuilder {

    private ListSweepsRequest request;
    private final SDKMethodInterfaces.MethodCallListSweeps sdk;

    public ListSweepsRequestBuilder(SDKMethodInterfaces.MethodCallListSweeps sdk) {
        this.sdk = sdk;
    }

    public ListSweepsRequestBuilder request(ListSweepsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListSweepsResponse call() throws Exception {

        return sdk.list(
            request);
    }
}
