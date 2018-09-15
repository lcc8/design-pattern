package observer.weatherstation;

import observer.weatherstation.observer.CurrentConditionsDisplayJavaImpl;
import observer.weatherstation.subject.WeatherDataJavaImpl;

public class WeatherStation {


    public static void main(String[] args) {
//        WeatherDataImpl weatherData = new WeatherDataImpl();
//
//        CurrentConditionsDisplayImpl currentConditionsDisplay = new CurrentConditionsDisplayImpl(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

//        weatherData.setMeasurements(80, 65, 30.4f);
//        weatherData.setMeasurements(82, 70, 29.2f);
//        weatherData.setMeasurements(78, 90, 29.2f);

        WeatherDataJavaImpl observable = new WeatherDataJavaImpl();

        CurrentConditionsDisplayJavaImpl currentConditionsDisplayJava = new CurrentConditionsDisplayJavaImpl(observable);

        observable.setMeasurements(80, 65, 30.4f);
        observable.setMeasurements(82, 70, 29.2f);
        observable.setMeasurements(78, 90, 29.2f);
    }

}
