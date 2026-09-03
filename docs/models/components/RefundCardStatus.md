# RefundCardStatus

## Example Usage

```java
import io.moov.sdk.models.components.RefundCardStatus;

RefundCardStatus value = RefundCardStatus.INITIATED;

// Open enum: use .of() to create instances from custom string values
RefundCardStatus custom = RefundCardStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `INITIATED` | initiated   |
| `CONFIRMED` | confirmed   |
| `SETTLED`   | settled     |
| `FAILED`    | failed      |
| `COMPLETED` | completed   |