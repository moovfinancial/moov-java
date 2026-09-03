# CardAcquiringModel

Specifies the card processing pricing model

## Example Usage

```java
import io.moov.sdk.models.components.CardAcquiringModel;

CardAcquiringModel value = CardAcquiringModel.COST_PLUS;

// Open enum: use .of() to create instances from custom string values
CardAcquiringModel custom = CardAcquiringModel.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `COST_PLUS` | cost-plus   |
| `FLAT_RATE` | flat-rate   |