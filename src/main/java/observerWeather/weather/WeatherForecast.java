package observerWeather.weather;



import observerWeather.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {
    private int temperature;
    private int pressure;
    Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        registeredObservers.forEach(r->r.updateForecast(this));
    }

    public void updateForecast(int i, int i1) {
        setTemperature(i);
        setPressure(i1);
        notifyObservers();
    }
}
