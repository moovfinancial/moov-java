# BankAccountHolderType

The type of holder on a funding source.

## Example Usage

```java
import io.moov.sdk.models.components.BankAccountHolderType;

BankAccountHolderType value = BankAccountHolderType.INDIVIDUAL;

// Open enum: use .of() to create instances from custom string values
BankAccountHolderType custom = BankAccountHolderType.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `INDIVIDUAL` | individual   |
| `BUSINESS`   | business     |