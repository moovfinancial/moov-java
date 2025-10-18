# ImageUploadRequestMultiPart

Multipart request body for uploading an image with optional metadata.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `image`                                                                            | [Image](../../models/components/Image.md)                                          | :heavy_check_mark:                                                                 | N/A                                                                                |
| `metadata`                                                                         | [Optional\<ImageMetadataRequest>](../../models/components/ImageMetadataRequest.md) | :heavy_minus_sign:                                                                 | Optional, json-encoded metadata to associate with the uploaded image.              |