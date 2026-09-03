# TransferParty

## Example Usage

```java
import io.moov.sdk.models.components.TransferParty;

TransferParty value = TransferParty.SOURCE;

// Open enum: use .of() to create instances from custom string values
TransferParty custom = TransferParty.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `SOURCE`      | source        |
| `DESTINATION` | destination   |
| `PARTNER`     | partner       |