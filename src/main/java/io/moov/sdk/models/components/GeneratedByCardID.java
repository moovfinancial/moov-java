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


public class GeneratedByCardID {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("CardID")
    private Optional<String> cardID;

    @JsonCreator
    public GeneratedByCardID(
            @JsonProperty("CardID") Optional<String> cardID) {
        Utils.checkNotNull(cardID, "cardID");
        this.cardID = cardID;
    }
    
    public GeneratedByCardID() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> cardID() {
        return cardID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GeneratedByCardID withCardID(String cardID) {
        Utils.checkNotNull(cardID, "cardID");
        this.cardID = Optional.ofNullable(cardID);
        return this;
    }

    public GeneratedByCardID withCardID(Optional<String> cardID) {
        Utils.checkNotNull(cardID, "cardID");
        this.cardID = cardID;
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
        GeneratedByCardID other = (GeneratedByCardID) o;
        return 
            Objects.deepEquals(this.cardID, other.cardID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            cardID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GeneratedByCardID.class,
                "cardID", cardID);
    }
    
    public final static class Builder {
 
        private Optional<String> cardID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cardID(String cardID) {
            Utils.checkNotNull(cardID, "cardID");
            this.cardID = Optional.ofNullable(cardID);
            return this;
        }

        public Builder cardID(Optional<String> cardID) {
            Utils.checkNotNull(cardID, "cardID");
            this.cardID = cardID;
            return this;
        }
        
        public GeneratedByCardID build() {
            return new GeneratedByCardID(
                cardID);
        }
    }
}

