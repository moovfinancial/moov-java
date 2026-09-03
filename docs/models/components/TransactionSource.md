# TransactionSource

Specifies the nature and initiator of a transaction. 

Crucial for recurring and merchant-initiated transactions as per card scheme rules. 
Omit for customer-initiated e-commerce transactions.

## Example Usage

```java
import io.moov.sdk.models.components.TransactionSource;

TransactionSource value = TransactionSource.FIRST_RECURRING;

// Open enum: use .of() to create instances from custom string values
TransactionSource custom = TransactionSource.of("custom_value");
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `FIRST_RECURRING` | first-recurring   |
| `RECURRING`       | recurring         |
| `UNSCHEDULED`     | unscheduled       |