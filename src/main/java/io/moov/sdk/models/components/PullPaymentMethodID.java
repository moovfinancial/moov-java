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

@JsonDeserialize(using = PullPaymentMethodID._Deserializer.class)
public class PullPaymentMethodID {

    @JsonValue
    private TypedObject value;
    
    private PullPaymentMethodID(TypedObject value) {
        this.value = value;
    }

    public static PullPaymentMethodID of(String value) {
        Utils.checkNotNull(value, "value");
        return new PullPaymentMethodID(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static PullPaymentMethodID of(PullPaymentMethodID2 value) {
        Utils.checkNotNull(value, "value");
        return new PullPaymentMethodID(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<PullPaymentMethodID2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code io.moov.sdk.models.components.PullPaymentMethodID2}</li>
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
        PullPaymentMethodID other = (PullPaymentMethodID) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<PullPaymentMethodID> {

        public _Deserializer() {
            super(PullPaymentMethodID.class, false,
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<PullPaymentMethodID2>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(PullPaymentMethodID.class,
                "value", value);
    }
 
}

