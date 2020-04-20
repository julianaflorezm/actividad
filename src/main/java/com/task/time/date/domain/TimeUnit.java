package com.task.time.date.domain;

import java.time.LocalTime;

public enum TimeUnit {
    HOURS,
    MINUTES,
    SECONDS,
    MILISECONDS;

    public static Long fromMidnight(TimeUnit unidad, LocalTime actualHour) {
        int hour = actualHour.getHour();
        int minute = actualHour.getMinute();
        int second = actualHour.getSecond();
        switch (unidad) {
            case HOURS:
                return (long) hour + (minute / 60) + (second / 3600);
            case MINUTES:
                return (long) (hour * 60) + minute + (second / 60);
            case SECONDS:
                return (long) (hour * 3600) + (minute * 60) + second;
            case MILISECONDS:
                return (long) (hour * 1000 * 3600) + (minute * 60 * 1000) + (second * 1000);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
