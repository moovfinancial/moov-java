# FeeModel

Specifies the pricing model used for the calculation of the final fee.

## Example Usage

```java
import io.moov.sdk.models.components.FeeModel;

FeeModel value = FeeModel.FIXED;

// Open enum: use .of() to create instances from custom string values
FeeModel custom = FeeModel.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `FIXED`    | fixed      |
| `BLENDED`  | blended    |
| `VARIABLE` | variable   |