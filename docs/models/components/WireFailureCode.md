# WireFailureCode

Status codes for wire failures.

## Example Usage

```java
import io.moov.sdk.models.components.WireFailureCode;

WireFailureCode value = WireFailureCode.PROCESSING_ERROR;

// Open enum: use .of() to create instances from custom string values
WireFailureCode custom = WireFailureCode.of("custom_value");
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
| `OTHER`                     | other                       |