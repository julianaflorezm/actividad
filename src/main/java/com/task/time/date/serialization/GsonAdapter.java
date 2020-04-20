package com.task.time.date.serialization;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public interface GsonAdapter<T> extends JsonSerializer<T>, JsonDeserializer<T> {
}
