package com.task.time.date.domain;

import com.task.time.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "from")
public class DayHourRequest {
    Hour hour;
    Minute minute;
    Second second;
    Long fromidnight;

    private DayHourRequest(Hour hour, Minute minute, Second second, Long fromidnight) {
        Preconditions.CheckNotNull(hour);
        Preconditions.CheckNotNull(minute);
        Preconditions.CheckNotNull(second);
        Preconditions.CheckNotNull(fromidnight);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.fromidnight = fromidnight;
    }
}
