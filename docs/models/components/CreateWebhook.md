# CreateWebhook

Request body for creating a new webhook.


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `url`                                                                  | *String*                                                               | :heavy_check_mark:                                                     | The URL where webhook events will be sent.                             |
| `status`                                                               | [WebhookStatus](../../models/components/WebhookStatus.md)              | :heavy_check_mark:                                                     | The status of the webhook.                                             |
| `eventTypes`                                                           | List\<[WebhookEventType](../../models/components/WebhookEventType.md)> | :heavy_check_mark:                                                     | The list of event types this webhook should subscribe to.              |
| `description`                                                          | *String*                                                               | :heavy_check_mark:                                                     | A description of the webhook for reference. Can be an empty string.    |