package com.example.demo.Service;

import com.example.demo.model.WeatherModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class OpenWeatherMapService implements WeatherService {

    @Override
    public WeatherModel getWeather(String city) {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + ",pl&appid=ef2028e98b54649bf1f4c4582631f350";
        return new RestTemplate().getForObject(url, WeatherModel.class);
    }

}
