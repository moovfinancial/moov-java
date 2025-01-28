# Files
(*files()*)

## Overview

### Available Operations

* [upload](#upload) - Upload a file and link it to the specified Moov account. 

The maximum file size is 10MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf, 
and png. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/files.write` scope.
* [list](#list) - List all the files associated with a particular Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/files.read` scope.
* [get](#get) - Retrieve file details associated with a specific Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/files.read` scope.

## upload

Upload a file and link it to the specified Moov account. 

The maximum file size is 10MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf, 
and png. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/files.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.FilePurpose;
import io.moov.sdk.models.components.FileUploadRequestMultiPart;
import io.moov.sdk.models.components.FileUploadRequestMultiPartFile;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.FileValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UploadFileResponse;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws GenericError, FileValidationError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UploadFileResponse res = sdk.files().upload()
                .xMoovVersion(Versions.V202504)
                .accountID("68f95825-1ae3-4f3f-8af2-789dd2a59d6d")
                .fileUploadRequestMultiPart(FileUploadRequestMultiPart.builder()
                    .file(FileUploadRequestMultiPartFile.builder()
                        .fileName("example.file")
                        .content("0xcc9e675ad1".getBytes(StandardCharsets.UTF_8))
                        .build())
                    .filePurpose(FilePurpose.REPRESENTATIVE_VERIFICATION)
                    .metadata("{\"requirement_id\": \"document.individual.verification\"}")
                    .build())
                .call();

        if (res.fileDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                          | :heavy_minus_sign:                                                                  | Specify an API version.                                                             |
| `accountID`                                                                         | *String*                                                                            | :heavy_check_mark:                                                                  | N/A                                                                                 |
| `fileUploadRequestMultiPart`                                                        | [FileUploadRequestMultiPart](../../models/components/FileUploadRequestMultiPart.md) | :heavy_check_mark:                                                                  | N/A                                                                                 |

### Response

**[UploadFileResponse](../../models/operations/UploadFileResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/GenericError        | 400, 409                          | application/json                  |
| models/errors/FileValidationError | 422                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## list

List all the files associated with a particular Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/files.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListFilesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListFilesResponse res = sdk.files().list()
                .xMoovVersion(Versions.V202510)
                .accountID("a3c35406-9eb6-4801-bbac-0649c31c058a")
                .call();

        if (res.fileDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `xMoovVersion`                                             | [Optional\<Versions>](../../models/components/Versions.md) | :heavy_minus_sign:                                         | Specify an API version.                                    |
| `accountID`                                                | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |

### Response

**[ListFilesResponse](../../models/operations/ListFilesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Retrieve file details associated with a specific Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/files.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetFileDetailsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetFileDetailsResponse res = sdk.files().get()
                .xMoovVersion(Versions.V202510)
                .accountID("346add0a-4dae-4729-8e74-1a50d00d677a")
                .fileID("bf657841-ba2d-4060-ad21-eb2b7372cf85")
                .call();

        if (res.fileDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `xMoovVersion`                                             | [Optional\<Versions>](../../models/components/Versions.md) | :heavy_minus_sign:                                         | Specify an API version.                                    |
| `accountID`                                                | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `fileID`                                                   | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |

### Response

**[GetFileDetailsResponse](../../models/operations/GetFileDetailsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |