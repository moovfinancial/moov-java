# InstantBankTransactionStatus

Status of a transaction within the instant-bank lifecycle.

## Example Usage

```java
import io.moov.sdk.models.components.InstantBankTransactionStatus;

InstantBankTransactionStatus value = InstantBankTransactionStatus.INITIATED;

// Open enum: use .of() to create instances from custom string values
InstantBankTransactionStatus custom = InstantBankTransactionStatus.of("custom_value");
```


## Values

| Name                       | Value                      |
| -------------------------- | -------------------------- |
| `INITIATED`                | initiated                  |
| `COMPLETED`                | completed                  |
| `FAILED`                   | failed                     |
| `ACCEPTED_WITHOUT_POSTING` | accepted-without-posting   |