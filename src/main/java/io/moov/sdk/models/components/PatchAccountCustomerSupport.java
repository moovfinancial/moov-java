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
/**
 * PatchAccountCustomerSupport
 * 
 * <p>User-provided information that can be displayed on credit card transactions for customers to use when
 * contacting a customer support team. This data is only allowed on a business account.
 */

public class PatchAccountCustomerSupport {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private Optional<? extends PhoneNumber> phone;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends AddressUpdate> address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("website")
    private Optional<String> website;

    @JsonCreator
    public PatchAccountCustomerSupport(
            @JsonProperty("phone") Optional<? extends PhoneNumber> phone,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("address") Optional<? extends AddressUpdate> address,
            @JsonProperty("website") Optional<String> website) {
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(website, "website");
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.website = website;
    }
    
    public PatchAccountCustomerSupport() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AddressUpdate> address() {
        return (Optional<AddressUpdate>) address;
    }

    @JsonIgnore
    public Optional<String> website() {
        return website;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchAccountCustomerSupport withPhone(PhoneNumber phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = Optional.ofNullable(phone);
        return this;
    }

    public PatchAccountCustomerSupport withPhone(Optional<? extends PhoneNumber> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    public PatchAccountCustomerSupport withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public PatchAccountCustomerSupport withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public PatchAccountCustomerSupport withAddress(AddressUpdate address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public PatchAccountCustomerSupport withAddress(Optional<? extends AddressUpdate> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public PatchAccountCustomerSupport withWebsite(String website) {
        Utils.checkNotNull(website, "website");
        this.website = Optional.ofNullable(website);
        return this;
    }

    public PatchAccountCustomerSupport withWebsite(Optional<String> website) {
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
        PatchAccountCustomerSupport other = (PatchAccountCustomerSupport) o;
        return 
            Objects.deepEquals(this.phone, other.phone) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.website, other.website);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            phone,
            email,
            address,
            website);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchAccountCustomerSupport.class,
                "phone", phone,
                "email", email,
                "address", address,
                "website", website);
    }
    
    public final static class Builder {
 
        private Optional<? extends PhoneNumber> phone = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private Optional<? extends AddressUpdate> address = Optional.empty();
 
        private Optional<String> website = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder address(AddressUpdate address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends AddressUpdate> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
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
        
        public PatchAccountCustomerSupport build() {
            return new PatchAccountCustomerSupport(
                phone,
                email,
                address,
                website);
        }
    }
}

