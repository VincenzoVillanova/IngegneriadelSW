public class Stop implements State {
    public State play() {
        return new Play();
    }

    public State stop() {
        System.out.println("Già sei in pausa!!!");
        return this;
    }

    public void sound() {
        System.out.println("SEMU STUTATI!");
    }
}
