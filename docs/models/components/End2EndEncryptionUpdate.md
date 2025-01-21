# End2EndEncryptionUpdate

Optional and only used if planning to use End to End Encryption to pass PCI data through an intermediary. 
This is the output of using compact serialization of a JWE token that wraps an AES key and uses the public key returned from /end-to-end-keys.
Examples of how to create this token can be found on our [GitHub](https://github.com/moovfinancial/moov-go/blob/main/examples/e2ee/e2ee_test.go).
Body for a JWE token following [RFC](https://datatracker.ietf.org/doc/html/rfc7516).


## Fields

| Field               | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `token`             | *Optional\<String>* | :heavy_minus_sign:  | N/A                 |