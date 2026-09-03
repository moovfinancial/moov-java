# BusinessPresence

## Example Usage

```java
import io.moov.sdk.models.components.BusinessPresence;

BusinessPresence value = BusinessPresence.COMMERCIAL_OFFICE;

// Open enum: use .of() to create instances from custom string values
BusinessPresence custom = BusinessPresence.of("custom_value");
```


## Values

| Name                | Value               |
| ------------------- | ------------------- |
| `COMMERCIAL_OFFICE` | commercial-office   |
| `HOME_BASED`        | home-based          |
| `MIXED_PRESENCE`    | mixed-presence      |
| `MOBILE_BUSINESS`   | mobile-business     |
| `ONLINE_ONLY`       | online-only         |
| `RETAIL_STOREFRONT` | retail-storefront   |