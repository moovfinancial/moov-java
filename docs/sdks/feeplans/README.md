# FeePlans
(*feePlans()*)

## Overview

### Available Operations

* [listFeePlanAgreements](#listfeeplanagreements) - List all fee plan agreements associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [createFeePlanAgreements](#createfeeplanagreements) - Creates the subscription of a fee plan to a merchant account. Merchants are required to accept the fee plan terms prior to activation.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.write` scope.
* [listFeePlans](#listfeeplans) - List all fee plans available for use by an account. This is intended to be used by an account when 
selecting a fee plan to apply to a connected account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [retrieveFees](#retrievefees) - Retrieve fees associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [listFeesFetch](#listfeesfetch) - List fees associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [listPartnerPricing](#listpartnerpricing) - List all partner pricing plans available for use by an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [listPartnerPricingAgreements](#listpartnerpricingagreements) - List all partner pricing agreements associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

## listFeePlanAgreements

List all fee plan agreements associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listFeePlanAgreements" method="get" path="/accounts/{accountID}/fee-plan-agreements" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListFeePlanAgreementsRequest;
import io.moov.sdk.models.operations.ListFeePlanAgreementsResponse;
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

        ListFeePlanAgreementsRequest req = ListFeePlanAgreementsRequest.builder()
                .accountID("93c43634-5477-42a7-972d-01fa76a09e17")
                .skip(60L)
                .count(20L)
                .build();

        ListFeePlanAgreementsResponse res = sdk.feePlans().listFeePlanAgreements()
                .request(req)
                .call();

        if (res.feePlanAgreements().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListFeePlanAgreementsRequest](../../models/operations/ListFeePlanAgreementsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListFeePlanAgreementsResponse](../../models/operations/ListFeePlanAgreementsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## createFeePlanAgreements

Creates the subscription of a fee plan to a merchant account. Merchants are required to accept the fee plan terms prior to activation.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createFeePlanAgreements" method="post" path="/accounts/{accountID}/fee-plan-agreements" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateFeePlanAgreement;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.FeePlanAgreementError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateFeePlanAgreementsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, FeePlanAgreementError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        CreateFeePlanAgreementsResponse res = sdk.feePlans().createFeePlanAgreements()
                .accountID("409c6b4b-e622-40c2-9dc4-fb494e555723")
                .createFeePlanAgreement(CreateFeePlanAgreement.builder()
                    .planID("19801f96-ea27-4610-b4d1-8c6b46f37928")
                    .build())
                .call();

        if (res.feePlanAgreement().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `accountID`                                                                 | *String*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         |
| `createFeePlanAgreement`                                                    | [CreateFeePlanAgreement](../../models/components/CreateFeePlanAgreement.md) | :heavy_check_mark:                                                          | N/A                                                                         |

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

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listFeePlans" method="get" path="/accounts/{accountID}/fee-plans" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListFeePlansResponse;
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

        ListFeePlansResponse res = sdk.feePlans().listFeePlans()
                .accountID("b3d59179-f74e-4ee8-b123-33220b3c7d4b")
                .call();

        if (res.feePlans().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `accountID`                                                  | *String*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `planIDs`                                                    | List\<*String*>                                              | :heavy_minus_sign:                                           | A comma-separated list of plan IDs to filter the results by. |

### Response

**[ListFeePlansResponse](../../models/operations/ListFeePlansResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## retrieveFees

Retrieve fees associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="retrieveFees" method="get" path="/accounts/{accountID}/fees" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.RetrieveFeesRequest;
import io.moov.sdk.models.operations.RetrieveFeesResponse;
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

        RetrieveFeesRequest req = RetrieveFeesRequest.builder()
                .accountID("89daf02d-b6b3-4fbf-b20d-5bf967324682")
                .skip(60L)
                .count(20L)
                .build();

        RetrieveFeesResponse res = sdk.feePlans().retrieveFees()
                .request(req)
                .call();

        if (res.incurredFees().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [RetrieveFeesRequest](../../models/operations/RetrieveFeesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[RetrieveFeesResponse](../../models/operations/RetrieveFeesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listFeesFetch

List fees associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listFeesFetch" method="post" path="/accounts/{accountID}/fees/.fetch" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListFeesFetchResponse;
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

        ListFeesFetchResponse res = sdk.feePlans().listFeesFetch()
                .accountID("55c34e26-269d-4872-8e42-0fa83e3f4b10")
                .call();

        if (res.incurredFees().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `accountID`                                                                        | *String*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                |
| `listFeesFetchRequest`                                                             | [Optional\<ListFeesFetchRequest>](../../models/components/ListFeesFetchRequest.md) | :heavy_minus_sign:                                                                 | N/A                                                                                |

### Response

**[ListFeesFetchResponse](../../models/operations/ListFeesFetchResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listPartnerPricing

List all partner pricing plans available for use by an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPartnerPricing" method="get" path="/accounts/{accountID}/partner-pricing" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListPartnerPricingResponse;
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

        ListPartnerPricingResponse res = sdk.feePlans().listPartnerPricing()
                .accountID("600637f9-c38a-473f-b909-0d5ac537b8a5")
                .call();

        if (res.partnerPricings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `accountID`                                                  | *String*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `planIDs`                                                    | List\<*String*>                                              | :heavy_minus_sign:                                           | A comma-separated list of plan IDs to filter the results by. |

### Response

**[ListPartnerPricingResponse](../../models/operations/ListPartnerPricingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listPartnerPricingAgreements

List all partner pricing agreements associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPartnerPricingAgreements" method="get" path="/accounts/{accountID}/partner-pricing-agreements" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListPartnerPricingAgreementsRequest;
import io.moov.sdk.models.operations.ListPartnerPricingAgreementsResponse;
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

        ListPartnerPricingAgreementsRequest req = ListPartnerPricingAgreementsRequest.builder()
                .accountID("123bfe5e-2288-4146-9d8a-4c07264c3758")
                .skip(60L)
                .count(20L)
                .build();

        ListPartnerPricingAgreementsResponse res = sdk.feePlans().listPartnerPricingAgreements()
                .request(req)
                .call();

        if (res.partnerPricingAgreements().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListPartnerPricingAgreementsRequest](../../models/operations/ListPartnerPricingAgreementsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListPartnerPricingAgreementsResponse](../../models/operations/ListPartnerPricingAgreementsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |