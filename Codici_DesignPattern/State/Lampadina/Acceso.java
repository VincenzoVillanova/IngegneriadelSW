public class Acceso implements State {
    public State accendi() {
        System.out.println("Sono già acceso");
        return this;
    }

    public State spegni() {
        System.out.println("Spegnimento in corso...");
        return new Spento();
    }
}
