# CardIssuingNetwork

The name of the network a card transaction is routed through.

## Example Usage

```java
import io.moov.sdk.models.components.CardIssuingNetwork;

CardIssuingNetwork value = CardIssuingNetwork.DISCOVER;

// Open enum: use .of() to create instances from custom string values
CardIssuingNetwork custom = CardIssuingNetwork.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `DISCOVER` | discover   |
| `SHAZAM`   | shazam     |
| `VISA`     | visa       |