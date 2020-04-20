package com.task.time.configuration;

import com.google.gson.Gson;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

public class WebApplicationConfiguration implements WebMvcConfigurer {

    private final Gson gson;

    public WebApplicationConfiguration(Gson gson) {
        this.gson = gson;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        GsonHttpMessageConverter message = new GsonHttpMessageConverter(gson);
        converters.add(message);
    }
}
