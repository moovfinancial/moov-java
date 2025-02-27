/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.errors;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.models.components.CreateAuthorizedUserError;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
@SuppressWarnings("serial")
public class UpdateIssuedCardError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<String> state;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memo")
    private Optional<String> memo;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorizedUser")
    private Optional<? extends CreateAuthorizedUserError> authorizedUser;

    @JsonCreator
    public UpdateIssuedCardError(
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("memo") Optional<String> memo,
            @JsonProperty("authorizedUser") Optional<? extends CreateAuthorizedUserError> authorizedUser) {
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(memo, "memo");
        Utils.checkNotNull(authorizedUser, "authorizedUser");
        this.state = state;
        this.memo = memo;
        this.authorizedUser = authorizedUser;
    }
    
    public UpdateIssuedCardError() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    public Optional<String> state(){
        return state;
    }

    public Optional<String> memo(){
        return memo;
    }

    @SuppressWarnings("unchecked")
    public Optional<CreateAuthorizedUserError> authorizedUser(){
        return (Optional<CreateAuthorizedUserError>) authorizedUser;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public UpdateIssuedCardError withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }
    
    public UpdateIssuedCardError withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public UpdateIssuedCardError withMemo(String memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = Optional.ofNullable(memo);
        return this;
    }
    
    public UpdateIssuedCardError withMemo(Optional<String> memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = memo;
        return this;
    }

    public UpdateIssuedCardError withAuthorizedUser(CreateAuthorizedUserError authorizedUser) {
        Utils.checkNotNull(authorizedUser, "authorizedUser");
        this.authorizedUser = Optional.ofNullable(authorizedUser);
        return this;
    }
    
    public UpdateIssuedCardError withAuthorizedUser(Optional<? extends CreateAuthorizedUserError> authorizedUser) {
        Utils.checkNotNull(authorizedUser, "authorizedUser");
        this.authorizedUser = authorizedUser;
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
        UpdateIssuedCardError other = (UpdateIssuedCardError) o;
        return
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.memo, other.memo) &&
            Objects.deepEquals(this.authorizedUser, other.authorizedUser);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            state,
            memo,
            authorizedUser);
    }

    @Override
    public String toString() {
        return Utils.toString(UpdateIssuedCardError.class,
                "state", state,
                "memo", memo,
                "authorizedUser", authorizedUser);
    }

    public final static class Builder {

        private Optional<String> state = Optional.empty();

        private Optional<String> memo = Optional.empty();

        private Optional<? extends CreateAuthorizedUserError> authorizedUser = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }
        
        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        public Builder memo(String memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = Optional.ofNullable(memo);
            return this;
        }
        
        public Builder memo(Optional<String> memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = memo;
            return this;
        }

        public Builder authorizedUser(CreateAuthorizedUserError authorizedUser) {
            Utils.checkNotNull(authorizedUser, "authorizedUser");
            this.authorizedUser = Optional.ofNullable(authorizedUser);
            return this;
        }
        
        public Builder authorizedUser(Optional<? extends CreateAuthorizedUserError> authorizedUser) {
            Utils.checkNotNull(authorizedUser, "authorizedUser");
            this.authorizedUser = authorizedUser;
            return this;
        }

        public UpdateIssuedCardError build() {
            return new UpdateIssuedCardError(
                state,
                memo,
                authorizedUser);
        }
    }
}
