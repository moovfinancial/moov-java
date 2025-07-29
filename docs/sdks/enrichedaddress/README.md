# EnrichedAddress
(*enrichedAddress()*)

## Overview

### Available Operations

* [get](#get) - Fetch enriched address suggestions. Requires a partial address. 
  
To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/profile-enrichment.read` scope.

## get

Fetch enriched address suggestions. Requires a partial address. 
  
To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/profile-enrichment.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getEnrichmentAddress" method="get" path="/enrichment/address" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetEnrichmentAddressRequest;
import io.moov.sdk.models.operations.GetEnrichmentAddressResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        GetEnrichmentAddressRequest req = GetEnrichmentAddressRequest.builder()
                .search("<value>")
                .build();

        GetEnrichmentAddressResponse res = sdk.enrichedAddress().get()
                .request(req)
                .call();

        if (res.enrichedAddressResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetEnrichmentAddressRequest](../../models/operations/GetEnrichmentAddressRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetEnrichmentAddressResponse](../../models/operations/GetEnrichmentAddressResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |