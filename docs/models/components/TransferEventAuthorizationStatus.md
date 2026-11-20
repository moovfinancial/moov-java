# TransferEventAuthorizationStatus

## Example Usage

```java
import io.moov.sdk.models.components.TransferEventAuthorizationStatus;

TransferEventAuthorizationStatus value = TransferEventAuthorizationStatus.APPROVED;

// Open enum: use .of() to create instances from custom string values
TransferEventAuthorizationStatus custom = TransferEventAuthorizationStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `APPROVED` | approved   |
| `DECLINED` | declined   |
| `REVERSED` | reversed   |