/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.models.operations.GetEnrichmentProfileRequest;
import io.moov.sdk.models.operations.GetEnrichmentProfileRequestBuilder;
import io.moov.sdk.models.operations.GetEnrichmentProfileResponse;
import io.moov.sdk.operations.GetEnrichmentProfileOperation;
import java.lang.Exception;
import java.lang.String;


public class EnrichedProfile {
    private final SDKConfiguration sdkConfiguration;

    EnrichedProfile(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Fetch enriched profile data. Requires a valid email address. This service is offered in collaboration with Clearbit. 
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/profile-enrichment.read` scope.
     * 
     * @return The call builder
     */
    public GetEnrichmentProfileRequestBuilder get() {
        return new GetEnrichmentProfileRequestBuilder(sdkConfiguration);
    }

    /**
     * Fetch enriched profile data. Requires a valid email address. This service is offered in collaboration with Clearbit. 
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/profile-enrichment.read` scope.
     * 
     * @param email 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetEnrichmentProfileResponse get(String email) throws Exception {
        GetEnrichmentProfileRequest request =
            GetEnrichmentProfileRequest
                .builder()
                .email(email)
                .build();
        RequestOperation<GetEnrichmentProfileRequest, GetEnrichmentProfileResponse> operation
              = new GetEnrichmentProfileOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

}
