# SweepStatus

## Example Usage

```java
import io.moov.sdk.models.components.SweepStatus;

SweepStatus value = SweepStatus.ACCRUING;

// Open enum: use .of() to create instances from custom string values
SweepStatus custom = SweepStatus.of("custom_value");
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `ACCRUING`        | accruing          |
| `ACTION_REQUIRED` | action-required   |
| `CANCELED`        | canceled          |
| `CLOSED`          | closed            |
| `FAILED`          | failed            |
| `PAID`            | paid              |