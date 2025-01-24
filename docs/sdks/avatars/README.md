# Avatars
(*avatars()*)

## Overview

### Available Operations

* [getAvatar](#getavatar) - Get avatar image for an account using a unique ID.    

To use this endpoint from the browser, you'll need to specify the `/profile-enrichment.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

## getAvatar

Get avatar image for an account using a unique ID.    

To use this endpoint from the browser, you'll need to specify the `/profile-enrichment.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetAvatarResponse;
import io.moov.openapi.models.operations.GetAvatarSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetAvatarResponse res = sdk.avatars().getAvatar()
                .security(GetAvatarSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202401)
                .uniqueID("<id>")
                .call();

        if (res.twoHundredImagePngResponseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `security`                                                                                               | [io.moov.openapi.models.operations.GetAvatarSecurity](../../models/operations/GetAvatarSecurity.md)      | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |
| `xMoovVersion`                                                                                           | [Optional\<Versions>](../../models/components/Versions.md)                                               | :heavy_minus_sign:                                                                                       | Specify an API version.                                                                                  |
| `uniqueID`                                                                                               | *String*                                                                                                 | :heavy_check_mark:                                                                                       | Any unique ID associated with an account such as accountID, representativeID, routing number, or userID. |

### Response

**[GetAvatarResponse](../../models/operations/GetAvatarResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |