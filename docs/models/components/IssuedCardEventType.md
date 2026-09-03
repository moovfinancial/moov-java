# IssuedCardEventType

The type of event that occurred on the card.

## Example Usage

```java
import io.moov.sdk.models.components.IssuedCardEventType;

IssuedCardEventType value = IssuedCardEventType.AUTHORIZATION;

// Open enum: use .of() to create instances from custom string values
IssuedCardEventType custom = IssuedCardEventType.of("custom_value");
```


## Values

| Name                        | Value                       |
| --------------------------- | --------------------------- |
| `AUTHORIZATION`             | authorization               |
| `REVERSAL`                  | reversal                    |
| `AUTHORIZATION_ADVICE`      | authorization-advice        |
| `AUTHORIZATION_EXPIRATION`  | authorization-expiration    |
| `AUTHORIZATION_INCREMENTAL` | authorization-incremental   |
| `CLEARING`                  | clearing                    |