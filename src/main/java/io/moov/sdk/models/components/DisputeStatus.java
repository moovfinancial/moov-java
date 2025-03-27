/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * DisputeStatus
 * 
 * <p>The status of a particular dispute. 
 * 
 * <p>Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/#dispute-statuses) to learn what each status means.
 */
public enum DisputeStatus {
    RESPONSE_NEEDED("response-needed"),
    RESOLVED("resolved"),
    UNDER_REVIEW("under-review"),
    CLOSED("closed"),
    ACCEPTED("accepted"),
    EXPIRED("expired"),
    WON("won"),
    LOST("lost");

    @JsonValue
    private final String value;

    private DisputeStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DisputeStatus> fromValue(String value) {
        for (DisputeStatus o: DisputeStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
