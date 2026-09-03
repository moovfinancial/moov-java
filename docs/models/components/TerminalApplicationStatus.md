# TerminalApplicationStatus

Status of the terminal application.

## Example Usage

```java
import io.moov.sdk.models.components.TerminalApplicationStatus;

TerminalApplicationStatus value = TerminalApplicationStatus.UNDEFINED;

// Open enum: use .of() to create instances from custom string values
TerminalApplicationStatus custom = TerminalApplicationStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `UNDEFINED` | undefined   |
| `PENDING`   | pending     |
| `ENABLED`   | enabled     |
| `DISABLED`  | disabled    |