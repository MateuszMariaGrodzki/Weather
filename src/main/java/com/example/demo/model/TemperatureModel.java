package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown =  true)
public class TemperatureModel {

    @JsonProperty("temp")
    private Double temp;

    @JsonProperty("pressure")
    private Integer pressure;

    public double getTemperatureInCelsjusz(){
        return temp - 273.15;
    }

    public String getTemperatureDescription(){
        return String.format("%.2f" , getTemperatureInCelsjusz());
    }

}
