/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * RequirementID
 * 
 * <p>The unique ID of what the requirement is asking to be filled out.
 */
public enum RequirementID {
    ACCOUNT_TOS_ACCEPTANCE("account.tos-acceptance"),
    INDIVIDUAL_MOBILE("individual.mobile"),
    INDIVIDUAL_EMAIL("individual.email"),
    INDIVIDUAL_EMAIL_OR_MOBILE("individual.email-or-mobile"),
    INDIVIDUAL_FIRSTNAME("individual.firstname"),
    INDIVIDUAL_LASTNAME("individual.lastname"),
    INDIVIDUAL_ADDRESS("individual.address"),
    INDIVIDUAL_SSN_LAST4("individual.ssn-last4"),
    INDIVIDUAL_SSN("individual.ssn"),
    INDIVIDUAL_BIRTHDATE("individual.birthdate"),
    BUSINESS_LEGALNAME("business.legalname"),
    BUSINESS_DESCRIPTION_OR_WEBSITE("business.description-or-website"),
    BUSINESS_ENTITY_TYPE("business.entity-type"),
    BUSINESS_BUSINESS_TYPE("business.business-type"),
    BUSINESS_DBA("business.dba"),
    BUSINESS_EIN("business.ein"),
    BUSINESS_ADDRESS("business.address"),
    BUSINESS_PHONE("business.phone"),
    BUSINESS_ADMINS("business.admins"),
    BUSINESS_CONTROLLERS("business.controllers"),
    BUSINESS_OWNERS("business.owners"),
    BUSINESS_CLASSIFICATION("business.classification"),
    BUSINESS_INDUSTRY_CODE_MCC("business.industry-code-mcc"),
    BUSINESS_INDICATE_OWNERS_PROVIDED("business.indicate-owners-provided"),
    BUSINESS_AVERAGE_TRANSACTION_SIZE("business.average-transaction-size"),
    BUSINESS_MAX_TRANSACTION_SIZE("business.max-transaction-size"),
    BUSINESS_AVERAGE_MONTHLY_TRANSACTION_VOLUME("business.average-monthly-transaction-volume"),
    BUSINESS_VOLUME_BY_CUSTOMER_TYPE("business.volume-by-customer-type"),
    BUSINESS_CARD_VOLUME_DISTRIBUTION("business.card-volume-distribution"),
    BUSINESS_FULFILLMENT("business.fulfillment"),
    BUSINESS_DESCRIPTION("business.description"),
    BUSINESS_UNDERWRITING_DOCUMENTS_TIER_ONE("business.underwriting-documents-tier-one"),
    BANK_ACCOUNTS_NAME("bank-accounts.name"),
    BANK_ACCOUNTS_ROUTING_NUMBER("bank-accounts.routing-number"),
    BANK_ACCOUNTS_ACCOUNT_NUMBER("bank-accounts.account-number"),
    DOCUMENT_BUSINESS_VERIFICATION("document.business.verification"),
    DOCUMENT_INDIVIDUAL_TIN("document.individual.tin"),
    DOCUMENT_INDIVIDUAL_VERIFICATION("document.individual.verification"),
    DOCUMENT_REPRESENTATIVE_REP_UUID_TIN("document.representative.{rep-uuid}.tin"),
    DOCUMENT_REPRESENTATIVE_REP_UUID_VERIFICATION("document.representative.{rep-uuid}.verification"),
    REPRESENTATIVE_REP_UUID_MOBILE("representative.{rep-uuid}.mobile"),
    REPRESENTATIVE_REP_UUID_EMAIL("representative.{rep-uuid}.email"),
    REPRESENTATIVE_REP_UUID_EMAIL_OR_MOBILE("representative.{rep-uuid}.email-or-mobile"),
    REPRESENTATIVE_REP_UUID_FIRSTNAME("representative.{rep-uuid}.firstname"),
    REPRESENTATIVE_REP_UUID_LASTNAME("representative.{rep-uuid}.lastname"),
    REPRESENTATIVE_REP_UUID_ADDRESS("representative.{rep-uuid}.address"),
    REPRESENTATIVE_REP_UUID_SSN_LAST4("representative.{rep-uuid}.ssn-last4"),
    REPRESENTATIVE_REP_UUID_SSN("representative.{rep-uuid}.ssn"),
    REPRESENTATIVE_REP_UUID_BIRTHDATE("representative.{rep-uuid}.birthdate"),
    REPRESENTATIVE_REP_UUID_JOB_TITLE("representative.{rep-uuid}.job-title"),
    REPRESENTATIVE_REP_UUID_IS_CONTROLLER("representative.{rep-uuid}.is-controller"),
    REPRESENTATIVE_REP_UUID_IS_OWNER("representative.{rep-uuid}.is-owner"),
    REPRESENTATIVE_REP_UUID_OWNERSHIP("representative.{rep-uuid}.ownership"),
    DOCUMENT_DOC_UUID("document.{doc-uuid}");

    @JsonValue
    private final String value;

    private RequirementID(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<RequirementID> fromValue(String value) {
        for (RequirementID o: RequirementID.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

