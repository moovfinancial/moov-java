/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class File {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filename")
    private Optional<String> filename;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mimeType")
    private Optional<String> mimeType;

    @JsonCreator
    public File(
            @JsonProperty("filename") Optional<String> filename,
            @JsonProperty("mimeType") Optional<String> mimeType) {
        Utils.checkNotNull(filename, "filename");
        Utils.checkNotNull(mimeType, "mimeType");
        this.filename = filename;
        this.mimeType = mimeType;
    }
    
    public File() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> filename() {
        return filename;
    }

    @JsonIgnore
    public Optional<String> mimeType() {
        return mimeType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public File withFilename(String filename) {
        Utils.checkNotNull(filename, "filename");
        this.filename = Optional.ofNullable(filename);
        return this;
    }

    public File withFilename(Optional<String> filename) {
        Utils.checkNotNull(filename, "filename");
        this.filename = filename;
        return this;
    }

    public File withMimeType(String mimeType) {
        Utils.checkNotNull(mimeType, "mimeType");
        this.mimeType = Optional.ofNullable(mimeType);
        return this;
    }

    public File withMimeType(Optional<String> mimeType) {
        Utils.checkNotNull(mimeType, "mimeType");
        this.mimeType = mimeType;
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
        File other = (File) o;
        return 
            Objects.deepEquals(this.filename, other.filename) &&
            Objects.deepEquals(this.mimeType, other.mimeType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            filename,
            mimeType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(File.class,
                "filename", filename,
                "mimeType", mimeType);
    }
    
    public final static class Builder {
 
        private Optional<String> filename = Optional.empty();
 
        private Optional<String> mimeType = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder filename(String filename) {
            Utils.checkNotNull(filename, "filename");
            this.filename = Optional.ofNullable(filename);
            return this;
        }

        public Builder filename(Optional<String> filename) {
            Utils.checkNotNull(filename, "filename");
            this.filename = filename;
            return this;
        }

        public Builder mimeType(String mimeType) {
            Utils.checkNotNull(mimeType, "mimeType");
            this.mimeType = Optional.ofNullable(mimeType);
            return this;
        }

        public Builder mimeType(Optional<String> mimeType) {
            Utils.checkNotNull(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }
        
        public File build() {
            return new File(
                filename,
                mimeType);
        }
    }
}
