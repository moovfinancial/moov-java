/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.FeePlanAgreement;
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

public class CreateFeePlanAgreementsResponse implements Response {

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
     * The resource was successfully created.
     */
    private Optional<? extends FeePlanAgreement> feePlanAgreement;

    private Map<String, List<String>> headers;

    @JsonCreator
    public CreateFeePlanAgreementsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends FeePlanAgreement> feePlanAgreement,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(feePlanAgreement, "feePlanAgreement");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.feePlanAgreement = feePlanAgreement;
        this.headers = headers;
    }
    
    public CreateFeePlanAgreementsResponse(
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
     * The resource was successfully created.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FeePlanAgreement> feePlanAgreement() {
        return (Optional<FeePlanAgreement>) feePlanAgreement;
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
    public CreateFeePlanAgreementsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateFeePlanAgreementsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateFeePlanAgreementsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The resource was successfully created.
     */
    public CreateFeePlanAgreementsResponse withFeePlanAgreement(FeePlanAgreement feePlanAgreement) {
        Utils.checkNotNull(feePlanAgreement, "feePlanAgreement");
        this.feePlanAgreement = Optional.ofNullable(feePlanAgreement);
        return this;
    }

    /**
     * The resource was successfully created.
     */
    public CreateFeePlanAgreementsResponse withFeePlanAgreement(Optional<? extends FeePlanAgreement> feePlanAgreement) {
        Utils.checkNotNull(feePlanAgreement, "feePlanAgreement");
        this.feePlanAgreement = feePlanAgreement;
        return this;
    }

    public CreateFeePlanAgreementsResponse withHeaders(Map<String, List<String>> headers) {
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
        CreateFeePlanAgreementsResponse other = (CreateFeePlanAgreementsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.feePlanAgreement, other.feePlanAgreement) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            feePlanAgreement,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateFeePlanAgreementsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "feePlanAgreement", feePlanAgreement,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends FeePlanAgreement> feePlanAgreement = Optional.empty();
 
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
         * The resource was successfully created.
         */
        public Builder feePlanAgreement(FeePlanAgreement feePlanAgreement) {
            Utils.checkNotNull(feePlanAgreement, "feePlanAgreement");
            this.feePlanAgreement = Optional.ofNullable(feePlanAgreement);
            return this;
        }

        /**
         * The resource was successfully created.
         */
        public Builder feePlanAgreement(Optional<? extends FeePlanAgreement> feePlanAgreement) {
            Utils.checkNotNull(feePlanAgreement, "feePlanAgreement");
            this.feePlanAgreement = feePlanAgreement;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public CreateFeePlanAgreementsResponse build() {
            return new CreateFeePlanAgreementsResponse(
                contentType,
                statusCode,
                rawResponse,
                feePlanAgreement,
                headers);
        }
    }
}
