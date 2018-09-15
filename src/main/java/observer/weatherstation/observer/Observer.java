package observer.weatherstation.observer;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
