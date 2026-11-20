# CreateCardPaymentOptionsCaptureMethod

How funds are captured. `automatic` (default) authorizes and captures the full amount right away.
`manual` authorizes only; capture later with the capture endpoint.

## Example Usage

```java
import io.moov.sdk.models.components.CreateCardPaymentOptionsCaptureMethod;

CreateCardPaymentOptionsCaptureMethod value = CreateCardPaymentOptionsCaptureMethod.AUTOMATIC;
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `AUTOMATIC` | automatic   |
| `MANUAL`    | manual      |