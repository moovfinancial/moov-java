# Disputes
(*disputes()*)

## Overview

### Available Operations

* [listDisputes](#listdisputes) - Returns the list of disputes. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getDispute](#getdispute) - Get a dispute by ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [acceptDispute](#acceptdispute) - Accepts a dispute. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [listDisputeEvidence](#listdisputeevidence) - Returns a dispute's public evidence by its ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [uploadDisputeEvidenceFile](#uploaddisputeevidencefile) - Uploads a file as evidence for a dispute. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [uploadDisputeEvidenceText](#uploaddisputeevidencetext) - Uploads text as evidence for a dispute.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [submitDisputeEvidence](#submitdisputeevidence) - Submit the evidence associated with a dispute.

Evidence items must be uploaded using the appropriate endpoint(s) prior to calling this endpoint to submit it. **Evidence can only
be submitted once per dispute.**

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getDisputeEvidence](#getdisputeevidence) - Get dispute evidence by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [updateDisputeEvidence](#updatedisputeevidence) - Updates dispute evidence by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [deleteDisputeEvidenceFile](#deletedisputeevidencefile) - Deletes dispute evidence by ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getDisputeEvidenceData](#getdisputeevidencedata) - Downloads dispute evidence data by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

## listDisputes

Returns the list of disputes. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.operations.ListDisputesRequest;
import io.moov.sdk.models.operations.ListDisputesResponse;
import io.moov.sdk.models.operations.ListDisputesSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListDisputesRequest req = ListDisputesRequest.builder()
                .accountID("2cb8fed5-9089-45a7-88aa-5468adeaaddb")
                .skip(60L)
                .count(20L)
                .build();

        ListDisputesResponse res = sdk.disputes().listDisputes()
                .request(req)
                .security(ListDisputesSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.disputes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListDisputesRequest](../../models/operations/ListDisputesRequest.md)                                 | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |
| `security`                                                                                            | [io.moov.sdk.models.operations.ListDisputesSecurity](../../models/operations/ListDisputesSecurity.md) | :heavy_check_mark:                                                                                    | The security requirements to use for the request.                                                     |

### Response

**[ListDisputesResponse](../../models/operations/ListDisputesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getDispute

Get a dispute by ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetDisputeResponse;
import io.moov.sdk.models.operations.GetDisputeSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetDisputeResponse res = sdk.disputes().getDispute()
                .security(GetDisputeSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202401)
                .accountID("102df293-b524-4bb7-9b68-5610432a0b8d")
                .disputeID("2efe55e9-61a0-4b3d-aab6-423bb7f8140b")
                .call();

        if (res.dispute().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `security`                                                                                        | [io.moov.sdk.models.operations.GetDisputeSecurity](../../models/operations/GetDisputeSecurity.md) | :heavy_check_mark:                                                                                | The security requirements to use for the request.                                                 |
| `xMoovVersion`                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                        | :heavy_minus_sign:                                                                                | Specify an API version.                                                                           |
| `accountID`                                                                                       | *String*                                                                                          | :heavy_check_mark:                                                                                | N/A                                                                                               |
| `disputeID`                                                                                       | *String*                                                                                          | :heavy_check_mark:                                                                                | N/A                                                                                               |

### Response

**[GetDisputeResponse](../../models/operations/GetDisputeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## acceptDispute

Accepts a dispute. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.AcceptDisputeResponse;
import io.moov.sdk.models.operations.AcceptDisputeSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        AcceptDisputeResponse res = sdk.disputes().acceptDispute()
                .security(AcceptDisputeSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("bfefe6f4-2658-4d3d-9be8-73ff29049dbe")
                .disputeID("692e1a18-8314-4a5d-bcfd-0d5ada162cf8")
                .call();

        if (res.dispute().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `security`                                                                                              | [io.moov.sdk.models.operations.AcceptDisputeSecurity](../../models/operations/AcceptDisputeSecurity.md) | :heavy_check_mark:                                                                                      | The security requirements to use for the request.                                                       |
| `xMoovVersion`                                                                                          | [Optional\<Versions>](../../models/components/Versions.md)                                              | :heavy_minus_sign:                                                                                      | Specify an API version.                                                                                 |
| `accountID`                                                                                             | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     |
| `disputeID`                                                                                             | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     |

### Response

**[AcceptDisputeResponse](../../models/operations/AcceptDisputeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listDisputeEvidence

Returns a dispute's public evidence by its ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListDisputeEvidenceResponse;
import io.moov.sdk.models.operations.ListDisputeEvidenceSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListDisputeEvidenceResponse res = sdk.disputes().listDisputeEvidence()
                .security(ListDisputeEvidenceSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("dcaaa24e-96d2-4b5b-997d-aa20f46c812a")
                .disputeID("e0434916-3828-49bb-bfa4-30f3c039d5f0")
                .call();

        if (res.disputeEvidenceMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                          | [io.moov.sdk.models.operations.ListDisputeEvidenceSecurity](../../models/operations/ListDisputeEvidenceSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |
| `xMoovVersion`                                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                                          | :heavy_minus_sign:                                                                                                  | Specify an API version.                                                                                             |
| `accountID`                                                                                                         | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |
| `disputeID`                                                                                                         | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |

### Response

**[ListDisputeEvidenceResponse](../../models/operations/ListDisputeEvidenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## uploadDisputeEvidenceFile

Uploads a file as evidence for a dispute. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateEvidenceFileMultiPart;
import io.moov.sdk.models.components.EvidenceType;
import io.moov.sdk.models.components.File;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UploadDisputeEvidenceFileResponse;
import io.moov.sdk.models.operations.UploadDisputeEvidenceFileSecurity;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UploadDisputeEvidenceFileResponse res = sdk.disputes().uploadDisputeEvidenceFile()
                .security(UploadDisputeEvidenceFileSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("1ae7aa8f-dfc0-4d00-927a-c5349c04fa3f")
                .disputeID("c3dddece-4b5f-4b6e-b8a0-719d5e192fc7")
                .createEvidenceFileMultiPart(CreateEvidenceFileMultiPart.builder()
                    .file(File.builder()
                        .fileName("example.file")
                        .content("0xfAb2d31B5B".getBytes(StandardCharsets.UTF_8))
                        .build())
                    .evidenceType(EvidenceType.COVER_LETTER)
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                      | [io.moov.sdk.models.operations.UploadDisputeEvidenceFileSecurity](../../models/operations/UploadDisputeEvidenceFileSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |
| `xMoovVersion`                                                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                                                      | :heavy_minus_sign:                                                                                                              | Specify an API version.                                                                                                         |
| `accountID`                                                                                                                     | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |
| `disputeID`                                                                                                                     | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |
| `createEvidenceFileMultiPart`                                                                                                   | [CreateEvidenceFileMultiPart](../../models/components/CreateEvidenceFileMultiPart.md)                                           | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |

### Response

**[UploadDisputeEvidenceFileResponse](../../models/operations/UploadDisputeEvidenceFileResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## uploadDisputeEvidenceText

Uploads text as evidence for a dispute.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateEvidenceText;
import io.moov.sdk.models.components.EvidenceType;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UploadDisputeEvidenceTextResponse;
import io.moov.sdk.models.operations.UploadDisputeEvidenceTextSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UploadDisputeEvidenceTextResponse res = sdk.disputes().uploadDisputeEvidenceText()
                .security(UploadDisputeEvidenceTextSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("d542736f-c9c3-491c-86c3-7303a97965ea")
                .disputeID("9487cd25-501d-4a76-8c24-54328af8a4b6")
                .createEvidenceText(CreateEvidenceText.builder()
                    .text("<value>")
                    .evidenceType(EvidenceType.COVER_LETTER)
                    .build())
                .call();

        if (res.evidenceText().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                      | [io.moov.sdk.models.operations.UploadDisputeEvidenceTextSecurity](../../models/operations/UploadDisputeEvidenceTextSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |
| `xMoovVersion`                                                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                                                      | :heavy_minus_sign:                                                                                                              | Specify an API version.                                                                                                         |
| `accountID`                                                                                                                     | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |
| `disputeID`                                                                                                                     | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |
| `createEvidenceText`                                                                                                            | [CreateEvidenceText](../../models/components/CreateEvidenceText.md)                                                             | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |

### Response

**[UploadDisputeEvidenceTextResponse](../../models/operations/UploadDisputeEvidenceTextResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## submitDisputeEvidence

Submit the evidence associated with a dispute.

Evidence items must be uploaded using the appropriate endpoint(s) prior to calling this endpoint to submit it. **Evidence can only
be submitted once per dispute.**

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.SubmitDisputeEvidenceResponse;
import io.moov.sdk.models.operations.SubmitDisputeEvidenceSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        SubmitDisputeEvidenceResponse res = sdk.disputes().submitDisputeEvidence()
                .security(SubmitDisputeEvidenceSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("aff4d2bf-fd2c-471e-a697-b2cc2c9f297e")
                .disputeID("491e05b8-7adc-440b-af36-4d2229edd4f0")
                .call();

        if (res.dispute().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                              | [io.moov.sdk.models.operations.SubmitDisputeEvidenceSecurity](../../models/operations/SubmitDisputeEvidenceSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |
| `xMoovVersion`                                                                                                          | [Optional\<Versions>](../../models/components/Versions.md)                                                              | :heavy_minus_sign:                                                                                                      | Specify an API version.                                                                                                 |
| `accountID`                                                                                                             | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |
| `disputeID`                                                                                                             | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |

### Response

**[SubmitDisputeEvidenceResponse](../../models/operations/SubmitDisputeEvidenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getDisputeEvidence

Get dispute evidence by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetDisputeEvidenceResponse;
import io.moov.sdk.models.operations.GetDisputeEvidenceSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetDisputeEvidenceResponse res = sdk.disputes().getDisputeEvidence()
                .security(GetDisputeEvidenceSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("8abb6e62-d012-4f06-8c83-d993dd3155f2")
                .disputeID("ebf0479f-774e-4881-9e0b-2c791e0601fc")
                .evidenceID("37534a23-990f-4bdd-b2c7-1653336983f0")
                .call();

        if (res.disputeEvidenceMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                        | [io.moov.sdk.models.operations.GetDisputeEvidenceSecurity](../../models/operations/GetDisputeEvidenceSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |
| `xMoovVersion`                                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                                        | :heavy_minus_sign:                                                                                                | Specify an API version.                                                                                           |
| `accountID`                                                                                                       | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |
| `disputeID`                                                                                                       | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |
| `evidenceID`                                                                                                      | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |

### Response

**[GetDisputeEvidenceResponse](../../models/operations/GetDisputeEvidenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateDisputeEvidence

Updates dispute evidence by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.UpdateEvidence;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UpdateDisputeEvidenceRequest;
import io.moov.sdk.models.operations.UpdateDisputeEvidenceResponse;
import io.moov.sdk.models.operations.UpdateDisputeEvidenceSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateDisputeEvidenceRequest req = UpdateDisputeEvidenceRequest.builder()
                .accountID("51c8da31-2c44-4bdf-a86e-26169242ffe0")
                .disputeID("584a4c46-9412-4622-8ac9-001d7ececcd4")
                .evidenceID("743d351d-f194-45e4-8628-700f3b327c51")
                .updateEvidence(UpdateEvidence.builder()
                    .build())
                .build();

        UpdateDisputeEvidenceResponse res = sdk.disputes().updateDisputeEvidence()
                .request(req)
                .security(UpdateDisputeEvidenceSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.disputeEvidenceMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [UpdateDisputeEvidenceRequest](../../models/operations/UpdateDisputeEvidenceRequest.md)                                 | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [io.moov.sdk.models.operations.UpdateDisputeEvidenceSecurity](../../models/operations/UpdateDisputeEvidenceSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |

### Response

**[UpdateDisputeEvidenceResponse](../../models/operations/UpdateDisputeEvidenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## deleteDisputeEvidenceFile

Deletes dispute evidence by ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DeleteDisputeEvidenceFileResponse;
import io.moov.sdk.models.operations.DeleteDisputeEvidenceFileSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        DeleteDisputeEvidenceFileResponse res = sdk.disputes().deleteDisputeEvidenceFile()
                .security(DeleteDisputeEvidenceFileSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("927e189d-273f-40ab-814f-1fa3ab1aa7dd")
                .disputeID("94451c2e-a568-4800-a669-7f6190da461d")
                .evidenceID("1bfaf385-47fb-4da3-8072-d54e354a9910")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                      | [io.moov.sdk.models.operations.DeleteDisputeEvidenceFileSecurity](../../models/operations/DeleteDisputeEvidenceFileSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |
| `xMoovVersion`                                                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                                                      | :heavy_minus_sign:                                                                                                              | Specify an API version.                                                                                                         |
| `accountID`                                                                                                                     | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |
| `disputeID`                                                                                                                     | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |
| `evidenceID`                                                                                                                    | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |

### Response

**[DeleteDisputeEvidenceFileResponse](../../models/operations/DeleteDisputeEvidenceFileResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 409                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getDisputeEvidenceData

Downloads dispute evidence data by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/transfers.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetDisputeEvidenceDataResponse;
import io.moov.sdk.models.operations.GetDisputeEvidenceDataSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetDisputeEvidenceDataResponse res = sdk.disputes().getDisputeEvidenceData()
                .security(GetDisputeEvidenceDataSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .accountID("38299899-8c4f-4a43-b73a-3cef9ba87c62")
                .disputeID("22c477d1-525c-4c1b-b8a3-7dcec5c4da28")
                .evidenceID("fb1c15fd-675b-4f82-861e-f3092ed39462")
                .call();

        if (res.twoHundredApplicationPdfResponseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                | [io.moov.sdk.models.operations.GetDisputeEvidenceDataSecurity](../../models/operations/GetDisputeEvidenceDataSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |
| `xMoovVersion`                                                                                                            | [Optional\<Versions>](../../models/components/Versions.md)                                                                | :heavy_minus_sign:                                                                                                        | Specify an API version.                                                                                                   |
| `accountID`                                                                                                               | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |
| `disputeID`                                                                                                               | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |
| `evidenceID`                                                                                                              | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |

### Response

**[GetDisputeEvidenceDataResponse](../../models/operations/GetDisputeEvidenceDataResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |