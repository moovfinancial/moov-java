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
import java.util.Objects;
import java.util.Optional;

public class EnrichedBusinessProfile {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends Address> address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("industryCodes")
    private Optional<? extends EnrichedIndustryCodes> industryCodes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("legalBusinessName")
    private Optional<String> legalBusinessName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private Optional<? extends PhoneNumber> phone;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("website")
    private Optional<String> website;

    @JsonCreator
    public EnrichedBusinessProfile(
            @JsonProperty("address") Optional<? extends Address> address,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("industryCodes") Optional<? extends EnrichedIndustryCodes> industryCodes,
            @JsonProperty("legalBusinessName") Optional<String> legalBusinessName,
            @JsonProperty("phone") Optional<? extends PhoneNumber> phone,
            @JsonProperty("website") Optional<String> website) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(industryCodes, "industryCodes");
        Utils.checkNotNull(legalBusinessName, "legalBusinessName");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(website, "website");
        this.address = address;
        this.email = email;
        this.industryCodes = industryCodes;
        this.legalBusinessName = legalBusinessName;
        this.phone = phone;
        this.website = website;
    }
    
    public EnrichedBusinessProfile() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Address> address() {
        return (Optional<Address>) address;
    }

    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EnrichedIndustryCodes> industryCodes() {
        return (Optional<EnrichedIndustryCodes>) industryCodes;
    }

    @JsonIgnore
    public Optional<String> legalBusinessName() {
        return legalBusinessName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PhoneNumber> phone() {
        return (Optional<PhoneNumber>) phone;
    }

    @JsonIgnore
    public Optional<String> website() {
        return website;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EnrichedBusinessProfile withAddress(Address address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public EnrichedBusinessProfile withAddress(Optional<? extends Address> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public EnrichedBusinessProfile withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public EnrichedBusinessProfile withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public EnrichedBusinessProfile withIndustryCodes(EnrichedIndustryCodes industryCodes) {
        Utils.checkNotNull(industryCodes, "industryCodes");
        this.industryCodes = Optional.ofNullable(industryCodes);
        return this;
    }

    public EnrichedBusinessProfile withIndustryCodes(Optional<? extends EnrichedIndustryCodes> industryCodes) {
        Utils.checkNotNull(industryCodes, "industryCodes");
        this.industryCodes = industryCodes;
        return this;
    }

    public EnrichedBusinessProfile withLegalBusinessName(String legalBusinessName) {
        Utils.checkNotNull(legalBusinessName, "legalBusinessName");
        this.legalBusinessName = Optional.ofNullable(legalBusinessName);
        return this;
    }

    public EnrichedBusinessProfile withLegalBusinessName(Optional<String> legalBusinessName) {
        Utils.checkNotNull(legalBusinessName, "legalBusinessName");
        this.legalBusinessName = legalBusinessName;
        return this;
    }

    public EnrichedBusinessProfile withPhone(PhoneNumber phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = Optional.ofNullable(phone);
        return this;
    }

    public EnrichedBusinessProfile withPhone(Optional<? extends PhoneNumber> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    public EnrichedBusinessProfile withWebsite(String website) {
        Utils.checkNotNull(website, "website");
        this.website = Optional.ofNullable(website);
        return this;
    }

    public EnrichedBusinessProfile withWebsite(Optional<String> website) {
        Utils.checkNotNull(website, "website");
        this.website = website;
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
        EnrichedBusinessProfile other = (EnrichedBusinessProfile) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.industryCodes, other.industryCodes) &&
            Objects.deepEquals(this.legalBusinessName, other.legalBusinessName) &&
            Objects.deepEquals(this.phone, other.phone) &&
            Objects.deepEquals(this.website, other.website);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            email,
            industryCodes,
            legalBusinessName,
            phone,
            website);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EnrichedBusinessProfile.class,
                "address", address,
                "email", email,
                "industryCodes", industryCodes,
                "legalBusinessName", legalBusinessName,
                "phone", phone,
                "website", website);
    }
    
    public final static class Builder {
 
        private Optional<? extends Address> address = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private Optional<? extends EnrichedIndustryCodes> industryCodes = Optional.empty();
 
        private Optional<String> legalBusinessName = Optional.empty();
 
        private Optional<? extends PhoneNumber> phone = Optional.empty();
 
        private Optional<String> website = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address(Address address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends Address> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder industryCodes(EnrichedIndustryCodes industryCodes) {
            Utils.checkNotNull(industryCodes, "industryCodes");
            this.industryCodes = Optional.ofNullable(industryCodes);
            return this;
        }

        public Builder industryCodes(Optional<? extends EnrichedIndustryCodes> industryCodes) {
            Utils.checkNotNull(industryCodes, "industryCodes");
            this.industryCodes = industryCodes;
            return this;
        }

        public Builder legalBusinessName(String legalBusinessName) {
            Utils.checkNotNull(legalBusinessName, "legalBusinessName");
            this.legalBusinessName = Optional.ofNullable(legalBusinessName);
            return this;
        }

        public Builder legalBusinessName(Optional<String> legalBusinessName) {
            Utils.checkNotNull(legalBusinessName, "legalBusinessName");
            this.legalBusinessName = legalBusinessName;
            return this;
        }

        public Builder phone(PhoneNumber phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = Optional.ofNullable(phone);
            return this;
        }

        public Builder phone(Optional<? extends PhoneNumber> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }

        public Builder website(String website) {
            Utils.checkNotNull(website, "website");
            this.website = Optional.ofNullable(website);
            return this;
        }

        public Builder website(Optional<String> website) {
            Utils.checkNotNull(website, "website");
            this.website = website;
            return this;
        }
        
        public EnrichedBusinessProfile build() {
            return new EnrichedBusinessProfile(
                address,
                email,
                industryCodes,
                legalBusinessName,
                phone,
                website);
        }
    }
}

