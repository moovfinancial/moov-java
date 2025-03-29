/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.errors;

import java.net.http.HttpResponse;
import java.io.InputStream;
import io.moov.sdk.utils.Utils;

/**
 * Thrown by a service call when an error response occurs. Contains details about the response.
 */
@SuppressWarnings("serial")
public class APIException extends Exception {

    private final HttpResponse<InputStream> rawResponse;
    private final int code;
    private final String message;
    private final byte[] body;

    public APIException(
            HttpResponse<InputStream> rawResponse,
            int code,
            String message,
            byte[] body) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(body, "body");
        this.rawResponse = rawResponse;
        this.code = code;
        this.message = message;
        this.body = body;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        APIException other = (APIException) o;
        return 
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.code, other.code) &&
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.body, other.body);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            rawResponse,
            code,
            message,
            body);
    }
    
    @Override
    public String toString() {
        return Utils.toString(APIException.class,
                "rawResponse", rawResponse,
                "code", code,
                "message", message,
                "body", body);
    }

    public HttpResponse<InputStream> rawResponse() {
        return this.rawResponse;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public byte[] body() {
        return this.body;
    }
}
