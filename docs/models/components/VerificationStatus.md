# ~~VerificationStatus~~

Possible states an account verification can be in.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```java
import io.moov.sdk.models.components.VerificationStatus;

VerificationStatus value = VerificationStatus.UNVERIFIED;
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `UNVERIFIED` | unverified   |
| `PENDING`    | pending      |
| `VERIFIED`   | verified     |
| `ERRORED`    | errored      |