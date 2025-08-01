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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Optional;


public class InstitutionsSearchResponse {

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("ach")
    private Optional<? extends List<ACHInstitution>> ach;


    @JsonInclude(Include.ALWAYS)
    @JsonProperty("rtp")
    private Optional<? extends List<RTPInstitution>> rtp;


    @JsonInclude(Include.ALWAYS)
    @JsonProperty("wire")
    private Optional<? extends List<WireInstitution>> wire;

    @JsonCreator
    public InstitutionsSearchResponse(
            @JsonProperty("ach") Optional<? extends List<ACHInstitution>> ach,
            @JsonProperty("rtp") Optional<? extends List<RTPInstitution>> rtp,
            @JsonProperty("wire") Optional<? extends List<WireInstitution>> wire) {
        Utils.checkNotNull(ach, "ach");
        Utils.checkNotNull(rtp, "rtp");
        Utils.checkNotNull(wire, "wire");
        this.ach = ach;
        this.rtp = rtp;
        this.wire = wire;
    }
    
    public InstitutionsSearchResponse() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ACHInstitution>> ach() {
        return (Optional<List<ACHInstitution>>) ach;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<RTPInstitution>> rtp() {
        return (Optional<List<RTPInstitution>>) rtp;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<WireInstitution>> wire() {
        return (Optional<List<WireInstitution>>) wire;
    }

    public static Builder builder() {
        return new Builder();
    }


    public InstitutionsSearchResponse withAch(List<ACHInstitution> ach) {
        Utils.checkNotNull(ach, "ach");
        this.ach = Optional.ofNullable(ach);
        return this;
    }


    public InstitutionsSearchResponse withAch(Optional<? extends List<ACHInstitution>> ach) {
        Utils.checkNotNull(ach, "ach");
        this.ach = ach;
        return this;
    }

    public InstitutionsSearchResponse withRtp(List<RTPInstitution> rtp) {
        Utils.checkNotNull(rtp, "rtp");
        this.rtp = Optional.ofNullable(rtp);
        return this;
    }


    public InstitutionsSearchResponse withRtp(Optional<? extends List<RTPInstitution>> rtp) {
        Utils.checkNotNull(rtp, "rtp");
        this.rtp = rtp;
        return this;
    }

    public InstitutionsSearchResponse withWire(List<WireInstitution> wire) {
        Utils.checkNotNull(wire, "wire");
        this.wire = Optional.ofNullable(wire);
        return this;
    }


    public InstitutionsSearchResponse withWire(Optional<? extends List<WireInstitution>> wire) {
        Utils.checkNotNull(wire, "wire");
        this.wire = wire;
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
        InstitutionsSearchResponse other = (InstitutionsSearchResponse) o;
        return 
            Utils.enhancedDeepEquals(this.ach, other.ach) &&
            Utils.enhancedDeepEquals(this.rtp, other.rtp) &&
            Utils.enhancedDeepEquals(this.wire, other.wire);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            ach, rtp, wire);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InstitutionsSearchResponse.class,
                "ach", ach,
                "rtp", rtp,
                "wire", wire);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends List<ACHInstitution>> ach = Optional.empty();

        private Optional<? extends List<RTPInstitution>> rtp = Optional.empty();

        private Optional<? extends List<WireInstitution>> wire = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder ach(List<ACHInstitution> ach) {
            Utils.checkNotNull(ach, "ach");
            this.ach = Optional.ofNullable(ach);
            return this;
        }

        public Builder ach(Optional<? extends List<ACHInstitution>> ach) {
            Utils.checkNotNull(ach, "ach");
            this.ach = ach;
            return this;
        }


        public Builder rtp(List<RTPInstitution> rtp) {
            Utils.checkNotNull(rtp, "rtp");
            this.rtp = Optional.ofNullable(rtp);
            return this;
        }

        public Builder rtp(Optional<? extends List<RTPInstitution>> rtp) {
            Utils.checkNotNull(rtp, "rtp");
            this.rtp = rtp;
            return this;
        }


        public Builder wire(List<WireInstitution> wire) {
            Utils.checkNotNull(wire, "wire");
            this.wire = Optional.ofNullable(wire);
            return this;
        }

        public Builder wire(Optional<? extends List<WireInstitution>> wire) {
            Utils.checkNotNull(wire, "wire");
            this.wire = wire;
            return this;
        }

        public InstitutionsSearchResponse build() {

            return new InstitutionsSearchResponse(
                ach, rtp, wire);
        }

    }
}
