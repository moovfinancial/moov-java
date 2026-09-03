# CancellationStatus

## Example Usage

```java
import io.moov.sdk.models.components.CancellationStatus;

CancellationStatus value = CancellationStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
CancellationStatus custom = CancellationStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PENDING`   | pending     |
| `COMPLETED` | completed   |
| `FAILED`    | failed      |