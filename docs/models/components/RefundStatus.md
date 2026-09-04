# RefundStatus

## Example Usage

```java
import io.moov.sdk.models.components.RefundStatus;

RefundStatus value = RefundStatus.CREATED;

// Open enum: use .of() to create instances from custom string values
RefundStatus custom = RefundStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `CREATED`   | created     |
| `PENDING`   | pending     |
| `COMPLETED` | completed   |
| `FAILED`    | failed      |