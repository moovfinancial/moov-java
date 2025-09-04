# Files
(*files()*)

## Overview

### Available Operations

* [upload](#upload) - Upload a file and link it to the specified Moov account. 

The maximum file size is 20MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf, 
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

The maximum file size is 20MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf, 
and png. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/files.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="uploadFile" method="post" path="/accounts/{accountID}/files" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.FileValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UploadFileResponse;
import io.moov.sdk.utils.Utils;
import java.io.FileInputStream;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, FileValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UploadFileResponse res = sdk.files().upload()
                .accountID("51ae4a14-07bf-4659-b9b7-285439b7a22e")
                .fileUploadRequestMultiPart(FileUploadRequestMultiPart.builder()
                    .file(FileUploadRequestMultiPartFile.builder()
                        .fileName("example.file")
                        .content(Utils.readBytesAndClose(new FileInputStream("example.file")))
                        .build())
                    .filePurpose(FilePurpose.REPRESENTATIVE_VERIFICATION)
                    .metadata("{\"requirement_id\": \"document.individual.verification\"}")
                    .build())
                .call();

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
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

<!-- UsageSnippet language="java" operationID="listFiles" method="get" path="/accounts/{accountID}/files" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListFilesResponse;
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

        ListFilesResponse res = sdk.files().list()
                .accountID("d1133bf2-4853-4436-9a03-23739895ab98")
                .call();

        if (res.fileDetails().isPresent()) {
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

<!-- UsageSnippet language="java" operationID="getFileDetails" method="get" path="/accounts/{accountID}/files/{fileID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetFileDetailsResponse;
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

        GetFileDetailsResponse res = sdk.files().get()
                .accountID("7f888113-d35a-4536-b9bc-c55076736ab6")
                .fileID("af170db9-0d17-4a9f-ade6-5dd2f1b3412d")
                .call();

        if (res.fileDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `fileID`           | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetFileDetailsResponse](../../models/operations/GetFileDetailsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |