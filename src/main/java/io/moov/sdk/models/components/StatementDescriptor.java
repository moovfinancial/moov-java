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

@JsonDeserialize(using = StatementDescriptor._Deserializer.class)
public class StatementDescriptor {

    @JsonValue
    private TypedObject value;
    
    private StatementDescriptor(TypedObject value) {
        this.value = value;
    }

    public static StatementDescriptor of(String value) {
        Utils.checkNotNull(value, "value");
        return new StatementDescriptor(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static StatementDescriptor of(StatementDescriptor2 value) {
        Utils.checkNotNull(value, "value");
        return new StatementDescriptor(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StatementDescriptor2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code io.moov.sdk.models.components.StatementDescriptor2}</li>
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
        StatementDescriptor other = (StatementDescriptor) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<StatementDescriptor> {

        public _Deserializer() {
            super(StatementDescriptor.class, false,
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<StatementDescriptor2>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(StatementDescriptor.class,
                "value", value);
    }
 
}

