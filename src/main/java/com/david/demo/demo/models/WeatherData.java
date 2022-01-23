package com.david.demo.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherData {

    @JsonProperty("temp")
    private String temp;
    @JsonProperty("feels_like")
    private String feelsLike;
}
