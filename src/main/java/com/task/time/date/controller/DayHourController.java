package com.task.time.date.controller;

import com.task.time.date.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api/v1/dayhour")
public class DayHourController {

    TimeUnit timeUnit;

    @Autowired
    public DayHourController(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @GetMapping("/hour")
    public DayHourRequest getDayHour(){
        LocalTime date = LocalTime.now();
        Hour hour = Hour.of(date.getHour());
        Minute minute = Minute.of(date.getMinute());
        Second second = Second.of(date.getSecond());
        Long fromMidnight = TimeUnit.fromMidnight(timeUnit, date);

        return DayHourRequest.from(
                hour,
                minute,
                second,
                fromMidnight
        );
    }
}
