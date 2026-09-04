# WalletTransactionSourceType

## Example Usage

```java
import io.moov.sdk.models.components.WalletTransactionSourceType;

WalletTransactionSourceType value = WalletTransactionSourceType.TRANSFER;

// Open enum: use .of() to create instances from custom string values
WalletTransactionSourceType custom = WalletTransactionSourceType.of("custom_value");
```


## Values

| Name                       | Value                      |
| -------------------------- | -------------------------- |
| `TRANSFER`                 | transfer                   |
| `DISPUTE`                  | dispute                    |
| `ISSUING_CARD_TRANSACTION` | issuing-card-transaction   |
| `ISSUING_AUTHORIZATION`    | issuing-authorization      |
| `SWEEP`                    | sweep                      |
| `ADJUSTMENT`               | adjustment                 |
| `FEE`                      | fee                        |
| `RESIDUAL`                 | residual                   |