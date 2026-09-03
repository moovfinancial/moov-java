# WireTransactionStatus

Status of a transaction within the wire lifecycle.

## Example Usage

```java
import io.moov.sdk.models.components.WireTransactionStatus;

WireTransactionStatus value = WireTransactionStatus.INITIATED;

// Open enum: use .of() to create instances from custom string values
WireTransactionStatus custom = WireTransactionStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `INITIATED` | initiated   |
| `COMPLETED` | completed   |
| `FAILED`    | failed      |
| `RETURNED`  | returned    |