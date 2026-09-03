# ReturnPolicyType

## Example Usage

```java
import io.moov.sdk.models.components.ReturnPolicyType;

ReturnPolicyType value = ReturnPolicyType.NONE;

// Open enum: use .of() to create instances from custom string values
ReturnPolicyType custom = ReturnPolicyType.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `NONE`               | none                 |
| `EXCHANGE_ONLY`      | exchangeOnly         |
| `WITHIN_THIRTY_DAYS` | withinThirtyDays     |
| `OTHER`              | other                |