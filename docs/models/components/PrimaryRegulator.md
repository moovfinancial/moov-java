# PrimaryRegulator

If the business is a financial institution, this field describes its primary regulator.

## Example Usage

```java
import io.moov.sdk.models.components.PrimaryRegulator;

PrimaryRegulator value = PrimaryRegulator.OCC;

// Open enum: use .of() to create instances from custom string values
PrimaryRegulator custom = PrimaryRegulator.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `OCC`                | OCC                  |
| `FDIC`               | FDIC                 |
| `NCUA`               | NCUA                 |
| `FRB`                | FRB                  |
| `STATE_CU_REGULATOR` | state-cu-regulator   |