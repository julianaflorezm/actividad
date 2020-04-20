package com.task.time.configuration;

import com.task.time.configuration.domain.TimeUnitParam;
import com.task.time.date.domain.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeUnitConfiguration{
    private final TimeUnitParam timeUnit;

    @Autowired
    public TimeUnitConfiguration(TimeUnitParam timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Bean
    public TimeUnit getTimeUnit(TimeUnitParam param){
        /*
        TimeUnit unidad = TimeUnit.SECONDS; //Find a better way
        if (timeUnit.getValue().equals(TimeUnit.valueOf("HOURS").toString())){
            unidad = TimeUnit.HOURS;
        }
        if(timeUnit.getValue().equals(TimeUnit.valueOf("MINUTES").toString())){
            unidad = TimeUnit.MINUTES;
        }
        if(timeUnit.getValue().equals(TimeUnit.valueOf("SECONDS").toString())){
            unidad = TimeUnit.SECONDS;
        }
        if(timeUnit.getValue().equals(TimeUnit.valueOf("MILISECONDS").toString())){
            unidad = TimeUnit.MILISECONDS;
        }*/
        return TimeUnit.valueOf(param.getValue());
    }

    /*
    @PostConstruct
    public void prueba(){
        System.out.println(timeUnit.getValue());
        System.out.println(timeUnit.getValue().equals(TimeUnit.valueOf("HOURS").toString()));
    }*/
}
