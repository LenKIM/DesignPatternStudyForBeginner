/**
 * Created by len on 2017. 1. 9..
 * Observer Pattern
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //디스플레이를 생성하면서 weaterData객체를 인자로 전달한다
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,11.4f);
        weatherData.setMeasurements(78,90,22.4f);
    }

}
