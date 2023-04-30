package observerWeather.notification;

import observerWeather.weather.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println(this.getClass().getSimpleName()
                + " - nowa prognoza pogody: temperatura: "
                + weatherForecast.getTemperature() + "'C, ciśnienie: "
                + weatherForecast.getPressure() + "hPa");
    }
}
