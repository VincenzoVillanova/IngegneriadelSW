public class Adaptee {
    private int tempCelsius;

    public Adaptee(int k) {
        this.tempCelsius = k;
    }

    public int getTempKelvin() {

        return this.tempCelsius + 273;
    }
}
