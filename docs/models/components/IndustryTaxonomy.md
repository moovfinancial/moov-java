# IndustryTaxonomy

A structured industry taxonomy entry with category and mapped to a default MCC code.


## Fields

| Field                                       | Type                                        | Required                                    | Description                                 | Example                                     |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `industry`                                  | *String*                                    | :heavy_check_mark:                          | Classification identifier for the industry. | clothing-accessories                        |
| `displayName`                               | *String*                                    | :heavy_check_mark:                          | Display name of the industry                | Clothing & Accessories                      |
| `category`                                  | *String*                                    | :heavy_check_mark:                          | Category slug                               | retail                                      |
| `categoryDisplayName`                       | *String*                                    | :heavy_check_mark:                          | Human-readable category label               | Retail                                      |
| `defaultMcc`                                | *String*                                    | :heavy_check_mark:                          | Default Merchant Category Code              | 5651                                        |