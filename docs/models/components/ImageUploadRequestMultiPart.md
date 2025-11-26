# ImageUploadRequestMultiPart


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `image`                                                                            | [Image](../../models/components/Image.md)                                          | :heavy_check_mark:                                                                 | A PNG, JPEG, or WebP image file to upload.                                         |
| `metadata`                                                                         | [Optional\<ImageMetadataRequest>](../../models/components/ImageMetadataRequest.md) | :heavy_minus_sign:                                                                 | Optional, json-encoded metadata to associate with the uploaded image.              |