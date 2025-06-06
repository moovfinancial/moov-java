/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.LinkCard;
import io.moov.sdk.models.components.LinkCardWaitFor;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class LinkCardRequest {

    /**
     * Specify an API version.
     * 
     * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<String> xMoovVersion;

    /**
     * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
     * 
     * <p>When this header is set to `payment-method`, the response will include any payment methods that were created for the newly 
     * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-wait-for")
    private Optional<? extends LinkCardWaitFor> xWaitFor;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private LinkCard linkCard;

    @JsonCreator
    public LinkCardRequest(
            Optional<String> xMoovVersion,
            Optional<? extends LinkCardWaitFor> xWaitFor,
            String accountID,
            LinkCard linkCard) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(linkCard, "linkCard");
        this.xMoovVersion = xMoovVersion;
        this.xWaitFor = xWaitFor;
        this.accountID = accountID;
        this.linkCard = linkCard;
    }
    
    public LinkCardRequest(
            String accountID,
            LinkCard linkCard) {
        this(Optional.empty(), Optional.empty(), accountID, linkCard);
    }

    /**
     * Specify an API version.
     * 
     * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    @JsonIgnore
    public Optional<String> xMoovVersion() {
        return xMoovVersion;
    }

    /**
     * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
     * 
     * <p>When this header is set to `payment-method`, the response will include any payment methods that were created for the newly 
     * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LinkCardWaitFor> xWaitFor() {
        return (Optional<LinkCardWaitFor>) xWaitFor;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public LinkCard linkCard() {
        return linkCard;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Specify an API version.
     * 
     * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    public LinkCardRequest withXMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     * 
     * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    public LinkCardRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
     * 
     * <p>When this header is set to `payment-method`, the response will include any payment methods that were created for the newly 
     * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
     */
    public LinkCardRequest withXWaitFor(LinkCardWaitFor xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = Optional.ofNullable(xWaitFor);
        return this;
    }

    /**
     * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
     * 
     * <p>When this header is set to `payment-method`, the response will include any payment methods that were created for the newly 
     * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
     */
    public LinkCardRequest withXWaitFor(Optional<? extends LinkCardWaitFor> xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = xWaitFor;
        return this;
    }

    public LinkCardRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public LinkCardRequest withLinkCard(LinkCard linkCard) {
        Utils.checkNotNull(linkCard, "linkCard");
        this.linkCard = linkCard;
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
        LinkCardRequest other = (LinkCardRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.xWaitFor, other.xWaitFor) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.linkCard, other.linkCard);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            xWaitFor,
            accountID,
            linkCard);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkCardRequest.class,
                "xMoovVersion", xMoovVersion,
                "xWaitFor", xWaitFor,
                "accountID", accountID,
                "linkCard", linkCard);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private Optional<? extends LinkCardWaitFor> xWaitFor = Optional.empty();
 
        private String accountID;
 
        private LinkCard linkCard;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specify an API version.
         * 
         * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
         *   - `YYYY` is the year
         *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
         *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
         *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
         * 
         * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
         */
        public Builder xMoovVersion(String xMoovVersion) {
            Utils.checkNotNull(xMoovVersion, "xMoovVersion");
            this.xMoovVersion = Optional.ofNullable(xMoovVersion);
            return this;
        }

        /**
         * Specify an API version.
         * 
         * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
         *   - `YYYY` is the year
         *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
         *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
         *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
         * 
         * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
         */
        public Builder xMoovVersion(Optional<String> xMoovVersion) {
            Utils.checkNotNull(xMoovVersion, "xMoovVersion");
            this.xMoovVersion = xMoovVersion;
            return this;
        }

        /**
         * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
         * 
         * <p>When this header is set to `payment-method`, the response will include any payment methods that were created for the newly 
         * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
         */
        public Builder xWaitFor(LinkCardWaitFor xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = Optional.ofNullable(xWaitFor);
            return this;
        }

        /**
         * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
         * 
         * <p>When this header is set to `payment-method`, the response will include any payment methods that were created for the newly 
         * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
         */
        public Builder xWaitFor(Optional<? extends LinkCardWaitFor> xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = xWaitFor;
            return this;
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder linkCard(LinkCard linkCard) {
            Utils.checkNotNull(linkCard, "linkCard");
            this.linkCard = linkCard;
            return this;
        }
        
        public LinkCardRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }
            return new LinkCardRequest(
                xMoovVersion,
                xWaitFor,
                accountID,
                linkCard);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}
