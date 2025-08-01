/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.SecuritySource;
import io.moov.sdk.models.errors.APIException;
import io.moov.sdk.models.operations.DisablePaymentLinkRequest;
import io.moov.sdk.models.operations.DisablePaymentLinkResponse;
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
import java.util.Optional;


public class DisablePaymentLinkOperation implements RequestOperation<DisablePaymentLinkRequest, DisablePaymentLinkResponse> {

    private final SDKConfiguration sdkConfiguration;
    private final String baseUrl;
    private final SecuritySource securitySource;
    private final HTTPClient client;

    public DisablePaymentLinkOperation(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.baseUrl = this.sdkConfiguration.serverUrl();
        this.securitySource = this.sdkConfiguration.securitySource();
        this.client = this.sdkConfiguration.client();
    }

    private Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(this.securitySource);
    }

    public HttpRequest buildRequest(DisablePaymentLinkRequest request) throws Exception {
        String url = Utils.generateURL(
                DisablePaymentLinkRequest.class,
                this.baseUrl,
                "/accounts/{accountID}/payment-links/{paymentLinkCode}",
                request, this.sdkConfiguration.globals);
        HTTPRequest req = new HTTPRequest(url, "DELETE");
        req.addHeader("Accept", "*/*")
                .addHeader("user-agent", SDKConfiguration.USER_AGENT);
        req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        Utils.configureSecurity(req, this.sdkConfiguration.securitySource().getSecurity());

        return sdkConfiguration.hooks().beforeRequest(
              new BeforeRequestContextImpl(
                  this.sdkConfiguration,
                  this.baseUrl,
                  "disablePaymentLink",
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
                    "disablePaymentLink",
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
                    "disablePaymentLink",
                    java.util.Optional.of(java.util.List.of()),
                    securitySource()),
                response);
    }

    @Override
    public HttpResponse<InputStream> doRequest(DisablePaymentLinkRequest request) throws Exception {
        HttpRequest r = buildRequest(request);
        HttpResponse<InputStream> httpRes;
        try {
            httpRes = client.send(r);
            if (Utils.statusCodeMatches(httpRes.statusCode(), "401", "403", "404", "429", "4XX", "500", "504", "5XX")) {
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
    public DisablePaymentLinkResponse handleResponse(HttpResponse<InputStream> response) throws Exception {
        String contentType = response
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DisablePaymentLinkResponse.Builder resBuilder = 
            DisablePaymentLinkResponse
                .builder()
                .contentType(contentType)
                .statusCode(response.statusCode())
                .rawResponse(response);

        DisablePaymentLinkResponse res = resBuilder.build();
        
        if (Utils.statusCodeMatches(response.statusCode(), "204")) {
            res.withHeaders(response.headers().map());
            // no content 
            return res;
        }
        if (Utils.statusCodeMatches(response.statusCode(), "401", "403", "404", "429")) {
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
