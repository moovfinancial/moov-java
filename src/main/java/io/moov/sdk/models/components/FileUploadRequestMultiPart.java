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
import java.util.Optional;
/**
 * FileUploadRequestMultiPart - Request to upload a file for an account.
 */

public class FileUploadRequestMultiPart {

    /**
     * The file to be added. Valid types are `csv`, `png`, `jpeg`, `pdf`.
     */
    @SpeakeasyMetadata("multipartForm:file,name=file")
    private FileUploadRequestMultiPartFile file;

    /**
     * The file's purpose.
     */
    @SpeakeasyMetadata("multipartForm:name=filePurpose")
    private FilePurpose filePurpose;

    /**
     * Additional metadata to be stored with the file, formatted as a JSON string.
     * 
     * Valid keys are `representative_id`, `comment`, `requirement_id`, `error_code`.
     */
    @SpeakeasyMetadata("multipartForm:name=metadata")
    private Optional<String> metadata;

    @JsonCreator
    public FileUploadRequestMultiPart(
            FileUploadRequestMultiPartFile file,
            FilePurpose filePurpose,
            Optional<String> metadata) {
        Utils.checkNotNull(file, "file");
        Utils.checkNotNull(filePurpose, "filePurpose");
        Utils.checkNotNull(metadata, "metadata");
        this.file = file;
        this.filePurpose = filePurpose;
        this.metadata = metadata;
    }
    
    public FileUploadRequestMultiPart(
            FileUploadRequestMultiPartFile file,
            FilePurpose filePurpose) {
        this(file, filePurpose, Optional.empty());
    }

    /**
     * The file to be added. Valid types are `csv`, `png`, `jpeg`, `pdf`.
     */
    @JsonIgnore
    public FileUploadRequestMultiPartFile file() {
        return file;
    }

    /**
     * The file's purpose.
     */
    @JsonIgnore
    public FilePurpose filePurpose() {
        return filePurpose;
    }

    /**
     * Additional metadata to be stored with the file, formatted as a JSON string.
     * 
     * Valid keys are `representative_id`, `comment`, `requirement_id`, `error_code`.
     */
    @JsonIgnore
    public Optional<String> metadata() {
        return metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The file to be added. Valid types are `csv`, `png`, `jpeg`, `pdf`.
     */
    public FileUploadRequestMultiPart withFile(FileUploadRequestMultiPartFile file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
        return this;
    }

    /**
     * The file's purpose.
     */
    public FileUploadRequestMultiPart withFilePurpose(FilePurpose filePurpose) {
        Utils.checkNotNull(filePurpose, "filePurpose");
        this.filePurpose = filePurpose;
        return this;
    }

    /**
     * Additional metadata to be stored with the file, formatted as a JSON string.
     * 
     * Valid keys are `representative_id`, `comment`, `requirement_id`, `error_code`.
     */
    public FileUploadRequestMultiPart withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Additional metadata to be stored with the file, formatted as a JSON string.
     * 
     * Valid keys are `representative_id`, `comment`, `requirement_id`, `error_code`.
     */
    public FileUploadRequestMultiPart withMetadata(Optional<String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
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
        FileUploadRequestMultiPart other = (FileUploadRequestMultiPart) o;
        return 
            Objects.deepEquals(this.file, other.file) &&
            Objects.deepEquals(this.filePurpose, other.filePurpose) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            file,
            filePurpose,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FileUploadRequestMultiPart.class,
                "file", file,
                "filePurpose", filePurpose,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private FileUploadRequestMultiPartFile file;
 
        private FilePurpose filePurpose;
 
        private Optional<String> metadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The file to be added. Valid types are `csv`, `png`, `jpeg`, `pdf`.
         */
        public Builder file(FileUploadRequestMultiPartFile file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }

        /**
         * The file's purpose.
         */
        public Builder filePurpose(FilePurpose filePurpose) {
            Utils.checkNotNull(filePurpose, "filePurpose");
            this.filePurpose = filePurpose;
            return this;
        }

        /**
         * Additional metadata to be stored with the file, formatted as a JSON string.
         * 
         * Valid keys are `representative_id`, `comment`, `requirement_id`, `error_code`.
         */
        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * Additional metadata to be stored with the file, formatted as a JSON string.
         * 
         * Valid keys are `representative_id`, `comment`, `requirement_id`, `error_code`.
         */
        public Builder metadata(Optional<String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public FileUploadRequestMultiPart build() {
            return new FileUploadRequestMultiPart(
                file,
                filePurpose,
                metadata);
        }
    }
}

