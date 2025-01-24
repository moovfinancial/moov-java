# Representatives
(*representatives()*)

## Overview

### Available Operations

* [createRepresentative](#createrepresentative) - Moov accounts associated with businesses require information regarding individuals who represent the business. 
You can provide this information by creating a representative. Each account is allowed a maximum of 7 representatives. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To use this endpoint from the browser, you’ll need to specify the `/accounts/{accountID}/representatives.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [listRepresentatives](#listrepresentatives) - A Moov account may have multiple representatives depending on the associated business’s ownership and management structure. 
You can use this method to list all the representatives for a given Moov account. 
Note that Moov accounts associated with an individual do not have representatives. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To use this endpoint from the browser, you’ll need to specify the `/accounts/{accountID}/representatives.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [deleteRepresentative](#deleterepresentative) - Deletes a business representative associated with a Moov account. Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To use this endpoint from the browser, you’ll need to specify the `/accounts/{accountID}/representatives.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getRepresentative](#getrepresentative) - Retrieve a specific representative associated with a given Moov account. Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To use this endpoint from the browser, you’ll need to specify the `/accounts/{accountID}/representatives.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [updateRepresentative](#updaterepresentative) - If a representative’s information has changed you can patch the information associated with a specific representative ID. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To use this endpoint from the browser, you’ll need to specify the `/accounts/{accountID}/representatives.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

When **can** profile data be updated:

- For unverified representatives, all profile data can be edited.
- During the verification process, missing or incomplete profile data can be edited.
- Verified representatives can only add missing profile data.

When **can’t** profile data be updated:

- Verified representatives cannot change any existing profile data.

If you need to update information in a locked state, please contact Moov support.

## createRepresentative

Moov accounts associated with businesses require information regarding individuals who represent the business. 
You can provide this information by creating a representative. Each account is allowed a maximum of 7 representatives. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To use this endpoint from the browser, you’ll need to specify the `/accounts/{accountID}/representatives.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Address;
import io.moov.sdk.models.components.BirthDate;
import io.moov.sdk.models.components.CreateRepresentative;
import io.moov.sdk.models.components.IndividualName;
import io.moov.sdk.models.components.PhoneNumber;
import io.moov.sdk.models.components.RepresentativeResponsibilities;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.RepresentativeValidationError;
import io.moov.sdk.models.operations.CreateRepresentativeResponse;
import io.moov.sdk.models.operations.CreateRepresentativeSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, RepresentativeValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateRepresentativeResponse res = sdk.representatives().createRepresentative()
                .security(CreateRepresentativeSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202504)
                .accountID("602bcb92-e33e-47e9-874b-f8c8cdea8a6e")
                .createRepresentative(CreateRepresentative.builder()
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
                    .responsibilities(RepresentativeResponsibilities.builder()
                        .ownershipPercentage(38L)
                        .jobTitle("CEO")
                        .build())
                    .build())
                .call();

        if (res.representative().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                            | [io.moov.sdk.models.operations.CreateRepresentativeSecurity](../../models/operations/CreateRepresentativeSecurity.md) | :heavy_check_mark:                                                                                                    | The security requirements to use for the request.                                                                     |
| `xMoovVersion`                                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                                            | :heavy_minus_sign:                                                                                                    | Specify an API version.                                                                                               |
| `accountID`                                                                                                           | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | ID of the account.                                                                                                    |
| `createRepresentative`                                                                                                | [CreateRepresentative](../../models/components/CreateRepresentative.md)                                               | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |

### Response

**[CreateRepresentativeResponse](../../models/operations/CreateRepresentativeResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GenericError                  | 400, 409                                    | application/json                            |
| models/errors/RepresentativeValidationError | 422                                         | application/json                            |
| models/errors/APIException                  | 4XX, 5XX                                    | \*/\*                                       |

## listRepresentatives

A Moov account may have multiple representatives depending on the associated business’s ownership and management structure. 
You can use this method to list all the representatives for a given Moov account. 
Note that Moov accounts associated with an individual do not have representatives. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To use this endpoint from the browser, you’ll need to specify the `/accounts/{accountID}/representatives.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListRepresentativesResponse;
import io.moov.sdk.models.operations.ListRepresentativesSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListRepresentativesResponse res = sdk.representatives().listRepresentatives()
                .security(ListRepresentativesSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .accountID("33c72fc5-9781-4400-9547-0fa6966c8791")
                .call();

        if (res.representatives().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                          | [io.moov.sdk.models.operations.ListRepresentativesSecurity](../../models/operations/ListRepresentativesSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |
| `xMoovVersion`                                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                                          | :heavy_minus_sign:                                                                                                  | Specify an API version.                                                                                             |
| `accountID`                                                                                                         | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | ID of the account.                                                                                                  |

### Response

**[ListRepresentativesResponse](../../models/operations/ListRepresentativesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## deleteRepresentative

Deletes a business representative associated with a Moov account. Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To use this endpoint from the browser, you’ll need to specify the `/accounts/{accountID}/representatives.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DeleteRepresentativeResponse;
import io.moov.sdk.models.operations.DeleteRepresentativeSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        DeleteRepresentativeResponse res = sdk.representatives().deleteRepresentative()
                .security(DeleteRepresentativeSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("8c15ae30-39cc-45a6-a9b1-f96dfd44efa8")
                .representativeID("302eff0a-1b46-4437-bfa0-532d4401ffcd")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                            | [io.moov.sdk.models.operations.DeleteRepresentativeSecurity](../../models/operations/DeleteRepresentativeSecurity.md) | :heavy_check_mark:                                                                                                    | The security requirements to use for the request.                                                                     |
| `xMoovVersion`                                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                                            | :heavy_minus_sign:                                                                                                    | Specify an API version.                                                                                               |
| `accountID`                                                                                                           | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | ID of the account.                                                                                                    |
| `representativeID`                                                                                                    | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | ID of the representative.                                                                                             |

### Response

**[DeleteRepresentativeResponse](../../models/operations/DeleteRepresentativeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getRepresentative

Retrieve a specific representative associated with a given Moov account. Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To use this endpoint from the browser, you’ll need to specify the `/accounts/{accountID}/representatives.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetRepresentativeResponse;
import io.moov.sdk.models.operations.GetRepresentativeSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetRepresentativeResponse res = sdk.representatives().getRepresentative()
                .security(GetRepresentativeSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202504)
                .accountID("64980616-9a3a-476e-b482-151eb6571b76")
                .representativeID("7b611595-93d0-48cc-9da4-3aac709d069a")
                .call();

        if (res.representative().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                      | [io.moov.sdk.models.operations.GetRepresentativeSecurity](../../models/operations/GetRepresentativeSecurity.md) | :heavy_check_mark:                                                                                              | The security requirements to use for the request.                                                               |
| `xMoovVersion`                                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                                      | :heavy_minus_sign:                                                                                              | Specify an API version.                                                                                         |
| `accountID`                                                                                                     | *String*                                                                                                        | :heavy_check_mark:                                                                                              | ID of the account.                                                                                              |
| `representativeID`                                                                                              | *String*                                                                                                        | :heavy_check_mark:                                                                                              | ID of the representative.                                                                                       |

### Response

**[GetRepresentativeResponse](../../models/operations/GetRepresentativeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateRepresentative

If a representative’s information has changed you can patch the information associated with a specific representative ID. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To use this endpoint from the browser, you’ll need to specify the `/accounts/{accountID}/representatives.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

When **can** profile data be updated:

- For unverified representatives, all profile data can be edited.
- During the verification process, missing or incomplete profile data can be edited.
- Verified representatives can only add missing profile data.

When **can’t** profile data be updated:

- Verified representatives cannot change any existing profile data.

If you need to update information in a locked state, please contact Moov support.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.IndividualNameUpdate;
import io.moov.sdk.models.components.Phone;
import io.moov.sdk.models.components.Responsibilities;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.UpdateRepresentative;
import io.moov.sdk.models.components.UpdateRepresentativeAddress;
import io.moov.sdk.models.components.UpdateRepresentativeBirthDate;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UpdateRepresentativeResponse;
import io.moov.sdk.models.operations.UpdateRepresentativeSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateRepresentativeResponse res = sdk.representatives().updateRepresentative()
                .security(UpdateRepresentativeSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .accountID("377d9553-179a-45f6-8ed4-c92810fbb4d0")
                .representativeID("54619159-548e-45ed-b917-271fb71fc438")
                .updateRepresentative(UpdateRepresentative.builder()
                    .name(IndividualNameUpdate.builder()
                        .firstName("Jordan")
                        .middleName("Reese")
                        .lastName("Lee")
                        .suffix("Jr")
                        .build())
                    .phone(Phone.builder()
                        .number("8185551212")
                        .countryCode("1")
                        .build())
                    .address(UpdateRepresentativeAddress.builder()
                        .addressLine1("123 Main Street")
                        .addressLine2("Apt 302")
                        .city("Boulder")
                        .stateOrProvince("CO")
                        .postalCode("80301")
                        .country("US")
                        .build())
                    .birthDate(UpdateRepresentativeBirthDate.builder()
                        .day(9L)
                        .month(11L)
                        .year(1989L)
                        .build())
                    .responsibilities(Responsibilities.builder()
                        .ownershipPercentage(38L)
                        .jobTitle("CEO")
                        .build())
                    .build())
                .call();

        if (res.representative().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                            | [io.moov.sdk.models.operations.UpdateRepresentativeSecurity](../../models/operations/UpdateRepresentativeSecurity.md) | :heavy_check_mark:                                                                                                    | The security requirements to use for the request.                                                                     |
| `xMoovVersion`                                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                                            | :heavy_minus_sign:                                                                                                    | Specify an API version.                                                                                               |
| `accountID`                                                                                                           | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | ID of the account.                                                                                                    |
| `representativeID`                                                                                                    | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | ID of the representative.                                                                                             |
| `updateRepresentative`                                                                                                | [UpdateRepresentative](../../models/components/UpdateRepresentative.md)                                               | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |

### Response

**[UpdateRepresentativeResponse](../../models/operations/UpdateRepresentativeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |