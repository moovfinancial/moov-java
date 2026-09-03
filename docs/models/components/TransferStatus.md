# TransferStatus

Status of a transfer.

## Example Usage

```java
import io.moov.sdk.models.components.TransferStatus;

TransferStatus value = TransferStatus.CREATED;

// Open enum: use .of() to create instances from custom string values
TransferStatus custom = TransferStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `CREATED`          | created            |
| `PENDING`          | pending            |
| `COMPLETED`        | completed          |
| `FAILED`           | failed             |
| `REVERSED`         | reversed           |
| `QUEUED`           | queued             |
| `AWAITING_CAPTURE` | awaiting-capture   |
| `CANCELED`         | canceled           |