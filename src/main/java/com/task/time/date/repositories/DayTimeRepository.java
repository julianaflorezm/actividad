package com.task.time.date.repositories;

import com.task.time.date.domain.DayTime;
import com.task.time.date.domain.Hour;
import com.task.time.date.domain.Minute;
import com.task.time.date.domain.Second;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DayTimeRepository {
    Long insertOne(Hour hour, Minute minute, Second second);
    ArrayList<DayTime> findAll();
}
