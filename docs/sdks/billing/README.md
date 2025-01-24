# Billing
(*billing()*)

## Overview

### Available Operations

* [listFeePlanAgreements](#listfeeplanagreements) - List all fee plan agreements associated with an account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.
* [createFeePlanAgreements](#createfeeplanagreements) - Creates the subscription of a fee plan to a merchant account. Merchants are required to accept the fee plan terms prior to activation.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.write` scope.
* [listFeePlans](#listfeeplans) - List all fee plans available for use by an account. This is intended to be used by an account when 
selecting a fee plan to apply to a connected account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.
* [listPartnerPricing](#listpartnerpricing) - List all partner pricing plans available for use by an account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.
* [listPartnerPricingAgreements](#listpartnerpricingagreements) - List all partner pricing agreements associated with an account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.

## listFeePlanAgreements

List all fee plan agreements associated with an account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.FeePlanAgreementStatus;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListFeePlanAgreementsResponse;
import io.moov.sdk.models.operations.ListFeePlanAgreementsSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListFeePlanAgreementsResponse res = sdk.billing().listFeePlanAgreements()
                .security(ListFeePlanAgreementsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .accountID("4c49ae91-2b32-4a4d-91bf-f062f3c2f38d")
                .agreementID(List.of(
                    "<id>"))
                .status(List.of(
                    FeePlanAgreementStatus.TERMINATED))
                .call();

        if (res.feePlanAgreements().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                              | [io.moov.sdk.models.operations.ListFeePlanAgreementsSecurity](../../models/operations/ListFeePlanAgreementsSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |
| `xMoovVersion`                                                                                                          | [Optional\<Versions>](../../models/components/Versions.md)                                                              | :heavy_minus_sign:                                                                                                      | Specify an API version.                                                                                                 |
| `accountID`                                                                                                             | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |
| `agreementID`                                                                                                           | List\<*String*>                                                                                                         | :heavy_minus_sign:                                                                                                      | A comma-separated list of agreement IDs to filter the results by.                                                       |
| `status`                                                                                                                | List\<[FeePlanAgreementStatus](../../models/components/FeePlanAgreementStatus.md)>                                      | :heavy_minus_sign:                                                                                                      | A comma-separated list of statuses to filter the results by.                                                            |

### Response

**[ListFeePlanAgreementsResponse](../../models/operations/ListFeePlanAgreementsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## createFeePlanAgreements

Creates the subscription of a fee plan to a merchant account. Merchants are required to accept the fee plan terms prior to activation.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateFeePlanAgreement;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.FeePlanAgreementError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateFeePlanAgreementsResponse;
import io.moov.sdk.models.operations.CreateFeePlanAgreementsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, FeePlanAgreementError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateFeePlanAgreementsResponse res = sdk.billing().createFeePlanAgreements()
                .security(CreateFeePlanAgreementsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("19962eb8-00cd-44e5-8a66-a1ebaf88c2fe")
                .createFeePlanAgreement(CreateFeePlanAgreement.builder()
                    .planID("b97c2d59-80c5-49ac-b1fc-40e3a81d8daf")
                    .build())
                .call();

        if (res.feePlanAgreement().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                  | [io.moov.sdk.models.operations.CreateFeePlanAgreementsSecurity](../../models/operations/CreateFeePlanAgreementsSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |
| `xMoovVersion`                                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                                  | :heavy_minus_sign:                                                                                                          | Specify an API version.                                                                                                     |
| `accountID`                                                                                                                 | *String*                                                                                                                    | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `createFeePlanAgreement`                                                                                                    | [CreateFeePlanAgreement](../../models/components/CreateFeePlanAgreement.md)                                                 | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |

### Response

**[CreateFeePlanAgreementsResponse](../../models/operations/CreateFeePlanAgreementsResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400, 409                            | application/json                    |
| models/errors/FeePlanAgreementError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## listFeePlans

List all fee plans available for use by an account. This is intended to be used by an account when 
selecting a fee plan to apply to a connected account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListFeePlansResponse;
import io.moov.sdk.models.operations.ListFeePlansSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListFeePlansResponse res = sdk.billing().listFeePlans()
                .security(ListFeePlansSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("ac8fa716-4b75-4902-b296-d734524ca45c")
                .planIDs(List.of(
                    "<value>"))
                .call();

        if (res.feePlans().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `security`                                                                                            | [io.moov.sdk.models.operations.ListFeePlansSecurity](../../models/operations/ListFeePlansSecurity.md) | :heavy_check_mark:                                                                                    | The security requirements to use for the request.                                                     |
| `xMoovVersion`                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                            | :heavy_minus_sign:                                                                                    | Specify an API version.                                                                               |
| `accountID`                                                                                           | *String*                                                                                              | :heavy_check_mark:                                                                                    | N/A                                                                                                   |
| `planIDs`                                                                                             | List\<*String*>                                                                                       | :heavy_minus_sign:                                                                                    | A comma-separated list of plan IDs to filter the results by.                                          |

### Response

**[ListFeePlansResponse](../../models/operations/ListFeePlansResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listPartnerPricing

List all partner pricing plans available for use by an account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListPartnerPricingResponse;
import io.moov.sdk.models.operations.ListPartnerPricingSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListPartnerPricingResponse res = sdk.billing().listPartnerPricing()
                .security(ListPartnerPricingSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("85f15b07-5c44-4302-ab6f-d22f8d45b7f4")
                .planIDs(List.of(
                    "<value>"))
                .call();

        if (res.partnerPricings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                        | [io.moov.sdk.models.operations.ListPartnerPricingSecurity](../../models/operations/ListPartnerPricingSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |
| `xMoovVersion`                                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                                        | :heavy_minus_sign:                                                                                                | Specify an API version.                                                                                           |
| `accountID`                                                                                                       | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |
| `planIDs`                                                                                                         | List\<*String*>                                                                                                   | :heavy_minus_sign:                                                                                                | A comma-separated list of plan IDs to filter the results by.                                                      |

### Response

**[ListPartnerPricingResponse](../../models/operations/ListPartnerPricingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listPartnerPricingAgreements

List all partner pricing agreements associated with an account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.FeePlanAgreementStatus;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListPartnerPricingAgreementsResponse;
import io.moov.sdk.models.operations.ListPartnerPricingAgreementsSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListPartnerPricingAgreementsResponse res = sdk.billing().listPartnerPricingAgreements()
                .security(ListPartnerPricingAgreementsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("9366921a-25de-4c52-8ec6-4cd4ef557223")
                .agreementID(List.of(
                    "<id>"))
                .status(List.of(
                    FeePlanAgreementStatus.ACTIVE))
                .call();

        if (res.partnerPricingAgreements().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                            | [io.moov.sdk.models.operations.ListPartnerPricingAgreementsSecurity](../../models/operations/ListPartnerPricingAgreementsSecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |
| `xMoovVersion`                                                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                                                            | :heavy_minus_sign:                                                                                                                    | Specify an API version.                                                                                                               |
| `accountID`                                                                                                                           | *String*                                                                                                                              | :heavy_check_mark:                                                                                                                    | N/A                                                                                                                                   |
| `agreementID`                                                                                                                         | List\<*String*>                                                                                                                       | :heavy_minus_sign:                                                                                                                    | A comma-separated list of agreement IDs to filter the results by.                                                                     |
| `status`                                                                                                                              | List\<[FeePlanAgreementStatus](../../models/components/FeePlanAgreementStatus.md)>                                                    | :heavy_minus_sign:                                                                                                                    | A comma-separated list of statuses to filter the results by.                                                                          |

### Response

**[ListPartnerPricingAgreementsResponse](../../models/operations/ListPartnerPricingAgreementsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |