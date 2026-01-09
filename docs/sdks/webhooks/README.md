# Webhooks

## Overview

### Available Operations

* [listEventTypes](#listeventtypes) - List all available event types that can be subscribed to.
* [list](#list) - List all webhooks configured for the account.
* [create](#create) - Create a new webhook for the account.
* [get](#get) - Get details of a specific webhook.
* [update](#update) - Update an existing webhook.
* [disable](#disable) - Disable a webhook. Disabled webhooks will no longer receive events.
* [ping](#ping) - Send a test ping to a webhook to verify it is configured correctly.
* [getSecret](#getsecret) - Get the secret key for verifying webhook payloads.

## listEventTypes

List all available event types that can be subscribed to.

### Example Usage

<!-- UsageSnippet language="java" operationID="listEventTypes" method="get" path="/event-types" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListEventTypesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListEventTypesResponse res = sdk.webhooks().listEventTypes()
                .call();

        if (res.eventTypes().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListEventTypesResponse](../../models/operations/ListEventTypesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## list

List all webhooks configured for the account.

### Example Usage

<!-- UsageSnippet language="java" operationID="listWebhooks" method="get" path="/webhooks" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListWebhooksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListWebhooksResponse res = sdk.webhooks().list()
                .call();

        if (res.webhooks().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListWebhooksResponse](../../models/operations/ListWebhooksResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## create

Create a new webhook for the account.

### Example Usage

<!-- UsageSnippet language="java" operationID="createWebhook" method="post" path="/webhooks" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.WebhookStatus;
import io.moov.sdk.models.errors.CreateWebhookValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateWebhookResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, CreateWebhookValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateWebhookResponse res = sdk.webhooks().create()
                .url("https://experienced-sailor.biz/")
                .status(WebhookStatus.DISABLED)
                .eventTypes(List.of())
                .description("overdue bonnet failing")
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `url`                                                                  | *String*                                                               | :heavy_check_mark:                                                     | The URL where webhook events will be sent.                             |
| `status`                                                               | [WebhookStatus](../../models/components/WebhookStatus.md)              | :heavy_check_mark:                                                     | The status of the webhook.                                             |
| `eventTypes`                                                           | List\<[WebhookEventType](../../models/components/WebhookEventType.md)> | :heavy_check_mark:                                                     | The list of event types this webhook should subscribe to.              |
| `description`                                                          | *String*                                                               | :heavy_check_mark:                                                     | A description of the webhook for reference. Can be an empty string.    |

### Response

**[CreateWebhookResponse](../../models/operations/CreateWebhookResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GenericError                 | 400, 409                                   | application/json                           |
| models/errors/CreateWebhookValidationError | 422                                        | application/json                           |
| models/errors/APIException                 | 4XX, 5XX                                   | \*/\*                                      |

## get

Get details of a specific webhook.

### Example Usage

<!-- UsageSnippet language="java" operationID="getWebhook" method="get" path="/webhooks/{webhookID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetWebhookResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetWebhookResponse res = sdk.webhooks().get()
                .webhookID("deeb5a05-74d4-40ad-b4be-a9265fd49428")
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `webhookID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetWebhookResponse](../../models/operations/GetWebhookResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Update an existing webhook.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateWebhook" method="put" path="/webhooks/{webhookID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.UpdateWebhookValidationError;
import io.moov.sdk.models.operations.UpdateWebhookResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateWebhookValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateWebhookResponse res = sdk.webhooks().update()
                .webhookID("954b566e-0c37-481b-bf92-6cdbd0e47dc0")
                .updateWebhook(UpdateWebhook.builder()
                    .url("https://nimble-affect.name")
                    .status(WebhookStatus.ENABLED)
                    .eventTypes(List.of())
                    .description("hmph eyeglasses pink stylish blah")
                    .build())
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `webhookID`                                               | *String*                                                  | :heavy_check_mark:                                        | N/A                                                       |
| `updateWebhook`                                           | [UpdateWebhook](../../models/components/UpdateWebhook.md) | :heavy_check_mark:                                        | N/A                                                       |

### Response

**[UpdateWebhookResponse](../../models/operations/UpdateWebhookResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GenericError                 | 400, 409                                   | application/json                           |
| models/errors/UpdateWebhookValidationError | 422                                        | application/json                           |
| models/errors/APIException                 | 4XX, 5XX                                   | \*/\*                                      |

## disable

Disable a webhook. Disabled webhooks will no longer receive events.

### Example Usage

<!-- UsageSnippet language="java" operationID="disableWebhook" method="delete" path="/webhooks/{webhookID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DisableWebhookResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DisableWebhookResponse res = sdk.webhooks().disable()
                .webhookID("c88929b3-cbb6-4144-923f-e9a5ba645708")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `webhookID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[DisableWebhookResponse](../../models/operations/DisableWebhookResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## ping

Send a test ping to a webhook to verify it is configured correctly.

### Example Usage

<!-- UsageSnippet language="java" operationID="pingWebhook" method="post" path="/webhooks/{webhookID}/ping" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.PingWebhookResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        PingWebhookResponse res = sdk.webhooks().ping()
                .webhookID("87e0ecc6-d6c3-4eeb-99e8-6dbe9212a6a2")
                .call();

        if (res.pingResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `webhookID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[PingWebhookResponse](../../models/operations/PingWebhookResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getSecret

Get the secret key for verifying webhook payloads.

### Example Usage

<!-- UsageSnippet language="java" operationID="getWebhookSecret" method="get" path="/webhooks/{webhookID}/secret" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetWebhookSecretResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetWebhookSecretResponse res = sdk.webhooks().getSecret()
                .webhookID("1fac81d6-2d5b-4180-8765-81282a450eda")
                .call();

        if (res.webhookSecret().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `webhookID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetWebhookSecretResponse](../../models/operations/GetWebhookSecretResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |