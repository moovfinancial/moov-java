/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * EvidenceUploadResponse
 * 
 * <p>Details of a successfully uploaded evidence file.
 */
public class EvidenceUploadResponse {

    /**
     * The ID of the evidence.
     */
    @JsonProperty("evidenceID")
    private String evidenceID;

    /**
     * The ID of the dispute the evidence is associated with.
     */
    @JsonProperty("disputeID")
    private String disputeID;

    /**
     * The name of the evidence file.
     */
    @JsonProperty("filename")
    private String filename;

    /**
     * The MIME type of the evidence file.
     */
    @JsonProperty("mimeType")
    private String mimeType;

    /**
     * The size of the evidence file.
     */
    @JsonProperty("size")
    private long size;

    @JsonProperty("evidenceType")
    private EvidenceType evidenceType;

    /**
     * The date and time the evidence was uploaded.
     */
    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;

    @JsonCreator
    public EvidenceUploadResponse(
            @JsonProperty("evidenceID") String evidenceID,
            @JsonProperty("disputeID") String disputeID,
            @JsonProperty("filename") String filename,
            @JsonProperty("mimeType") String mimeType,
            @JsonProperty("size") long size,
            @JsonProperty("evidenceType") EvidenceType evidenceType,
            @JsonProperty("createdOn") OffsetDateTime createdOn) {
        Utils.checkNotNull(evidenceID, "evidenceID");
        Utils.checkNotNull(disputeID, "disputeID");
        Utils.checkNotNull(filename, "filename");
        Utils.checkNotNull(mimeType, "mimeType");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(evidenceType, "evidenceType");
        Utils.checkNotNull(createdOn, "createdOn");
        this.evidenceID = evidenceID;
        this.disputeID = disputeID;
        this.filename = filename;
        this.mimeType = mimeType;
        this.size = size;
        this.evidenceType = evidenceType;
        this.createdOn = createdOn;
    }

    /**
     * The ID of the evidence.
     */
    @JsonIgnore
    public String evidenceID() {
        return evidenceID;
    }

    /**
     * The ID of the dispute the evidence is associated with.
     */
    @JsonIgnore
    public String disputeID() {
        return disputeID;
    }

    /**
     * The name of the evidence file.
     */
    @JsonIgnore
    public String filename() {
        return filename;
    }

    /**
     * The MIME type of the evidence file.
     */
    @JsonIgnore
    public String mimeType() {
        return mimeType;
    }

    /**
     * The size of the evidence file.
     */
    @JsonIgnore
    public long size() {
        return size;
    }

    @JsonIgnore
    public EvidenceType evidenceType() {
        return evidenceType;
    }

    /**
     * The date and time the evidence was uploaded.
     */
    @JsonIgnore
    public OffsetDateTime createdOn() {
        return createdOn;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The ID of the evidence.
     */
    public EvidenceUploadResponse withEvidenceID(String evidenceID) {
        Utils.checkNotNull(evidenceID, "evidenceID");
        this.evidenceID = evidenceID;
        return this;
    }

    /**
     * The ID of the dispute the evidence is associated with.
     */
    public EvidenceUploadResponse withDisputeID(String disputeID) {
        Utils.checkNotNull(disputeID, "disputeID");
        this.disputeID = disputeID;
        return this;
    }

    /**
     * The name of the evidence file.
     */
    public EvidenceUploadResponse withFilename(String filename) {
        Utils.checkNotNull(filename, "filename");
        this.filename = filename;
        return this;
    }

    /**
     * The MIME type of the evidence file.
     */
    public EvidenceUploadResponse withMimeType(String mimeType) {
        Utils.checkNotNull(mimeType, "mimeType");
        this.mimeType = mimeType;
        return this;
    }

    /**
     * The size of the evidence file.
     */
    public EvidenceUploadResponse withSize(long size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public EvidenceUploadResponse withEvidenceType(EvidenceType evidenceType) {
        Utils.checkNotNull(evidenceType, "evidenceType");
        this.evidenceType = evidenceType;
        return this;
    }

    /**
     * The date and time the evidence was uploaded.
     */
    public EvidenceUploadResponse withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
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
        EvidenceUploadResponse other = (EvidenceUploadResponse) o;
        return 
            Objects.deepEquals(this.evidenceID, other.evidenceID) &&
            Objects.deepEquals(this.disputeID, other.disputeID) &&
            Objects.deepEquals(this.filename, other.filename) &&
            Objects.deepEquals(this.mimeType, other.mimeType) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.evidenceType, other.evidenceType) &&
            Objects.deepEquals(this.createdOn, other.createdOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            evidenceID,
            disputeID,
            filename,
            mimeType,
            size,
            evidenceType,
            createdOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EvidenceUploadResponse.class,
                "evidenceID", evidenceID,
                "disputeID", disputeID,
                "filename", filename,
                "mimeType", mimeType,
                "size", size,
                "evidenceType", evidenceType,
                "createdOn", createdOn);
    }
    
    public final static class Builder {
 
        private String evidenceID;
 
        private String disputeID;
 
        private String filename;
 
        private String mimeType;
 
        private Long size;
 
        private EvidenceType evidenceType;
 
        private OffsetDateTime createdOn;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the evidence.
         */
        public Builder evidenceID(String evidenceID) {
            Utils.checkNotNull(evidenceID, "evidenceID");
            this.evidenceID = evidenceID;
            return this;
        }

        /**
         * The ID of the dispute the evidence is associated with.
         */
        public Builder disputeID(String disputeID) {
            Utils.checkNotNull(disputeID, "disputeID");
            this.disputeID = disputeID;
            return this;
        }

        /**
         * The name of the evidence file.
         */
        public Builder filename(String filename) {
            Utils.checkNotNull(filename, "filename");
            this.filename = filename;
            return this;
        }

        /**
         * The MIME type of the evidence file.
         */
        public Builder mimeType(String mimeType) {
            Utils.checkNotNull(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        /**
         * The size of the evidence file.
         */
        public Builder size(long size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder evidenceType(EvidenceType evidenceType) {
            Utils.checkNotNull(evidenceType, "evidenceType");
            this.evidenceType = evidenceType;
            return this;
        }

        /**
         * The date and time the evidence was uploaded.
         */
        public Builder createdOn(OffsetDateTime createdOn) {
            Utils.checkNotNull(createdOn, "createdOn");
            this.createdOn = createdOn;
            return this;
        }
        
        public EvidenceUploadResponse build() {
            return new EvidenceUploadResponse(
                evidenceID,
                disputeID,
                filename,
                mimeType,
                size,
                evidenceType,
                createdOn);
        }
    }
}
