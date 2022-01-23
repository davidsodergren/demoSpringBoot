package com.david.demo.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class WeatherInput {

    @JsonProperty("main")
    public WeatherData main;
}
