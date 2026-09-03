# CaptureStatus

## Example Usage

```java
import io.moov.sdk.models.components.CaptureStatus;

CaptureStatus value = CaptureStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
CaptureStatus custom = CaptureStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PENDING`   | pending     |
| `COMPLETED` | completed   |
| `FAILED`    | failed      |
| `CANCELED`  | canceled    |