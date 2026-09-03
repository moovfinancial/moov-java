# TicketStatus

## Example Usage

```java
import io.moov.sdk.models.components.TicketStatus;

TicketStatus value = TicketStatus.NEW;

// Open enum: use .of() to create instances from custom string values
TicketStatus custom = TicketStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `NEW`         | new           |
| `IN_PROGRESS` | in-progress   |
| `ON_HOLD`     | on-hold       |
| `CLOSED`      | closed        |