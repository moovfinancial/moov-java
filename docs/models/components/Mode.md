# Mode

The operating mode for an account.

## Example Usage

```java
import io.moov.sdk.models.components.Mode;

Mode value = Mode.SANDBOX;

// Open enum: use .of() to create instances from custom string values
Mode custom = Mode.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `SANDBOX`    | sandbox      |
| `PRODUCTION` | production   |