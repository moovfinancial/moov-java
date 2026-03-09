# UpdateIssuedCardState

Updates the state of a Moov issued card.
- `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.

## Example Usage

```java
import io.moov.sdk.models.components.UpdateIssuedCardState;

UpdateIssuedCardState value = UpdateIssuedCardState.CLOSED;
```


## Values

| Name     | Value    |
| -------- | -------- |
| `CLOSED` | closed   |