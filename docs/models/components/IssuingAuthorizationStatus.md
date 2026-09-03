# IssuingAuthorizationStatus

Status of a card issuing authorization.

## Example Usage

```java
import io.moov.sdk.models.components.IssuingAuthorizationStatus;

IssuingAuthorizationStatus value = IssuingAuthorizationStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
IssuingAuthorizationStatus custom = IssuingAuthorizationStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `PENDING`  | pending    |
| `DECLINED` | declined   |
| `CANCELED` | canceled   |
| `CLEARED`  | cleared    |
| `EXPIRED`  | expired    |