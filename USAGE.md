<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.AccountType;
import io.moov.sdk.models.components.CreateAccount;
import io.moov.sdk.models.components.CreateBusinessProfile;
import io.moov.sdk.models.components.CreateProfile;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.CreateAccountResponseBody;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CreateAccountResponseBody, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateAccountResponse res = sdk.accounts().create()
                .xMoovVersion(Versions.V202504)
                .createAccount(CreateAccount.builder()
                    .accountType(AccountType.BUSINESS)
                    .profile(CreateProfile.builder()
                        .business(CreateBusinessProfile.builder()
                            .legalBusinessName("Classbooker, LLC")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.account().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->