package observerWeather.weather;


import observerWeather.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}