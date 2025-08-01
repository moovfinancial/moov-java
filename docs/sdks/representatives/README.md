# Representatives
(*representatives()*)

## Overview

### Available Operations

* [create](#create) - Moov accounts associated with businesses require information regarding individuals who represent the business. 
You can provide this information by creating a representative. Each account is allowed a maximum of 7 representatives. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/representatives.write` scope.
* [list](#list) - A Moov account may have multiple representatives depending on the associated business's ownership and management structure. 
You can use this method to list all the representatives for a given Moov account. 
Note that Moov accounts associated with an individual do not have representatives. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/representatives.read` scope.
* [delete](#delete) - Deletes a business representative associated with a Moov account. Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/representatives.write` scope.
* [get](#get) - Retrieve a specific representative associated with a given Moov account. Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/representatives.read` scope.
* [update](#update) - If a representative's information has changed you can patch the information associated with a specific representative ID. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

When **can** profile data be updated:

- For unverified representatives, all profile data can be edited.
- During the verification process, missing or incomplete profile data can be edited.
- Verified representatives can only add missing profile data.

When **can't** profile data be updated:

- Verified representatives cannot change any existing profile data.

If you need to update information in a locked state, please contact Moov support.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/representatives.write` scope.

## create

Moov accounts associated with businesses require information regarding individuals who represent the business. 
You can provide this information by creating a representative. Each account is allowed a maximum of 7 representatives. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/representatives.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepresentative" method="post" path="/accounts/{accountID}/representatives" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.RepresentativeValidationError;
import io.moov.sdk.models.operations.CreateRepresentativeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, RepresentativeValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        CreateRepresentativeResponse res = sdk.representatives().create()
                .accountID("5abfe3a5-7cd3-4f92-a8bd-19b64e3ccc10")
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `accountID`                                                             | *String*                                                                | :heavy_check_mark:                                                      | ID of the account.                                                      |
| `createRepresentative`                                                  | [CreateRepresentative](../../models/components/CreateRepresentative.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[CreateRepresentativeResponse](../../models/operations/CreateRepresentativeResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GenericError                  | 400, 409                                    | application/json                            |
| models/errors/RepresentativeValidationError | 422                                         | application/json                            |
| models/errors/APIException                  | 4XX, 5XX                                    | \*/\*                                       |

## list

A Moov account may have multiple representatives depending on the associated business's ownership and management structure. 
You can use this method to list all the representatives for a given Moov account. 
Note that Moov accounts associated with an individual do not have representatives. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/representatives.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepresentatives" method="get" path="/accounts/{accountID}/representatives" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListRepresentativesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        ListRepresentativesResponse res = sdk.representatives().list()
                .accountID("aa071158-7ed6-4c18-af34-4fa37b755e53")
                .call();

        if (res.representatives().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | ID of the account. |

### Response

**[ListRepresentativesResponse](../../models/operations/ListRepresentativesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## delete

Deletes a business representative associated with a Moov account. Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/representatives.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteRepresentative" method="delete" path="/accounts/{accountID}/representatives/{representativeID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DeleteRepresentativeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        DeleteRepresentativeResponse res = sdk.representatives().delete()
                .accountID("23b950c7-3ccf-4edc-9566-07f765d57c73")
                .representativeID("74d0f56b-b81b-467a-bc86-47a55fe5e503")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                 | Type                      | Required                  | Description               |
| ------------------------- | ------------------------- | ------------------------- | ------------------------- |
| `accountID`               | *String*                  | :heavy_check_mark:        | ID of the account.        |
| `representativeID`        | *String*                  | :heavy_check_mark:        | ID of the representative. |

### Response

**[DeleteRepresentativeResponse](../../models/operations/DeleteRepresentativeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Retrieve a specific representative associated with a given Moov account. Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/representatives.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepresentative" method="get" path="/accounts/{accountID}/representatives/{representativeID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetRepresentativeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        GetRepresentativeResponse res = sdk.representatives().get()
                .accountID("071b8a57-e691-4e4b-9143-75f1a828ce9b")
                .representativeID("00d87070-b167-48e6-be2f-198b5e1556c4")
                .call();

        if (res.representative().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                 | Type                      | Required                  | Description               |
| ------------------------- | ------------------------- | ------------------------- | ------------------------- |
| `accountID`               | *String*                  | :heavy_check_mark:        | ID of the account.        |
| `representativeID`        | *String*                  | :heavy_check_mark:        | ID of the representative. |

### Response

**[GetRepresentativeResponse](../../models/operations/GetRepresentativeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

If a representative's information has changed you can patch the information associated with a specific representative ID. 
Read our [business representatives guide](https://docs.moov.io/guides/accounts/requirements/business-representatives/) to learn more.

When **can** profile data be updated:

- For unverified representatives, all profile data can be edited.
- During the verification process, missing or incomplete profile data can be edited.
- Verified representatives can only add missing profile data.

When **can't** profile data be updated:

- Verified representatives cannot change any existing profile data.

If you need to update information in a locked state, please contact Moov support.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/representatives.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepresentative" method="patch" path="/accounts/{accountID}/representatives/{representativeID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UpdateRepresentativeResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        UpdateRepresentativeResponse res = sdk.representatives().update()
                .accountID("76647e2b-97ea-4551-8275-7153219f3317")
                .representativeID("e89d3d0d-fbe3-4df6-8b18-d7cbcb761161")
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
                    .birthDate(JsonNullable.of(null))
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `accountID`                                                             | *String*                                                                | :heavy_check_mark:                                                      | ID of the account.                                                      |
| `representativeID`                                                      | *String*                                                                | :heavy_check_mark:                                                      | ID of the representative.                                               |
| `updateRepresentative`                                                  | [UpdateRepresentative](../../models/components/UpdateRepresentative.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[UpdateRepresentativeResponse](../../models/operations/UpdateRepresentativeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |