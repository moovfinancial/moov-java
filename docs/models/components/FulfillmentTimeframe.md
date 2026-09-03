# FulfillmentTimeframe

## Example Usage

```java
import io.moov.sdk.models.components.FulfillmentTimeframe;

FulfillmentTimeframe value = FulfillmentTimeframe.IMMEDIATE;

// Open enum: use .of() to create instances from custom string values
FulfillmentTimeframe custom = FulfillmentTimeframe.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `IMMEDIATE`          | immediate            |
| `OTHER`              | other                |
| `OVER30_DAYS`        | over-30-days         |
| `PRE_ORDER`          | pre-order            |
| `RECURRING_SCHEDULE` | recurring-schedule   |
| `SCHEDULED_EVENT`    | scheduled-event      |
| `WITHIN30_DAYS`      | within-30-days       |
| `WITHIN7_DAYS`       | within-7-days        |