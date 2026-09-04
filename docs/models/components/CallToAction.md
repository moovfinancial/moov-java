# CallToAction

The text to be displayed on web form's submit button.

If set to "auto" the UI will automatically select between 
"pay" and "confirm" for payments and payouts respectively.

## Example Usage

```java
import io.moov.sdk.models.components.CallToAction;

CallToAction value = CallToAction.PAY;

// Open enum: use .of() to create instances from custom string values
CallToAction custom = CallToAction.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PAY`       | pay         |
| `BOOK`      | book        |
| `SUBSCRIBE` | subscribe   |
| `DONATE`    | donate      |
| `CONFIRM`   | confirm     |
| `AUTO`      | auto        |