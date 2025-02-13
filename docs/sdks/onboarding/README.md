# Onboarding
(*onboarding()*)

## Overview

### Available Operations

* [createInvite](#createinvite) - Create an invitation containing a unique link that allows the recipient to onboard their organization with Moov.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.
* [listInvites](#listinvites) - List all the onboarding invites created by the caller's account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.read` scope.
* [getInvite](#getinvite) - Retrieve details about an onboarding invite.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.read` scope.
* [revokeInvite](#revokeinvite) - Revoke an onboarding invite, rendering the invitation link unusable.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.

## createInvite

Create an invitation containing a unique link that allows the recipient to onboard their organization with Moov.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.ACHPaymentSettings;
import io.moov.sdk.models.components.AccountType;
import io.moov.sdk.models.components.Address;
import io.moov.sdk.models.components.ApplicationScope;
import io.moov.sdk.models.components.BirthDate;
import io.moov.sdk.models.components.BusinessType;
import io.moov.sdk.models.components.CapabilityID;
import io.moov.sdk.models.components.CardPaymentSettings;
import io.moov.sdk.models.components.CreateAccount;
import io.moov.sdk.models.components.CreateAccountTermsOfService;
import io.moov.sdk.models.components.CreateBusinessProfile;
import io.moov.sdk.models.components.CreateIndividualProfile;
import io.moov.sdk.models.components.CreateProfile;
import io.moov.sdk.models.components.CustomerSupport;
import io.moov.sdk.models.components.Ein;
import io.moov.sdk.models.components.IndividualName;
import io.moov.sdk.models.components.IndustryCodes;
import io.moov.sdk.models.components.ManualTermsOfService;
import io.moov.sdk.models.components.OnboardingInviteRequest;
import io.moov.sdk.models.components.PhoneNumber;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Settings;
import io.moov.sdk.models.components.TaxID;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.OnboardingInviteError;
import io.moov.sdk.models.operations.CreateOnboardingInviteResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws GenericError, OnboardingInviteError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateOnboardingInviteResponse res = sdk.onboarding().createInvite()
                .xMoovVersion("v2024.01.00")
                .onboardingInviteRequest(OnboardingInviteRequest.builder()
                    .scopes(List.of(
                        ApplicationScope.ACCOUNTS_READ))
                    .capabilities(List.of(
                        CapabilityID.TRANSFERS))
                    .feePlanCodes(List.of(
                        "merchant-direct"))
                    .prefill(CreateAccount.builder()
                        .accountType(AccountType.BUSINESS)
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
                        .termsOfService(CreateAccountTermsOfService.of(ManualTermsOfService.builder()
                            .acceptedDate(OffsetDateTime.parse("2024-12-17T23:29:29.246Z"))
                            .acceptedIP("172.217.2.46")
                            .acceptedUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.71 Safari/537.36")
                            .acceptedDomain("https://odd-brace.biz/")
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
                        .build())
                    .build())
                .call();

        if (res.onboardingInvite().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |
| `onboardingInviteRequest`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [OnboardingInviteRequest](../../models/components/OnboardingInviteRequest.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |

### Response

**[CreateOnboardingInviteResponse](../../models/operations/CreateOnboardingInviteResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400, 409                            | application/json                    |
| models/errors/OnboardingInviteError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## listInvites

List all the onboarding invites created by the caller's account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListOnboardingInvitesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListOnboardingInvitesResponse res = sdk.onboarding().listInvites()
                .xMoovVersion("v2024.01.00")
                .call();

        if (res.onboardingInvites().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |

### Response

**[ListOnboardingInvitesResponse](../../models/operations/ListOnboardingInvitesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getInvite

Retrieve details about an onboarding invite.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetOnboardingInviteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetOnboardingInviteResponse res = sdk.onboarding().getInvite()
                .xMoovVersion("v2024.01.00")
                .code("N1IA5eWYNh")
                .call();

        if (res.onboardingInvite().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Example                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| `code`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | N1IA5eWYNh                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |

### Response

**[GetOnboardingInviteResponse](../../models/operations/GetOnboardingInviteResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## revokeInvite

Revoke an onboarding invite, rendering the invitation link unusable.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.RevokeOnboardingInviteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        RevokeOnboardingInviteResponse res = sdk.onboarding().revokeInvite()
                .xMoovVersion("v2024.01.00")
                .code("N1IA5eWYNh")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Example                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| `code`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | N1IA5eWYNh                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |

### Response

**[RevokeOnboardingInviteResponse](../../models/operations/RevokeOnboardingInviteResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |