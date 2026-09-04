# DisputePhase

The phase of a dispute within the dispute lifecycle.

## Example Usage

```java
import io.moov.sdk.models.components.DisputePhase;

DisputePhase value = DisputePhase.PRE_DISPUTE;

// Open enum: use .of() to create instances from custom string values
DisputePhase custom = DisputePhase.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `PRE_DISPUTE` | pre-dispute   |
| `INQUIRY`     | inquiry       |
| `CHARGEBACK`  | chargeback    |
| `UNKNOWN`     | unknown       |