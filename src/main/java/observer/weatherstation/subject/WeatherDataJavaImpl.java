package observer.weatherstation.subject;

import observer.weatherstation.observer.Observer;

import java.util.List;
import java.util.Observable;

public class WeatherDataJavaImpl extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    List<Observer> observers;

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
        setChanged();
        notifyObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
