# Branding
(*branding()*)

## Overview

### Available Operations

* [create](#create) - Create brand properties for the specified account.

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
import io.moov.sdk.models.components.Brand;
import io.moov.sdk.models.components.BrandColor;
import io.moov.sdk.models.components.Colors;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.BrandValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateBrandResponse;
import io.moov.sdk.models.operations.CreateBrandSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, BrandValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateBrandResponse res = sdk.branding().create()
                .security(CreateBrandSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202504)
                .accountID("7a621cf0-21cd-49cf-8540-3315211a509a")
                .brand(Brand.builder()
                    .colors(Colors.builder()
                        .dark(BrandColor.builder()
                            .accent("#111111")
                            .build())
                        .light(BrandColor.builder()
                            .accent("#111111")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.brand().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `security`                                                                                          | [io.moov.sdk.models.operations.CreateBrandSecurity](../../models/operations/CreateBrandSecurity.md) | :heavy_check_mark:                                                                                  | The security requirements to use for the request.                                                   |
| `xMoovVersion`                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                          | :heavy_minus_sign:                                                                                  | Specify an API version.                                                                             |
| `accountID`                                                                                         | *String*                                                                                            | :heavy_check_mark:                                                                                  | N/A                                                                                                 |
| `brand`                                                                                             | [Brand](../../models/components/Brand.md)                                                           | :heavy_check_mark:                                                                                  | N/A                                                                                                 |

### Response

**[CreateBrandResponse](../../models/operations/CreateBrandResponse.md)**

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
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetBrandResponse;
import io.moov.sdk.models.operations.GetBrandSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetBrandResponse res = sdk.branding().get()
                .security(GetBrandSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("07eb5173-1869-4649-9aa6-f399787a2751")
                .call();

        if (res.brand().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `security`                                                                                    | [io.moov.sdk.models.operations.GetBrandSecurity](../../models/operations/GetBrandSecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |
| `xMoovVersion`                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                    | :heavy_minus_sign:                                                                            | Specify an API version.                                                                       |
| `accountID`                                                                                   | *String*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |

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
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.UpdateBrand;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.BrandValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UpdateBrandResponse;
import io.moov.sdk.models.operations.UpdateBrandSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, BrandValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateBrandResponse res = sdk.branding().update()
                .security(UpdateBrandSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("6c1f5632-7f37-4b3d-861e-10e31b8853de")
                .updateBrand(UpdateBrand.builder()
                    .build())
                .call();

        if (res.brand().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `security`                                                                                          | [io.moov.sdk.models.operations.UpdateBrandSecurity](../../models/operations/UpdateBrandSecurity.md) | :heavy_check_mark:                                                                                  | The security requirements to use for the request.                                                   |
| `xMoovVersion`                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                          | :heavy_minus_sign:                                                                                  | Specify an API version.                                                                             |
| `accountID`                                                                                         | *String*                                                                                            | :heavy_check_mark:                                                                                  | N/A                                                                                                 |
| `updateBrand`                                                                                       | [UpdateBrand](../../models/components/UpdateBrand.md)                                               | :heavy_check_mark:                                                                                  | N/A                                                                                                 |

### Response

**[UpdateBrandResponse](../../models/operations/UpdateBrandResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/GenericError         | 400, 409                           | application/json                   |
| models/errors/BrandValidationError | 422                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |