public class Adapter implements Target {
    Adaptee obj;
    int tempCelsius;

    public Adapter(int k) {
        this.tempCelsius = k;
    }

    public int getTempCelsius() {
        return this.tempCelsius;
    }

    public int getTempKelvin() {
        if (obj == null)
            obj = new Adaptee(tempCelsius);

        return obj.getTempKelvin();
    }
}
