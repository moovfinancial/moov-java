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

public class CreateBusinessProfile {

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
     * An EIN (employer identification number) for the business. For sole proprietors, an SSN can be used as the EIN.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxID")
    private Optional<? extends TaxID> taxID;

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
    public CreateBusinessProfile(
            @JsonProperty("legalBusinessName") String legalBusinessName,
            @JsonProperty("doingBusinessAs") Optional<String> doingBusinessAs,
            @JsonProperty("businessType") Optional<? extends BusinessType> businessType,
            @JsonProperty("address") Optional<? extends Address> address,
            @JsonProperty("phone") Optional<? extends PhoneNumber> phone,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("website") Optional<String> website,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("taxID") Optional<? extends TaxID> taxID,
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
        Utils.checkNotNull(taxID, "taxID");
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
        this.taxID = taxID;
        this.industryCodes = industryCodes;
        this.primaryRegulator = primaryRegulator;
    }
    
    public CreateBusinessProfile(
            String legalBusinessName) {
        this(legalBusinessName, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
     * An EIN (employer identification number) for the business. For sole proprietors, an SSN can be used as the EIN.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaxID> taxID() {
        return (Optional<TaxID>) taxID;
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
    public CreateBusinessProfile withLegalBusinessName(String legalBusinessName) {
        Utils.checkNotNull(legalBusinessName, "legalBusinessName");
        this.legalBusinessName = legalBusinessName;
        return this;
    }

    /**
     * A registered trade name under which the business operates, if different from its legal name.
     */
    public CreateBusinessProfile withDoingBusinessAs(String doingBusinessAs) {
        Utils.checkNotNull(doingBusinessAs, "doingBusinessAs");
        this.doingBusinessAs = Optional.ofNullable(doingBusinessAs);
        return this;
    }

    /**
     * A registered trade name under which the business operates, if different from its legal name.
     */
    public CreateBusinessProfile withDoingBusinessAs(Optional<String> doingBusinessAs) {
        Utils.checkNotNull(doingBusinessAs, "doingBusinessAs");
        this.doingBusinessAs = doingBusinessAs;
        return this;
    }

    /**
     * The type of entity represented by this business.
     */
    public CreateBusinessProfile withBusinessType(BusinessType businessType) {
        Utils.checkNotNull(businessType, "businessType");
        this.businessType = Optional.ofNullable(businessType);
        return this;
    }

    /**
     * The type of entity represented by this business.
     */
    public CreateBusinessProfile withBusinessType(Optional<? extends BusinessType> businessType) {
        Utils.checkNotNull(businessType, "businessType");
        this.businessType = businessType;
        return this;
    }

    public CreateBusinessProfile withAddress(Address address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public CreateBusinessProfile withAddress(Optional<? extends Address> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public CreateBusinessProfile withPhone(PhoneNumber phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = Optional.ofNullable(phone);
        return this;
    }

    public CreateBusinessProfile withPhone(Optional<? extends PhoneNumber> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    public CreateBusinessProfile withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public CreateBusinessProfile withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public CreateBusinessProfile withWebsite(String website) {
        Utils.checkNotNull(website, "website");
        this.website = Optional.ofNullable(website);
        return this;
    }

    public CreateBusinessProfile withWebsite(Optional<String> website) {
        Utils.checkNotNull(website, "website");
        this.website = website;
        return this;
    }

    public CreateBusinessProfile withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public CreateBusinessProfile withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * An EIN (employer identification number) for the business. For sole proprietors, an SSN can be used as the EIN.
     */
    public CreateBusinessProfile withTaxID(TaxID taxID) {
        Utils.checkNotNull(taxID, "taxID");
        this.taxID = Optional.ofNullable(taxID);
        return this;
    }

    /**
     * An EIN (employer identification number) for the business. For sole proprietors, an SSN can be used as the EIN.
     */
    public CreateBusinessProfile withTaxID(Optional<? extends TaxID> taxID) {
        Utils.checkNotNull(taxID, "taxID");
        this.taxID = taxID;
        return this;
    }

    public CreateBusinessProfile withIndustryCodes(IndustryCodes industryCodes) {
        Utils.checkNotNull(industryCodes, "industryCodes");
        this.industryCodes = Optional.ofNullable(industryCodes);
        return this;
    }

    public CreateBusinessProfile withIndustryCodes(Optional<? extends IndustryCodes> industryCodes) {
        Utils.checkNotNull(industryCodes, "industryCodes");
        this.industryCodes = industryCodes;
        return this;
    }

    /**
     * If the business is a financial institution, this field describes its primary regulator.
     */
    public CreateBusinessProfile withPrimaryRegulator(PrimaryRegulator primaryRegulator) {
        Utils.checkNotNull(primaryRegulator, "primaryRegulator");
        this.primaryRegulator = Optional.ofNullable(primaryRegulator);
        return this;
    }

    /**
     * If the business is a financial institution, this field describes its primary regulator.
     */
    public CreateBusinessProfile withPrimaryRegulator(Optional<? extends PrimaryRegulator> primaryRegulator) {
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
        CreateBusinessProfile other = (CreateBusinessProfile) o;
        return 
            Objects.deepEquals(this.legalBusinessName, other.legalBusinessName) &&
            Objects.deepEquals(this.doingBusinessAs, other.doingBusinessAs) &&
            Objects.deepEquals(this.businessType, other.businessType) &&
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.phone, other.phone) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.website, other.website) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.taxID, other.taxID) &&
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
            taxID,
            industryCodes,
            primaryRegulator);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBusinessProfile.class,
                "legalBusinessName", legalBusinessName,
                "doingBusinessAs", doingBusinessAs,
                "businessType", businessType,
                "address", address,
                "phone", phone,
                "email", email,
                "website", website,
                "description", description,
                "taxID", taxID,
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
 
        private Optional<? extends TaxID> taxID = Optional.empty();
 
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
         * An EIN (employer identification number) for the business. For sole proprietors, an SSN can be used as the EIN.
         */
        public Builder taxID(TaxID taxID) {
            Utils.checkNotNull(taxID, "taxID");
            this.taxID = Optional.ofNullable(taxID);
            return this;
        }

        /**
         * An EIN (employer identification number) for the business. For sole proprietors, an SSN can be used as the EIN.
         */
        public Builder taxID(Optional<? extends TaxID> taxID) {
            Utils.checkNotNull(taxID, "taxID");
            this.taxID = taxID;
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
        
        public CreateBusinessProfile build() {
            return new CreateBusinessProfile(
                legalBusinessName,
                doingBusinessAs,
                businessType,
                address,
                phone,
                email,
                website,
                description,
                taxID,
                industryCodes,
                primaryRegulator);
        }
    }
}

