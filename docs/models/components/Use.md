# Use

The intended use of the key. 'sig' for signature, 'enc' for encryption.

## Example Usage

```java
import io.moov.sdk.models.components.Use;

Use value = Use.SIG;

// Open enum: use .of() to create instances from custom string values
Use custom = Use.of("custom_value");
```


## Values

| Name  | Value |
| ----- | ----- |
| `SIG` | sig   |
| `ENC` | enc   |