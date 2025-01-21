# Branding
(*branding()*)

## Overview

### Available Operations

* [postBrand](#postbrand) - Creates the brand properties for the specified account.
* [getBrand](#getbrand) - Gets the brand properties for the specified account.
* [updateBrand](#updatebrand) - Updates the brand properties for the specified account.

## postBrand

Creates the brand properties for the specified account.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.Brand;
import io.moov.openapi.models.components.BrandColor;
import io.moov.openapi.models.components.Colors;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.BrandValidationError;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.PostBrandResponse;
import io.moov.openapi.models.operations.PostBrandSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, BrandValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        PostBrandResponse res = sdk.branding().postBrand()
                .security(PostBrandSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("e0ae5cc2-d23b-44c7-b778-06f786dadb4b")
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
| `security`                                                                                          | [io.moov.openapi.models.operations.PostBrandSecurity](../../models/operations/PostBrandSecurity.md) | :heavy_check_mark:                                                                                  | The security requirements to use for the request.                                                   |
| `xMoovVersion`                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                          | :heavy_minus_sign:                                                                                  | Specify an API version.                                                                             |
| `accountID`                                                                                         | *String*                                                                                            | :heavy_check_mark:                                                                                  | N/A                                                                                                 |
| `brand`                                                                                             | [Brand](../../models/components/Brand.md)                                                           | :heavy_check_mark:                                                                                  | N/A                                                                                                 |

### Response

**[PostBrandResponse](../../models/operations/PostBrandResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/GenericError         | 400, 409                           | application/json                   |
| models/errors/BrandValidationError | 422                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## getBrand

Gets the brand properties for the specified account.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetBrandResponse;
import io.moov.openapi.models.operations.GetBrandSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetBrandResponse res = sdk.branding().getBrand()
                .security(GetBrandSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
                .accountID("07eb5173-1869-4649-9aa6-f399787a2751")
                .call();

        if (res.brand().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `security`                                                                                        | [io.moov.openapi.models.operations.GetBrandSecurity](../../models/operations/GetBrandSecurity.md) | :heavy_check_mark:                                                                                | The security requirements to use for the request.                                                 |
| `xMoovVersion`                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                        | :heavy_minus_sign:                                                                                | Specify an API version.                                                                           |
| `accountID`                                                                                       | *String*                                                                                          | :heavy_check_mark:                                                                                | N/A                                                                                               |

### Response

**[GetBrandResponse](../../models/operations/GetBrandResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateBrand

Updates the brand properties for the specified account.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.UpdateBrand;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.BrandValidationError;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.UpdateBrandResponse;
import io.moov.openapi.models.operations.UpdateBrandSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, BrandValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateBrandResponse res = sdk.branding().updateBrand()
                .security(UpdateBrandSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `security`                                                                                              | [io.moov.openapi.models.operations.UpdateBrandSecurity](../../models/operations/UpdateBrandSecurity.md) | :heavy_check_mark:                                                                                      | The security requirements to use for the request.                                                       |
| `xMoovVersion`                                                                                          | [Optional\<Versions>](../../models/components/Versions.md)                                              | :heavy_minus_sign:                                                                                      | Specify an API version.                                                                                 |
| `accountID`                                                                                             | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     |
| `updateBrand`                                                                                           | [UpdateBrand](../../models/components/UpdateBrand.md)                                                   | :heavy_check_mark:                                                                                      | N/A                                                                                                     |

### Response

**[UpdateBrandResponse](../../models/operations/UpdateBrandResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/GenericError         | 400, 409                           | application/json                   |
| models/errors/BrandValidationError | 422                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |