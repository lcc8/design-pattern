package observer.weatherstation.subject;

import observer.weatherstation.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataImpl implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    List<Observer> observers;

    public WeatherDataImpl() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
       for(Observer observer : observers){
           observer.update(temperature, humidity, pressure);
       }
    }

    public void setMeasurements(float temprature, float humidity, float pressure){
        this.temperature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObserver();
    }
}
