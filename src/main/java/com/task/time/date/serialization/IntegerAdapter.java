package com.task.time.date.serialization;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.function.Function;

public class IntegerAdapter<T extends IntegerSerializable> implements GsonAdapter<T> {

    private final Function<Integer, T> factory;

    public IntegerAdapter(Function<Integer, T> factory) {
        this.factory = factory;
    }

    @Override
    public T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = Integer.parseInt(jsonElement.getAsString());
        return factory.apply(value);
    }

    @Override
    public JsonElement serialize(T t, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = t.typeOf();
        return new JsonPrimitive(value);
    }
}
