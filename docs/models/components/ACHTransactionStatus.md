# ACHTransactionStatus

Status of a transaction within the ACH lifecycle.

## Example Usage

```java
import io.moov.sdk.models.components.ACHTransactionStatus;

ACHTransactionStatus value = ACHTransactionStatus.UNKNOWN;

// Open enum: use .of() to create instances from custom string values
ACHTransactionStatus custom = ACHTransactionStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `UNKNOWN`    |              |
| `INITIATED`  | initiated    |
| `ORIGINATED` | originated   |
| `CORRECTED`  | corrected    |
| `RETURNED`   | returned     |
| `COMPLETED`  | completed    |
| `CANCELED`   | canceled     |