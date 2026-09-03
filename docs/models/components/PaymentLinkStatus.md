# PaymentLinkStatus

## Example Usage

```java
import io.moov.sdk.models.components.PaymentLinkStatus;

PaymentLinkStatus value = PaymentLinkStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
PaymentLinkStatus custom = PaymentLinkStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `ACTIVE`   | active     |
| `USED`     | used       |
| `DISABLED` | disabled   |
| `EXPIRED`  | expired    |