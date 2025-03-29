/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.IssuedCardAuthorization;
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

public class GetIssuedCardAuthorizationResponse implements Response {

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
    private Optional<? extends IssuedCardAuthorization> issuedCardAuthorization;

    private Map<String, List<String>> headers;

    @JsonCreator
    public GetIssuedCardAuthorizationResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends IssuedCardAuthorization> issuedCardAuthorization,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(issuedCardAuthorization, "issuedCardAuthorization");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.issuedCardAuthorization = issuedCardAuthorization;
        this.headers = headers;
    }
    
    public GetIssuedCardAuthorizationResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Map<String, List<String>> headers) {
        this(contentType, statusCode, rawResponse, Optional.empty(), headers);
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
    public Optional<IssuedCardAuthorization> issuedCardAuthorization() {
        return (Optional<IssuedCardAuthorization>) issuedCardAuthorization;
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
    public GetIssuedCardAuthorizationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetIssuedCardAuthorizationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetIssuedCardAuthorizationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The request completed successfully.
     */
    public GetIssuedCardAuthorizationResponse withIssuedCardAuthorization(IssuedCardAuthorization issuedCardAuthorization) {
        Utils.checkNotNull(issuedCardAuthorization, "issuedCardAuthorization");
        this.issuedCardAuthorization = Optional.ofNullable(issuedCardAuthorization);
        return this;
    }

    /**
     * The request completed successfully.
     */
    public GetIssuedCardAuthorizationResponse withIssuedCardAuthorization(Optional<? extends IssuedCardAuthorization> issuedCardAuthorization) {
        Utils.checkNotNull(issuedCardAuthorization, "issuedCardAuthorization");
        this.issuedCardAuthorization = issuedCardAuthorization;
        return this;
    }

    public GetIssuedCardAuthorizationResponse withHeaders(Map<String, List<String>> headers) {
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
        GetIssuedCardAuthorizationResponse other = (GetIssuedCardAuthorizationResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.issuedCardAuthorization, other.issuedCardAuthorization) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            issuedCardAuthorization,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetIssuedCardAuthorizationResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "issuedCardAuthorization", issuedCardAuthorization,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends IssuedCardAuthorization> issuedCardAuthorization = Optional.empty();
 
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
        public Builder issuedCardAuthorization(IssuedCardAuthorization issuedCardAuthorization) {
            Utils.checkNotNull(issuedCardAuthorization, "issuedCardAuthorization");
            this.issuedCardAuthorization = Optional.ofNullable(issuedCardAuthorization);
            return this;
        }

        /**
         * The request completed successfully.
         */
        public Builder issuedCardAuthorization(Optional<? extends IssuedCardAuthorization> issuedCardAuthorization) {
            Utils.checkNotNull(issuedCardAuthorization, "issuedCardAuthorization");
            this.issuedCardAuthorization = issuedCardAuthorization;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public GetIssuedCardAuthorizationResponse build() {
            return new GetIssuedCardAuthorizationResponse(
                contentType,
                statusCode,
                rawResponse,
                issuedCardAuthorization,
                headers);
        }
    }
}
