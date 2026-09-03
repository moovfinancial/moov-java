# OccurrenceStatus

Status of the completed occurrence.

## Example Usage

```java
import io.moov.sdk.models.components.OccurrenceStatus;

OccurrenceStatus value = OccurrenceStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
OccurrenceStatus custom = OccurrenceStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PENDING`   | pending     |
| `FAILED`    | failed      |
| `COMPLETED` | completed   |