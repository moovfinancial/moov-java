# BankAccountStatus

## Example Usage

```java
import io.moov.sdk.models.components.BankAccountStatus;

BankAccountStatus value = BankAccountStatus.NEW;

// Open enum: use .of() to create instances from custom string values
BankAccountStatus custom = BankAccountStatus.of("custom_value");
```


## Values

| Name                  | Value                 |
| --------------------- | --------------------- |
| `NEW`                 | new                   |
| `VERIFIED`            | verified              |
| `VERIFICATION_FAILED` | verificationFailed    |
| `PENDING`             | pending               |
| `ERRORED`             | errored               |