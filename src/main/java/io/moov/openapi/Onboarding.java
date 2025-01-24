/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.openapi.models.components.OnboardingInvite;
import io.moov.openapi.models.components.OnboardingInviteRequest;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.APIException;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.OnboardingInviteError;
import io.moov.openapi.models.operations.CreateOnboardingInviteRequest;
import io.moov.openapi.models.operations.CreateOnboardingInviteRequestBuilder;
import io.moov.openapi.models.operations.CreateOnboardingInviteResponse;
import io.moov.openapi.models.operations.CreateOnboardingInviteSecurity;
import io.moov.openapi.models.operations.GetOnboardingInviteRequest;
import io.moov.openapi.models.operations.GetOnboardingInviteRequestBuilder;
import io.moov.openapi.models.operations.GetOnboardingInviteResponse;
import io.moov.openapi.models.operations.GetOnboardingInviteSecurity;
import io.moov.openapi.models.operations.ListOnboardingInvitesRequest;
import io.moov.openapi.models.operations.ListOnboardingInvitesRequestBuilder;
import io.moov.openapi.models.operations.ListOnboardingInvitesResponse;
import io.moov.openapi.models.operations.ListOnboardingInvitesSecurity;
import io.moov.openapi.models.operations.RevokeOnboardingInviteRequest;
import io.moov.openapi.models.operations.RevokeOnboardingInviteRequestBuilder;
import io.moov.openapi.models.operations.RevokeOnboardingInviteResponse;
import io.moov.openapi.models.operations.RevokeOnboardingInviteSecurity;
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

public class Onboarding implements
            MethodCallCreateOnboardingInvite,
            MethodCallListOnboardingInvites,
            MethodCallGetOnboardingInvite,
            MethodCallRevokeOnboardingInvite {

    private final SDKConfiguration sdkConfiguration;

    Onboarding(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create an invitation containing a unique link that allows the recipient to onboard their organization with Moov. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.write` scope.
     * @return The call builder
     */
    public CreateOnboardingInviteRequestBuilder createOnboardingInvite() {
        return new CreateOnboardingInviteRequestBuilder(this);
    }

    /**
     * Create an invitation containing a unique link that allows the recipient to onboard their organization with Moov. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.write` scope.
     * @param security The security details to use for authentication.
     * @param onboardingInviteRequest Request to create an onboarding invite.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateOnboardingInviteResponse createOnboardingInvite(
            CreateOnboardingInviteSecurity security,
            OnboardingInviteRequest onboardingInviteRequest) throws Exception {
        return createOnboardingInvite(security, Optional.empty(), onboardingInviteRequest);
    }
    
    /**
     * Create an invitation containing a unique link that allows the recipient to onboard their organization with Moov. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.write` scope.
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. 

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param onboardingInviteRequest Request to create an onboarding invite.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateOnboardingInviteResponse createOnboardingInvite(
            CreateOnboardingInviteSecurity security,
            Optional<? extends Versions> xMoovVersion,
            OnboardingInviteRequest onboardingInviteRequest) throws Exception {
        CreateOnboardingInviteRequest request =
            CreateOnboardingInviteRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .onboardingInviteRequest(onboardingInviteRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/onboarding-invites");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "onboardingInviteRequest",
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
                      "createOnboardingInvite", 
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
                            "createOnboardingInvite",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "createOnboardingInvite",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "createOnboardingInvite",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateOnboardingInviteResponse.Builder _resBuilder = 
            CreateOnboardingInviteResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateOnboardingInviteResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                OnboardingInvite _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<OnboardingInvite>() {});
                _res.withOnboardingInvite(Optional.ofNullable(_out));
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
                OnboardingInviteError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<OnboardingInviteError>() {});
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



    /**
     * List all the onboarding invites created by the caller's account. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.read` scope.
     * @return The call builder
     */
    public ListOnboardingInvitesRequestBuilder listOnboardingInvites() {
        return new ListOnboardingInvitesRequestBuilder(this);
    }

    /**
     * List all the onboarding invites created by the caller's account. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.read` scope.
     * @param security The security details to use for authentication.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListOnboardingInvitesResponse listOnboardingInvites(
            ListOnboardingInvitesSecurity security) throws Exception {
        return listOnboardingInvites(security, Optional.empty());
    }
    
    /**
     * List all the onboarding invites created by the caller's account. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.read` scope.
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. 

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListOnboardingInvitesResponse listOnboardingInvites(
            ListOnboardingInvitesSecurity security,
            Optional<? extends Versions> xMoovVersion) throws Exception {
        ListOnboardingInvitesRequest request =
            ListOnboardingInvitesRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/onboarding-invites");
        
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
                      "listOnboardingInvites", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "429", "4XX", "500", "504", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listOnboardingInvites",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listOnboardingInvites",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listOnboardingInvites",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListOnboardingInvitesResponse.Builder _resBuilder = 
            ListOnboardingInvitesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListOnboardingInvitesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<OnboardingInvite> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<OnboardingInvite>>() {});
                _res.withOnboardingInvites(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "429", "4XX")) {
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
     * Retrieve details about an onboarding invite. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.read` scope.
     * @return The call builder
     */
    public GetOnboardingInviteRequestBuilder getOnboardingInvite() {
        return new GetOnboardingInviteRequestBuilder(this);
    }

    /**
     * Retrieve details about an onboarding invite. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.read` scope.
     * @param security The security details to use for authentication.
     * @param code
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetOnboardingInviteResponse getOnboardingInvite(
            GetOnboardingInviteSecurity security,
            String code) throws Exception {
        return getOnboardingInvite(security, Optional.empty(), code);
    }
    
    /**
     * Retrieve details about an onboarding invite. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.read` scope.
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. 

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param code
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetOnboardingInviteResponse getOnboardingInvite(
            GetOnboardingInviteSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String code) throws Exception {
        GetOnboardingInviteRequest request =
            GetOnboardingInviteRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .code(code)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetOnboardingInviteRequest.class,
                _baseUrl,
                "/onboarding-invites/{code}",
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
                      "getOnboardingInvite", 
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
                            "getOnboardingInvite",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getOnboardingInvite",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getOnboardingInvite",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetOnboardingInviteResponse.Builder _resBuilder = 
            GetOnboardingInviteResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetOnboardingInviteResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                OnboardingInvite _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<OnboardingInvite>() {});
                _res.withOnboardingInvite(Optional.ofNullable(_out));
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
     * Revoke an onboarding invite, rendering the invitation link unusable. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.write` scope.
     * @return The call builder
     */
    public RevokeOnboardingInviteRequestBuilder revokeOnboardingInvite() {
        return new RevokeOnboardingInviteRequestBuilder(this);
    }

    /**
     * Revoke an onboarding invite, rendering the invitation link unusable. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.write` scope.
     * @param security The security details to use for authentication.
     * @param code
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RevokeOnboardingInviteResponse revokeOnboardingInvite(
            RevokeOnboardingInviteSecurity security,
            String code) throws Exception {
        return revokeOnboardingInvite(security, Optional.empty(), code);
    }
    
    /**
     * Revoke an onboarding invite, rendering the invitation link unusable. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need  - to specify the `/accounts.write` scope.
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. 

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param code
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RevokeOnboardingInviteResponse revokeOnboardingInvite(
            RevokeOnboardingInviteSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String code) throws Exception {
        RevokeOnboardingInviteRequest request =
            RevokeOnboardingInviteRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .code(code)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                RevokeOnboardingInviteRequest.class,
                _baseUrl,
                "/onboarding-invites/{code}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "*/*")
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
                      "revokeOnboardingInvite", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "revokeOnboardingInvite",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "revokeOnboardingInvite",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "revokeOnboardingInvite",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        RevokeOnboardingInviteResponse.Builder _resBuilder = 
            RevokeOnboardingInviteResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        RevokeOnboardingInviteResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
