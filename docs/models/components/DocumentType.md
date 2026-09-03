# DocumentType

Types of documents that can be uploaded.

## Example Usage

```java
import io.moov.sdk.models.components.DocumentType;

DocumentType value = DocumentType.DRIVERS_LICENSE;

// Open enum: use .of() to create instances from custom string values
DocumentType custom = DocumentType.of("custom_value");
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `DRIVERS_LICENSE` | driversLicense    |
| `PASSPORT`        | passport          |
| `UTILITY_BILL`    | utilityBill       |
| `BANK_STATEMENT`  | bankStatement     |