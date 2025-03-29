/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.CardAcquiringRefund;
import io.moov.sdk.models.components.CreateRefundResponse;
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
import java.util.Objects;
import java.util.Optional;

public class InitiateRefundResponse implements Response {

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
    private Optional<? extends CreateRefundResponse> createRefundResponse;

    /**
     * A refund was successfully created but an error occurred while waiting for a synchronous response.
     */
    private Optional<? extends CardAcquiringRefund> cardAcquiringRefund;

    private Map<String, List<String>> headers;

    @JsonCreator
    public InitiateRefundResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends CreateRefundResponse> createRefundResponse,
            Optional<? extends CardAcquiringRefund> cardAcquiringRefund,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(createRefundResponse, "createRefundResponse");
        Utils.checkNotNull(cardAcquiringRefund, "cardAcquiringRefund");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.createRefundResponse = createRefundResponse;
        this.cardAcquiringRefund = cardAcquiringRefund;
        this.headers = headers;
    }
    
    public InitiateRefundResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Map<String, List<String>> headers) {
        this(contentType, statusCode, rawResponse, Optional.empty(), Optional.empty(), headers);
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
    public Optional<CreateRefundResponse> createRefundResponse() {
        return (Optional<CreateRefundResponse>) createRefundResponse;
    }

    /**
     * A refund was successfully created but an error occurred while waiting for a synchronous response.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardAcquiringRefund> cardAcquiringRefund() {
        return (Optional<CardAcquiringRefund>) cardAcquiringRefund;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public InitiateRefundResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public InitiateRefundResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public InitiateRefundResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The request completed successfully.
     */
    public InitiateRefundResponse withCreateRefundResponse(CreateRefundResponse createRefundResponse) {
        Utils.checkNotNull(createRefundResponse, "createRefundResponse");
        this.createRefundResponse = Optional.ofNullable(createRefundResponse);
        return this;
    }

    /**
     * The request completed successfully.
     */
    public InitiateRefundResponse withCreateRefundResponse(Optional<? extends CreateRefundResponse> createRefundResponse) {
        Utils.checkNotNull(createRefundResponse, "createRefundResponse");
        this.createRefundResponse = createRefundResponse;
        return this;
    }

    /**
     * A refund was successfully created but an error occurred while waiting for a synchronous response.
     */
    public InitiateRefundResponse withCardAcquiringRefund(CardAcquiringRefund cardAcquiringRefund) {
        Utils.checkNotNull(cardAcquiringRefund, "cardAcquiringRefund");
        this.cardAcquiringRefund = Optional.ofNullable(cardAcquiringRefund);
        return this;
    }

    /**
     * A refund was successfully created but an error occurred while waiting for a synchronous response.
     */
    public InitiateRefundResponse withCardAcquiringRefund(Optional<? extends CardAcquiringRefund> cardAcquiringRefund) {
        Utils.checkNotNull(cardAcquiringRefund, "cardAcquiringRefund");
        this.cardAcquiringRefund = cardAcquiringRefund;
        return this;
    }

    public InitiateRefundResponse withHeaders(Map<String, List<String>> headers) {
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
        InitiateRefundResponse other = (InitiateRefundResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.createRefundResponse, other.createRefundResponse) &&
            Objects.deepEquals(this.cardAcquiringRefund, other.cardAcquiringRefund) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            createRefundResponse,
            cardAcquiringRefund,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InitiateRefundResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "createRefundResponse", createRefundResponse,
                "cardAcquiringRefund", cardAcquiringRefund,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends CreateRefundResponse> createRefundResponse = Optional.empty();
 
        private Optional<? extends CardAcquiringRefund> cardAcquiringRefund = Optional.empty();
 
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
        public Builder createRefundResponse(CreateRefundResponse createRefundResponse) {
            Utils.checkNotNull(createRefundResponse, "createRefundResponse");
            this.createRefundResponse = Optional.ofNullable(createRefundResponse);
            return this;
        }

        /**
         * The request completed successfully.
         */
        public Builder createRefundResponse(Optional<? extends CreateRefundResponse> createRefundResponse) {
            Utils.checkNotNull(createRefundResponse, "createRefundResponse");
            this.createRefundResponse = createRefundResponse;
            return this;
        }

        /**
         * A refund was successfully created but an error occurred while waiting for a synchronous response.
         */
        public Builder cardAcquiringRefund(CardAcquiringRefund cardAcquiringRefund) {
            Utils.checkNotNull(cardAcquiringRefund, "cardAcquiringRefund");
            this.cardAcquiringRefund = Optional.ofNullable(cardAcquiringRefund);
            return this;
        }

        /**
         * A refund was successfully created but an error occurred while waiting for a synchronous response.
         */
        public Builder cardAcquiringRefund(Optional<? extends CardAcquiringRefund> cardAcquiringRefund) {
            Utils.checkNotNull(cardAcquiringRefund, "cardAcquiringRefund");
            this.cardAcquiringRefund = cardAcquiringRefund;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public InitiateRefundResponse build() {
            return new InitiateRefundResponse(
                contentType,
                statusCode,
                rawResponse,
                createRefundResponse,
                cardAcquiringRefund,
                headers);
        }
    }
}
