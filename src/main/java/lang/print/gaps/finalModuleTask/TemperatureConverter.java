package lang.print.gaps.finalModuleTask;

// °F = (°C ×9/5) + 32
// °C = (°F − 32) x 5/9

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        System.out.println((double) temperatureCelsius * 9 / 5 + 32);
    }
}
