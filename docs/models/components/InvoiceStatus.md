# InvoiceStatus

## Example Usage

```java
import io.moov.sdk.models.components.InvoiceStatus;

InvoiceStatus value = InvoiceStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
InvoiceStatus custom = InvoiceStatus.of("custom_value");
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `DRAFT`           | draft             |
| `UNPAID`          | unpaid            |
| `PAYMENT_PENDING` | payment-pending   |
| `PAID`            | paid              |
| `OVERDUE`         | overdue           |
| `CANCELED`        | canceled          |