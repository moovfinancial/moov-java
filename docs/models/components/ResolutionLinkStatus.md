# ResolutionLinkStatus

The status of a resolution link.

## Example Usage

```java
import io.moov.sdk.models.components.ResolutionLinkStatus;

ResolutionLinkStatus value = ResolutionLinkStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
ResolutionLinkStatus custom = ResolutionLinkStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `ACTIVE`    | active      |
| `SUBMITTED` | submitted   |
| `COMPLETED` | completed   |
| `DISABLED`  | disabled    |
| `EXPIRED`   | expired     |