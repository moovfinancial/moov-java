/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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


public class GetDisputeEvidenceDataResponse implements Response {
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
     * The request has succeeded.
     */
    private Optional<? extends InputStream> twoHundredApplicationPdfResponseStream;

    /**
     * The request has succeeded.
     */
    private Optional<? extends InputStream> twoHundredImageJpegResponseStream;

    /**
     * The request has succeeded.
     */
    private Optional<? extends InputStream> twoHundredImageTiffResponseStream;


    private Map<String, List<String>> headers;

    @JsonCreator
    public GetDisputeEvidenceDataResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends InputStream> twoHundredApplicationPdfResponseStream,
            Optional<? extends InputStream> twoHundredImageJpegResponseStream,
            Optional<? extends InputStream> twoHundredImageTiffResponseStream,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(twoHundredApplicationPdfResponseStream, "twoHundredApplicationPdfResponseStream");
        Utils.checkNotNull(twoHundredImageJpegResponseStream, "twoHundredImageJpegResponseStream");
        Utils.checkNotNull(twoHundredImageTiffResponseStream, "twoHundredImageTiffResponseStream");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(headers, "headers");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.twoHundredApplicationPdfResponseStream = twoHundredApplicationPdfResponseStream;
        this.twoHundredImageJpegResponseStream = twoHundredImageJpegResponseStream;
        this.twoHundredImageTiffResponseStream = twoHundredImageTiffResponseStream;
        this.headers = headers;
    }
    
    public GetDisputeEvidenceDataResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Map<String, List<String>> headers) {
        this(contentType, statusCode, rawResponse,
            Optional.empty(), Optional.empty(), Optional.empty(),
            headers);
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
     * The request has succeeded.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InputStream> twoHundredApplicationPdfResponseStream() {
        return (Optional<InputStream>) twoHundredApplicationPdfResponseStream;
    }

    /**
     * The request has succeeded.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InputStream> twoHundredImageJpegResponseStream() {
        return (Optional<InputStream>) twoHundredImageJpegResponseStream;
    }

    /**
     * The request has succeeded.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InputStream> twoHundredImageTiffResponseStream() {
        return (Optional<InputStream>) twoHundredImageTiffResponseStream;
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
    public GetDisputeEvidenceDataResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetDisputeEvidenceDataResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetDisputeEvidenceDataResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The request has succeeded.
     */
    public GetDisputeEvidenceDataResponse withTwoHundredApplicationPdfResponseStream(InputStream twoHundredApplicationPdfResponseStream) {
        Utils.checkNotNull(twoHundredApplicationPdfResponseStream, "twoHundredApplicationPdfResponseStream");
        this.twoHundredApplicationPdfResponseStream = Optional.ofNullable(twoHundredApplicationPdfResponseStream);
        return this;
    }


    /**
     * The request has succeeded.
     */
    public GetDisputeEvidenceDataResponse withTwoHundredApplicationPdfResponseStream(Optional<? extends InputStream> twoHundredApplicationPdfResponseStream) {
        Utils.checkNotNull(twoHundredApplicationPdfResponseStream, "twoHundredApplicationPdfResponseStream");
        this.twoHundredApplicationPdfResponseStream = twoHundredApplicationPdfResponseStream;
        return this;
    }

    /**
     * The request has succeeded.
     */
    public GetDisputeEvidenceDataResponse withTwoHundredImageJpegResponseStream(InputStream twoHundredImageJpegResponseStream) {
        Utils.checkNotNull(twoHundredImageJpegResponseStream, "twoHundredImageJpegResponseStream");
        this.twoHundredImageJpegResponseStream = Optional.ofNullable(twoHundredImageJpegResponseStream);
        return this;
    }


    /**
     * The request has succeeded.
     */
    public GetDisputeEvidenceDataResponse withTwoHundredImageJpegResponseStream(Optional<? extends InputStream> twoHundredImageJpegResponseStream) {
        Utils.checkNotNull(twoHundredImageJpegResponseStream, "twoHundredImageJpegResponseStream");
        this.twoHundredImageJpegResponseStream = twoHundredImageJpegResponseStream;
        return this;
    }

    /**
     * The request has succeeded.
     */
    public GetDisputeEvidenceDataResponse withTwoHundredImageTiffResponseStream(InputStream twoHundredImageTiffResponseStream) {
        Utils.checkNotNull(twoHundredImageTiffResponseStream, "twoHundredImageTiffResponseStream");
        this.twoHundredImageTiffResponseStream = Optional.ofNullable(twoHundredImageTiffResponseStream);
        return this;
    }


    /**
     * The request has succeeded.
     */
    public GetDisputeEvidenceDataResponse withTwoHundredImageTiffResponseStream(Optional<? extends InputStream> twoHundredImageTiffResponseStream) {
        Utils.checkNotNull(twoHundredImageTiffResponseStream, "twoHundredImageTiffResponseStream");
        this.twoHundredImageTiffResponseStream = twoHundredImageTiffResponseStream;
        return this;
    }

    public GetDisputeEvidenceDataResponse withHeaders(Map<String, List<String>> headers) {
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
        GetDisputeEvidenceDataResponse other = (GetDisputeEvidenceDataResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.twoHundredApplicationPdfResponseStream, other.twoHundredApplicationPdfResponseStream) &&
            Utils.enhancedDeepEquals(this.twoHundredImageJpegResponseStream, other.twoHundredImageJpegResponseStream) &&
            Utils.enhancedDeepEquals(this.twoHundredImageTiffResponseStream, other.twoHundredImageTiffResponseStream) &&
            Utils.enhancedDeepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            twoHundredApplicationPdfResponseStream, twoHundredImageJpegResponseStream, twoHundredImageTiffResponseStream,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDisputeEvidenceDataResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "twoHundredApplicationPdfResponseStream", twoHundredApplicationPdfResponseStream,
                "twoHundredImageJpegResponseStream", twoHundredImageJpegResponseStream,
                "twoHundredImageTiffResponseStream", twoHundredImageTiffResponseStream,
                "headers", headers);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends InputStream> twoHundredApplicationPdfResponseStream = Optional.empty();

        private Optional<? extends InputStream> twoHundredImageJpegResponseStream = Optional.empty();

        private Optional<? extends InputStream> twoHundredImageTiffResponseStream = Optional.empty();

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
         * The request has succeeded.
         */
        public Builder twoHundredApplicationPdfResponseStream(InputStream twoHundredApplicationPdfResponseStream) {
            Utils.checkNotNull(twoHundredApplicationPdfResponseStream, "twoHundredApplicationPdfResponseStream");
            this.twoHundredApplicationPdfResponseStream = Optional.ofNullable(twoHundredApplicationPdfResponseStream);
            return this;
        }

        /**
         * The request has succeeded.
         */
        public Builder twoHundredApplicationPdfResponseStream(Optional<? extends InputStream> twoHundredApplicationPdfResponseStream) {
            Utils.checkNotNull(twoHundredApplicationPdfResponseStream, "twoHundredApplicationPdfResponseStream");
            this.twoHundredApplicationPdfResponseStream = twoHundredApplicationPdfResponseStream;
            return this;
        }


        /**
         * The request has succeeded.
         */
        public Builder twoHundredImageJpegResponseStream(InputStream twoHundredImageJpegResponseStream) {
            Utils.checkNotNull(twoHundredImageJpegResponseStream, "twoHundredImageJpegResponseStream");
            this.twoHundredImageJpegResponseStream = Optional.ofNullable(twoHundredImageJpegResponseStream);
            return this;
        }

        /**
         * The request has succeeded.
         */
        public Builder twoHundredImageJpegResponseStream(Optional<? extends InputStream> twoHundredImageJpegResponseStream) {
            Utils.checkNotNull(twoHundredImageJpegResponseStream, "twoHundredImageJpegResponseStream");
            this.twoHundredImageJpegResponseStream = twoHundredImageJpegResponseStream;
            return this;
        }


        /**
         * The request has succeeded.
         */
        public Builder twoHundredImageTiffResponseStream(InputStream twoHundredImageTiffResponseStream) {
            Utils.checkNotNull(twoHundredImageTiffResponseStream, "twoHundredImageTiffResponseStream");
            this.twoHundredImageTiffResponseStream = Optional.ofNullable(twoHundredImageTiffResponseStream);
            return this;
        }

        /**
         * The request has succeeded.
         */
        public Builder twoHundredImageTiffResponseStream(Optional<? extends InputStream> twoHundredImageTiffResponseStream) {
            Utils.checkNotNull(twoHundredImageTiffResponseStream, "twoHundredImageTiffResponseStream");
            this.twoHundredImageTiffResponseStream = twoHundredImageTiffResponseStream;
            return this;
        }


        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public GetDisputeEvidenceDataResponse build() {

            return new GetDisputeEvidenceDataResponse(
                contentType, statusCode, rawResponse,
                twoHundredApplicationPdfResponseStream, twoHundredImageJpegResponseStream, twoHundredImageTiffResponseStream,
                headers);
        }

    }
}
