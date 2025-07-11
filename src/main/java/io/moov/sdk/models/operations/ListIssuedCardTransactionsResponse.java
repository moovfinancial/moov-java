/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.IssuedCardTransaction;
import io.moov.sdk.utils.Response;
import io.moov.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class ListIssuedCardTransactionsResponse implements Response {
    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * The request completed successfully.
     */
    private Optional<? extends List<IssuedCardTransaction>> issuedCardTransactions;


    private Map<String, List<String>> headers;

    @JsonCreator
    public ListIssuedCardTransactionsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<IssuedCardTransaction>> issuedCardTransactions,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(issuedCardTransactions, "issuedCardTransactions");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(headers, "headers");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.issuedCardTransactions = issuedCardTransactions;
        this.headers = headers;
    }
    
    public ListIssuedCardTransactionsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Map<String, List<String>> headers) {
        this(contentType, statusCode, rawResponse,
            Optional.empty(), headers);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * The request completed successfully.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<IssuedCardTransaction>> issuedCardTransactions() {
        return (Optional<List<IssuedCardTransaction>>) issuedCardTransactions;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * HTTP response content type for this operation
     */
    public ListIssuedCardTransactionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListIssuedCardTransactionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListIssuedCardTransactionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The request completed successfully.
     */
    public ListIssuedCardTransactionsResponse withIssuedCardTransactions(List<IssuedCardTransaction> issuedCardTransactions) {
        Utils.checkNotNull(issuedCardTransactions, "issuedCardTransactions");
        this.issuedCardTransactions = Optional.ofNullable(issuedCardTransactions);
        return this;
    }


    /**
     * The request completed successfully.
     */
    public ListIssuedCardTransactionsResponse withIssuedCardTransactions(Optional<? extends List<IssuedCardTransaction>> issuedCardTransactions) {
        Utils.checkNotNull(issuedCardTransactions, "issuedCardTransactions");
        this.issuedCardTransactions = issuedCardTransactions;
        return this;
    }

    public ListIssuedCardTransactionsResponse withHeaders(Map<String, List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIssuedCardTransactionsResponse other = (ListIssuedCardTransactionsResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.issuedCardTransactions, other.issuedCardTransactions) &&
            Utils.enhancedDeepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            issuedCardTransactions, headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListIssuedCardTransactionsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "issuedCardTransactions", issuedCardTransactions,
                "headers", headers);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends List<IssuedCardTransaction>> issuedCardTransactions = Optional.empty();

        private Map<String, List<String>> headers;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }


        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }


        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }


        /**
         * The request completed successfully.
         */
        public Builder issuedCardTransactions(List<IssuedCardTransaction> issuedCardTransactions) {
            Utils.checkNotNull(issuedCardTransactions, "issuedCardTransactions");
            this.issuedCardTransactions = Optional.ofNullable(issuedCardTransactions);
            return this;
        }

        /**
         * The request completed successfully.
         */
        public Builder issuedCardTransactions(Optional<? extends List<IssuedCardTransaction>> issuedCardTransactions) {
            Utils.checkNotNull(issuedCardTransactions, "issuedCardTransactions");
            this.issuedCardTransactions = issuedCardTransactions;
            return this;
        }


        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public ListIssuedCardTransactionsResponse build() {

            return new ListIssuedCardTransactionsResponse(
                contentType, statusCode, rawResponse,
                issuedCardTransactions, headers);
        }

    }
}
