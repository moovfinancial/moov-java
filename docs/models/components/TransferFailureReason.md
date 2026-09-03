# TransferFailureReason

Reason for a transfer's failure.

## Example Usage

```java
import io.moov.sdk.models.components.TransferFailureReason;

TransferFailureReason value = TransferFailureReason.SOURCE_PAYMENT_ERROR;

// Open enum: use .of() to create instances from custom string values
TransferFailureReason custom = TransferFailureReason.of("custom_value");
```


## Values

| Name                        | Value                       |
| --------------------------- | --------------------------- |
| `SOURCE_PAYMENT_ERROR`      | source-payment-error        |
| `DESTINATION_PAYMENT_ERROR` | destination-payment-error   |
| `WALLET_INSUFFICIENT_FUNDS` | wallet-insufficient-funds   |
| `REJECTED_HIGH_RISK`        | rejected-high-risk          |
| `PROCESSING_ERROR`          | processing-error            |