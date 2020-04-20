package com.task.time.date.services;

import com.task.time.date.domain.DayTime;
import com.task.time.date.domain.Hour;
import com.task.time.date.domain.Minute;
import com.task.time.date.domain.Second;
import com.task.time.date.repositories.DayTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DayTimeServices {

    private final DayTimeRepository repository;

    @Autowired
    public DayTimeServices(@Qualifier("in-memory") DayTimeRepository repository) {
        this.repository = repository;
    }

    public Long InsertOne(Hour hour, Minute minute, Second second){
        return repository.insertOne(hour, minute, second);
    }

    public ArrayList<DayTime> findAll(){
        return repository.findAll();
    }
}
