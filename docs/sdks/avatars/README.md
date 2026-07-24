# Avatars

## Overview

### Available Operations

* [get](#get) - Get avatar image for an account using a unique ID.    

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/profile-enrichment.read` scope.
* [upload](#upload) - Upload a user avatar image for an account.

The image will be normalized to 512x512 PNG format and stored separately from 
automatically discovered logos. User-uploaded avatars take precedence over enriched avatars at read time.

This endpoint only accepts accountID values for the uniqueID parameter.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.
* [delete](#delete) - Delete a user-uploaded avatar for an account.

After deletion, the avatar endpoint will fall back to the enriched avatar
or an account-type-aware fallback icon.

This endpoint only accepts accountID values for the uniqueID parameter.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.

## get

Get avatar image for an account using a unique ID.    

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/profile-enrichment.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAvatar" method="get" path="/avatars/{uniqueID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetAvatarResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetAvatarResponse res = sdk.avatars().get()
                .uniqueID("<id>")
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `uniqueID`                                                                                               | *String*                                                                                                 | :heavy_check_mark:                                                                                       | Any unique ID associated with an account such as accountID, representativeID, routing number, or userID. |

### Response

**[GetAvatarResponse](../../models/operations/GetAvatarResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## upload

Upload a user avatar image for an account.

The image will be normalized to 512x512 PNG format and stored separately from 
automatically discovered logos. User-uploaded avatars take precedence over enriched avatars at read time.

This endpoint only accepts accountID values for the uniqueID parameter.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="uploadAvatar" method="put" path="/avatars/{uniqueID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.AvatarUploadRequest;
import io.moov.sdk.models.components.AvatarUploadRequestFile;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UploadAvatarResponse;
import io.moov.sdk.models.operations.UploadAvatarSecurity;
import io.moov.sdk.utils.Utils;
import java.io.FileInputStream;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UploadAvatarResponse res = sdk.avatars().upload()
                .security(UploadAvatarSecurity.builder()
                    .username("")
                    .build())
                .uniqueID("<id>")
                .avatarUploadRequest(AvatarUploadRequest.builder()
                    .file(AvatarUploadRequestFile.builder()
                        .fileName("example.file")
                        .content(Utils.readBytesAndClose(new FileInputStream("example.file")))
                        .build())
                    .build())
                .call();

    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `security`                                                                                            | [io.moov.sdk.models.operations.UploadAvatarSecurity](../../models/operations/UploadAvatarSecurity.md) | :heavy_check_mark:                                                                                    | The security requirements to use for the request.                                                     |
| `uniqueID`                                                                                            | *String*                                                                                              | :heavy_check_mark:                                                                                    | The accountID to upload the avatar for. Only accountID values are accepted for writes.                |
| `avatarUploadRequest`                                                                                 | [AvatarUploadRequest](../../models/components/AvatarUploadRequest.md)                                 | :heavy_check_mark:                                                                                    | N/A                                                                                                   |

### Response

**[UploadAvatarResponse](../../models/operations/UploadAvatarResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## delete

Delete a user-uploaded avatar for an account.

After deletion, the avatar endpoint will fall back to the enriched avatar
or an account-type-aware fallback icon.

This endpoint only accepts accountID values for the uniqueID parameter.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteAvatar" method="delete" path="/avatars/{uniqueID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DeleteAvatarResponse;
import io.moov.sdk.models.operations.DeleteAvatarSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        DeleteAvatarResponse res = sdk.avatars().delete()
                .security(DeleteAvatarSecurity.builder()
                    .username("")
                    .build())
                .uniqueID("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `security`                                                                                            | [io.moov.sdk.models.operations.DeleteAvatarSecurity](../../models/operations/DeleteAvatarSecurity.md) | :heavy_check_mark:                                                                                    | The security requirements to use for the request.                                                     |
| `uniqueID`                                                                                            | *String*                                                                                              | :heavy_check_mark:                                                                                    | The accountID to delete the avatar for. Only accountID values are accepted for writes.                |

### Response

**[DeleteAvatarResponse](../../models/operations/DeleteAvatarResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |