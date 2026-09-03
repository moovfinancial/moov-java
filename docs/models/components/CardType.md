# CardType

The type of the card.

## Example Usage

```java
import io.moov.sdk.models.components.CardType;

CardType value = CardType.DEBIT;

// Open enum: use .of() to create instances from custom string values
CardType custom = CardType.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `DEBIT`   | debit     |
| `CREDIT`  | credit    |
| `PREPAID` | prepaid   |
| `UNKNOWN` | unknown   |