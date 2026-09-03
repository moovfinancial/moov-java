# WalletStatus

Status of a wallet.
  - `active`: The wallet is available for use and has an enabled payment method.
  - `closed`: The wallet is no longer active and the corresponding payment method has been disabled.

## Example Usage

```java
import io.moov.sdk.models.components.WalletStatus;

WalletStatus value = WalletStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
WalletStatus custom = WalletStatus.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `ACTIVE` | active   |
| `CLOSED` | closed   |