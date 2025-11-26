# Support
(*support()*)

## Overview

### Available Operations

* [createTicket](#createticket) - Create a support ticket for a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/tickets.write` scope.

If you're creating the ticket on behalf of another account, then you'll need to
specify the `/accounts/{partnerAccountID}/tickets.write` and `/accounts/{accountID}/profile.read` scopes.
* [listTickets](#listtickets) - List all the support tickets created under a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/tickets.read` scope.

If you're listing another account's tickets, then you'll need to
specify the `/accounts/{partnerAccountID}/tickets.read` and `/accounts/{accountID}/profile.read` scopes.
* [getTicket](#getticket) - Retrieve a support ticket by ID.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/tickets.read` scope.

If you're retrieving another account's ticket, then you'll need to
specify the `/accounts/{partnerAccountID}/tickets.read` and `/accounts/{accountID}/profile.read` scopes.
* [updateTicket](#updateticket) - Updates a support ticket.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/tickets.write` scope.

If you're updating the ticket on behalf of another account, then you'll need to
specify the `/accounts/{partnerAccountID}/tickets.write` and `/accounts/{accountID}/profile.read` scopes.
* [listTicketMessages](#listticketmessages) - List all the messages for a support ticket.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/tickets.read` scope.

If you're listing another account's messages, then you'll need to
specify the `/accounts/{partnerAccountID}/tickets.read` and `/accounts/{accountID}/profile.read` scopes.

## createTicket

Create a support ticket for a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/tickets.write` scope.

If you're creating the ticket on behalf of another account, then you'll need to
specify the `/accounts/{partnerAccountID}/tickets.write` and `/accounts/{accountID}/profile.read` scopes.

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicket" method="post" path="/accounts/{accountID}/tickets" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.CreateTicketError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateTicketResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CreateTicketError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateTicketResponse res = sdk.support().createTicket()
                .accountID("4af4784a-c777-48f6-8211-063d5341f84b")
                .createTicket(CreateTicket.builder()
                    .title("<value>")
                    .body("<value>")
                    .contact(TicketContact.builder()
                        .email("Melany.Roberts@yahoo.com")
                        .build())
                    .build())
                .call();

        if (res.ticket().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `accountID`                                             | *String*                                                | :heavy_check_mark:                                      | N/A                                                     |
| `createTicket`                                          | [CreateTicket](../../models/components/CreateTicket.md) | :heavy_check_mark:                                      | N/A                                                     |

### Response

**[CreateTicketResponse](../../models/operations/CreateTicketResponse.md)**

### Errors

| Error Type                      | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/GenericError      | 400, 409                        | application/json                |
| models/errors/CreateTicketError | 422                             | application/json                |
| models/errors/APIException      | 4XX, 5XX                        | \*/\*                           |

## listTickets

List all the support tickets created under a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/tickets.read` scope.

If you're listing another account's tickets, then you'll need to
specify the `/accounts/{partnerAccountID}/tickets.read` and `/accounts/{accountID}/profile.read` scopes.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTickets" method="get" path="/accounts/{accountID}/tickets" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListTicketsRequest;
import io.moov.sdk.models.operations.ListTicketsResponse;
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

        ListTicketsRequest req = ListTicketsRequest.builder()
                .accountID("8ef75c13-2a50-4438-b294-2a850eb4986d")
                .count(20L)
                .build();

        ListTicketsResponse res = sdk.support().listTickets()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListTicketsRequest](../../models/operations/ListTicketsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListTicketsResponse](../../models/operations/ListTicketsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getTicket

Retrieve a support ticket by ID.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/tickets.read` scope.

If you're retrieving another account's ticket, then you'll need to
specify the `/accounts/{partnerAccountID}/tickets.read` and `/accounts/{accountID}/profile.read` scopes.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicket" method="get" path="/accounts/{accountID}/tickets/{ticketID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetTicketResponse;
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

        GetTicketResponse res = sdk.support().getTicket()
                .accountID("873ccb78-88b3-4520-85f2-7cc2aef5704b")
                .ticketID("91fea9bf-b373-40f7-86e0-2c80690126e4")
                .call();

        if (res.ticket().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `ticketID`         | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetTicketResponse](../../models/operations/GetTicketResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateTicket

Updates a support ticket.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/tickets.write` scope.

If you're updating the ticket on behalf of another account, then you'll need to
specify the `/accounts/{partnerAccountID}/tickets.write` and `/accounts/{accountID}/profile.read` scopes.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicket" method="patch" path="/accounts/{accountID}/tickets/{ticketID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.UpdateTicket;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.UpdateTicketError;
import io.moov.sdk.models.operations.UpdateTicketResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateTicketError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateTicketResponse res = sdk.support().updateTicket()
                .accountID("7cce2b85-37c2-4c76-954c-03dcec2b12f0")
                .ticketID("1d621d17-8e7d-4ac0-9f7d-6e9fcebe8eef")
                .updateTicket(UpdateTicket.builder()
                    .build())
                .call();

        if (res.ticket().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `accountID`                                             | *String*                                                | :heavy_check_mark:                                      | N/A                                                     |
| `ticketID`                                              | *String*                                                | :heavy_check_mark:                                      | N/A                                                     |
| `updateTicket`                                          | [UpdateTicket](../../models/components/UpdateTicket.md) | :heavy_check_mark:                                      | N/A                                                     |

### Response

**[UpdateTicketResponse](../../models/operations/UpdateTicketResponse.md)**

### Errors

| Error Type                      | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/GenericError      | 400, 409                        | application/json                |
| models/errors/UpdateTicketError | 422                             | application/json                |
| models/errors/APIException      | 4XX, 5XX                        | \*/\*                           |

## listTicketMessages

List all the messages for a support ticket.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/tickets.read` scope.

If you're listing another account's messages, then you'll need to
specify the `/accounts/{partnerAccountID}/tickets.read` and `/accounts/{accountID}/profile.read` scopes.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketMessages" method="get" path="/accounts/{accountID}/tickets/{ticketID}/messages" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListTicketMessagesResponse;
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

        ListTicketMessagesResponse res = sdk.support().listTicketMessages()
                .accountID("72444918-8529-4986-b10c-41817e45d09e")
                .ticketID("edeaab65-c54c-45b8-881b-19138f125fb1")
                .call();

        if (res.ticketMessages().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `ticketID`         | *String*           | :heavy_check_mark: | N/A                |

### Response

**[ListTicketMessagesResponse](../../models/operations/ListTicketMessagesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |