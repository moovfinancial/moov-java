# DomesticPullFromCard

Indicates if the card supports domestic pull-from-card transfer.

## Example Usage

```java
import io.moov.sdk.models.components.DomesticPullFromCard;

DomesticPullFromCard value = DomesticPullFromCard.NOT_SUPPORTED;

// Open enum: use .of() to create instances from custom string values
DomesticPullFromCard custom = DomesticPullFromCard.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `NOT_SUPPORTED` | not-supported   |
| `SUPPORTED`     | supported       |
| `UNKNOWN`       | unknown         |