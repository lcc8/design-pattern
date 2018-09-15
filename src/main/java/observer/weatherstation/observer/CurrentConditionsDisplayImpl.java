package observer.weatherstation.observer;

import observer.weatherstation.subject.Subject;

public class CurrentConditionsDisplayImpl implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplayImpl(Subject weatherData) {
       this.weatherData = weatherData;
       weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current Conditions: " + temperature + " F degrees and " + humidity + "% humidity.");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
