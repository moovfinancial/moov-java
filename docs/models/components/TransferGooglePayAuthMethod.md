# TransferGooglePayAuthMethod

The authentication method used for the Google Pay token.

## Example Usage

```java
import io.moov.sdk.models.components.TransferGooglePayAuthMethod;

TransferGooglePayAuthMethod value = TransferGooglePayAuthMethod.PAN_ONLY;

// Open enum: use .of() to create instances from custom string values
TransferGooglePayAuthMethod custom = TransferGooglePayAuthMethod.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PAN_ONLY`       | PAN_ONLY         |
| `CRYPTOGRAM3_DS` | CRYPTOGRAM_3DS   |