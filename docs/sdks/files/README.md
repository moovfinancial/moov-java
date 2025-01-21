# Files
(*files()*)

## Overview

### Available Operations

* [uploadFile](#uploadfile) - Upload a file and link it to the specified Moov account. 

The maximum file size is 10MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf, 
and png. 

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the 
`/accounts/{accountID}/files.write` scope.
* [listFiles](#listfiles) - List all the files associated with a particular Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the 
`/accounts/{accountID}/files.read` scope.
* [getFileDetails](#getfiledetails) - Retrieve file details associated with a specific Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the 
`/accounts/{accountID}/files.read` scope.

## uploadFile

Upload a file and link it to the specified Moov account. 

The maximum file size is 10MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf, 
and png. 

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the 
`/accounts/{accountID}/files.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.FilePurpose;
import io.moov.openapi.models.components.FileUploadRequestMultiPart;
import io.moov.openapi.models.components.FileUploadRequestMultiPartFile;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.FileValidationError;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.UploadFileResponse;
import io.moov.openapi.models.operations.UploadFileSecurity;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws GenericError, FileValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UploadFileResponse res = sdk.files().uploadFile()
                .security(UploadFileSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("68f95825-1ae3-4f3f-8af2-789dd2a59d6d")
                .fileUploadRequestMultiPart(FileUploadRequestMultiPart.builder()
                    .file(FileUploadRequestMultiPartFile.builder()
                        .fileName("example.file")
                        .content("0xcaF7dB59f9".getBytes(StandardCharsets.UTF_8))
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

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `security`                                                                                            | [io.moov.openapi.models.operations.UploadFileSecurity](../../models/operations/UploadFileSecurity.md) | :heavy_check_mark:                                                                                    | The security requirements to use for the request.                                                     |
| `xMoovVersion`                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                            | :heavy_minus_sign:                                                                                    | Specify an API version.                                                                               |
| `accountID`                                                                                           | *String*                                                                                              | :heavy_check_mark:                                                                                    | N/A                                                                                                   |
| `fileUploadRequestMultiPart`                                                                          | [FileUploadRequestMultiPart](../../models/components/FileUploadRequestMultiPart.md)                   | :heavy_check_mark:                                                                                    | N/A                                                                                                   |

### Response

**[UploadFileResponse](../../models/operations/UploadFileResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/GenericError        | 400, 409                          | application/json                  |
| models/errors/FileValidationError | 422                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## listFiles

List all the files associated with a particular Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the 
`/accounts/{accountID}/files.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.ListFilesResponse;
import io.moov.openapi.models.operations.ListFilesSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListFilesResponse res = sdk.files().listFiles()
                .security(ListFilesSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("a3c35406-9eb6-4801-bbac-0649c31c058a")
                .call();

        if (res.fileDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `security`                                                                                          | [io.moov.openapi.models.operations.ListFilesSecurity](../../models/operations/ListFilesSecurity.md) | :heavy_check_mark:                                                                                  | The security requirements to use for the request.                                                   |
| `xMoovVersion`                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                          | :heavy_minus_sign:                                                                                  | Specify an API version.                                                                             |
| `accountID`                                                                                         | *String*                                                                                            | :heavy_check_mark:                                                                                  | N/A                                                                                                 |

### Response

**[ListFilesResponse](../../models/operations/ListFilesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getFileDetails

Retrieve file details associated with a specific Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the 
`/accounts/{accountID}/files.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetFileDetailsResponse;
import io.moov.openapi.models.operations.GetFileDetailsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetFileDetailsResponse res = sdk.files().getFileDetails()
                .security(GetFileDetailsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [io.moov.openapi.models.operations.GetFileDetailsSecurity](../../models/operations/GetFileDetailsSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `fileID`                                                                                                      | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

### Response

**[GetFileDetailsResponse](../../models/operations/GetFileDetailsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |