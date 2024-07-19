public class Main {
    public static void main(String[] args) {
        Materia ing = new Materia("Ingegneria del SW", "01/07/2024");
        Context obj = new Context(ing);

        obj.registra();
        obj.prenota();

        obj.setState(new Prenotato());

        obj.registra();
        obj.prenota();

    }
}
