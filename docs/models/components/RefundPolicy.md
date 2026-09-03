# RefundPolicy

## Example Usage

```java
import io.moov.sdk.models.components.RefundPolicy;

RefundPolicy value = RefundPolicy.CONDITIONAL_REFUND;

// Open enum: use .of() to create instances from custom string values
RefundPolicy custom = RefundPolicy.of("custom_value");
```


## Values

| Name                          | Value                         |
| ----------------------------- | ----------------------------- |
| `CONDITIONAL_REFUND`          | conditional-refund            |
| `CUSTOM_POLICY`               | custom-policy                 |
| `EVENT_BASED_POLICY`          | event-based-policy            |
| `FULL_REFUND_EXTENDED_WINDOW` | full-refund-extended-window   |
| `FULL_REFUND_WITHIN30_DAYS`   | full-refund-within-30-days    |
| `NO_REFUNDS`                  | no-refunds                    |
| `PARTIAL_REFUND`              | partial-refund                |
| `PRORATED_REFUND`             | prorated-refund               |
| `STORE_CREDIT_ONLY`           | store-credit-only             |