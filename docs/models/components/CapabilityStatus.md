# CapabilityStatus

The status of the capability requested for an account.

## Example Usage

```java
import io.moov.sdk.models.components.CapabilityStatus;

CapabilityStatus value = CapabilityStatus.ENABLED;

// Open enum: use .of() to create instances from custom string values
CapabilityStatus custom = CapabilityStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `ENABLED`   | enabled     |
| `DISABLED`  | disabled    |
| `PENDING`   | pending     |
| `IN_REVIEW` | in-review   |