package com.task.time.configuration.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration //Bean de Spring
@ConfigurationProperties(prefix = "timeunit") //Prefijo del archivo de config donde esta el param
@RequiredArgsConstructor
@Data
public class TimeUnitParam {
    String value;
}
