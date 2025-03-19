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


@JsonDeserialize(using = CreateRefundResponse._Deserializer.class)
public class CreateRefundResponse {

    @JsonValue
    private TypedObject value;
    
    private CreateRefundResponse(TypedObject value) {
        this.value = value;
    }

    public static CreateRefundResponse of(CardAcquiringRefund value) {
        Utils.checkNotNull(value, "value");
        return new CreateRefundResponse(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<CardAcquiringRefund>(){}));
    }

    public static CreateRefundResponse of(AsyncCreatedRefund value) {
        Utils.checkNotNull(value, "value");
        return new CreateRefundResponse(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AsyncCreatedRefund>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code io.moov.sdk.models.components.CardAcquiringRefund}</li>
     * <li>{@code io.moov.sdk.models.components.AsyncCreatedRefund}</li>
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
        CreateRefundResponse other = (CreateRefundResponse) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CreateRefundResponse> {

        public _Deserializer() {
            super(CreateRefundResponse.class, false,
                  TypeReferenceWithShape.of(new TypeReference<CardAcquiringRefund>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AsyncCreatedRefund>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRefundResponse.class,
                "value", value);
    }
 
}
