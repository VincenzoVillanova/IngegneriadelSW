public class Adapter implements Target {
    private double dollari;
    private Adaptee obj;

    public Adapter(double dollari) {
        this.dollari = dollari;
        obj = new Adaptee(dollari);
    }

    public double getDollari() {
        return dollari;
    }

    public double getEuro() {
        return obj.getEuro();
    }
}
