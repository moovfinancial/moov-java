# ACHTransactionStatus

Status of a transaction within the ACH lifecycle.

## Example Usage

```java
import io.moov.sdk.models.components.ACHTransactionStatus;

ACHTransactionStatus value = ACHTransactionStatus.UNKNOWN;
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