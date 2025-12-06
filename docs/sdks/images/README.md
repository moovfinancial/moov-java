# Images

## Overview

### Available Operations

* [list](#list) - List metadata for all images in the specified account.
* [upload](#upload) -   Upload a new PNG, JPEG, or WebP image with optional metadata. 
  Duplicate images, and requests larger than 16MB will be rejected.
* [getMetadata](#getmetadata) - Retrieve metadata for a specific image by its ID.
* [update](#update) - Replace an existing image and, optionally, its metadata.

This endpoint replaces the existing image with the new PNG, JPEG, or WebP. Omit
the metadata form section to keep existing metadata. Duplicate images, and requests larger than 16MB will be rejected.
* [delete](#delete) - Permanently delete an image by its ID.
* [updateMetadata](#updatemetadata) - Replace the metadata for an existing image.
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
                .skip(60L)
                .count(20L)
                .call();

        if (res.imageMetadata().isPresent()) {
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

**[ListImageMetadataResponse](../../models/operations/ListImageMetadataResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## upload

  Upload a new PNG, JPEG, or WebP image with optional metadata. 
  Duplicate images, and requests larger than 16MB will be rejected.

### Example Usage

<!-- UsageSnippet language="java" operationID="uploadImage" method="post" path="/accounts/{accountID}/images" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ImageRequestValidationError;
import io.moov.sdk.models.operations.UploadImageResponse;
import io.moov.sdk.utils.Utils;
import java.io.FileInputStream;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, ImageRequestValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UploadImageResponse res = sdk.images().upload()
                .accountID("c0971a52-1f1c-4511-876a-f45c4cfd6154")
                .imageUploadRequestMultiPart(ImageUploadRequestMultiPart.builder()
                    .image(Image.builder()
                        .fileName("example.file")
                        .content(Utils.readBytesAndClose(new FileInputStream("example.file")))
                        .build())
                    .build())
                .call();

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `accountID`                                                                           | *String*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `imageUploadRequestMultiPart`                                                         | [ImageUploadRequestMultiPart](../../models/components/ImageUploadRequestMultiPart.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |

### Response

**[UploadImageResponse](../../models/operations/UploadImageResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GenericError                | 400, 409                                  | application/json                          |
| models/errors/ImageRequestValidationError | 422                                       | application/json                          |
| models/errors/APIException                | 4XX, 5XX                                  | \*/\*                                     |

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

## update

Replace an existing image and, optionally, its metadata.

This endpoint replaces the existing image with the new PNG, JPEG, or WebP. Omit
the metadata form section to keep existing metadata. Duplicate images, and requests larger than 16MB will be rejected.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateImage" method="put" path="/accounts/{accountID}/images/{imageID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ImageRequestValidationError;
import io.moov.sdk.models.operations.UpdateImageResponse;
import io.moov.sdk.utils.Utils;
import java.io.FileInputStream;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, ImageRequestValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateImageResponse res = sdk.images().update()
                .accountID("310f4f19-45cf-4429-9aae-8e93827ecb0d")
                .imageID("8ef109f8-5a61-4355-b2e4-b8ac2f6f6f47")
                .imageUploadRequestMultiPart(ImageUploadRequestMultiPart.builder()
                    .image(Image.builder()
                        .fileName("example.file")
                        .content(Utils.readBytesAndClose(new FileInputStream("example.file")))
                        .build())
                    .build())
                .call();

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `accountID`                                                                           | *String*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `imageID`                                                                             | *String*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `imageUploadRequestMultiPart`                                                         | [ImageUploadRequestMultiPart](../../models/components/ImageUploadRequestMultiPart.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |

### Response

**[UpdateImageResponse](../../models/operations/UpdateImageResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GenericError                | 400, 409                                  | application/json                          |
| models/errors/ImageRequestValidationError | 422                                       | application/json                          |
| models/errors/APIException                | 4XX, 5XX                                  | \*/\*                                     |

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

## updateMetadata

Replace the metadata for an existing image.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateImageMetadata" method="put" path="/accounts/{accountID}/images/{imageID}/metadata" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.ImageMetadataRequest;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ImageMetadataValidationError;
import io.moov.sdk.models.operations.UpdateImageMetadataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, ImageMetadataValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateImageMetadataResponse res = sdk.images().updateMetadata()
                .accountID("58c3c937-e648-49c5-88be-6225cca35af1")
                .imageID("d957e703-ecd4-48ac-9c14-c0ecf1b496f0")
                .imageMetadataRequest(ImageMetadataRequest.builder()
                    .build())
                .call();

        if (res.imageMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `accountID`                                                             | *String*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `imageID`                                                               | *String*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `imageMetadataRequest`                                                  | [ImageMetadataRequest](../../models/components/ImageMetadataRequest.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[UpdateImageMetadataResponse](../../models/operations/UpdateImageMetadataResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GenericError                 | 400, 409                                   | application/json                           |
| models/errors/ImageMetadataValidationError | 422                                        | application/json                           |
| models/errors/APIException                 | 4XX, 5XX                                   | \*/\*                                      |

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