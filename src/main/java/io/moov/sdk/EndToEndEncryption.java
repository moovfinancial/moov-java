/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.E2EEToken;
import io.moov.sdk.models.components.JSONWebKey;
import io.moov.sdk.models.errors.APIException;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.GenerateEndToEndKeyRequest;
import io.moov.sdk.models.operations.GenerateEndToEndKeyRequestBuilder;
import io.moov.sdk.models.operations.GenerateEndToEndKeyResponse;
import io.moov.sdk.models.operations.SDKMethodInterfaces.*;
import io.moov.sdk.models.operations.TestEndToEndTokenRequest;
import io.moov.sdk.models.operations.TestEndToEndTokenRequestBuilder;
import io.moov.sdk.models.operations.TestEndToEndTokenResponse;
import io.moov.sdk.utils.HTTPClient;
import io.moov.sdk.utils.HTTPRequest;
import io.moov.sdk.utils.Hook.AfterErrorContextImpl;
import io.moov.sdk.utils.Hook.AfterSuccessContextImpl;
import io.moov.sdk.utils.Hook.BeforeRequestContextImpl;
import io.moov.sdk.utils.SerializedBody;
import io.moov.sdk.utils.Utils.JsonShape;
import io.moov.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

public class EndToEndEncryption implements
            MethodCallTestEndToEndToken,
            MethodCallGenerateEndToEndKey {

    private final SDKConfiguration sdkConfiguration;

    EndToEndEncryption(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Allows for testing a JWE token to ensure it's acceptable by Moov. 
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/ping.read` scope.
     * 
     * @return The call builder
     */
    public TestEndToEndTokenRequestBuilder testEncryptedToken() {
        return new TestEndToEndTokenRequestBuilder(this);
    }

    /**
     * Allows for testing a JWE token to ensure it's acceptable by Moov. 
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/ping.read` scope.
     * 
     * @param e2EEToken Wraps a compact-serialized JSON Web Encryption (JWE) token used for secure transmission of sensitive data (e.g., PCI information) through intermediaries. 
     *         This token is encrypted using the public key from /end-to-end-keys and wraps an AES key. For details and examples, refer to our 
     *         [GitHub repository](https://github.com/moovfinancial/moov-go/blob/main/examples/e2ee/e2ee_test.go).
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public TestEndToEndTokenResponse testEncryptedToken(
            E2EEToken e2EEToken) throws Exception {
        return testEncryptedToken(Optional.empty(), e2EEToken);
    }
    
    /**
     * Allows for testing a JWE token to ensure it's acceptable by Moov. 
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/ping.read` scope.
     * 
     * @param xMoovVersion Specify an API version.
     *         
     *         API versioning follows the format `vYYYY.QQ.BB`, where 
     *           - `YYYY` is the year
     *           - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *           - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *             - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     *         
     *         The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param e2EEToken Wraps a compact-serialized JSON Web Encryption (JWE) token used for secure transmission of sensitive data (e.g., PCI information) through intermediaries. 
     *         This token is encrypted using the public key from /end-to-end-keys and wraps an AES key. For details and examples, refer to our 
     *         [GitHub repository](https://github.com/moovfinancial/moov-go/blob/main/examples/e2ee/e2ee_test.go).
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public TestEndToEndTokenResponse testEncryptedToken(
            Optional<String> xMoovVersion,
            E2EEToken e2EEToken) throws Exception {
        TestEndToEndTokenRequest request =
            TestEndToEndTokenRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .e2EEToken(e2EEToken)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl();
        String _url = Utils.generateURL(
                _baseUrl,
                "/debug/end-to-end-token");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "e2EEToken",
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
        
        Optional<SecuritySource> _hookSecuritySource = Optional.of(this.sdkConfiguration.securitySource());
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource().getSecurity());
        HTTPClient _client = this.sdkConfiguration.client();
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      this.sdkConfiguration,
                      _baseUrl,
                      "testEndToEndToken", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "429", "4XX", "500", "504", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "testEndToEndToken",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "testEndToEndToken",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "testEndToEndToken",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        TestEndToEndTokenResponse.Builder _resBuilder = 
            TestEndToEndTokenResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        TestEndToEndTokenResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            _res.withHeaders(_httpRes.headers().map());
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            _res.withHeaders(_httpRes.headers().map());
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "429")) {
            _res.withHeaders(_httpRes.headers().map());
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "500", "504")) {
            _res.withHeaders(_httpRes.headers().map());
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
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


    /**
     * Generates a public key used to create a JWE token for passing secure authentication data through non-PCI compliant intermediaries.
     * 
     * @return The call builder
     */
    public GenerateEndToEndKeyRequestBuilder generateKey() {
        return new GenerateEndToEndKeyRequestBuilder(this);
    }

    /**
     * Generates a public key used to create a JWE token for passing secure authentication data through non-PCI compliant intermediaries.
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GenerateEndToEndKeyResponse generateKeyDirect() throws Exception {
        return generateKey(Optional.empty());
    }
    
    /**
     * Generates a public key used to create a JWE token for passing secure authentication data through non-PCI compliant intermediaries.
     * 
     * @param xMoovVersion Specify an API version.
     *         
     *         API versioning follows the format `vYYYY.QQ.BB`, where 
     *           - `YYYY` is the year
     *           - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *           - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *             - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     *         
     *         The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GenerateEndToEndKeyResponse generateKey(
            Optional<String> xMoovVersion) throws Exception {
        GenerateEndToEndKeyRequest request =
            GenerateEndToEndKeyRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl();
        String _url = Utils.generateURL(
                _baseUrl,
                "/end-to-end-keys");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = Optional.of(this.sdkConfiguration.securitySource());
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource().getSecurity());
        HTTPClient _client = this.sdkConfiguration.client();
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      this.sdkConfiguration,
                      _baseUrl,
                      "generateEndToEndKey", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "generateEndToEndKey",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "generateEndToEndKey",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "generateEndToEndKey",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GenerateEndToEndKeyResponse.Builder _resBuilder = 
            GenerateEndToEndKeyResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GenerateEndToEndKeyResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                JSONWebKey _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<JSONWebKey>() {});
                _res.withJSONWebKey(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "429")) {
            _res.withHeaders(_httpRes.headers().map());
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
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
