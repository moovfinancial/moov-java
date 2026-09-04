# PullFromCardTransactionStatus

Status of a pull-from-card transaction.

## Example Usage

```java
import io.moov.sdk.models.components.PullFromCardTransactionStatus;

PullFromCardTransactionStatus value = PullFromCardTransactionStatus.INITIATED;

// Open enum: use .of() to create instances from custom string values
PullFromCardTransactionStatus custom = PullFromCardTransactionStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `INITIATED` | initiated   |
| `FAILED`    | failed      |
| `COMPLETED` | completed   |