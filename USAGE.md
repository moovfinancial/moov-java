<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.CreateAccountError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CreateAccountError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        CreateAccount req = CreateAccount.builder()
                .accountType(CreateAccountType.BUSINESS)
                .profile(CreateProfile.builder()
                    .business(CreateBusinessProfile.builder()
                        .legalBusinessName("Whole Body Fitness LLC")
                        .build())
                    .build())
                .build();

        CreateAccountResponse res = sdk.accounts().create()
                .request(req)
                .call();

        if (res.account().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->