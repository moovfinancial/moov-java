# AuthMethod

The authentication method used for the Google Pay token.

## Example Usage

```java
import io.moov.sdk.models.components.AuthMethod;

AuthMethod value = AuthMethod.PAN_ONLY;

// Open enum: use .of() to create instances from custom string values
AuthMethod custom = AuthMethod.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PAN_ONLY`       | PAN_ONLY         |
| `CRYPTOGRAM3_DS` | CRYPTOGRAM_3DS   |