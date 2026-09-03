# ~~VerificationStatus~~

Possible states an account verification can be in.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```java
import io.moov.sdk.models.components.VerificationStatus;

VerificationStatus value = VerificationStatus.UNVERIFIED;

// Open enum: use .of() to create instances from custom string values
VerificationStatus custom = VerificationStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `UNVERIFIED` | unverified   |
| `PENDING`    | pending      |
| `VERIFIED`   | verified     |
| `ERRORED`    | errored      |