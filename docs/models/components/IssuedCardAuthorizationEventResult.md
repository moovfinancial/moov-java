# IssuedCardAuthorizationEventResult

The result of an event.

## Example Usage

```java
import io.moov.sdk.models.components.IssuedCardAuthorizationEventResult;

IssuedCardAuthorizationEventResult value = IssuedCardAuthorizationEventResult.APPROVED;

// Open enum: use .of() to create instances from custom string values
IssuedCardAuthorizationEventResult custom = IssuedCardAuthorizationEventResult.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `APPROVED`  | approved    |
| `DECLINED`  | declined    |
| `PROCESSED` | processed   |