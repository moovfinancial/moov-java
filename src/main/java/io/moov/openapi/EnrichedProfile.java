/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.openapi.models.components.EnrichedBusinessProfile;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.APIException;
import io.moov.openapi.models.operations.GetEnrichmentProfileRequest;
import io.moov.openapi.models.operations.GetEnrichmentProfileRequestBuilder;
import io.moov.openapi.models.operations.GetEnrichmentProfileResponse;
import io.moov.openapi.models.operations.GetEnrichmentProfileSecurity;
import io.moov.openapi.models.operations.SDKMethodInterfaces.*;
import io.moov.openapi.utils.HTTPClient;
import io.moov.openapi.utils.HTTPRequest;
import io.moov.openapi.utils.Hook.AfterErrorContextImpl;
import io.moov.openapi.utils.Hook.AfterSuccessContextImpl;
import io.moov.openapi.utils.Hook.BeforeRequestContextImpl;
import io.moov.openapi.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class EnrichedProfile implements
            MethodCallGetEnrichmentProfile {

    private final SDKConfiguration sdkConfiguration;

    EnrichedProfile(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     *   Fetch enriched profile data. Requires a valid email address. This service is offered in collaboration with Clearbit.  -  -   To use this endpoint from the browser, you'll need to specify the `/profile-enrichment.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @return The call builder
     */
    public GetEnrichmentProfileRequestBuilder getEnrichmentProfile() {
        return new GetEnrichmentProfileRequestBuilder(this);
    }

    /**
     *   Fetch enriched profile data. Requires a valid email address. This service is offered in collaboration with Clearbit.  -  -   To use this endpoint from the browser, you'll need to specify the `/profile-enrichment.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param email
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetEnrichmentProfileResponse getEnrichmentProfile(
            GetEnrichmentProfileSecurity security,
            String email) throws Exception {
        return getEnrichmentProfile(security, Optional.empty(), email);
    }
    
    /**
     *   Fetch enriched profile data. Requires a valid email address. This service is offered in collaboration with Clearbit.  -  -   To use this endpoint from the browser, you'll need to specify the `/profile-enrichment.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param email
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetEnrichmentProfileResponse getEnrichmentProfile(
            GetEnrichmentProfileSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String email) throws Exception {
        GetEnrichmentProfileRequest request =
            GetEnrichmentProfileRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .email(email)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/enrichment/profile");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetEnrichmentProfileRequest.class,
                request, 
                null));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        
        // hooks will have access to global security options
        // TODO pass the method level security object to hooks (type system doesn't allow 
        // it, would require some reflection work)
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req, security);
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getEnrichmentProfile", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "404", "429", "4XX", "500", "504", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getEnrichmentProfile",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getEnrichmentProfile",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getEnrichmentProfile",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetEnrichmentProfileResponse.Builder _resBuilder = 
            GetEnrichmentProfileResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetEnrichmentProfileResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                EnrichedBusinessProfile _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<EnrichedBusinessProfile>() {});
                _res.withEnrichedBusinessProfile(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "404", "429", "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "500", "504", "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
