/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class CreateEvidenceFileMultiPart {

    /**
     * The file to upload as evidence. Valid types are [jpeg, tiff, pdf].
     * 
     * <p>The `Content-Type` header for this form part must be one of the following:
     *   - `image/jpeg`
     *   - `image/tiff`
     *   - `application/pdf`
     */
    @SpeakeasyMetadata("multipartForm:file,name=file")
    private File file;

    @SpeakeasyMetadata("multipartForm:name=evidenceType")
    private EvidenceType evidenceType;

    @JsonCreator
    public CreateEvidenceFileMultiPart(
            File file,
            EvidenceType evidenceType) {
        Utils.checkNotNull(file, "file");
        Utils.checkNotNull(evidenceType, "evidenceType");
        this.file = file;
        this.evidenceType = evidenceType;
    }

    /**
     * The file to upload as evidence. Valid types are [jpeg, tiff, pdf].
     * 
     * <p>The `Content-Type` header for this form part must be one of the following:
     *   - `image/jpeg`
     *   - `image/tiff`
     *   - `application/pdf`
     */
    @JsonIgnore
    public File file() {
        return file;
    }

    @JsonIgnore
    public EvidenceType evidenceType() {
        return evidenceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The file to upload as evidence. Valid types are [jpeg, tiff, pdf].
     * 
     * <p>The `Content-Type` header for this form part must be one of the following:
     *   - `image/jpeg`
     *   - `image/tiff`
     *   - `application/pdf`
     */
    public CreateEvidenceFileMultiPart withFile(File file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
        return this;
    }

    public CreateEvidenceFileMultiPart withEvidenceType(EvidenceType evidenceType) {
        Utils.checkNotNull(evidenceType, "evidenceType");
        this.evidenceType = evidenceType;
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
        CreateEvidenceFileMultiPart other = (CreateEvidenceFileMultiPart) o;
        return 
            Objects.deepEquals(this.file, other.file) &&
            Objects.deepEquals(this.evidenceType, other.evidenceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            file,
            evidenceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateEvidenceFileMultiPart.class,
                "file", file,
                "evidenceType", evidenceType);
    }
    
    public final static class Builder {
 
        private File file;
 
        private EvidenceType evidenceType;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The file to upload as evidence. Valid types are [jpeg, tiff, pdf].
         * 
         * <p>The `Content-Type` header for this form part must be one of the following:
         *   - `image/jpeg`
         *   - `image/tiff`
         *   - `application/pdf`
         */
        public Builder file(File file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }

        public Builder evidenceType(EvidenceType evidenceType) {
            Utils.checkNotNull(evidenceType, "evidenceType");
            this.evidenceType = evidenceType;
            return this;
        }
        
        public CreateEvidenceFileMultiPart build() {
            return new CreateEvidenceFileMultiPart(
                file,
                evidenceType);
        }
    }
}
