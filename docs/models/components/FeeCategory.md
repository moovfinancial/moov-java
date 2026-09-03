# FeeCategory

## Example Usage

```java
import io.moov.sdk.models.components.FeeCategory;

FeeCategory value = FeeCategory.ACH;

// Open enum: use .of() to create instances from custom string values
FeeCategory custom = FeeCategory.of("custom_value");
```


## Values

| Name                  | Value                 |
| --------------------- | --------------------- |
| `ACH`                 | ach                   |
| `CARD_ACQUIRING`      | card-acquiring        |
| `CARD_OTHER`          | card-other            |
| `CARD_PULL`           | card-pull             |
| `CARD_PUSH`           | card-push             |
| `INSTANT_BANK`        | instant-bank          |
| `MONTHLY_PLATFORM`    | monthly-platform      |
| `NETWORK_PASSTHROUGH` | network-passthrough   |
| `OTHER`               | other                 |
| `RTP`                 | rtp                   |