public class WeatherStation {
    public static void main(String[] args) {

        System.out.println("Prima prova");

        WeatherData weatherData = new WeatherData();

        weatherData.attach(new CurrentConditionsDisplay());
        weatherData.setMeasurements(80, 65);
        weatherData.attach(new CurrentConditionsDisplay());
        weatherData.attach(new CurrentConditionsDisplay());
        weatherData.setMeasurements(80, 70);
    }
}
