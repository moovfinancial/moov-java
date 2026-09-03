# PaymentLinkType

## Example Usage

```java
import io.moov.sdk.models.components.PaymentLinkType;

PaymentLinkType value = PaymentLinkType.PAYMENT;

// Open enum: use .of() to create instances from custom string values
PaymentLinkType custom = PaymentLinkType.of("custom_value");
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `PAYMENT`         | payment           |
| `PAYOUT`          | payout            |
| `INVOICE_PAYMENT` | invoice-payment   |