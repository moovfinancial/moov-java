# PushDeliverySpeed

Delivery speed options for push-to-card payouts.

## Example Usage

```java
import io.moov.sdk.models.components.PushDeliverySpeed;

PushDeliverySpeed value = PushDeliverySpeed.INSTANT;

// Open enum: use .of() to create instances from custom string values
PushDeliverySpeed custom = PushDeliverySpeed.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `INSTANT`  | instant    |
| `DEFERRED` | deferred   |