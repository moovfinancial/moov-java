# CardTransactionStatus

Status of a transaction within the card payment lifecycle.

## Example Usage

```java
import io.moov.sdk.models.components.CardTransactionStatus;

CardTransactionStatus value = CardTransactionStatus.INITIATED;

// Open enum: use .of() to create instances from custom string values
CardTransactionStatus custom = CardTransactionStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `INITIATED` | initiated   |
| `CONFIRMED` | confirmed   |
| `CANCELED`  | canceled    |
| `SETTLED`   | settled     |
| `FAILED`    | failed      |
| `COMPLETED` | completed   |
| `DEFERRED`  | deferred    |