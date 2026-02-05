# FeePlans

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
* [listFeeRevenue](#listfeerevenue) - Used by a partner. Retrieve revenue generated from merchant fees.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [retrieveFees](#retrievefees) - Retrieve fees assessed to an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [listFeesFetch](#listfeesfetch) - List fees associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [listPartnerPricingAgreements](#listpartnerpricingagreements) - List all partner pricing agreements associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [listResiduals](#listresiduals) - List all residuals associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [getResidual](#getresidual) - Get a residual associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [listResidualFees](#listresidualfees) - List all fees associated with a residual.

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
                    .username("")
                    .password("")
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
                    .username("")
                    .password("")
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
                    .username("")
                    .password("")
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

## listFeeRevenue

Used by a partner. Retrieve revenue generated from merchant fees.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listFeeRevenue" method="get" path="/accounts/{accountID}/fee-revenue" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListFeeRevenueRequest;
import io.moov.sdk.models.operations.ListFeeRevenueResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListFeeRevenueRequest req = ListFeeRevenueRequest.builder()
                .accountID("795465fb-f955-40e7-9d48-4a6d6fbdbdf2")
                .skip(60L)
                .count(20L)
                .build();

        ListFeeRevenueResponse res = sdk.feePlans().listFeeRevenue()
                .request(req)
                .call();

        if (res.incurredFees().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListFeeRevenueRequest](../../models/operations/ListFeeRevenueRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListFeeRevenueResponse](../../models/operations/ListFeeRevenueResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## retrieveFees

Retrieve fees assessed to an account.

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
                    .username("")
                    .password("")
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
                    .username("")
                    .password("")
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
                    .username("")
                    .password("")
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

## listResiduals

List all residuals associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listResiduals" method="get" path="/accounts/{accountID}/residuals" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListResidualsRequest;
import io.moov.sdk.models.operations.ListResidualsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListResidualsRequest req = ListResidualsRequest.builder()
                .accountID("8b40b967-ae12-4851-8be2-7b0c39978ce7")
                .skip(60L)
                .count(20L)
                .build();

        ListResidualsResponse res = sdk.feePlans().listResiduals()
                .request(req)
                .call();

        if (res.residuals().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListResidualsRequest](../../models/operations/ListResidualsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListResidualsResponse](../../models/operations/ListResidualsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getResidual

Get a residual associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getResidual" method="get" path="/accounts/{accountID}/residuals/{residualID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetResidualResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetResidualResponse res = sdk.feePlans().getResidual()
                .accountID("4c308842-45d1-49c1-98be-7299848b1e20")
                .residualID("5f30e43d-1fa8-4834-8788-05a3c27a40d4")
                .call();

        if (res.residual().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `accountID`                                              | *String*                                                 | :heavy_check_mark:                                       | N/A                                                      |
| `residualID`                                             | *String*                                                 | :heavy_check_mark:                                       | Unique identifier for this residual payment calculation. |

### Response

**[GetResidualResponse](../../models/operations/GetResidualResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listResidualFees

List all fees associated with a residual.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listResidualFees" method="get" path="/accounts/{accountID}/residuals/{residualID}/fees" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListResidualFeesRequest;
import io.moov.sdk.models.operations.ListResidualFeesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListResidualFeesRequest req = ListResidualFeesRequest.builder()
                .accountID("6b95293f-c3e7-42b5-98b7-fd9cc8d49685")
                .residualID("8ecb1a63-25e0-41e7-a9c7-bb8a1cf63d1c")
                .skip(60L)
                .count(20L)
                .build();

        ListResidualFeesResponse res = sdk.feePlans().listResidualFees()
                .request(req)
                .call();

        if (res.incurredFees().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListResidualFeesRequest](../../models/operations/ListResidualFeesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListResidualFeesResponse](../../models/operations/ListResidualFeesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |