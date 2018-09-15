package observer.weatherstation.observer;

import observer.weatherstation.subject.WeatherDataImpl;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherDataImpl weatherData;

    public StatisticsDisplay(WeatherDataImpl weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                                   + "/" + maxTemp + "/" + minTemp);
    }
    
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }
}
