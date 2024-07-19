public class Main {
    public static void main(String[] args) {
        IAuto seicento = new AutoB();
        seicento = new Turbina(seicento);
        seicento = new Sospensioni(seicento);
        seicento.operation();
    }
}
