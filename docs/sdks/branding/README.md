# Branding
(*branding()*)

## Overview

### Available Operations

* [create](#create) - Create brand properties for the specified account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/branding.write` scope.
* [upsert](#upsert) - Create or replace brand properties for the specified account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/branding.write` scope.
* [get](#get) - Get brand properties for the specified account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/branding.read` scope.
* [update](#update) - Updates the brand properties for the specified account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/branding.write` scope.

## create

Create brand properties for the specified account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/branding.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.BrandValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateBrandResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, BrandValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        CreateBrandResponse res = sdk.branding().create()
                .accountID("0a6ae927-b52b-4ef4-86d0-288f27479817")
                .brandProperties(BrandProperties.builder()
                    .colors(BrandColors.builder()
                        .dark(BrandColor.builder()
                            .accent("#111111")
                            .build())
                        .light(BrandColor.builder()
                            .accent("#111111")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.brandProperties().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `accountID`                                                   | *String*                                                      | :heavy_check_mark:                                            | N/A                                                           |
| `brandProperties`                                             | [BrandProperties](../../models/components/BrandProperties.md) | :heavy_check_mark:                                            | N/A                                                           |

### Response

**[CreateBrandResponse](../../models/operations/CreateBrandResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/GenericError         | 400, 409                           | application/json                   |
| models/errors/BrandValidationError | 422                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## upsert

Create or replace brand properties for the specified account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/branding.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.BrandValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UpsertBrandResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, BrandValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        UpsertBrandResponse res = sdk.branding().upsert()
                .accountID("0cd408b1-a57d-477b-825b-12331c2ed00a")
                .brandProperties(BrandProperties.builder()
                    .colors(BrandColors.builder()
                        .dark(BrandColor.builder()
                            .accent("#111111")
                            .build())
                        .light(BrandColor.builder()
                            .accent("#111111")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.brandProperties().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `accountID`                                                   | *String*                                                      | :heavy_check_mark:                                            | N/A                                                           |
| `brandProperties`                                             | [BrandProperties](../../models/components/BrandProperties.md) | :heavy_check_mark:                                            | N/A                                                           |

### Response

**[UpsertBrandResponse](../../models/operations/UpsertBrandResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/GenericError         | 400, 409                           | application/json                   |
| models/errors/BrandValidationError | 422                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## get

Get brand properties for the specified account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/branding.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetBrandResponse;
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

        GetBrandResponse res = sdk.branding().get()
                .accountID("8a4ec43e-d45f-481d-a291-683cb221e3cc")
                .call();

        if (res.brandProperties().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetBrandResponse](../../models/operations/GetBrandResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Updates the brand properties for the specified account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/branding.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.UpdateBrand;
import io.moov.sdk.models.errors.BrandValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UpdateBrandResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, BrandValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        UpdateBrandResponse res = sdk.branding().update()
                .accountID("0c0dc4a5-ecd9-4223-810a-a71632980156")
                .updateBrand(UpdateBrand.builder()
                    .build())
                .call();

        if (res.brandProperties().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `accountID`                                           | *String*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `updateBrand`                                         | [UpdateBrand](../../models/components/UpdateBrand.md) | :heavy_check_mark:                                    | N/A                                                   |

### Response

**[UpdateBrandResponse](../../models/operations/UpdateBrandResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/GenericError         | 400, 409                           | application/json                   |
| models/errors/BrandValidationError | 422                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |