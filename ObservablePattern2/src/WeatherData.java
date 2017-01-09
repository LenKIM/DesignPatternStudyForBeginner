import java.util.Observable;

/**
 * Created by len on 2017. 1. 9..
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged(){
        //상태가 변했음을 알려주는 메소드
        setChanged();

        notifyObservers();
    }

    public void setMeasurements(float temp, float humi, float pressure){
        this.temperature = temp;
        this.humidity = humi;
        this.pressure = pressure;
        measurementsChanged();
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
