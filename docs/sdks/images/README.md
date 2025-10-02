# Images
(*images()*)

## Overview

### Available Operations

* [list](#list) - List metadata for all images in the specified account.
* [getMetadata](#getmetadata) - Retrieve metadata for a specific image by its ID.
* [delete](#delete) - Permanently delete an image by its ID.
* [getPublic](#getpublic) - Get an image by its public ID.

## list

List metadata for all images in the specified account.

### Example Usage

<!-- UsageSnippet language="java" operationID="listImageMetadata" method="get" path="/accounts/{accountID}/images" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListImageMetadataResponse;
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

        ListImageMetadataResponse res = sdk.images().list()
                .accountID("3a4ed2d9-03e1-4b0e-b45f-2a9ca72f8adb")
                .call();

        if (res.imageMetadata().isPresent()) {
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

**[ListImageMetadataResponse](../../models/operations/ListImageMetadataResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getMetadata

Retrieve metadata for a specific image by its ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getImageMetadata" method="get" path="/accounts/{accountID}/images/{imageID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetImageMetadataResponse;
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

        GetImageMetadataResponse res = sdk.images().getMetadata()
                .accountID("6cf66a43-31ce-4d27-8dd4-130fa57f0a6f")
                .imageID("7cec5bd3-6340-4de4-a923-bf6ec0f7e921")
                .call();

        if (res.imageMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `imageID`          | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetImageMetadataResponse](../../models/operations/GetImageMetadataResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## delete

Permanently delete an image by its ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteImage" method="delete" path="/accounts/{accountID}/images/{imageID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DeleteImageResponse;
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

        DeleteImageResponse res = sdk.images().delete()
                .accountID("866c32ce-2536-4b21-8e12-f8c474fb2a9b")
                .imageID("ca048253-31d2-4bfb-9077-1f07a2a09f26")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `imageID`          | *String*           | :heavy_check_mark: | N/A                |

### Response

**[DeleteImageResponse](../../models/operations/DeleteImageResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getPublic

Get an image by its public ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPublicImage" method="get" path="/images/{publicID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.operations.GetPublicImageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetPublicImageResponse res = sdk.images().getPublic()
                .publicID("<id>")
                .size("400x400")
                .call();

        if (res.twoHundredImageWebpResponseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                          | Type                                                                                                                                                                                                                                                                               | Required                                                                                                                                                                                                                                                                           | Description                                                                                                                                                                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ifNoneMatch`                                                                                                                                                                                                                                                                      | *Optional\<String>*                                                                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                                                                 | N/A                                                                                                                                                                                                                                                                                |
| `publicID`                                                                                                                                                                                                                                                                         | *String*                                                                                                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                                                                                 | N/A                                                                                                                                                                                                                                                                                |
| `size`                                                                                                                                                                                                                                                                             | *Optional\<String>*                                                                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                                                                 | Optional parameter to request a resized version of the image (WxH).<br/><br/>If either dimension is 0, the image will be scaled proportionally based on<br/>the non-zero dimension. Dimensions are capped at 2048 pixels. A default size<br/>of 400x400 will be used if this parameter is omitted. |

### Response

**[GetPublicImageResponse](../../models/operations/GetPublicImageResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |