# WalletTransactionStatus

## Example Usage

```java
import io.moov.sdk.models.components.WalletTransactionStatus;

WalletTransactionStatus value = WalletTransactionStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
WalletTransactionStatus custom = WalletTransactionStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PENDING`   | pending     |
| `COMPLETED` | completed   |
| `CANCELED`  | canceled    |
| `FAILED`    | failed      |