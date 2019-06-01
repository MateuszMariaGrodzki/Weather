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


}
