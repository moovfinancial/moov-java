# TransferEventType

The event family.

## Example Usage

```java
import io.moov.sdk.models.components.TransferEventType;

TransferEventType value = TransferEventType.TRANSFER;

// Open enum: use .of() to create instances from custom string values
TransferEventType custom = TransferEventType.of("custom_value");
```


## Values

| Name                  | Value                 |
| --------------------- | --------------------- |
| `TRANSFER`            | transfer              |
| `AUTHORIZATION`       | authorization         |
| `CAPTURE`             | capture               |
| `REFUND`              | refund                |
| `CANCELLATION`        | cancellation          |
| `DISPUTE`             | dispute               |
| `ACH_CREDIT`          | ach-credit            |
| `ACH_DEBIT`           | ach-debit             |
| `INSTANT_BANK_CREDIT` | instant-bank-credit   |
| `WIRE_CREDIT`         | wire-credit           |
| `CARD_PAYMENT`        | card-payment          |
| `PUSH_TO_CARD`        | push-to-card          |
| `PULL_FROM_CARD`      | pull-from-card        |
| `WALLET_CREDIT`       | wallet-credit         |
| `WALLET_DEBIT`        | wallet-debit          |