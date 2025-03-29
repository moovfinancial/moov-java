/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.moov.sdk.utils.OneOfDeserializer;
import io.moov.sdk.utils.TypedObject;
import io.moov.sdk.utils.Utils.JsonShape;
import io.moov.sdk.utils.Utils.TypeReferenceWithShape;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Reversal
 * 
 * <p>Contains either a cancellation or refund, depending on the method used to reverse the transfer.
 */
@JsonDeserialize(using = Reversal._Deserializer.class)
public class Reversal {

    @JsonValue
    private TypedObject value;
    
    private Reversal(TypedObject value) {
        this.value = value;
    }

    public static Reversal of(ReversedWithCancellation value) {
        Utils.checkNotNull(value, "value");
        return new Reversal(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ReversedWithCancellation>(){}));
    }

    public static Reversal of(ReversedWithRefund value) {
        Utils.checkNotNull(value, "value");
        return new Reversal(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ReversedWithRefund>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code io.moov.sdk.models.components.ReversedWithCancellation}</li>
     * <li>{@code io.moov.sdk.models.components.ReversedWithRefund}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reversal other = (Reversal) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Reversal> {

        public _Deserializer() {
            super(Reversal.class, false,
                  TypeReferenceWithShape.of(new TypeReference<ReversedWithRefund>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ReversedWithCancellation>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Reversal.class,
                "value", value);
    }
 
}

