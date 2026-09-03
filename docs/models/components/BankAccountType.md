# BankAccountType

The bank account type.

## Example Usage

```java
import io.moov.sdk.models.components.BankAccountType;

BankAccountType value = BankAccountType.CHECKING;

// Open enum: use .of() to create instances from custom string values
BankAccountType custom = BankAccountType.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `CHECKING`       | checking         |
| `SAVINGS`        | savings          |
| `GENERAL_LEDGER` | general-ledger   |
| `LOAN`           | loan             |