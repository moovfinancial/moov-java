/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.utils.Utils;
import java.lang.Exception;

public class ListPartnerPricingAgreementsRequestBuilder {

    private ListPartnerPricingAgreementsRequest request;
    private final SDKMethodInterfaces.MethodCallListPartnerPricingAgreements sdk;

    public ListPartnerPricingAgreementsRequestBuilder(SDKMethodInterfaces.MethodCallListPartnerPricingAgreements sdk) {
        this.sdk = sdk;
    }

    public ListPartnerPricingAgreementsRequestBuilder request(ListPartnerPricingAgreementsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListPartnerPricingAgreementsResponse call() throws Exception {

        return sdk.listPartnerPricingAgreements(
            request);
    }
}
