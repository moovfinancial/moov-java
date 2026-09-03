# RTPFailureCode

Status codes for RTP failures.

## Example Usage

```java
import io.moov.sdk.models.components.RTPFailureCode;

RTPFailureCode value = RTPFailureCode.PROCESSING_ERROR;

// Open enum: use .of() to create instances from custom string values
RTPFailureCode custom = RTPFailureCode.of("custom_value");
```


## Values

| Name                        | Value                       |
| --------------------------- | --------------------------- |
| `PROCESSING_ERROR`          | processing-error            |
| `INVALID_ACCOUNT`           | invalid-account             |
| `ACCOUNT_CLOSED`            | account-closed              |
| `ACCOUNT_BLOCKED`           | account-blocked             |
| `INVALID_FIELD`             | invalid-field               |
| `TRANSACTION_NOT_SUPPORTED` | transaction-not-supported   |
| `LIMIT_EXCEEDED`            | limit-exceeded              |
| `INVALID_AMOUNT`            | invalid-amount              |
| `CUSTOMER_DECEASED`         | customer-deceased           |
| `OTHER`                     | other                       |