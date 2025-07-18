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
import java.util.Optional;


public class WireInstitution {
    /**
     * Name of the financial institution.
     */
    @JsonProperty("name")
    private String name;


    @JsonProperty("routingNumber")
    private String routingNumber;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends Address> address;


    @JsonProperty("services")
    private WireServices services;

    @JsonCreator
    public WireInstitution(
            @JsonProperty("name") String name,
            @JsonProperty("routingNumber") String routingNumber,
            @JsonProperty("address") Optional<? extends Address> address,
            @JsonProperty("services") WireServices services) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(routingNumber, "routingNumber");
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(services, "services");
        this.name = name;
        this.routingNumber = routingNumber;
        this.address = address;
        this.services = services;
    }
    
    public WireInstitution(
            String name,
            String routingNumber,
            WireServices services) {
        this(name, routingNumber, Optional.empty(),
            services);
    }

    /**
     * Name of the financial institution.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String routingNumber() {
        return routingNumber;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Address> address() {
        return (Optional<Address>) address;
    }

    @JsonIgnore
    public WireServices services() {
        return services;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Name of the financial institution.
     */
    public WireInstitution withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public WireInstitution withRoutingNumber(String routingNumber) {
        Utils.checkNotNull(routingNumber, "routingNumber");
        this.routingNumber = routingNumber;
        return this;
    }

    public WireInstitution withAddress(Address address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }


    public WireInstitution withAddress(Optional<? extends Address> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public WireInstitution withServices(WireServices services) {
        Utils.checkNotNull(services, "services");
        this.services = services;
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
        WireInstitution other = (WireInstitution) o;
        return 
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.routingNumber, other.routingNumber) &&
            Utils.enhancedDeepEquals(this.address, other.address) &&
            Utils.enhancedDeepEquals(this.services, other.services);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            name, routingNumber, address,
            services);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WireInstitution.class,
                "name", name,
                "routingNumber", routingNumber,
                "address", address,
                "services", services);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String name;

        private String routingNumber;

        private Optional<? extends Address> address = Optional.empty();

        private WireServices services;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Name of the financial institution.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        public Builder routingNumber(String routingNumber) {
            Utils.checkNotNull(routingNumber, "routingNumber");
            this.routingNumber = routingNumber;
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


        public Builder services(WireServices services) {
            Utils.checkNotNull(services, "services");
            this.services = services;
            return this;
        }

        public WireInstitution build() {

            return new WireInstitution(
                name, routingNumber, address,
                services);
        }

    }
}
