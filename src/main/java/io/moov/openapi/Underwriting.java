/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.openapi.models.components.UpdateUnderwriting;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.APIException;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.UpdateUnderwritingError;
import io.moov.openapi.models.operations.GetUnderwritingRequest;
import io.moov.openapi.models.operations.GetUnderwritingRequestBuilder;
import io.moov.openapi.models.operations.GetUnderwritingResponse;
import io.moov.openapi.models.operations.GetUnderwritingSecurity;
import io.moov.openapi.models.operations.SDKMethodInterfaces.*;
import io.moov.openapi.models.operations.UpdateUnderwritingRequest;
import io.moov.openapi.models.operations.UpdateUnderwritingRequestBuilder;
import io.moov.openapi.models.operations.UpdateUnderwritingResponse;
import io.moov.openapi.models.operations.UpdateUnderwritingSecurity;
import io.moov.openapi.utils.HTTPClient;
import io.moov.openapi.utils.HTTPRequest;
import io.moov.openapi.utils.Hook.AfterErrorContextImpl;
import io.moov.openapi.utils.Hook.AfterSuccessContextImpl;
import io.moov.openapi.utils.Hook.BeforeRequestContextImpl;
import io.moov.openapi.utils.SerializedBody;
import io.moov.openapi.utils.Utils.JsonShape;
import io.moov.openapi.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class Underwriting implements
            MethodCallGetUnderwriting,
            MethodCallUpdateUnderwriting {

    private final SDKConfiguration sdkConfiguration;

    Underwriting(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Retrieve underwriting associated with a given Moov account.  -  - Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.  -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts/{accountID}/profile.read` scope.
     * @return The call builder
     */
    public GetUnderwritingRequestBuilder getUnderwriting() {
        return new GetUnderwritingRequestBuilder(this);
    }

    /**
     * Retrieve underwriting associated with a given Moov account.  -  - Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.  -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts/{accountID}/profile.read` scope.
     * @param security The security details to use for authentication.
     * @param accountID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetUnderwritingResponse getUnderwriting(
            GetUnderwritingSecurity security,
            String accountID) throws Exception {
        return getUnderwriting(security, Optional.empty(), accountID);
    }
    
    /**
     * Retrieve underwriting associated with a given Moov account.  -  - Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.  -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts/{accountID}/profile.read` scope.
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. 

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param accountID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetUnderwritingResponse getUnderwriting(
            GetUnderwritingSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID) throws Exception {
        GetUnderwritingRequest request =
            GetUnderwritingRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetUnderwritingRequest.class,
                _baseUrl,
                "/accounts/{accountID}/underwriting",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
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
                      "getUnderwriting", 
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
                            "getUnderwriting",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getUnderwriting",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getUnderwriting",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetUnderwritingResponse.Builder _resBuilder = 
            GetUnderwritingResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetUnderwritingResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                io.moov.openapi.models.components.Underwriting _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<io.moov.openapi.models.components.Underwriting>() {});
                _res.withUnderwriting(Optional.ofNullable(_out));
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



    /**
     * Update the account's underwriting by passing new values for one or more of the fields.  -  - Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts/{accountID}/profile.write` scope.
     * @return The call builder
     */
    public UpdateUnderwritingRequestBuilder updateUnderwriting() {
        return new UpdateUnderwritingRequestBuilder(this);
    }

    /**
     * Update the account's underwriting by passing new values for one or more of the fields.  -  - Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts/{accountID}/profile.write` scope.
     * @param security The security details to use for authentication.
     * @param accountID
     * @param updateUnderwriting
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateUnderwritingResponse updateUnderwriting(
            UpdateUnderwritingSecurity security,
            String accountID,
            UpdateUnderwriting updateUnderwriting) throws Exception {
        return updateUnderwriting(security, Optional.empty(), accountID, updateUnderwriting);
    }
    
    /**
     * Update the account's underwriting by passing new values for one or more of the fields.  -  - Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts/{accountID}/profile.write` scope.
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. 

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param accountID
     * @param updateUnderwriting
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateUnderwritingResponse updateUnderwriting(
            UpdateUnderwritingSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            UpdateUnderwriting updateUnderwriting) throws Exception {
        UpdateUnderwritingRequest request =
            UpdateUnderwritingRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .updateUnderwriting(updateUnderwriting)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UpdateUnderwritingRequest.class,
                _baseUrl,
                "/accounts/{accountID}/underwriting",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "updateUnderwriting",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
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
                      "updateUnderwriting", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "409", "422", "429", "4XX", "500", "504", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "updateUnderwriting",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "updateUnderwriting",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "updateUnderwriting",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateUnderwritingResponse.Builder _resBuilder = 
            UpdateUnderwritingResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateUnderwritingResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                io.moov.openapi.models.components.Underwriting _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<io.moov.openapi.models.components.Underwriting>() {});
                _res.withUnderwriting(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "409")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GenericError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GenericError>() {});
                throw _out;
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "422")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UpdateUnderwritingError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UpdateUnderwritingError>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
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
