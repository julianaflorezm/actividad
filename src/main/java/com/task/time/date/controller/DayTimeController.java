package com.task.time.date.controller;

import com.task.time.date.domain.DayTime;
import com.task.time.date.services.DayTimeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/times")
@RequiredArgsConstructor
public class DayTimeController {

    private final DayTimeServices service;

    @PostMapping
    public Long insertOne(@RequestBody DayTime daytimeBody){
        return service.InsertOne(daytimeBody.getHour(), daytimeBody.getMinute(), daytimeBody.getSecond());
    }

    @GetMapping("/list")
    public ArrayList<DayTime> findAll(){
        return service.findAll();
    }


}
