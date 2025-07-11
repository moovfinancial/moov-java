/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.SecuritySource;
import io.moov.sdk.models.components.BankAccountVerificationCreated;
import io.moov.sdk.models.errors.APIException;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.InitiateBankAccountVerificationRequest;
import io.moov.sdk.models.operations.InitiateBankAccountVerificationResponse;
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


public class InitiateBankAccountVerificationOperation implements RequestOperation<InitiateBankAccountVerificationRequest, InitiateBankAccountVerificationResponse> {
    
    private final SDKConfiguration sdkConfiguration;

    public InitiateBankAccountVerificationOperation(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    
    @Override
    public HttpResponse<InputStream> doRequest(InitiateBankAccountVerificationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl();
        String url = Utils.generateURL(
                InitiateBankAccountVerificationRequest.class,
                baseUrl,
                "/accounts/{accountID}/bank-accounts/{bankAccountID}/verify",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest(url, "POST");
        req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
        Optional<SecuritySource> hookSecuritySource = Optional.of(this.sdkConfiguration.securitySource());
        Utils.configureSecurity(req,  
                this.sdkConfiguration.securitySource().getSecurity());
        HTTPClient client = this.sdkConfiguration.client();
        HttpRequest r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      this.sdkConfiguration,
                      baseUrl,
                      "initiateBankAccountVerification", 
                      java.util.Optional.of(java.util.List.of()), 
                      hookSecuritySource),
                  req.build());
        HttpResponse<InputStream> httpRes;
        try {
            httpRes = client.send(r);
            if (Utils.statusCodeMatches(httpRes.statusCode(), "400", "401", "403", "404", "409", "429", "4XX", "500", "504", "5XX")) {
                httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            baseUrl,
                            "initiateBankAccountVerification",
                            java.util.Optional.of(java.util.List.of()),
                            hookSecuritySource),
                        Optional.of(httpRes),
                        Optional.empty());
            } else {
                httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            this.sdkConfiguration,
                            baseUrl,
                            "initiateBankAccountVerification",
                            java.util.Optional.of(java.util.List.of()), 
                            hookSecuritySource),
                         httpRes);
            }
        } catch (Exception e) {
            httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            baseUrl,
                            "initiateBankAccountVerification",
                            java.util.Optional.of(java.util.List.of()),
                            hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(e));
        }
    
        return httpRes;
    }

    @Override
    public InitiateBankAccountVerificationResponse handleResponse(HttpResponse<InputStream> response) throws Exception {
        String contentType = response
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        InitiateBankAccountVerificationResponse.Builder resBuilder = 
            InitiateBankAccountVerificationResponse
                .builder()
                .contentType(contentType)
                .statusCode(response.statusCode())
                .rawResponse(response);

        InitiateBankAccountVerificationResponse res = resBuilder.build();
        
        if (Utils.statusCodeMatches(response.statusCode(), "200")) {
            res.withHeaders(response.headers().map());
            if (Utils.contentTypeMatches(contentType, "application/json")) {
                BankAccountVerificationCreated out = Utils.mapper().readValue(
                    response.body(),
                    new TypeReference<>() {
                    });
                res.withBankAccountVerificationCreated(out);
                return res;
            } else {
                throw new APIException(
                    response, 
                    response.statusCode(), 
                    "Unexpected content-type received: " + contentType, 
                    Utils.extractByteArrayFromBody(response));
            }
        }
        if (Utils.statusCodeMatches(response.statusCode(), "400", "409")) {
            res.withHeaders(response.headers().map());
            if (Utils.contentTypeMatches(contentType, "application/json")) {
                GenericError out = Utils.mapper().readValue(
                    response.body(),
                    new TypeReference<>() {
                    });
                throw out;
            } else {
                throw new APIException(
                    response, 
                    response.statusCode(), 
                    "Unexpected content-type received: " + contentType, 
                    Utils.extractByteArrayFromBody(response));
            }
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
