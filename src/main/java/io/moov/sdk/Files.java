/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.FileDetails;
import io.moov.sdk.models.components.FileUploadRequestMultiPart;
import io.moov.sdk.models.errors.APIException;
import io.moov.sdk.models.errors.FileValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.GetFileDetailsRequest;
import io.moov.sdk.models.operations.GetFileDetailsRequestBuilder;
import io.moov.sdk.models.operations.GetFileDetailsResponse;
import io.moov.sdk.models.operations.ListFilesRequest;
import io.moov.sdk.models.operations.ListFilesRequestBuilder;
import io.moov.sdk.models.operations.ListFilesResponse;
import io.moov.sdk.models.operations.SDKMethodInterfaces.*;
import io.moov.sdk.models.operations.UploadFileRequest;
import io.moov.sdk.models.operations.UploadFileRequestBuilder;
import io.moov.sdk.models.operations.UploadFileResponse;
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

public class Files implements
            MethodCallUploadFile,
            MethodCallListFiles,
            MethodCallGetFileDetails {

    private final SDKConfiguration sdkConfiguration;

    Files(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Upload a file and link it to the specified Moov account. 
     * 
     * <p>The maximum file size is 20MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf, 
     * and png. 
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/files.write` scope.
     * 
     * @return The call builder
     */
    public UploadFileRequestBuilder upload() {
        return new UploadFileRequestBuilder(this);
    }

    /**
     * Upload a file and link it to the specified Moov account. 
     * 
     * <p>The maximum file size is 20MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf, 
     * and png. 
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/files.write` scope.
     * 
     * @param accountID 
     * @param fileUploadRequestMultiPart Request to upload a file for an account.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UploadFileResponse upload(
            String accountID,
            FileUploadRequestMultiPart fileUploadRequestMultiPart) throws Exception {
        return upload(Optional.empty(), accountID, fileUploadRequestMultiPart);
    }
    
    /**
     * Upload a file and link it to the specified Moov account. 
     * 
     * <p>The maximum file size is 20MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf, 
     * and png. 
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/files.write` scope.
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
     * @param accountID 
     * @param fileUploadRequestMultiPart Request to upload a file for an account.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UploadFileResponse upload(
            Optional<String> xMoovVersion,
            String accountID,
            FileUploadRequestMultiPart fileUploadRequestMultiPart) throws Exception {
        UploadFileRequest request =
            UploadFileRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .fileUploadRequestMultiPart(fileUploadRequestMultiPart)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl();
        String _url = Utils.generateURL(
                UploadFileRequest.class,
                _baseUrl,
                "/accounts/{accountID}/files",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "fileUploadRequestMultiPart",
                "multipart",
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
                      "uploadFile", 
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
                            this.sdkConfiguration,
                            _baseUrl,
                            "uploadFile",
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
                            "uploadFile",
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
                            "uploadFile",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UploadFileResponse.Builder _resBuilder = 
            UploadFileResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UploadFileResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                FileDetails _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<FileDetails>() {});
                _res.withFileDetails(Optional.ofNullable(_out));
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
                FileValidationError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<FileValidationError>() {});
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
     * List all the files associated with a particular Moov account.
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/files.read` scope.
     * 
     * @return The call builder
     */
    public ListFilesRequestBuilder list() {
        return new ListFilesRequestBuilder(this);
    }

    /**
     * List all the files associated with a particular Moov account.
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/files.read` scope.
     * 
     * @param accountID 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListFilesResponse list(
            String accountID) throws Exception {
        return list(Optional.empty(), accountID);
    }
    
    /**
     * List all the files associated with a particular Moov account.
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/files.read` scope.
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
     * @param accountID 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListFilesResponse list(
            Optional<String> xMoovVersion,
            String accountID) throws Exception {
        ListFilesRequest request =
            ListFilesRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl();
        String _url = Utils.generateURL(
                ListFilesRequest.class,
                _baseUrl,
                "/accounts/{accountID}/files",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
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
                      "listFiles", 
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
                            this.sdkConfiguration,
                            _baseUrl,
                            "listFiles",
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
                            "listFiles",
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
                            "listFiles",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListFilesResponse.Builder _resBuilder = 
            ListFilesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListFilesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<FileDetails> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<FileDetails>>() {});
                _res.withFileDetails(Optional.ofNullable(_out));
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


    /**
     * Retrieve file details associated with a specific Moov account.
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/files.read` scope.
     * 
     * @return The call builder
     */
    public GetFileDetailsRequestBuilder get() {
        return new GetFileDetailsRequestBuilder(this);
    }

    /**
     * Retrieve file details associated with a specific Moov account.
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/files.read` scope.
     * 
     * @param accountID 
     * @param fileID 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetFileDetailsResponse get(
            String accountID,
            String fileID) throws Exception {
        return get(Optional.empty(), accountID, fileID);
    }
    
    /**
     * Retrieve file details associated with a specific Moov account.
     * 
     * <p>To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
     * you'll need to specify the `/accounts/{accountID}/files.read` scope.
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
     * @param accountID 
     * @param fileID 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetFileDetailsResponse get(
            Optional<String> xMoovVersion,
            String accountID,
            String fileID) throws Exception {
        GetFileDetailsRequest request =
            GetFileDetailsRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .fileID(fileID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl();
        String _url = Utils.generateURL(
                GetFileDetailsRequest.class,
                _baseUrl,
                "/accounts/{accountID}/files/{fileID}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
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
                      "getFileDetails", 
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
                            this.sdkConfiguration,
                            _baseUrl,
                            "getFileDetails",
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
                            "getFileDetails",
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
                            "getFileDetails",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetFileDetailsResponse.Builder _resBuilder = 
            GetFileDetailsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetFileDetailsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                FileDetails _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<FileDetails>() {});
                _res.withFileDetails(Optional.ofNullable(_out));
                return _res;
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

}
