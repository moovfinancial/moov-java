/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.components.WalletTransaction;
import io.moov.openapi.models.errors.APIException;
import io.moov.openapi.models.operations.GetWalletTransactionRequest;
import io.moov.openapi.models.operations.GetWalletTransactionRequestBuilder;
import io.moov.openapi.models.operations.GetWalletTransactionResponse;
import io.moov.openapi.models.operations.GetWalletTransactionSecurity;
import io.moov.openapi.models.operations.ListWalletTransactionsRequest;
import io.moov.openapi.models.operations.ListWalletTransactionsRequestBuilder;
import io.moov.openapi.models.operations.ListWalletTransactionsResponse;
import io.moov.openapi.models.operations.ListWalletTransactionsSecurity;
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

public class WalletTransactions implements
            MethodCallListWalletTransactions,
            MethodCallGetWalletTransaction {

    private final SDKConfiguration sdkConfiguration;

    WalletTransactions(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all the transactions associated with a particular Moov wallet. Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @return The call builder
     */
    public ListWalletTransactionsRequestBuilder listWalletTransactions() {
        return new ListWalletTransactionsRequestBuilder(this);
    }

    /**
     * List all the transactions associated with a particular Moov wallet. Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param request The request object containing all of the parameters for the API call.
     * @param security The security details to use for authentication.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListWalletTransactionsResponse listWalletTransactions(
            ListWalletTransactionsRequest request,
            ListWalletTransactionsSecurity security) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListWalletTransactionsRequest.class,
                _baseUrl,
                "/accounts/{accountID}/wallets/{walletID}/transactions",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListWalletTransactionsRequest.class,
                request, 
                this.sdkConfiguration.globals));
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
                      "listWalletTransactions", 
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
                            "listWalletTransactions",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listWalletTransactions",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listWalletTransactions",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListWalletTransactionsResponse.Builder _resBuilder = 
            ListWalletTransactionsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListWalletTransactionsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<WalletTransaction> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<WalletTransaction>>() {});
                _res.withWalletTransactions(Optional.ofNullable(_out));
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
     * Get details on a specific wallet transaction. Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more. -  - To use this endpoint from a browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @return The call builder
     */
    public GetWalletTransactionRequestBuilder getWalletTransaction() {
        return new GetWalletTransactionRequestBuilder(this);
    }

    /**
     * Get details on a specific wallet transaction. Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more. -  - To use this endpoint from a browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param accountID
     * @param walletID
     * @param transactionID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetWalletTransactionResponse getWalletTransaction(
            GetWalletTransactionSecurity security,
            String accountID,
            String walletID,
            String transactionID) throws Exception {
        return getWalletTransaction(security, Optional.empty(), accountID, walletID, transactionID);
    }
    
    /**
     * Get details on a specific wallet transaction. Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more. -  - To use this endpoint from a browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. 

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param accountID
     * @param walletID
     * @param transactionID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetWalletTransactionResponse getWalletTransaction(
            GetWalletTransactionSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            String walletID,
            String transactionID) throws Exception {
        GetWalletTransactionRequest request =
            GetWalletTransactionRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .walletID(walletID)
                .transactionID(transactionID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetWalletTransactionRequest.class,
                _baseUrl,
                "/accounts/{accountID}/wallets/{walletID}/transactions/{transactionID}",
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
                      "getWalletTransaction", 
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
                            "getWalletTransaction",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getWalletTransaction",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getWalletTransaction",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetWalletTransactionResponse.Builder _resBuilder = 
            GetWalletTransactionResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetWalletTransactionResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                WalletTransaction _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<WalletTransaction>() {});
                _res.withWalletTransaction(Optional.ofNullable(_out));
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
