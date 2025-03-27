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
/**
 * FileDetails
 * 
 * <p>Describes a file linked to a Moov account.
 */

public class FileDetails {

    @JsonProperty("fileID")
    private String fileID;

    @JsonProperty("fileName")
    private String fileName;

    @JsonProperty("accountID")
    private String accountID;

    /**
     * The file's purpose.
     */
    @JsonProperty("filePurpose")
    private FilePurpose filePurpose;

    /**
     * The file's status.
     */
    @JsonProperty("fileStatus")
    private FileStatus fileStatus;

    @JsonProperty("metadata")
    private String metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("decisionReason")
    private Optional<String> decisionReason;

    @JsonProperty("fileSizeBytes")
    private long fileSizeBytes;

    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;

    @JsonProperty("updatedOn")
    private OffsetDateTime updatedOn;

    @JsonCreator
    public FileDetails(
            @JsonProperty("fileID") String fileID,
            @JsonProperty("fileName") String fileName,
            @JsonProperty("accountID") String accountID,
            @JsonProperty("filePurpose") FilePurpose filePurpose,
            @JsonProperty("fileStatus") FileStatus fileStatus,
            @JsonProperty("metadata") String metadata,
            @JsonProperty("decisionReason") Optional<String> decisionReason,
            @JsonProperty("fileSizeBytes") long fileSizeBytes,
            @JsonProperty("createdOn") OffsetDateTime createdOn,
            @JsonProperty("updatedOn") OffsetDateTime updatedOn) {
        Utils.checkNotNull(fileID, "fileID");
        Utils.checkNotNull(fileName, "fileName");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(filePurpose, "filePurpose");
        Utils.checkNotNull(fileStatus, "fileStatus");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(decisionReason, "decisionReason");
        Utils.checkNotNull(fileSizeBytes, "fileSizeBytes");
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(updatedOn, "updatedOn");
        this.fileID = fileID;
        this.fileName = fileName;
        this.accountID = accountID;
        this.filePurpose = filePurpose;
        this.fileStatus = fileStatus;
        this.metadata = metadata;
        this.decisionReason = decisionReason;
        this.fileSizeBytes = fileSizeBytes;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }
    
    public FileDetails(
            String fileID,
            String fileName,
            String accountID,
            FilePurpose filePurpose,
            FileStatus fileStatus,
            String metadata,
            long fileSizeBytes,
            OffsetDateTime createdOn,
            OffsetDateTime updatedOn) {
        this(fileID, fileName, accountID, filePurpose, fileStatus, metadata, Optional.empty(), fileSizeBytes, createdOn, updatedOn);
    }

    @JsonIgnore
    public String fileID() {
        return fileID;
    }

    @JsonIgnore
    public String fileName() {
        return fileName;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    /**
     * The file's purpose.
     */
    @JsonIgnore
    public FilePurpose filePurpose() {
        return filePurpose;
    }

    /**
     * The file's status.
     */
    @JsonIgnore
    public FileStatus fileStatus() {
        return fileStatus;
    }

    @JsonIgnore
    public String metadata() {
        return metadata;
    }

    @JsonIgnore
    public Optional<String> decisionReason() {
        return decisionReason;
    }

    @JsonIgnore
    public long fileSizeBytes() {
        return fileSizeBytes;
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

    public FileDetails withFileID(String fileID) {
        Utils.checkNotNull(fileID, "fileID");
        this.fileID = fileID;
        return this;
    }

    public FileDetails withFileName(String fileName) {
        Utils.checkNotNull(fileName, "fileName");
        this.fileName = fileName;
        return this;
    }

    public FileDetails withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * The file's purpose.
     */
    public FileDetails withFilePurpose(FilePurpose filePurpose) {
        Utils.checkNotNull(filePurpose, "filePurpose");
        this.filePurpose = filePurpose;
        return this;
    }

    /**
     * The file's status.
     */
    public FileDetails withFileStatus(FileStatus fileStatus) {
        Utils.checkNotNull(fileStatus, "fileStatus");
        this.fileStatus = fileStatus;
        return this;
    }

    public FileDetails withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public FileDetails withDecisionReason(String decisionReason) {
        Utils.checkNotNull(decisionReason, "decisionReason");
        this.decisionReason = Optional.ofNullable(decisionReason);
        return this;
    }

    public FileDetails withDecisionReason(Optional<String> decisionReason) {
        Utils.checkNotNull(decisionReason, "decisionReason");
        this.decisionReason = decisionReason;
        return this;
    }

    public FileDetails withFileSizeBytes(long fileSizeBytes) {
        Utils.checkNotNull(fileSizeBytes, "fileSizeBytes");
        this.fileSizeBytes = fileSizeBytes;
        return this;
    }

    public FileDetails withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    public FileDetails withUpdatedOn(OffsetDateTime updatedOn) {
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
        FileDetails other = (FileDetails) o;
        return 
            Objects.deepEquals(this.fileID, other.fileID) &&
            Objects.deepEquals(this.fileName, other.fileName) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.filePurpose, other.filePurpose) &&
            Objects.deepEquals(this.fileStatus, other.fileStatus) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.decisionReason, other.decisionReason) &&
            Objects.deepEquals(this.fileSizeBytes, other.fileSizeBytes) &&
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.updatedOn, other.updatedOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fileID,
            fileName,
            accountID,
            filePurpose,
            fileStatus,
            metadata,
            decisionReason,
            fileSizeBytes,
            createdOn,
            updatedOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FileDetails.class,
                "fileID", fileID,
                "fileName", fileName,
                "accountID", accountID,
                "filePurpose", filePurpose,
                "fileStatus", fileStatus,
                "metadata", metadata,
                "decisionReason", decisionReason,
                "fileSizeBytes", fileSizeBytes,
                "createdOn", createdOn,
                "updatedOn", updatedOn);
    }
    
    public final static class Builder {
 
        private String fileID;
 
        private String fileName;
 
        private String accountID;
 
        private FilePurpose filePurpose;
 
        private FileStatus fileStatus;
 
        private String metadata;
 
        private Optional<String> decisionReason = Optional.empty();
 
        private Long fileSizeBytes;
 
        private OffsetDateTime createdOn;
 
        private OffsetDateTime updatedOn;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fileID(String fileID) {
            Utils.checkNotNull(fileID, "fileID");
            this.fileID = fileID;
            return this;
        }

        public Builder fileName(String fileName) {
            Utils.checkNotNull(fileName, "fileName");
            this.fileName = fileName;
            return this;
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
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
         * The file's status.
         */
        public Builder fileStatus(FileStatus fileStatus) {
            Utils.checkNotNull(fileStatus, "fileStatus");
            this.fileStatus = fileStatus;
            return this;
        }

        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder decisionReason(String decisionReason) {
            Utils.checkNotNull(decisionReason, "decisionReason");
            this.decisionReason = Optional.ofNullable(decisionReason);
            return this;
        }

        public Builder decisionReason(Optional<String> decisionReason) {
            Utils.checkNotNull(decisionReason, "decisionReason");
            this.decisionReason = decisionReason;
            return this;
        }

        public Builder fileSizeBytes(long fileSizeBytes) {
            Utils.checkNotNull(fileSizeBytes, "fileSizeBytes");
            this.fileSizeBytes = fileSizeBytes;
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
        
        public FileDetails build() {
            return new FileDetails(
                fileID,
                fileName,
                accountID,
                filePurpose,
                fileStatus,
                metadata,
                decisionReason,
                fileSizeBytes,
                createdOn,
                updatedOn);
        }
    }
}

