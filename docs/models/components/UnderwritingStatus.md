# ~~UnderwritingStatus~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```java
import io.moov.sdk.models.components.UnderwritingStatus;

UnderwritingStatus value = UnderwritingStatus.APPROVED;

// Open enum: use .of() to create instances from custom string values
UnderwritingStatus custom = UnderwritingStatus.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `APPROVED`       | approved         |
| `REJECTED`       | rejected         |
| `PENDING_REVIEW` | pendingReview    |
| `PENDING`        | pending          |
| `NOT_REQUESTED`  | notRequested     |