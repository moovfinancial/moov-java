# IssuedCardState

The `state` represents the operational status of an issued card.

Authorizations can only be approved while the card is `active`:

- `active`: The card is operational and authorizations can be approved.
- `frozen`: The card is temporarily suspended and authorizations cannot be approved. Set the state back to `active` to reactivate it. A card can move between `frozen` and `active` as often as needed.
- `closed`: The card is permanently deactivated. A card is closed by request or when it expires, and cannot be reopened.

## Example Usage

```java
import io.moov.sdk.models.components.IssuedCardState;

IssuedCardState value = IssuedCardState.ACTIVE;

// Open enum: use .of() to create instances from custom string values
IssuedCardState custom = IssuedCardState.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `ACTIVE` | active   |
| `FROZEN` | frozen   |
| `CLOSED` | closed   |