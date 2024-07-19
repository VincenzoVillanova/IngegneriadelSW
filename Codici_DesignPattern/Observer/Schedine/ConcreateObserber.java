public class ConcreateObserber implements Observer {
    double quota;

    public void update(double val) {
        this.quota = val;
        this.stampa();
    }

    public void stampa() {
        System.out.println("Quota esotica : " + quota);
    }
}