<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.CreateAccountResponseBody;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateAccountResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws GenericError, CreateAccountResponseBody, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateAccountResponse res = sdk.accounts().create()
                .createAccount(CreateAccount.builder()
                    .accountType(CreateAccountType.BUSINESS)
                    .profile(CreateProfile.builder()
                        .individual(CreateIndividualProfile.builder()
                            .name(IndividualName.builder()
                                .firstName("Jordan")
                                .lastName("Lee")
                                .middleName("Reese")
                                .suffix("Jr")
                                .build())
                            .phone(PhoneNumber.builder()
                                .number("8185551212")
                                .countryCode("1")
                                .build())
                            .email("jordan.lee@classbooker.dev")
                            .address(Address.builder()
                                .addressLine1("123 Main Street")
                                .city("Boulder")
                                .stateOrProvince("CO")
                                .postalCode("80301")
                                .country("US")
                                .addressLine2("Apt 302")
                                .build())
                            .birthDate(BirthDate.builder()
                                .day(9L)
                                .month(11L)
                                .year(1989L)
                                .build())
                            .build())
                        .business(CreateBusinessProfile.builder()
                            .legalBusinessName("Classbooker, LLC")
                            .businessType(BusinessType.LLC)
                            .address(Address.builder()
                                .addressLine1("123 Main Street")
                                .city("Boulder")
                                .stateOrProvince("CO")
                                .postalCode("80301")
                                .country("US")
                                .addressLine2("Apt 302")
                                .build())
                            .phone(PhoneNumber.builder()
                                .number("8185551212")
                                .countryCode("1")
                                .build())
                            .email("jordan.lee@classbooker.dev")
                            .description("Local fitness gym paying out instructors")
                            .taxID(TaxID.builder()
                                .ein(Ein.builder()
                                    .number("12-3456789")
                                    .build())
                                .build())
                            .industryCodes(IndustryCodes.builder()
                                .naics("713940")
                                .sic("7991")
                                .mcc("7997")
                                .build())
                            .build())
                        .build())
                    .metadata(Map.ofEntries(
                        Map.entry("optional", "metadata")))
                    .termsOfService(CreateAccountTermsOfService.of(TermsOfServiceToken.builder()
                        .token("kgT1uxoMAk7QKuyJcmQE8nqW_HjpyuXBabiXPi6T83fUQoxsyWYPcYzuHQTqrt7YRp4gCwyDQvb6U5REM9Pgl2EloCe35t-eiMAbUWGo3Kerxme6aqNcKrP_6-v0MTXViOEJ96IBxPFTvMV7EROI2dq3u4e-x4BbGSCedAX-ViAQND6hcreCDXwrO6sHuzh5Xi2IzSqZHxaovnWEboaxuZKRJkA3dsFID6fzitMpm2qrOh4")
                        .build()))
                    .customerSupport(CustomerSupport.builder()
                        .phone(PhoneNumber.builder()
                            .number("8185551212")
                            .countryCode("1")
                            .build())
                        .email("jordan.lee@classbooker.dev")
                        .address(Address.builder()
                            .addressLine1("123 Main Street")
                            .city("Boulder")
                            .stateOrProvince("CO")
                            .postalCode("80301")
                            .country("US")
                            .addressLine2("Apt 302")
                            .build())
                        .build())
                    .settings(Settings.builder()
                        .cardPayment(CardPaymentSettings.builder()
                            .statementDescriptor("Whole Body Fitness")
                            .build())
                        .achPayment(ACHPaymentSettings.builder()
                            .companyName("WholeBodyFitness")
                            .build())
                        .build())
                    .mode(Mode.PRODUCTION)
                    .build())
                .call();

        if (res.account().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->