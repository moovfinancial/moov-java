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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * BusinessProfile
 * 
 * <p>Describes a business.
 */
public class BusinessProfile {

    /**
     * The legal name under which the entity is registered.
     */
    @JsonProperty("legalBusinessName")
    private String legalBusinessName;

    /**
     * A registered trade name under which the business operates, if different from its legal name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("doingBusinessAs")
    private Optional<String> doingBusinessAs;

    /**
     * The type of entity represented by this business.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("businessType")
    private Optional<? extends BusinessType> businessType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends Address> address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private Optional<? extends PhoneNumber> phone;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("website")
    private Optional<String> website;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    /**
     * Indicates whether a tax ID has been provided for this business.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxIDProvided")
    private Optional<Boolean> taxIDProvided;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("representatives")
    private Optional<? extends List<Representative>> representatives;

    @JsonProperty("ownersProvided")
    private boolean ownersProvided;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("industryCodes")
    private Optional<? extends IndustryCodes> industryCodes;

    /**
     * If the business is a financial institution, this field describes its primary regulator.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primaryRegulator")
    private Optional<? extends PrimaryRegulator> primaryRegulator;

    @JsonCreator
    public BusinessProfile(
            @JsonProperty("legalBusinessName") String legalBusinessName,
            @JsonProperty("doingBusinessAs") Optional<String> doingBusinessAs,
            @JsonProperty("businessType") Optional<? extends BusinessType> businessType,
            @JsonProperty("address") Optional<? extends Address> address,
            @JsonProperty("phone") Optional<? extends PhoneNumber> phone,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("website") Optional<String> website,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("taxIDProvided") Optional<Boolean> taxIDProvided,
            @JsonProperty("representatives") Optional<? extends List<Representative>> representatives,
            @JsonProperty("ownersProvided") boolean ownersProvided,
            @JsonProperty("industryCodes") Optional<? extends IndustryCodes> industryCodes,
            @JsonProperty("primaryRegulator") Optional<? extends PrimaryRegulator> primaryRegulator) {
        Utils.checkNotNull(legalBusinessName, "legalBusinessName");
        Utils.checkNotNull(doingBusinessAs, "doingBusinessAs");
        Utils.checkNotNull(businessType, "businessType");
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(website, "website");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(taxIDProvided, "taxIDProvided");
        Utils.checkNotNull(representatives, "representatives");
        Utils.checkNotNull(ownersProvided, "ownersProvided");
        Utils.checkNotNull(industryCodes, "industryCodes");
        Utils.checkNotNull(primaryRegulator, "primaryRegulator");
        this.legalBusinessName = legalBusinessName;
        this.doingBusinessAs = doingBusinessAs;
        this.businessType = businessType;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.description = description;
        this.taxIDProvided = taxIDProvided;
        this.representatives = representatives;
        this.ownersProvided = ownersProvided;
        this.industryCodes = industryCodes;
        this.primaryRegulator = primaryRegulator;
    }
    
    public BusinessProfile(
            String legalBusinessName,
            boolean ownersProvided) {
        this(legalBusinessName, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), ownersProvided, Optional.empty(), Optional.empty());
    }

    /**
     * The legal name under which the entity is registered.
     */
    @JsonIgnore
    public String legalBusinessName() {
        return legalBusinessName;
    }

    /**
     * A registered trade name under which the business operates, if different from its legal name.
     */
    @JsonIgnore
    public Optional<String> doingBusinessAs() {
        return doingBusinessAs;
    }

    /**
     * The type of entity represented by this business.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BusinessType> businessType() {
        return (Optional<BusinessType>) businessType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Address> address() {
        return (Optional<Address>) address;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PhoneNumber> phone() {
        return (Optional<PhoneNumber>) phone;
    }

    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @JsonIgnore
    public Optional<String> website() {
        return website;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * Indicates whether a tax ID has been provided for this business.
     */
    @JsonIgnore
    public Optional<Boolean> taxIDProvided() {
        return taxIDProvided;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Representative>> representatives() {
        return (Optional<List<Representative>>) representatives;
    }

    @JsonIgnore
    public boolean ownersProvided() {
        return ownersProvided;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IndustryCodes> industryCodes() {
        return (Optional<IndustryCodes>) industryCodes;
    }

    /**
     * If the business is a financial institution, this field describes its primary regulator.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PrimaryRegulator> primaryRegulator() {
        return (Optional<PrimaryRegulator>) primaryRegulator;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The legal name under which the entity is registered.
     */
    public BusinessProfile withLegalBusinessName(String legalBusinessName) {
        Utils.checkNotNull(legalBusinessName, "legalBusinessName");
        this.legalBusinessName = legalBusinessName;
        return this;
    }

    /**
     * A registered trade name under which the business operates, if different from its legal name.
     */
    public BusinessProfile withDoingBusinessAs(String doingBusinessAs) {
        Utils.checkNotNull(doingBusinessAs, "doingBusinessAs");
        this.doingBusinessAs = Optional.ofNullable(doingBusinessAs);
        return this;
    }

    /**
     * A registered trade name under which the business operates, if different from its legal name.
     */
    public BusinessProfile withDoingBusinessAs(Optional<String> doingBusinessAs) {
        Utils.checkNotNull(doingBusinessAs, "doingBusinessAs");
        this.doingBusinessAs = doingBusinessAs;
        return this;
    }

    /**
     * The type of entity represented by this business.
     */
    public BusinessProfile withBusinessType(BusinessType businessType) {
        Utils.checkNotNull(businessType, "businessType");
        this.businessType = Optional.ofNullable(businessType);
        return this;
    }

    /**
     * The type of entity represented by this business.
     */
    public BusinessProfile withBusinessType(Optional<? extends BusinessType> businessType) {
        Utils.checkNotNull(businessType, "businessType");
        this.businessType = businessType;
        return this;
    }

    public BusinessProfile withAddress(Address address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public BusinessProfile withAddress(Optional<? extends Address> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public BusinessProfile withPhone(PhoneNumber phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = Optional.ofNullable(phone);
        return this;
    }

    public BusinessProfile withPhone(Optional<? extends PhoneNumber> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    public BusinessProfile withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public BusinessProfile withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public BusinessProfile withWebsite(String website) {
        Utils.checkNotNull(website, "website");
        this.website = Optional.ofNullable(website);
        return this;
    }

    public BusinessProfile withWebsite(Optional<String> website) {
        Utils.checkNotNull(website, "website");
        this.website = website;
        return this;
    }

    public BusinessProfile withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public BusinessProfile withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Indicates whether a tax ID has been provided for this business.
     */
    public BusinessProfile withTaxIDProvided(boolean taxIDProvided) {
        Utils.checkNotNull(taxIDProvided, "taxIDProvided");
        this.taxIDProvided = Optional.ofNullable(taxIDProvided);
        return this;
    }

    /**
     * Indicates whether a tax ID has been provided for this business.
     */
    public BusinessProfile withTaxIDProvided(Optional<Boolean> taxIDProvided) {
        Utils.checkNotNull(taxIDProvided, "taxIDProvided");
        this.taxIDProvided = taxIDProvided;
        return this;
    }

    public BusinessProfile withRepresentatives(List<Representative> representatives) {
        Utils.checkNotNull(representatives, "representatives");
        this.representatives = Optional.ofNullable(representatives);
        return this;
    }

    public BusinessProfile withRepresentatives(Optional<? extends List<Representative>> representatives) {
        Utils.checkNotNull(representatives, "representatives");
        this.representatives = representatives;
        return this;
    }

    public BusinessProfile withOwnersProvided(boolean ownersProvided) {
        Utils.checkNotNull(ownersProvided, "ownersProvided");
        this.ownersProvided = ownersProvided;
        return this;
    }

    public BusinessProfile withIndustryCodes(IndustryCodes industryCodes) {
        Utils.checkNotNull(industryCodes, "industryCodes");
        this.industryCodes = Optional.ofNullable(industryCodes);
        return this;
    }

    public BusinessProfile withIndustryCodes(Optional<? extends IndustryCodes> industryCodes) {
        Utils.checkNotNull(industryCodes, "industryCodes");
        this.industryCodes = industryCodes;
        return this;
    }

    /**
     * If the business is a financial institution, this field describes its primary regulator.
     */
    public BusinessProfile withPrimaryRegulator(PrimaryRegulator primaryRegulator) {
        Utils.checkNotNull(primaryRegulator, "primaryRegulator");
        this.primaryRegulator = Optional.ofNullable(primaryRegulator);
        return this;
    }

    /**
     * If the business is a financial institution, this field describes its primary regulator.
     */
    public BusinessProfile withPrimaryRegulator(Optional<? extends PrimaryRegulator> primaryRegulator) {
        Utils.checkNotNull(primaryRegulator, "primaryRegulator");
        this.primaryRegulator = primaryRegulator;
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
        BusinessProfile other = (BusinessProfile) o;
        return 
            Objects.deepEquals(this.legalBusinessName, other.legalBusinessName) &&
            Objects.deepEquals(this.doingBusinessAs, other.doingBusinessAs) &&
            Objects.deepEquals(this.businessType, other.businessType) &&
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.phone, other.phone) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.website, other.website) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.taxIDProvided, other.taxIDProvided) &&
            Objects.deepEquals(this.representatives, other.representatives) &&
            Objects.deepEquals(this.ownersProvided, other.ownersProvided) &&
            Objects.deepEquals(this.industryCodes, other.industryCodes) &&
            Objects.deepEquals(this.primaryRegulator, other.primaryRegulator);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            legalBusinessName,
            doingBusinessAs,
            businessType,
            address,
            phone,
            email,
            website,
            description,
            taxIDProvided,
            representatives,
            ownersProvided,
            industryCodes,
            primaryRegulator);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BusinessProfile.class,
                "legalBusinessName", legalBusinessName,
                "doingBusinessAs", doingBusinessAs,
                "businessType", businessType,
                "address", address,
                "phone", phone,
                "email", email,
                "website", website,
                "description", description,
                "taxIDProvided", taxIDProvided,
                "representatives", representatives,
                "ownersProvided", ownersProvided,
                "industryCodes", industryCodes,
                "primaryRegulator", primaryRegulator);
    }
    
    public final static class Builder {
 
        private String legalBusinessName;
 
        private Optional<String> doingBusinessAs = Optional.empty();
 
        private Optional<? extends BusinessType> businessType = Optional.empty();
 
        private Optional<? extends Address> address = Optional.empty();
 
        private Optional<? extends PhoneNumber> phone = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> website = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<Boolean> taxIDProvided = Optional.empty();
 
        private Optional<? extends List<Representative>> representatives = Optional.empty();
 
        private Boolean ownersProvided;
 
        private Optional<? extends IndustryCodes> industryCodes = Optional.empty();
 
        private Optional<? extends PrimaryRegulator> primaryRegulator = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The legal name under which the entity is registered.
         */
        public Builder legalBusinessName(String legalBusinessName) {
            Utils.checkNotNull(legalBusinessName, "legalBusinessName");
            this.legalBusinessName = legalBusinessName;
            return this;
        }

        /**
         * A registered trade name under which the business operates, if different from its legal name.
         */
        public Builder doingBusinessAs(String doingBusinessAs) {
            Utils.checkNotNull(doingBusinessAs, "doingBusinessAs");
            this.doingBusinessAs = Optional.ofNullable(doingBusinessAs);
            return this;
        }

        /**
         * A registered trade name under which the business operates, if different from its legal name.
         */
        public Builder doingBusinessAs(Optional<String> doingBusinessAs) {
            Utils.checkNotNull(doingBusinessAs, "doingBusinessAs");
            this.doingBusinessAs = doingBusinessAs;
            return this;
        }

        /**
         * The type of entity represented by this business.
         */
        public Builder businessType(BusinessType businessType) {
            Utils.checkNotNull(businessType, "businessType");
            this.businessType = Optional.ofNullable(businessType);
            return this;
        }

        /**
         * The type of entity represented by this business.
         */
        public Builder businessType(Optional<? extends BusinessType> businessType) {
            Utils.checkNotNull(businessType, "businessType");
            this.businessType = businessType;
            return this;
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

        /**
         * Indicates whether a tax ID has been provided for this business.
         */
        public Builder taxIDProvided(boolean taxIDProvided) {
            Utils.checkNotNull(taxIDProvided, "taxIDProvided");
            this.taxIDProvided = Optional.ofNullable(taxIDProvided);
            return this;
        }

        /**
         * Indicates whether a tax ID has been provided for this business.
         */
        public Builder taxIDProvided(Optional<Boolean> taxIDProvided) {
            Utils.checkNotNull(taxIDProvided, "taxIDProvided");
            this.taxIDProvided = taxIDProvided;
            return this;
        }

        public Builder representatives(List<Representative> representatives) {
            Utils.checkNotNull(representatives, "representatives");
            this.representatives = Optional.ofNullable(representatives);
            return this;
        }

        public Builder representatives(Optional<? extends List<Representative>> representatives) {
            Utils.checkNotNull(representatives, "representatives");
            this.representatives = representatives;
            return this;
        }

        public Builder ownersProvided(boolean ownersProvided) {
            Utils.checkNotNull(ownersProvided, "ownersProvided");
            this.ownersProvided = ownersProvided;
            return this;
        }

        public Builder industryCodes(IndustryCodes industryCodes) {
            Utils.checkNotNull(industryCodes, "industryCodes");
            this.industryCodes = Optional.ofNullable(industryCodes);
            return this;
        }

        public Builder industryCodes(Optional<? extends IndustryCodes> industryCodes) {
            Utils.checkNotNull(industryCodes, "industryCodes");
            this.industryCodes = industryCodes;
            return this;
        }

        /**
         * If the business is a financial institution, this field describes its primary regulator.
         */
        public Builder primaryRegulator(PrimaryRegulator primaryRegulator) {
            Utils.checkNotNull(primaryRegulator, "primaryRegulator");
            this.primaryRegulator = Optional.ofNullable(primaryRegulator);
            return this;
        }

        /**
         * If the business is a financial institution, this field describes its primary regulator.
         */
        public Builder primaryRegulator(Optional<? extends PrimaryRegulator> primaryRegulator) {
            Utils.checkNotNull(primaryRegulator, "primaryRegulator");
            this.primaryRegulator = primaryRegulator;
            return this;
        }
        
        public BusinessProfile build() {
            return new BusinessProfile(
                legalBusinessName,
                doingBusinessAs,
                businessType,
                address,
                phone,
                email,
                website,
                description,
                taxIDProvided,
                representatives,
                ownersProvided,
                industryCodes,
                primaryRegulator);
        }
    }
}
