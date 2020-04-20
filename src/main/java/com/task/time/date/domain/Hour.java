package com.task.time.date.domain;

import com.task.time.common.Preconditions;
import com.task.time.date.serialization.IntegerSerializable;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.Value;

@Value(staticConstructor = "of")
public class Hour implements IntegerSerializable {

    Integer value;

    private Hour(Integer value){
        Preconditions.CheckNotNull(value);
        Preconditions.CheckArgument(StringUtils.isNotBlank(value.toString()));
        Preconditions.CheckArgument(value >= 0 && value <= 23);
        this.value = value;
    }

    @Override
    public Integer typeOf() {
        return value;
    }
}
