public class Spento implements State {
    public State accendi() {
        System.out.println("Avviamento della lampadina in corso...");
        return new Acceso();
    }

    public State spegni() {
        System.out.println("Sono già spento!");
        return this;
    }
}
