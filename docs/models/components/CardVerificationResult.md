# CardVerificationResult

The result of a card verification check.

## Example Usage

```java
import io.moov.sdk.models.components.CardVerificationResult;

CardVerificationResult value = CardVerificationResult.NO_MATCH;

// Open enum: use .of() to create instances from custom string values
CardVerificationResult custom = CardVerificationResult.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `NO_MATCH`      | noMatch         |
| `MATCH`         | match           |
| `NOT_CHECKED`   | notChecked      |
| `UNAVAILABLE`   | unavailable     |
| `PARTIAL_MATCH` | partialMatch    |