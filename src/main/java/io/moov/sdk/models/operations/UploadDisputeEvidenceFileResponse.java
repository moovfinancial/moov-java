/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.EvidenceUploadResponse;
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

public class UploadDisputeEvidenceFileResponse implements Response {

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
    private Optional<? extends EvidenceUploadResponse> evidenceUploadResponse;

    private Map<String, List<String>> headers;

    @JsonCreator
    public UploadDisputeEvidenceFileResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends EvidenceUploadResponse> evidenceUploadResponse,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(evidenceUploadResponse, "evidenceUploadResponse");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.evidenceUploadResponse = evidenceUploadResponse;
        this.headers = headers;
    }
    
    public UploadDisputeEvidenceFileResponse(
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
    public Optional<EvidenceUploadResponse> evidenceUploadResponse() {
        return (Optional<EvidenceUploadResponse>) evidenceUploadResponse;
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
    public UploadDisputeEvidenceFileResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UploadDisputeEvidenceFileResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UploadDisputeEvidenceFileResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The resource was successfully created.
     */
    public UploadDisputeEvidenceFileResponse withEvidenceUploadResponse(EvidenceUploadResponse evidenceUploadResponse) {
        Utils.checkNotNull(evidenceUploadResponse, "evidenceUploadResponse");
        this.evidenceUploadResponse = Optional.ofNullable(evidenceUploadResponse);
        return this;
    }

    /**
     * The resource was successfully created.
     */
    public UploadDisputeEvidenceFileResponse withEvidenceUploadResponse(Optional<? extends EvidenceUploadResponse> evidenceUploadResponse) {
        Utils.checkNotNull(evidenceUploadResponse, "evidenceUploadResponse");
        this.evidenceUploadResponse = evidenceUploadResponse;
        return this;
    }

    public UploadDisputeEvidenceFileResponse withHeaders(Map<String, List<String>> headers) {
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
        UploadDisputeEvidenceFileResponse other = (UploadDisputeEvidenceFileResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.evidenceUploadResponse, other.evidenceUploadResponse) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            evidenceUploadResponse,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadDisputeEvidenceFileResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "evidenceUploadResponse", evidenceUploadResponse,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends EvidenceUploadResponse> evidenceUploadResponse = Optional.empty();
 
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
        public Builder evidenceUploadResponse(EvidenceUploadResponse evidenceUploadResponse) {
            Utils.checkNotNull(evidenceUploadResponse, "evidenceUploadResponse");
            this.evidenceUploadResponse = Optional.ofNullable(evidenceUploadResponse);
            return this;
        }

        /**
         * The resource was successfully created.
         */
        public Builder evidenceUploadResponse(Optional<? extends EvidenceUploadResponse> evidenceUploadResponse) {
            Utils.checkNotNull(evidenceUploadResponse, "evidenceUploadResponse");
            this.evidenceUploadResponse = evidenceUploadResponse;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public UploadDisputeEvidenceFileResponse build() {
            return new UploadDisputeEvidenceFileResponse(
                contentType,
                statusCode,
                rawResponse,
                evidenceUploadResponse,
                headers);
        }
    }
}
