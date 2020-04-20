package com.task.time.common;

import java.util.Objects;

public class Preconditions {

    public static void CheckNotNull(Object reference){
        if(Objects.isNull(reference)){
            throw new NullPointerException();
        }
    }

    public static void CheckArgument(Boolean argument){
        if(!argument){
            throw new IllegalArgumentException();
        }
    }
}
