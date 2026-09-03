# FileStatus

The file's status.

## Example Usage

```java
import io.moov.sdk.models.components.FileStatus;

FileStatus value = FileStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
FileStatus custom = FileStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `PENDING`  | pending    |
| `APPROVED` | approved   |
| `REJECTED` | rejected   |