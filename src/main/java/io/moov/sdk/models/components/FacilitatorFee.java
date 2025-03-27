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
import java.util.Objects;
import java.util.Optional;
/**
 * FacilitatorFee
 * 
 * <p>Total or markup fee.
 */

public class FacilitatorFee {

    /**
     * Total facilitator fee in cents. Only either `total` or `totalDecimal` can be set.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total")
    private Optional<Long> total;

    /**
     * Same as `total`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * 
     * <p>Only either `total` or `totalDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalDecimal")
    private Optional<String> totalDecimal;

    /**
     * Markup facilitator fee in cents. Only either `markup` or `markupDecimal` can be set.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("markup")
    private Optional<Long> markup;

    /**
     * Same as `markup`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * Only either `markup` or `markupDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("markupDecimal")
    private Optional<String> markupDecimal;

    @JsonCreator
    public FacilitatorFee(
            @JsonProperty("total") Optional<Long> total,
            @JsonProperty("totalDecimal") Optional<String> totalDecimal,
            @JsonProperty("markup") Optional<Long> markup,
            @JsonProperty("markupDecimal") Optional<String> markupDecimal) {
        Utils.checkNotNull(total, "total");
        Utils.checkNotNull(totalDecimal, "totalDecimal");
        Utils.checkNotNull(markup, "markup");
        Utils.checkNotNull(markupDecimal, "markupDecimal");
        this.total = total;
        this.totalDecimal = totalDecimal;
        this.markup = markup;
        this.markupDecimal = markupDecimal;
    }
    
    public FacilitatorFee() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Total facilitator fee in cents. Only either `total` or `totalDecimal` can be set.
     */
    @JsonIgnore
    public Optional<Long> total() {
        return total;
    }

    /**
     * Same as `total`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * 
     * <p>Only either `total` or `totalDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
     */
    @JsonIgnore
    public Optional<String> totalDecimal() {
        return totalDecimal;
    }

    /**
     * Markup facilitator fee in cents. Only either `markup` or `markupDecimal` can be set.
     */
    @JsonIgnore
    public Optional<Long> markup() {
        return markup;
    }

    /**
     * Same as `markup`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * Only either `markup` or `markupDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
     */
    @JsonIgnore
    public Optional<String> markupDecimal() {
        return markupDecimal;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Total facilitator fee in cents. Only either `total` or `totalDecimal` can be set.
     */
    public FacilitatorFee withTotal(long total) {
        Utils.checkNotNull(total, "total");
        this.total = Optional.ofNullable(total);
        return this;
    }

    /**
     * Total facilitator fee in cents. Only either `total` or `totalDecimal` can be set.
     */
    public FacilitatorFee withTotal(Optional<Long> total) {
        Utils.checkNotNull(total, "total");
        this.total = total;
        return this;
    }

    /**
     * Same as `total`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * 
     * <p>Only either `total` or `totalDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
     */
    public FacilitatorFee withTotalDecimal(String totalDecimal) {
        Utils.checkNotNull(totalDecimal, "totalDecimal");
        this.totalDecimal = Optional.ofNullable(totalDecimal);
        return this;
    }

    /**
     * Same as `total`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * 
     * <p>Only either `total` or `totalDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
     */
    public FacilitatorFee withTotalDecimal(Optional<String> totalDecimal) {
        Utils.checkNotNull(totalDecimal, "totalDecimal");
        this.totalDecimal = totalDecimal;
        return this;
    }

    /**
     * Markup facilitator fee in cents. Only either `markup` or `markupDecimal` can be set.
     */
    public FacilitatorFee withMarkup(long markup) {
        Utils.checkNotNull(markup, "markup");
        this.markup = Optional.ofNullable(markup);
        return this;
    }

    /**
     * Markup facilitator fee in cents. Only either `markup` or `markupDecimal` can be set.
     */
    public FacilitatorFee withMarkup(Optional<Long> markup) {
        Utils.checkNotNull(markup, "markup");
        this.markup = markup;
        return this;
    }

    /**
     * Same as `markup`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * Only either `markup` or `markupDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
     */
    public FacilitatorFee withMarkupDecimal(String markupDecimal) {
        Utils.checkNotNull(markupDecimal, "markupDecimal");
        this.markupDecimal = Optional.ofNullable(markupDecimal);
        return this;
    }

    /**
     * Same as `markup`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * Only either `markup` or `markupDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
     */
    public FacilitatorFee withMarkupDecimal(Optional<String> markupDecimal) {
        Utils.checkNotNull(markupDecimal, "markupDecimal");
        this.markupDecimal = markupDecimal;
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
        FacilitatorFee other = (FacilitatorFee) o;
        return 
            Objects.deepEquals(this.total, other.total) &&
            Objects.deepEquals(this.totalDecimal, other.totalDecimal) &&
            Objects.deepEquals(this.markup, other.markup) &&
            Objects.deepEquals(this.markupDecimal, other.markupDecimal);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            total,
            totalDecimal,
            markup,
            markupDecimal);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FacilitatorFee.class,
                "total", total,
                "totalDecimal", totalDecimal,
                "markup", markup,
                "markupDecimal", markupDecimal);
    }
    
    public final static class Builder {
 
        private Optional<Long> total = Optional.empty();
 
        private Optional<String> totalDecimal = Optional.empty();
 
        private Optional<Long> markup = Optional.empty();
 
        private Optional<String> markupDecimal = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Total facilitator fee in cents. Only either `total` or `totalDecimal` can be set.
         */
        public Builder total(long total) {
            Utils.checkNotNull(total, "total");
            this.total = Optional.ofNullable(total);
            return this;
        }

        /**
         * Total facilitator fee in cents. Only either `total` or `totalDecimal` can be set.
         */
        public Builder total(Optional<Long> total) {
            Utils.checkNotNull(total, "total");
            this.total = total;
            return this;
        }

        /**
         * Same as `total`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
         * 
         * <p>Only either `total` or `totalDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
         */
        public Builder totalDecimal(String totalDecimal) {
            Utils.checkNotNull(totalDecimal, "totalDecimal");
            this.totalDecimal = Optional.ofNullable(totalDecimal);
            return this;
        }

        /**
         * Same as `total`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
         * 
         * <p>Only either `total` or `totalDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
         */
        public Builder totalDecimal(Optional<String> totalDecimal) {
            Utils.checkNotNull(totalDecimal, "totalDecimal");
            this.totalDecimal = totalDecimal;
            return this;
        }

        /**
         * Markup facilitator fee in cents. Only either `markup` or `markupDecimal` can be set.
         */
        public Builder markup(long markup) {
            Utils.checkNotNull(markup, "markup");
            this.markup = Optional.ofNullable(markup);
            return this;
        }

        /**
         * Markup facilitator fee in cents. Only either `markup` or `markupDecimal` can be set.
         */
        public Builder markup(Optional<Long> markup) {
            Utils.checkNotNull(markup, "markup");
            this.markup = markup;
            return this;
        }

        /**
         * Same as `markup`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
         * Only either `markup` or `markupDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
         */
        public Builder markupDecimal(String markupDecimal) {
            Utils.checkNotNull(markupDecimal, "markupDecimal");
            this.markupDecimal = Optional.ofNullable(markupDecimal);
            return this;
        }

        /**
         * Same as `markup`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. 
         * Only either `markup` or `markupDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
         */
        public Builder markupDecimal(Optional<String> markupDecimal) {
            Utils.checkNotNull(markupDecimal, "markupDecimal");
            this.markupDecimal = markupDecimal;
            return this;
        }
        
        public FacilitatorFee build() {
            return new FacilitatorFee(
                total,
                totalDecimal,
                markup,
                markupDecimal);
        }
    }
}

