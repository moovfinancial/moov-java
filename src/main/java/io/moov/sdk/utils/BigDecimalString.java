/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.utils;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

// Internal API only

// Note that Jackson 2.16.1 does not support @JsonValue and @JsonFormat combined so we must use
// a custom serializer/deserializer

@JsonSerialize(using = BigDecimalString.Serializer.class)
@JsonDeserialize(using = BigDecimalString.Deserializer.class)
public class BigDecimalString {

    private final BigDecimal value;

    public BigDecimalString(BigDecimal value) {
        this.value = value;
    }
    
    public BigDecimalString(String value) {
        this(new BigDecimal(value));
    }
    
    public BigDecimal value() {
        return value;
    }
    
    @Override
    public String toString() {
        return value.toString();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BigDecimalString other = (BigDecimalString) obj;
        return Objects.equals(value, other.value);
    }
    
    @SuppressWarnings("serial")
    public static final class Serializer extends StdSerializer<BigDecimalString> {

        protected Serializer() {
            super(BigDecimalString.class);
        }

        @Override
        public void serialize(BigDecimalString value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeString(value.value.toString());
        }
    }

    @SuppressWarnings("serial")
    public static final class Deserializer extends StdDeserializer<BigDecimalString> {

        protected Deserializer() {
            super(BigDecimalString.class);
        }

        @Override
        public BigDecimalString deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String s = p.readValueAs(String.class);
            return new BigDecimalString(new BigDecimal(s));
        }
    }
}
