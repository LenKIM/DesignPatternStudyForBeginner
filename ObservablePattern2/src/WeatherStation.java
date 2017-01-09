/**
 * Created by len on 2017. 1. 9..
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditonsDisplay currentConditonsDisplay =
                new CurrentConditonsDisplay(weatherData);

        weatherData.setMeasurements(12, 32,44);
        weatherData.setMeasurements(30, 40,50);
        weatherData.setMeasurements(20, 10,60);
    }
}
