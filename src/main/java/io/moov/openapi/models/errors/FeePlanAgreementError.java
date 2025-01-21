/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

@SuppressWarnings("serial")
public class FeePlanAgreementError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("planID")
    private Optional<String> planID;

    @JsonCreator
    public FeePlanAgreementError(
            @JsonProperty("planID") Optional<String> planID) {
        Utils.checkNotNull(planID, "planID");
        this.planID = planID;
    }
    
    public FeePlanAgreementError() {
        this(Optional.empty());
    }

    public Optional<String> planID(){
        return planID;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public FeePlanAgreementError withPlanID(String planID) {
        Utils.checkNotNull(planID, "planID");
        this.planID = Optional.ofNullable(planID);
        return this;
    }
    
    public FeePlanAgreementError withPlanID(Optional<String> planID) {
        Utils.checkNotNull(planID, "planID");
        this.planID = planID;
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
        FeePlanAgreementError other = (FeePlanAgreementError) o;
        return
            Objects.deepEquals(this.planID, other.planID);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            planID);
    }

    @Override
    public String toString() {
        return Utils.toString(FeePlanAgreementError.class,
                "planID", planID);
    }

    public final static class Builder {

        private Optional<String> planID = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder planID(String planID) {
            Utils.checkNotNull(planID, "planID");
            this.planID = Optional.ofNullable(planID);
            return this;
        }
        
        public Builder planID(Optional<String> planID) {
            Utils.checkNotNull(planID, "planID");
            this.planID = planID;
            return this;
        }

        public FeePlanAgreementError build() {
            return new FeePlanAgreementError(
                planID);
        }
    }
}
