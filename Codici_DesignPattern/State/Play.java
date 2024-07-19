public class Play implements State {
    public State play() {
        System.out.println("Già sei in esecuzione!!!");
        return this;
    }

    public State stop() {
        return new Stop();
    }

    public void sound() {
        System.out.println("STAMU SUNANNU!");
    }
}
