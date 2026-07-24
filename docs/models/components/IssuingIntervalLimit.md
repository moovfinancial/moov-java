# IssuingIntervalLimit

Specifies the time frame for a velocity limit. `per-transaction` applies to each individual authorization and never resets. Time-based intervals (where supported) reset at midnight ET.

## Example Usage

```java
import io.moov.sdk.models.components.IssuingIntervalLimit;

IssuingIntervalLimit value = IssuingIntervalLimit.PER_TRANSACTION;
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `PER_TRANSACTION` | per-transaction   |