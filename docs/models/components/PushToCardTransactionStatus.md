# PushToCardTransactionStatus

Status of a push-to-card transaction.

## Example Usage

```java
import io.moov.sdk.models.components.PushToCardTransactionStatus;

PushToCardTransactionStatus value = PushToCardTransactionStatus.INITIATED;

// Open enum: use .of() to create instances from custom string values
PushToCardTransactionStatus custom = PushToCardTransactionStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `INITIATED` | initiated   |
| `DEFERRED`  | deferred    |
| `CANCELED`  | canceled    |
| `FAILED`    | failed      |
| `COMPLETED` | completed   |