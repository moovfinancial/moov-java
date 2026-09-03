# RTPTransactionStatus

Status of a transaction within the RTP lifecycle.

## Example Usage

```java
import io.moov.sdk.models.components.RTPTransactionStatus;

RTPTransactionStatus value = RTPTransactionStatus.INITIATED;

// Open enum: use .of() to create instances from custom string values
RTPTransactionStatus custom = RTPTransactionStatus.of("custom_value");
```


## Values

| Name                       | Value                      |
| -------------------------- | -------------------------- |
| `INITIATED`                | initiated                  |
| `COMPLETED`                | completed                  |
| `FAILED`                   | failed                     |
| `ACCEPTED_WITHOUT_POSTING` | accepted-without-posting   |