public class Adapter extends Adaptee implements Target {
    int tempCelsius;

    public Adapter(int k) {
        this.tempCelsius = k;
    }

    public int getTempCelsius() {
        return this.tempCelsius;
    }

    public int getTempKelvin() {
        return getTempeKelvin(tempCelsius);
    }
}
