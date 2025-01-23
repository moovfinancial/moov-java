/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.openapi.models.components.AuthToken;
import io.moov.openapi.models.components.AuthTokenRequest;
import io.moov.openapi.models.components.RevokeTokenRequest;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.APIException;
import io.moov.openapi.models.errors.AuthTokenRequestError;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.RevokeTokenRequestError;
import io.moov.openapi.models.operations.CreateAuthTokenRequest;
import io.moov.openapi.models.operations.CreateAuthTokenRequestBuilder;
import io.moov.openapi.models.operations.CreateAuthTokenResponse;
import io.moov.openapi.models.operations.RevokeAuthTokenRequest;
import io.moov.openapi.models.operations.RevokeAuthTokenRequestBuilder;
import io.moov.openapi.models.operations.RevokeAuthTokenResponse;
import io.moov.openapi.models.operations.SDKMethodInterfaces.*;
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

public class Authentication implements
            MethodCallRevokeAuthToken,
            MethodCallCreateAuthToken {

    private final SDKConfiguration sdkConfiguration;

    Authentication(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Revoke an auth token. -  - Allows clients to notify the authorization server that a previously obtained refresh or access token is no longer needed.
     * @return The call builder
     */
    public RevokeAuthTokenRequestBuilder revokeAuthToken() {
        return new RevokeAuthTokenRequestBuilder(this);
    }

    /**
     * Revoke an auth token. -  - Allows clients to notify the authorization server that a previously obtained refresh or access token is no longer needed.
     * @param revokeTokenRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RevokeAuthTokenResponse revokeAuthToken(
            RevokeTokenRequest revokeTokenRequest) throws Exception {
        return revokeAuthToken(Optional.empty(), revokeTokenRequest);
    }
    
    /**
     * Revoke an auth token. -  - Allows clients to notify the authorization server that a previously obtained refresh or access token is no longer needed.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param revokeTokenRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RevokeAuthTokenResponse revokeAuthToken(
            Optional<? extends Versions> xMoovVersion,
            RevokeTokenRequest revokeTokenRequest) throws Exception {
        RevokeAuthTokenRequest request =
            RevokeAuthTokenRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .revokeTokenRequest(revokeTokenRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/oauth2/revoke");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "revokeTokenRequest",
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
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "revokeAuthToken", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "422", "429", "4XX", "500", "504", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "revokeAuthToken",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "revokeAuthToken",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "revokeAuthToken",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        RevokeAuthTokenResponse.Builder _resBuilder = 
            RevokeAuthTokenResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        RevokeAuthTokenResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "422")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                RevokeTokenRequestError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<RevokeTokenRequestError>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "429", "4XX")) {
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
     * Create or refresh an access token.
     * @return The call builder
     */
    public CreateAuthTokenRequestBuilder createAuthToken() {
        return new CreateAuthTokenRequestBuilder(this);
    }

    /**
     * Create or refresh an access token.
     * @param authTokenRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateAuthTokenResponse createAuthToken(
            AuthTokenRequest authTokenRequest) throws Exception {
        return createAuthToken(Optional.empty(), authTokenRequest);
    }
    
    /**
     * Create or refresh an access token.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param authTokenRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateAuthTokenResponse createAuthToken(
            Optional<? extends Versions> xMoovVersion,
            AuthTokenRequest authTokenRequest) throws Exception {
        CreateAuthTokenRequest request =
            CreateAuthTokenRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .authTokenRequest(authTokenRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/oauth2/token");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "authTokenRequest",
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
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "createAuthToken", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "422", "429", "4XX", "500", "504", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "createAuthToken",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "createAuthToken",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "createAuthToken",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateAuthTokenResponse.Builder _resBuilder = 
            CreateAuthTokenResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateAuthTokenResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                AuthToken _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<AuthToken>() {});
                _res.withAuthToken(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "422")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                AuthTokenRequestError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<AuthTokenRequestError>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "429", "4XX")) {
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
