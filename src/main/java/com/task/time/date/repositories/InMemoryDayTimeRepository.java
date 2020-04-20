package com.task.time.date.repositories;

import com.task.time.date.domain.DayTime;
import com.task.time.date.domain.Hour;
import com.task.time.date.domain.Minute;
import com.task.time.date.domain.Second;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Qualifier("in-memory")
public class InMemoryDayTimeRepository implements DayTimeRepository {

    private final ArrayList<DayTime> lista = new ArrayList<>();

    @Override
    public Long insertOne(Hour hour, Minute minute, Second second) {
        DayTime dayTime = DayTime.from(hour, minute, second);
        lista.add(dayTime);
        Long index = lista.size() - 1L;
        return index;
    }

    @Override
    public ArrayList<DayTime> findAll() {
        return lista;
    }
}
