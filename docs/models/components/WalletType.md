# WalletType

Type of a wallet.
  - `default`: The system-generated wallet automatically created when an account is granted the wallet capability.
  - `general`: An additional, user-defined wallet created via API or Dashboard.
  - `card-issuing`: The system-generated wallet automatically created when an account is granted the card-issuing capability.

## Example Usage

```java
import io.moov.sdk.models.components.WalletType;

WalletType value = WalletType.DEFAULT;

// Open enum: use .of() to create instances from custom string values
WalletType custom = WalletType.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `DEFAULT`      | default        |
| `GENERAL`      | general        |
| `CARD_ISSUING` | card-issuing   |