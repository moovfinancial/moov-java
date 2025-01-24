# EnrichedProfile
(*enrichedProfile()*)

## Overview

### Available Operations

* [getEnrichmentProfile](#getenrichmentprofile) -   Fetch enriched profile data. Requires a valid email address. This service is offered in collaboration with Clearbit. 

  To use this endpoint from the browser, you'll need to specify the `/profile-enrichment.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

## getEnrichmentProfile

  Fetch enriched profile data. Requires a valid email address. This service is offered in collaboration with Clearbit. 

  To use this endpoint from the browser, you'll need to specify the `/profile-enrichment.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetEnrichmentProfileResponse;
import io.moov.sdk.models.operations.GetEnrichmentProfileSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetEnrichmentProfileResponse res = sdk.enrichedProfile().getEnrichmentProfile()
                .security(GetEnrichmentProfileSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .email("Sheldon.Effertz@gmail.com")
                .call();

        if (res.enrichedBusinessProfile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                            | [io.moov.sdk.models.operations.GetEnrichmentProfileSecurity](../../models/operations/GetEnrichmentProfileSecurity.md) | :heavy_check_mark:                                                                                                    | The security requirements to use for the request.                                                                     |
| `xMoovVersion`                                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                                            | :heavy_minus_sign:                                                                                                    | Specify an API version.                                                                                               |
| `email`                                                                                                               | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |

### Response

**[GetEnrichmentProfileResponse](../../models/operations/GetEnrichmentProfileResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |