# RiskVerificationOutcome

The outcome of a bank account risk-verification attempt.

## Example Usage

```java
import io.moov.sdk.models.components.RiskVerificationOutcome;

RiskVerificationOutcome value = RiskVerificationOutcome.NOT_ATTEMPTED;

// Open enum: use .of() to create instances from custom string values
RiskVerificationOutcome custom = RiskVerificationOutcome.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `NOT_ATTEMPTED` | notAttempted    |
| `SUCCESS`       | success         |
| `INCONCLUSIVE`  | inconclusive    |
| `DECLINE`       | decline         |