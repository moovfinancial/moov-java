# BankAccountVerificationStatus

## Example Usage

```java
import io.moov.sdk.models.components.BankAccountVerificationStatus;

BankAccountVerificationStatus value = BankAccountVerificationStatus.NEW;

// Open enum: use .of() to create instances from custom string values
BankAccountVerificationStatus custom = BankAccountVerificationStatus.of("custom_value");
```


## Values

| Name                    | Value                   |
| ----------------------- | ----------------------- |
| `NEW`                   | new                     |
| `SENT_CREDIT`           | sent-credit             |
| `MAX_ATTEMPTS_EXCEEDED` | max-attempts-exceeded   |
| `FAILED`                | failed                  |
| `EXPIRED`               | expired                 |
| `SUCCESSFUL`            | successful              |