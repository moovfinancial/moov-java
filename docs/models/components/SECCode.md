# SECCode

Code used to identify the ACH authorization method.

## Example Usage

```java
import io.moov.sdk.models.components.SECCode;

SECCode value = SECCode.WEB;

// Open enum: use .of() to create instances from custom string values
SECCode custom = SECCode.of("custom_value");
```


## Values

| Name  | Value |
| ----- | ----- |
| `WEB` | WEB   |
| `PPD` | PPD   |
| `CCD` | CCD   |
| `TEL` | TEL   |