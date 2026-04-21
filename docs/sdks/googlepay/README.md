# GooglePay

## Overview

### Available Operations

* [linkToken](#linktoken) - Connect a Google Pay token to the specified account.

The `token` data is defined by Google Pay and should be passed through from Google Pay's response unmodified.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/cards.write` scope.

## linkToken

Connect a Google Pay token to the specified account.

The `token` data is defined by Google Pay and should be passed through from Google Pay's response unmodified.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/cards.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="linkGooglePayToken" method="post" path="/accounts/{accountID}/google-pay/tokens" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.LinkGooglePayError;
import io.moov.sdk.models.operations.LinkGooglePayTokenResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, LinkGooglePayError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        LinkGooglePayTokenResponse res = sdk.googlePay().linkToken()
                .accountID("<id>")
                .linkGooglePay(LinkGooglePay.builder()
                    .token(GooglePayToken.builder()
                        .protocolVersion("ECv2")
                        .signature("<value>")
                        .intermediateSigningKey(GooglePayIntermediateSigningKey.builder()
                            .signedKey("<value>")
                            .signatures(List.of(
                                "<value 1>",
                                "<value 2>",
                                "<value 3>"))
                            .build())
                        .signedMessage("<value>")
                        .build())
                    .build())
                .call();

        if (res.linkedGooglePayPaymentMethods().isPresent()) {
            System.out.println(res.linkedGooglePayPaymentMethods().get());
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `accountID`                                               | *String*                                                  | :heavy_check_mark:                                        | ID of the Moov account representing the cardholder.       |
| `linkGooglePay`                                           | [LinkGooglePay](../../models/components/LinkGooglePay.md) | :heavy_check_mark:                                        | N/A                                                       |

### Response

**[LinkGooglePayTokenResponse](../../models/operations/LinkGooglePayTokenResponse.md)**

### Errors

| Error Type                       | Status Code                      | Content Type                     |
| -------------------------------- | -------------------------------- | -------------------------------- |
| models/errors/GenericError       | 400, 409                         | application/json                 |
| models/errors/LinkGooglePayError | 422                              | application/json                 |
| models/errors/APIException       | 4XX, 5XX                         | \*/\*                            |