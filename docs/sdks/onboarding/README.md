# Onboarding

## Overview

### Available Operations

* [createInvite](#createinvite) - Create an invitation containing a unique link that allows the recipient to onboard their organization with Moov.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.
* [listInvites](#listinvites) - List all the onboarding invites created by the caller's account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.read` scope.
* [getInvite](#getinvite) - Retrieve details about an onboarding invite.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.read` scope.
* [revokeInvite](#revokeinvite) - Revoke an onboarding invite, rendering the invitation link unusable.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.

## createInvite

Create an invitation containing a unique link that allows the recipient to onboard their organization with Moov.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createOnboardingInvite" method="post" path="/onboarding-invites" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.OnboardingInviteError;
import io.moov.sdk.models.operations.CreateOnboardingInviteResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, OnboardingInviteError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        OnboardingInviteRequest req = OnboardingInviteRequest.builder()
                .scopes(List.of(
                    ApplicationScope.ACCOUNTS_READ))
                .capabilities(List.of(
                    CapabilityID.TRANSFERS))
                .feePlanCodes(List.of(
                    "merchant-direct"))
                .grantScopes(List.of(
                    ApplicationScope.TRANSFERS_WRITE))
                .prefill(CreateAccount.builder()
                    .accountType(CreateAccountType.BUSINESS)
                    .profile(CreateProfile.builder()
                        .business(CreateBusinessProfile.builder()
                            .legalBusinessName("Whole Body Fitness LLC")
                            .build())
                        .build())
                    .build())
                .build();

        CreateOnboardingInviteResponse res = sdk.onboarding().createInvite()
                .request(req)
                .call();

        if (res.onboardingInvite().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [OnboardingInviteRequest](../../models/shared/OnboardingInviteRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateOnboardingInviteResponse](../../models/operations/CreateOnboardingInviteResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400, 409                            | application/json                    |
| models/errors/OnboardingInviteError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## listInvites

List all the onboarding invites created by the caller's account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listOnboardingInvites" method="get" path="/onboarding-invites" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListOnboardingInvitesResponse;
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

        ListOnboardingInvitesResponse res = sdk.onboarding().listInvites()
                .call();

        if (res.onboardingInvites().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListOnboardingInvitesResponse](../../models/operations/ListOnboardingInvitesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getInvite

Retrieve details about an onboarding invite.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getOnboardingInvite" method="get" path="/onboarding-invites/{code}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetOnboardingInviteResponse;
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

        GetOnboardingInviteResponse res = sdk.onboarding().getInvite()
                .code("N1IA5eWYNh")
                .call();

        if (res.onboardingInvite().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `code`             | *String*           | :heavy_check_mark: | N/A                | N1IA5eWYNh         |

### Response

**[GetOnboardingInviteResponse](../../models/operations/GetOnboardingInviteResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## revokeInvite

Revoke an onboarding invite, rendering the invitation link unusable.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="revokeOnboardingInvite" method="delete" path="/onboarding-invites/{code}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.RevokeOnboardingInviteResponse;
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

        RevokeOnboardingInviteResponse res = sdk.onboarding().revokeInvite()
                .code("N1IA5eWYNh")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `code`             | *String*           | :heavy_check_mark: | N/A                | N1IA5eWYNh         |

### Response

**[RevokeOnboardingInviteResponse](../../models/operations/RevokeOnboardingInviteResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |