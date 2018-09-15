package observer.weatherstation.observer;

import observer.weatherstation.subject.WeatherDataJavaImpl;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayJavaImpl implements Observer, DisplayElement {

    private Observable observable;

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayJavaImpl(Observable observable) {
       this.observable = observable;
       observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current Conditions: " + temperature + " F degrees and " + humidity + "% humidity.");
    }

    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherDataJavaImpl){
            this.temperature = ((WeatherDataJavaImpl) observable).getTemperature();
            this.humidity = ((WeatherDataJavaImpl) observable).getHumidity();
            display();
        }
    }
}
