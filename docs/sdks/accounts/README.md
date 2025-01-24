# Accounts
(*accounts()*)

## Overview

### Available Operations

* [createAccount](#createaccount) - You can create **business** or **individual** accounts for your users (i.e., customers, merchants) by passing the required
information to Moov. Requirements differ per account type and requested [capabilities](https://docs.moov.io/guides/accounts/capabilities/requirements/).

If you're requesting the `wallet`, `send-funds`, `collect-funds`, or `card-issuing` capabilities, you'll need to:
  + Send Moov the user [platform terms of service agreement](https://docs.moov.io/guides/accounts/requirements/platform-agreement/) acceptance.
    This can be done upon account creation, or by [patching](https://docs.moov.io/api/moov-accounts/accounts/patch/) the account using the `termsOfService` field.
If you're creating a business account with the business type `llc`, `partnership`, or `privateCorporation`, you'll need to:
  + Provide [business representatives](https://docs.moov.io/api/moov-accounts/representatives/) after creating the account.
  + [Patch](https://docs.moov.io/api/moov-accounts/accounts/patch/) the account to indicate that business representative ownership information is complete.

Visit our documentation to read more about [creating accounts](https://docs.moov.io/guides/accounts/create-accounts/) and [verification requirements](https://docs.moov.io/guides/accounts/requirements/identity-verification/).
Note that the `mode` field (for production or sandbox) is only required when creating a _facilitator_ account. All non-facilitator account requests will ignore the mode field and be set to the calling facilitator's mode.
* [listAccounts](#listaccounts) - List or search accounts to which the caller is connected.

All supported query parameters are optional. If none are provided the response will include all connected accounts.
Pagination is supported via the `skip` and `count` query parameters.
Searching by name and email will overlap and return results based on relevance.
* [getAccount](#getaccount) - Retrieves details for the account with the specified ID.
* [patchAccount](#patchaccount) - When **can** profile data be updated:
  + For unverified accounts, all profile data can be edited.
  + During the verification process, missing or incomplete profile data can be edited.
  + Verified accounts can only add missing profile data.

  When **can't** profile data be updated:
  + Verified accounts cannot change any existing profile data.

If you need to update information in a locked state, please contact Moov support.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/profile.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/), and provide the changed information.
* [disconnectAccount](#disconnectaccount) -   This will sever the connection between you and the account specified and it will no longer be listed as active in the list of accounts. 
  This also means you'll only have read-only access to the account going forward for reporting purposes.

  To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/profile.disconnect` scope when generating 
  a [token](https://docs.moov.io/api/authentication/access-tokens/), and provide the changed information.
* [getAccountCountries](#getaccountcountries) - Retrieve the specified countries of operation for an account. 

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/profile.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [assignAccountCountries](#assignaccountcountries) - Assign the countries of operation for an account.

This endpoint will always overwrite the previously assigned values. 

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/profile.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getMerchantProcessingAgreement](#getmerchantprocessingagreement) - Retrieve a merchant account's processing agreement.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.
* [getTermsOfServiceToken](#gettermsofservicetoken) -   Generates a non-expiring token that can then be used to accept Moov’s terms of service. 

  This token can only be generated via API. Any Moov account requesting the collect funds, send funds, wallet, or card issuing capabilities 
  must accept Moov’s terms of service, then have the generated terms of service token patched to the account. Read more in our [documentation](https://docs.moov.io/guides/accounts/requirements/platform-agreement/).

## createAccount

You can create **business** or **individual** accounts for your users (i.e., customers, merchants) by passing the required
information to Moov. Requirements differ per account type and requested [capabilities](https://docs.moov.io/guides/accounts/capabilities/requirements/).

If you're requesting the `wallet`, `send-funds`, `collect-funds`, or `card-issuing` capabilities, you'll need to:
  + Send Moov the user [platform terms of service agreement](https://docs.moov.io/guides/accounts/requirements/platform-agreement/) acceptance.
    This can be done upon account creation, or by [patching](https://docs.moov.io/api/moov-accounts/accounts/patch/) the account using the `termsOfService` field.
If you're creating a business account with the business type `llc`, `partnership`, or `privateCorporation`, you'll need to:
  + Provide [business representatives](https://docs.moov.io/api/moov-accounts/representatives/) after creating the account.
  + [Patch](https://docs.moov.io/api/moov-accounts/accounts/patch/) the account to indicate that business representative ownership information is complete.

Visit our documentation to read more about [creating accounts](https://docs.moov.io/guides/accounts/create-accounts/) and [verification requirements](https://docs.moov.io/guides/accounts/requirements/identity-verification/).
Note that the `mode` field (for production or sandbox) is only required when creating a _facilitator_ account. All non-facilitator account requests will ignore the mode field and be set to the calling facilitator's mode.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.AccountType;
import io.moov.sdk.models.components.AccountWaitFor;
import io.moov.sdk.models.components.CreateAccount;
import io.moov.sdk.models.components.CreateBusinessProfile;
import io.moov.sdk.models.components.CreateProfile;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.CreateAccountResponseBody;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateAccountResponse;
import io.moov.sdk.models.operations.CreateAccountSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CreateAccountResponseBody, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateAccountResponse res = sdk.accounts().createAccount()
                .security(CreateAccountSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .xWaitFor(AccountWaitFor.CONNECTION)
                .createAccount(CreateAccount.builder()
                    .accountType(AccountType.BUSINESS)
                    .profile(CreateProfile.builder()
                        .business(CreateBusinessProfile.builder()
                            .legalBusinessName("Classbooker, LLC")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.account().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 | Example                                                                                                                     |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                  | [io.moov.sdk.models.operations.CreateAccountSecurity](../../models/operations/CreateAccountSecurity.md)                     | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |                                                                                                                             |
| `xMoovVersion`                                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                                  | :heavy_minus_sign:                                                                                                          | Specify an API version.                                                                                                     |                                                                                                                             |
| `xWaitFor`                                                                                                                  | [Optional\<AccountWaitFor>](../../models/components/AccountWaitFor.md)                                                      | :heavy_minus_sign:                                                                                                          | Optional header that indicates whether to wait for the connection to be created before returning from the account creation. |                                                                                                                             |
| `createAccount`                                                                                                             | [CreateAccount](../../models/components/CreateAccount.md)                                                                   | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         | {<br/>"accountType": "business",<br/>"profile": {<br/>"business": {<br/>"legalBusinessName": "Whole Body Fitness LLC"<br/>}<br/>}<br/>} |

### Response

**[CreateAccountResponse](../../models/operations/CreateAccountResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GenericError              | 400, 409                                | application/json                        |
| models/errors/CreateAccountResponseBody | 422                                     | application/json                        |
| models/errors/APIException              | 4XX, 5XX                                | \*/\*                                   |

## listAccounts

List or search accounts to which the caller is connected.

All supported query parameters are optional. If none are provided the response will include all connected accounts.
Pagination is supported via the `skip` and `count` query parameters.
Searching by name and email will overlap and return results based on relevance.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.AccountType;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.operations.ListAccountsRequest;
import io.moov.sdk.models.operations.ListAccountsResponse;
import io.moov.sdk.models.operations.ListAccountsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListAccountsRequest req = ListAccountsRequest.builder()
                .type(AccountType.BUSINESS)
                .skip(60L)
                .count(20L)
                .build();

        ListAccountsResponse res = sdk.accounts().listAccounts()
                .request(req)
                .security(ListAccountsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.accounts().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListAccountsRequest](../../models/operations/ListAccountsRequest.md)                                 | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |
| `security`                                                                                            | [io.moov.sdk.models.operations.ListAccountsSecurity](../../models/operations/ListAccountsSecurity.md) | :heavy_check_mark:                                                                                    | The security requirements to use for the request.                                                     |

### Response

**[ListAccountsResponse](../../models/operations/ListAccountsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getAccount

Retrieves details for the account with the specified ID.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetAccountResponse;
import io.moov.sdk.models.operations.GetAccountSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetAccountResponse res = sdk.accounts().getAccount()
                .security(GetAccountSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .accountID("45ce7519-7f28-40c8-94bf-6edae7a38315")
                .call();

        if (res.account().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `security`                                                                                        | [io.moov.sdk.models.operations.GetAccountSecurity](../../models/operations/GetAccountSecurity.md) | :heavy_check_mark:                                                                                | The security requirements to use for the request.                                                 |
| `xMoovVersion`                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                        | :heavy_minus_sign:                                                                                | Specify an API version.                                                                           |
| `accountID`                                                                                       | *String*                                                                                          | :heavy_check_mark:                                                                                | N/A                                                                                               |

### Response

**[GetAccountResponse](../../models/operations/GetAccountResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## patchAccount

When **can** profile data be updated:
  + For unverified accounts, all profile data can be edited.
  + During the verification process, missing or incomplete profile data can be edited.
  + Verified accounts can only add missing profile data.

  When **can't** profile data be updated:
  + Verified accounts cannot change any existing profile data.

If you need to update information in a locked state, please contact Moov support.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/profile.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/), and provide the changed information.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.AccountType;
import io.moov.sdk.models.components.CreateAccountUpdate;
import io.moov.sdk.models.components.CreateBusinessProfileUpdate;
import io.moov.sdk.models.components.CreateProfileUpdate;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.PatchAccountResponseBody;
import io.moov.sdk.models.operations.PatchAccountResponse;
import io.moov.sdk.models.operations.PatchAccountSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, PatchAccountResponseBody, Exception {

        Moov sdk = Moov.builder()
            .build();

        PatchAccountResponse res = sdk.accounts().patchAccount()
                .security(PatchAccountSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202504)
                .accountID("7909eaa5-21eb-4fc4-bc91-9f7385408829")
                .createAccountUpdate(CreateAccountUpdate.builder()
                    .accountType(AccountType.BUSINESS)
                    .profile(CreateProfileUpdate.builder()
                        .business(CreateBusinessProfileUpdate.builder()
                            .legalBusinessName("Classbooker, LLC")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.account().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [io.moov.sdk.models.operations.PatchAccountSecurity](../../models/operations/PatchAccountSecurity.md)       | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |                                                                                                             |
| `xMoovVersion`                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                  | :heavy_minus_sign:                                                                                          | Specify an API version.                                                                                     |                                                                                                             |
| `accountID`                                                                                                 | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `createAccountUpdate`                                                                                       | [CreateAccountUpdate](../../models/components/CreateAccountUpdate.md)                                       | :heavy_check_mark:                                                                                          | N/A                                                                                                         | {<br/>"accountType": "business",<br/>"profile": {<br/>"business": {<br/>"legalBusinessName": "Whole Body Fitness LLC"<br/>}<br/>}<br/>} |

### Response

**[PatchAccountResponse](../../models/operations/PatchAccountResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/GenericError             | 400, 409                               | application/json                       |
| models/errors/PatchAccountResponseBody | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## disconnectAccount

  This will sever the connection between you and the account specified and it will no longer be listed as active in the list of accounts. 
  This also means you'll only have read-only access to the account going forward for reporting purposes.

  To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/profile.disconnect` scope when generating 
  a [token](https://docs.moov.io/api/authentication/access-tokens/), and provide the changed information.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DisconnectAccountResponse;
import io.moov.sdk.models.operations.DisconnectAccountSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        DisconnectAccountResponse res = sdk.accounts().disconnectAccount()
                .security(DisconnectAccountSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("97814a93-ba26-470e-bb15-3cb32711e8ea")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                      | [io.moov.sdk.models.operations.DisconnectAccountSecurity](../../models/operations/DisconnectAccountSecurity.md) | :heavy_check_mark:                                                                                              | The security requirements to use for the request.                                                               |
| `xMoovVersion`                                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                                      | :heavy_minus_sign:                                                                                              | Specify an API version.                                                                                         |
| `accountID`                                                                                                     | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             |

### Response

**[DisconnectAccountResponse](../../models/operations/DisconnectAccountResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getAccountCountries

Retrieve the specified countries of operation for an account. 

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/profile.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetAccountCountriesResponse;
import io.moov.sdk.models.operations.GetAccountCountriesSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetAccountCountriesResponse res = sdk.accounts().getAccountCountries()
                .security(GetAccountCountriesSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("df471fd8-7bb3-4db3-bf74-52fe588b8d2b")
                .call();

        if (res.accountCountries().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                          | [io.moov.sdk.models.operations.GetAccountCountriesSecurity](../../models/operations/GetAccountCountriesSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |
| `xMoovVersion`                                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                                          | :heavy_minus_sign:                                                                                                  | Specify an API version.                                                                                             |
| `accountID`                                                                                                         | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |

### Response

**[GetAccountCountriesResponse](../../models/operations/GetAccountCountriesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## assignAccountCountries

Assign the countries of operation for an account.

This endpoint will always overwrite the previously assigned values. 

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/profile.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.AccountCountries;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.AssignCountriesError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.AssignAccountCountriesResponse;
import io.moov.sdk.models.operations.AssignAccountCountriesSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, AssignCountriesError, Exception {

        Moov sdk = Moov.builder()
            .build();

        AssignAccountCountriesResponse res = sdk.accounts().assignAccountCountries()
                .security(AssignAccountCountriesSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("9ba3f09c-c93c-4ca1-b68f-1dbb0841a40a")
                .accountCountries(AccountCountries.builder()
                    .countries(List.of(
                        "United States"))
                    .build())
                .call();

        if (res.accountCountries().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                | [io.moov.sdk.models.operations.AssignAccountCountriesSecurity](../../models/operations/AssignAccountCountriesSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |
| `xMoovVersion`                                                                                                            | [Optional\<Versions>](../../models/components/Versions.md)                                                                | :heavy_minus_sign:                                                                                                        | Specify an API version.                                                                                                   |
| `accountID`                                                                                                               | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |
| `accountCountries`                                                                                                        | [AccountCountries](../../models/components/AccountCountries.md)                                                           | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |

### Response

**[AssignAccountCountriesResponse](../../models/operations/AssignAccountCountriesResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/GenericError         | 400, 409                           | application/json                   |
| models/errors/AssignCountriesError | 422                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## getMerchantProcessingAgreement

Retrieve a merchant account's processing agreement.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetMerchantProcessingAgreementResponse;
import io.moov.sdk.models.operations.GetMerchantProcessingAgreementSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetMerchantProcessingAgreementResponse res = sdk.accounts().getMerchantProcessingAgreement()
                .security(GetMerchantProcessingAgreementSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("d2cfd0d3-6efb-4bc4-a193-53f35dd0d912")
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                | [io.moov.sdk.models.operations.GetMerchantProcessingAgreementSecurity](../../models/operations/GetMerchantProcessingAgreementSecurity.md) | :heavy_check_mark:                                                                                                                        | The security requirements to use for the request.                                                                                         |
| `xMoovVersion`                                                                                                                            | [Optional\<Versions>](../../models/components/Versions.md)                                                                                | :heavy_minus_sign:                                                                                                                        | Specify an API version.                                                                                                                   |
| `accountID`                                                                                                                               | *String*                                                                                                                                  | :heavy_check_mark:                                                                                                                        | N/A                                                                                                                                       |

### Response

**[GetMerchantProcessingAgreementResponse](../../models/operations/GetMerchantProcessingAgreementResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getTermsOfServiceToken

  Generates a non-expiring token that can then be used to accept Moov’s terms of service. 

  This token can only be generated via API. Any Moov account requesting the collect funds, send funds, wallet, or card issuing capabilities 
  must accept Moov’s terms of service, then have the generated terms of service token patched to the account. Read more in our [documentation](https://docs.moov.io/guides/accounts/requirements/platform-agreement/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetTermsOfServiceTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetTermsOfServiceTokenResponse res = sdk.accounts().getTermsOfServiceToken()
                .xMoovVersion(Versions.V202507)
                .origin("<value>")
                .referer("powerless-humidity.org")
                .call();

        if (res.termsOfServiceToken().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                 | [Optional\<Versions>](../../models/components/Versions.md)                                                     | :heavy_minus_sign:                                                                                             | Specify an API version.                                                                                        |
| `origin`                                                                                                       | *Optional\<String>*                                                                                            | :heavy_minus_sign:                                                                                             | Indicates the domain from which the request originated. Required if referer header is not present.             |
| `referer`                                                                                                      | *Optional\<String>*                                                                                            | :heavy_minus_sign:                                                                                             | Specifies the URL of the resource from which the request originated. Required if origin header is not present. |

### Response

**[GetTermsOfServiceTokenResponse](../../models/operations/GetTermsOfServiceTokenResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |