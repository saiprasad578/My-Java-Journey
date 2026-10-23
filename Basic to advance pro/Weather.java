class Weather {

    private String city;
    private double temperature;
    private int humidity;

    Weather(String city, double temperature, int humidity) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    void checkWeather() {
        System.out.println("City: " + city);
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Humidity: " + humidity + "%");

        if (temperature >= 40) {
            System.out.println("Alert: Extreme heat!");
        } else if (temperature <= 10) {
            System.out.println("Alert: Very cold weather!");
        } else {
            System.out.println("Weather is normal.");
        }
    }

    void updateTemperature(double newTemperature) {
        temperature = newTemperature;
        System.out.println("Temperature updated successfully.");
    }
}

public class WeatherDemo {

    public static void main(String[] args) {

        Weather weather = new Weather("Hyderabad", 42, 35);

        weather.checkWeather();

        System.out.println();

        weather.updateTemperature(32);

        System.out.println();

        weather.checkWeather();
    }
}