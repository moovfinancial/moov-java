# AuthTokenRequest


## Fields

| Field                                             | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `grantType`                                       | [GrantType](../../models/components/GrantType.md) | :heavy_check_mark:                                | The type of grant being requested.                |                                                   |
| `scopes`                                          | *String*                                          | :heavy_check_mark:                                | A space delimited list of scopes                  | /moov/support.read /moov/support.write            |