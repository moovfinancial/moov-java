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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class DisplayOptionsError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("callToAction")
    private Optional<String> callToAction;

    @JsonCreator
    public DisplayOptionsError(
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("callToAction") Optional<String> callToAction) {
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(callToAction, "callToAction");
        this.title = title;
        this.description = description;
        this.callToAction = callToAction;
    }
    
    public DisplayOptionsError() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<String> callToAction() {
        return callToAction;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DisplayOptionsError withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public DisplayOptionsError withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public DisplayOptionsError withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public DisplayOptionsError withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public DisplayOptionsError withCallToAction(String callToAction) {
        Utils.checkNotNull(callToAction, "callToAction");
        this.callToAction = Optional.ofNullable(callToAction);
        return this;
    }

    public DisplayOptionsError withCallToAction(Optional<String> callToAction) {
        Utils.checkNotNull(callToAction, "callToAction");
        this.callToAction = callToAction;
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
        DisplayOptionsError other = (DisplayOptionsError) o;
        return 
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.callToAction, other.callToAction);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            title,
            description,
            callToAction);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DisplayOptionsError.class,
                "title", title,
                "description", description,
                "callToAction", callToAction);
    }
    
    public final static class Builder {
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> callToAction = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder callToAction(String callToAction) {
            Utils.checkNotNull(callToAction, "callToAction");
            this.callToAction = Optional.ofNullable(callToAction);
            return this;
        }

        public Builder callToAction(Optional<String> callToAction) {
            Utils.checkNotNull(callToAction, "callToAction");
            this.callToAction = callToAction;
            return this;
        }
        
        public DisplayOptionsError build() {
            return new DisplayOptionsError(
                title,
                description,
                callToAction);
        }
    }
}

