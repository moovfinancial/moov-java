/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.SecuritySource;
import io.moov.sdk.models.components.IssuedCardTransaction;
import io.moov.sdk.models.errors.APIException;
import io.moov.sdk.models.operations.ListIssuedCardTransactionsRequest;
import io.moov.sdk.models.operations.ListIssuedCardTransactionsResponse;
import io.moov.sdk.utils.HTTPClient;
import io.moov.sdk.utils.HTTPRequest;
import io.moov.sdk.utils.Hook.AfterErrorContextImpl;
import io.moov.sdk.utils.Hook.AfterSuccessContextImpl;
import io.moov.sdk.utils.Hook.BeforeRequestContextImpl;
import io.moov.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;


public class ListIssuedCardTransactionsOperation implements RequestOperation<ListIssuedCardTransactionsRequest, ListIssuedCardTransactionsResponse> {

    private final SDKConfiguration sdkConfiguration;
    private final String baseUrl;
    private final SecuritySource securitySource;
    private final HTTPClient client;

    public ListIssuedCardTransactionsOperation(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.baseUrl = this.sdkConfiguration.serverUrl();
        this.securitySource = this.sdkConfiguration.securitySource();
        this.client = this.sdkConfiguration.client();
    }

    private Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(this.securitySource);
    }

    public HttpRequest buildRequest(ListIssuedCardTransactionsRequest request) throws Exception {
        String url = Utils.generateURL(
                ListIssuedCardTransactionsRequest.class,
                this.baseUrl,
                "/issuing/{accountID}/card-transactions",
                request, this.sdkConfiguration.globals);
        HTTPRequest req = new HTTPRequest(url, "GET");
        req.addHeader("Accept", "application/json")
                .addHeader("user-agent", SDKConfiguration.USER_AGENT);

        req.addQueryParams(Utils.getQueryParams(
                ListIssuedCardTransactionsRequest.class,
                request, 
                this.sdkConfiguration.globals));
        req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        Utils.configureSecurity(req, this.sdkConfiguration.securitySource().getSecurity());

        return sdkConfiguration.hooks().beforeRequest(
              new BeforeRequestContextImpl(
                  this.sdkConfiguration,
                  this.baseUrl,
                  "listIssuedCardTransactions",
                  java.util.Optional.of(java.util.List.of()),
                  securitySource()),
              req.build());
    }

    private HttpResponse<InputStream> onError(HttpResponse<InputStream> response,
                                              Exception error) throws Exception {
        return sdkConfiguration.hooks()
            .afterError(
                new AfterErrorContextImpl(
                    this.sdkConfiguration,
                    this.baseUrl,
                    "listIssuedCardTransactions",
                    java.util.Optional.of(java.util.List.of()),
                    securitySource()),
                Optional.ofNullable(response),
                Optional.ofNullable(error));
    }

    private HttpResponse<InputStream> onSuccess(HttpResponse<InputStream> response) throws Exception {
        return sdkConfiguration.hooks()
            .afterSuccess(
                new AfterSuccessContextImpl(
                    this.sdkConfiguration,
                    this.baseUrl,
                    "listIssuedCardTransactions",
                    java.util.Optional.of(java.util.List.of()),
                    securitySource()),
                response);
    }

    @Override
    public HttpResponse<InputStream> doRequest(ListIssuedCardTransactionsRequest request) throws Exception {
        HttpRequest r = buildRequest(request);
        HttpResponse<InputStream> httpRes;
        try {
            httpRes = client.send(r);
            if (Utils.statusCodeMatches(httpRes.statusCode(), "401", "403", "429", "4XX", "500", "504", "5XX")) {
                httpRes = onError(httpRes, null);
            } else {
                httpRes = onSuccess(httpRes);
            }
        } catch (Exception e) {
            httpRes = onError(null, e);
        }

        return httpRes;
    }


    @Override
    public ListIssuedCardTransactionsResponse handleResponse(HttpResponse<InputStream> response) throws Exception {
        String contentType = response
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListIssuedCardTransactionsResponse.Builder resBuilder = 
            ListIssuedCardTransactionsResponse
                .builder()
                .contentType(contentType)
                .statusCode(response.statusCode())
                .rawResponse(response);

        ListIssuedCardTransactionsResponse res = resBuilder.build();
        
        if (Utils.statusCodeMatches(response.statusCode(), "200")) {
            res.withHeaders(response.headers().map());
            if (Utils.contentTypeMatches(contentType, "application/json")) {
                List<IssuedCardTransaction> out = Utils.mapper().readValue(
                    response.body(),
                    new TypeReference<>() {
                    });
                res.withIssuedCardTransactions(out);
                return res;
            } else {
                throw new APIException(
                    response, 
                    response.statusCode(), 
                    "Unexpected content-type received: " + contentType, 
                    Utils.extractByteArrayFromBody(response));
            }
        }
        if (Utils.statusCodeMatches(response.statusCode(), "401", "403", "429")) {
            res.withHeaders(response.headers().map());
            // no content 
            throw new APIException(
                    response, 
                    response.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(response));
        }
        if (Utils.statusCodeMatches(response.statusCode(), "500", "504")) {
            res.withHeaders(response.headers().map());
            // no content 
            throw new APIException(
                    response, 
                    response.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(response));
        }
        if (Utils.statusCodeMatches(response.statusCode(), "4XX")) {
            // no content 
            throw new APIException(
                    response, 
                    response.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(response));
        }
        if (Utils.statusCodeMatches(response.statusCode(), "5XX")) {
            // no content 
            throw new APIException(
                    response, 
                    response.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(response));
        }
        throw new APIException(
            response, 
            response.statusCode(), 
            "Unexpected status code received: " + response.statusCode(), 
            Utils.extractByteArrayFromBody(response));
    }
}
