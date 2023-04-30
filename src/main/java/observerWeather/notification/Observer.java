package observerWeather.notification;

import observerWeather.weather.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}