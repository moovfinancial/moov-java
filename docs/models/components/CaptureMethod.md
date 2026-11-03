# CaptureMethod

When funds for a `card-payment` transfer are captured.

## Example Usage

```java
import io.moov.sdk.models.components.CaptureMethod;

CaptureMethod value = CaptureMethod.AUTOMATIC;

// Open enum: use .of() to create instances from custom string values
CaptureMethod custom = CaptureMethod.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `AUTOMATIC` | automatic   |
| `MANUAL`    | manual      |