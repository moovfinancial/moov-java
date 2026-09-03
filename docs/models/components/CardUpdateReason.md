# CardUpdateReason

The results of the card update request.

## Example Usage

```java
import io.moov.sdk.models.components.CardUpdateReason;

CardUpdateReason value = CardUpdateReason.UNSPECIFIED;

// Open enum: use .of() to create instances from custom string values
CardUpdateReason custom = CardUpdateReason.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `UNSPECIFIED`        | unspecified          |
| `ACCOUNT_CLOSED`     | account-closed       |
| `CONTACT_CARDHOLDER` | contact-cardholder   |
| `EXPIRATION_UPDATE`  | expiration-update    |
| `NO_CHANGE`          | no-change            |
| `NO_MATCH`           | no-match             |
| `NUMBER_UPDATE`      | number-update        |