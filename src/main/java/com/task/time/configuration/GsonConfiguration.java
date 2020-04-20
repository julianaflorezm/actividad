package com.task.time.configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.task.time.date.domain.Hour;
import com.task.time.date.domain.Minute;
import com.task.time.date.domain.Second;
import com.task.time.date.serialization.IntegerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson() {
        return new GsonBuilder()
                .registerTypeAdapter(Hour.class, new IntegerAdapter<>(Hour::of))
                .registerTypeAdapter(Minute.class, new IntegerAdapter<>(Minute::of))
                .registerTypeAdapter(Second.class, new IntegerAdapter<>(Second::of))
                .create();
    }

}
