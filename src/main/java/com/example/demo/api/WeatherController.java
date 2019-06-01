package com.example.demo.api;

import com.example.demo.model.WeatherModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

    @GetMapping("/weather")
    @ResponseBody
    public String getWeather(@RequestParam String city){
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + ",pl&appid=ef2028e98b54649bf1f4c4582631f350";
        WeatherModel weatherModel = new RestTemplate().getForObject(url, WeatherModel.class);
        return weatherModel.toString();
    }
}
