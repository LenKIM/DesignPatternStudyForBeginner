import java.util.Observable;
import java.util.Observer;

/**
 * Created by len on 2017. 1. 9..
 */
public class CurrentConditonsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditonsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions :" + temperature
                    + "F degrees and " + humidity + "% humidity");
    }
}
