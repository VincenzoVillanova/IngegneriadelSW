public class Adaptee {
    double val;

    public Adaptee(double soldi) {
        this.val = soldi;
    }

    public double getEuro() {
        return val * 0.93;
    }
}
