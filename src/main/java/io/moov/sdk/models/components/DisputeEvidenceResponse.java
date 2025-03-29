/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class DisputeEvidenceResponse {

    @JsonProperty("evidenceID")
    private String evidenceID;

    @JsonProperty("disputeID")
    private String disputeID;

    @JsonProperty("evidenceType")
    private EvidenceType evidenceType;

    /**
     * For text evidence, the text submitted as evidence.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    private Optional<String> text;

    /**
     * For file evidence, the MIME type of the file.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mimeType")
    private Optional<String> mimeType;

    /**
     * For file evidence, the name of the file.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filename")
    private Optional<String> filename;

    /**
     * For file evidence, the size of the file.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Long> size;

    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;

    @JsonProperty("updatedOn")
    private OffsetDateTime updatedOn;

    @JsonCreator
    public DisputeEvidenceResponse(
            @JsonProperty("evidenceID") String evidenceID,
            @JsonProperty("disputeID") String disputeID,
            @JsonProperty("evidenceType") EvidenceType evidenceType,
            @JsonProperty("text") Optional<String> text,
            @JsonProperty("mimeType") Optional<String> mimeType,
            @JsonProperty("filename") Optional<String> filename,
            @JsonProperty("size") Optional<Long> size,
            @JsonProperty("createdOn") OffsetDateTime createdOn,
            @JsonProperty("updatedOn") OffsetDateTime updatedOn) {
        Utils.checkNotNull(evidenceID, "evidenceID");
        Utils.checkNotNull(disputeID, "disputeID");
        Utils.checkNotNull(evidenceType, "evidenceType");
        Utils.checkNotNull(text, "text");
        Utils.checkNotNull(mimeType, "mimeType");
        Utils.checkNotNull(filename, "filename");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(updatedOn, "updatedOn");
        this.evidenceID = evidenceID;
        this.disputeID = disputeID;
        this.evidenceType = evidenceType;
        this.text = text;
        this.mimeType = mimeType;
        this.filename = filename;
        this.size = size;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }
    
    public DisputeEvidenceResponse(
            String evidenceID,
            String disputeID,
            EvidenceType evidenceType,
            OffsetDateTime createdOn,
            OffsetDateTime updatedOn) {
        this(evidenceID, disputeID, evidenceType, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), createdOn, updatedOn);
    }

    @JsonIgnore
    public String evidenceID() {
        return evidenceID;
    }

    @JsonIgnore
    public String disputeID() {
        return disputeID;
    }

    @JsonIgnore
    public EvidenceType evidenceType() {
        return evidenceType;
    }

    /**
     * For text evidence, the text submitted as evidence.
     */
    @JsonIgnore
    public Optional<String> text() {
        return text;
    }

    /**
     * For file evidence, the MIME type of the file.
     */
    @JsonIgnore
    public Optional<String> mimeType() {
        return mimeType;
    }

    /**
     * For file evidence, the name of the file.
     */
    @JsonIgnore
    public Optional<String> filename() {
        return filename;
    }

    /**
     * For file evidence, the size of the file.
     */
    @JsonIgnore
    public Optional<Long> size() {
        return size;
    }

    @JsonIgnore
    public OffsetDateTime createdOn() {
        return createdOn;
    }

    @JsonIgnore
    public OffsetDateTime updatedOn() {
        return updatedOn;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public DisputeEvidenceResponse withEvidenceID(String evidenceID) {
        Utils.checkNotNull(evidenceID, "evidenceID");
        this.evidenceID = evidenceID;
        return this;
    }

    public DisputeEvidenceResponse withDisputeID(String disputeID) {
        Utils.checkNotNull(disputeID, "disputeID");
        this.disputeID = disputeID;
        return this;
    }

    public DisputeEvidenceResponse withEvidenceType(EvidenceType evidenceType) {
        Utils.checkNotNull(evidenceType, "evidenceType");
        this.evidenceType = evidenceType;
        return this;
    }

    /**
     * For text evidence, the text submitted as evidence.
     */
    public DisputeEvidenceResponse withText(String text) {
        Utils.checkNotNull(text, "text");
        this.text = Optional.ofNullable(text);
        return this;
    }

    /**
     * For text evidence, the text submitted as evidence.
     */
    public DisputeEvidenceResponse withText(Optional<String> text) {
        Utils.checkNotNull(text, "text");
        this.text = text;
        return this;
    }

    /**
     * For file evidence, the MIME type of the file.
     */
    public DisputeEvidenceResponse withMimeType(String mimeType) {
        Utils.checkNotNull(mimeType, "mimeType");
        this.mimeType = Optional.ofNullable(mimeType);
        return this;
    }

    /**
     * For file evidence, the MIME type of the file.
     */
    public DisputeEvidenceResponse withMimeType(Optional<String> mimeType) {
        Utils.checkNotNull(mimeType, "mimeType");
        this.mimeType = mimeType;
        return this;
    }

    /**
     * For file evidence, the name of the file.
     */
    public DisputeEvidenceResponse withFilename(String filename) {
        Utils.checkNotNull(filename, "filename");
        this.filename = Optional.ofNullable(filename);
        return this;
    }

    /**
     * For file evidence, the name of the file.
     */
    public DisputeEvidenceResponse withFilename(Optional<String> filename) {
        Utils.checkNotNull(filename, "filename");
        this.filename = filename;
        return this;
    }

    /**
     * For file evidence, the size of the file.
     */
    public DisputeEvidenceResponse withSize(long size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    /**
     * For file evidence, the size of the file.
     */
    public DisputeEvidenceResponse withSize(Optional<Long> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public DisputeEvidenceResponse withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    public DisputeEvidenceResponse withUpdatedOn(OffsetDateTime updatedOn) {
        Utils.checkNotNull(updatedOn, "updatedOn");
        this.updatedOn = updatedOn;
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
        DisputeEvidenceResponse other = (DisputeEvidenceResponse) o;
        return 
            Objects.deepEquals(this.evidenceID, other.evidenceID) &&
            Objects.deepEquals(this.disputeID, other.disputeID) &&
            Objects.deepEquals(this.evidenceType, other.evidenceType) &&
            Objects.deepEquals(this.text, other.text) &&
            Objects.deepEquals(this.mimeType, other.mimeType) &&
            Objects.deepEquals(this.filename, other.filename) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.updatedOn, other.updatedOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            evidenceID,
            disputeID,
            evidenceType,
            text,
            mimeType,
            filename,
            size,
            createdOn,
            updatedOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DisputeEvidenceResponse.class,
                "evidenceID", evidenceID,
                "disputeID", disputeID,
                "evidenceType", evidenceType,
                "text", text,
                "mimeType", mimeType,
                "filename", filename,
                "size", size,
                "createdOn", createdOn,
                "updatedOn", updatedOn);
    }
    
    public final static class Builder {
 
        private String evidenceID;
 
        private String disputeID;
 
        private EvidenceType evidenceType;
 
        private Optional<String> text = Optional.empty();
 
        private Optional<String> mimeType = Optional.empty();
 
        private Optional<String> filename = Optional.empty();
 
        private Optional<Long> size = Optional.empty();
 
        private OffsetDateTime createdOn;
 
        private OffsetDateTime updatedOn;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder evidenceID(String evidenceID) {
            Utils.checkNotNull(evidenceID, "evidenceID");
            this.evidenceID = evidenceID;
            return this;
        }

        public Builder disputeID(String disputeID) {
            Utils.checkNotNull(disputeID, "disputeID");
            this.disputeID = disputeID;
            return this;
        }

        public Builder evidenceType(EvidenceType evidenceType) {
            Utils.checkNotNull(evidenceType, "evidenceType");
            this.evidenceType = evidenceType;
            return this;
        }

        /**
         * For text evidence, the text submitted as evidence.
         */
        public Builder text(String text) {
            Utils.checkNotNull(text, "text");
            this.text = Optional.ofNullable(text);
            return this;
        }

        /**
         * For text evidence, the text submitted as evidence.
         */
        public Builder text(Optional<String> text) {
            Utils.checkNotNull(text, "text");
            this.text = text;
            return this;
        }

        /**
         * For file evidence, the MIME type of the file.
         */
        public Builder mimeType(String mimeType) {
            Utils.checkNotNull(mimeType, "mimeType");
            this.mimeType = Optional.ofNullable(mimeType);
            return this;
        }

        /**
         * For file evidence, the MIME type of the file.
         */
        public Builder mimeType(Optional<String> mimeType) {
            Utils.checkNotNull(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        /**
         * For file evidence, the name of the file.
         */
        public Builder filename(String filename) {
            Utils.checkNotNull(filename, "filename");
            this.filename = Optional.ofNullable(filename);
            return this;
        }

        /**
         * For file evidence, the name of the file.
         */
        public Builder filename(Optional<String> filename) {
            Utils.checkNotNull(filename, "filename");
            this.filename = filename;
            return this;
        }

        /**
         * For file evidence, the size of the file.
         */
        public Builder size(long size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        /**
         * For file evidence, the size of the file.
         */
        public Builder size(Optional<Long> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder createdOn(OffsetDateTime createdOn) {
            Utils.checkNotNull(createdOn, "createdOn");
            this.createdOn = createdOn;
            return this;
        }

        public Builder updatedOn(OffsetDateTime updatedOn) {
            Utils.checkNotNull(updatedOn, "updatedOn");
            this.updatedOn = updatedOn;
            return this;
        }
        
        public DisputeEvidenceResponse build() {
            return new DisputeEvidenceResponse(
                evidenceID,
                disputeID,
                evidenceType,
                text,
                mimeType,
                filename,
                size,
                createdOn,
                updatedOn);
        }
    }
}
