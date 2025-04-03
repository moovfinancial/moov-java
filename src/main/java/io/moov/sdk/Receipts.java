/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.ReceiptRequest;
import io.moov.sdk.models.components.ReceiptResponse;
import io.moov.sdk.models.errors.APIException;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ReceiptValidationError;
import io.moov.sdk.models.operations.CreateReceiptsRequest;
import io.moov.sdk.models.operations.CreateReceiptsRequestBuilder;
import io.moov.sdk.models.operations.CreateReceiptsResponse;
import io.moov.sdk.models.operations.ListReceiptsRequest;
import io.moov.sdk.models.operations.ListReceiptsRequestBuilder;
import io.moov.sdk.models.operations.ListReceiptsResponse;
import io.moov.sdk.models.operations.SDKMethodInterfaces.*;
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

public class Receipts implements
            MethodCallCreateReceipts,
            MethodCallListReceipts {

    private final SDKConfiguration sdkConfiguration;

    Receipts(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create receipts for transfers and scheduled transfers.
     * 
     * <p> To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     *  you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
     * 
     * @return The call builder
     */
    public CreateReceiptsRequestBuilder create() {
        return new CreateReceiptsRequestBuilder(this);
    }

    /**
     * Create receipts for transfers and scheduled transfers.
     * 
     * <p> To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     *  you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
     * 
     * @param requestBody 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateReceiptsResponse create(
            List<ReceiptRequest> requestBody) throws Exception {
        return create(Optional.empty(), requestBody);
    }
    
    /**
     * Create receipts for transfers and scheduled transfers.
     * 
     * <p> To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     *  you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
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
     * @param requestBody 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateReceiptsResponse create(
            Optional<String> xMoovVersion,
            List<ReceiptRequest> requestBody) throws Exception {
        CreateReceiptsRequest request =
            CreateReceiptsRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/receipts");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "requestBody",
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
                      _baseUrl,
                      "createReceipts", 
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
                            _baseUrl,
                            "createReceipts",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "createReceipts",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "createReceipts",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateReceiptsResponse.Builder _resBuilder = 
            CreateReceiptsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateReceiptsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ReceiptResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ReceiptResponse>() {});
                _res.withReceiptResponse(Optional.ofNullable(_out));
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "422")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ReceiptValidationError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ReceiptValidationError>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "404", "429")) {
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
     * List receipts by trasnferID, scheduleID, or occurrenceID.
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
     * 
     * @return The call builder
     */
    public ListReceiptsRequestBuilder list() {
        return new ListReceiptsRequestBuilder(this);
    }

    /**
     * List receipts by trasnferID, scheduleID, or occurrenceID.
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListReceiptsResponse listDirect() throws Exception {
        return list(Optional.empty(), Optional.empty());
    }
    
    /**
     * List receipts by trasnferID, scheduleID, or occurrenceID.
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
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
     * @param id The unique identifier to filter receipts by.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListReceiptsResponse list(
            Optional<String> xMoovVersion,
            Optional<String> id) throws Exception {
        ListReceiptsRequest request =
            ListReceiptsRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .id(id)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/receipts");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListReceiptsRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "listReceipts", 
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
                            _baseUrl,
                            "listReceipts",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "listReceipts",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "listReceipts",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListReceiptsResponse.Builder _resBuilder = 
            ListReceiptsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListReceiptsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<ReceiptResponse> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<ReceiptResponse>>() {});
                _res.withReceiptResponses(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "429")) {
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

}
