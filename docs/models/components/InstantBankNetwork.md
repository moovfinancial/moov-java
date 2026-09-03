# InstantBankNetwork

The network that the transaction was processed on.

## Example Usage

```java
import io.moov.sdk.models.components.InstantBankNetwork;

InstantBankNetwork value = InstantBankNetwork.FEDNOW;

// Open enum: use .of() to create instances from custom string values
InstantBankNetwork custom = InstantBankNetwork.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `FEDNOW` | fednow   |
| `RTP`    | rtp      |