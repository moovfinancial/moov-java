# IssuingControlsRestrictionMode

Whether the listed items should be allowed (`allow`) or blocked (`block`).

## Example Usage

```java
import io.moov.sdk.models.components.IssuingControlsRestrictionMode;

IssuingControlsRestrictionMode value = IssuingControlsRestrictionMode.ALLOW;

// Open enum: use .of() to create instances from custom string values
IssuingControlsRestrictionMode custom = IssuingControlsRestrictionMode.of("custom_value");
```


## Values

| Name    | Value   |
| ------- | ------- |
| `ALLOW` | allow   |
| `BLOCK` | block   |