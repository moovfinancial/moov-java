# WebhookStatus

The status of a webhook.

## Example Usage

```java
import io.moov.sdk.models.components.WebhookStatus;

WebhookStatus value = WebhookStatus.ENABLED;

// Open enum: use .of() to create instances from custom string values
WebhookStatus custom = WebhookStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `ENABLED`  | enabled    |
| `DISABLED` | disabled   |