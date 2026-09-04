# CardPaymentTransactionStatus

Status of a card payment transaction.

## Example Usage

```java
import io.moov.sdk.models.components.CardPaymentTransactionStatus;

CardPaymentTransactionStatus value = CardPaymentTransactionStatus.INITIATED;

// Open enum: use .of() to create instances from custom string values
CardPaymentTransactionStatus custom = CardPaymentTransactionStatus.of("custom_value");
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