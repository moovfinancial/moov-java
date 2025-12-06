# Products

## Overview

### Available Operations

* [list](#list) - List active (non-disabled) products for an account.
* [create](#create) - Creates a new product for the specified account.
* [get](#get) - Retrieve a product by ID.
* [update](#update) - Update a product and its options.
* [disable](#disable) - Disable a product by ID.

The product will no longer be available, but will remain in the system for historical and reporting purposes.

## list

List active (non-disabled) products for an account.

### Example Usage

<!-- UsageSnippet language="java" operationID="listProducts" method="get" path="/accounts/{accountID}/products" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListProductsResponse;
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

        ListProductsResponse res = sdk.products().list()
                .accountID("cd696219-4308-446c-b0d8-1759254995c2")
                .skip(60L)
                .count(20L)
                .call();

        if (res.products().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |                    |
| `skip`             | *Optional\<Long>*  | :heavy_minus_sign: | N/A                | 60                 |
| `count`            | *Optional\<Long>*  | :heavy_minus_sign: | N/A                | 20                 |

### Response

**[ListProductsResponse](../../models/operations/ListProductsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## create

Creates a new product for the specified account.

### Example Usage

<!-- UsageSnippet language="java" operationID="createProduct" method="post" path="/accounts/{accountID}/products" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ProductRequestValidationError;
import io.moov.sdk.models.operations.CreateProductResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, ProductRequestValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateProductResponse res = sdk.products().create()
                .accountID("27cd3181-7c1c-4d81-b020-e7d55c33941f")
                .productRequest(ProductRequest.builder()
                    .title("World's best lemonade")
                    .basePrice(AmountDecimal.builder()
                        .currency("USD")
                        .valueDecimal("4.99")
                        .build())
                    .description("Really, the best.")
                    .images(List.of(
                        AssignProductImage.builder()
                            .imageID("fed91252-6f48-4b70-885e-520bf53a52ff")
                            .build(),
                        AssignProductImage.builder()
                            .imageID("eb466644-0a58-4b87-af1e-94d03e223ad2")
                            .build()))
                    .optionGroups(List.of(
                        CreateProductOptionGroup.builder()
                            .name("Flavor add-ins")
                            .minSelect(0)
                            .maxSelect(3)
                            .options(List.of(
                                CreateProductOption.builder()
                                    .name("Strawberry puree")
                                    .description("Fresh and fruity.")
                                    .priceModifier(AmountDecimal.builder()
                                        .currency("USD")
                                        .valueDecimal("0.99")
                                        .build())
                                    .images(List.of(
                                        AssignProductImage.builder()
                                            .imageID("d359808d-9896-4414-8d17-dac43f35842d")
                                            .build()))
                                    .build(),
                                CreateProductOption.builder()
                                    .name("Passionfruit syrup")
                                    .priceModifier(AmountDecimal.builder()
                                        .currency("USD")
                                        .valueDecimal("0.49")
                                        .build())
                                    .build(),
                                CreateProductOption.builder()
                                    .name("Cherry syrup")
                                    .priceModifier(AmountDecimal.builder()
                                        .currency("USD")
                                        .valueDecimal("0.49")
                                        .build())
                                    .build()))
                            .description("Choose up to 3 flavor add-ins to enhance your lemonade.")
                            .build(),
                        CreateProductOptionGroup.builder()
                            .name("Sweetener")
                            .minSelect(1)
                            .maxSelect(1)
                            .options(List.of(
                                CreateProductOption.builder()
                                    .name("Cane Sugar")
                                    .build(),
                                CreateProductOption.builder()
                                    .name("Honey")
                                    .priceModifier(AmountDecimal.builder()
                                        .currency("USD")
                                        .valueDecimal("0.99")
                                        .build())
                                    .build(),
                                CreateProductOption.builder()
                                    .name("Stevia")
                                    .description("Natural, zero-calorie sweetener.")
                                    .build()))
                            .description("Choose a sweetener for your lemonade.")
                            .build()))
                    .build())
                .call();

        if (res.product().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `accountID`                                                 | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |
| `productRequest`                                            | [ProductRequest](../../models/components/ProductRequest.md) | :heavy_check_mark:                                          | N/A                                                         |

### Response

**[CreateProductResponse](../../models/operations/CreateProductResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GenericError                  | 400, 409                                    | application/json                            |
| models/errors/ProductRequestValidationError | 422                                         | application/json                            |
| models/errors/APIException                  | 4XX, 5XX                                    | \*/\*                                       |

## get

Retrieve a product by ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getProduct" method="get" path="/accounts/{accountID}/products/{productID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetProductResponse;
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

        GetProductResponse res = sdk.products().get()
                .accountID("a749d848-5ebc-42a4-9ae6-555804317835")
                .productID("dd0b4873-5cf5-4aa8-aa86-e31d86f7e38a")
                .call();

        if (res.product().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `productID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetProductResponse](../../models/operations/GetProductResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Update a product and its options.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateProduct" method="put" path="/accounts/{accountID}/products/{productID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ProductRequestValidationError;
import io.moov.sdk.models.operations.UpdateProductResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, ProductRequestValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateProductResponse res = sdk.products().update()
                .accountID("7a7b55ed-d90d-4e83-a8f6-f146eaebd0cc")
                .productID("fa407877-3b46-4484-814e-65b147d76a9e")
                .productRequest(ProductRequest.builder()
                    .title("<value>")
                    .basePrice(AmountDecimal.builder()
                        .currency("USD")
                        .valueDecimal("12.987654321")
                        .build())
                    .optionGroups(List.of(
                        CreateProductOptionGroup.builder()
                            .name("<value>")
                            .minSelect(328576)
                            .maxSelect(430951)
                            .options(List.of())
                            .build()))
                    .build())
                .call();

        if (res.product().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `accountID`                                                 | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |
| `productID`                                                 | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |
| `productRequest`                                            | [ProductRequest](../../models/components/ProductRequest.md) | :heavy_check_mark:                                          | N/A                                                         |

### Response

**[UpdateProductResponse](../../models/operations/UpdateProductResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GenericError                  | 400, 409                                    | application/json                            |
| models/errors/ProductRequestValidationError | 422                                         | application/json                            |
| models/errors/APIException                  | 4XX, 5XX                                    | \*/\*                                       |

## disable

Disable a product by ID.

The product will no longer be available, but will remain in the system for historical and reporting purposes.

### Example Usage

<!-- UsageSnippet language="java" operationID="disableProduct" method="delete" path="/accounts/{accountID}/products/{productID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DisableProductResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DisableProductResponse res = sdk.products().disable()
                .accountID("9fbe72c0-abba-4bb7-b1d0-d15ee702fe62")
                .productID("1e11a7dc-4e86-41ed-b256-55c22f3bfd38")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `productID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[DisableProductResponse](../../models/operations/DisableProductResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |