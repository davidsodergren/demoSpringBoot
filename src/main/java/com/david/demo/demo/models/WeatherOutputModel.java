package com.david.demo.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherOutputModel {

    private String city;
    private String temperature;
    private String feelsLike;
}
