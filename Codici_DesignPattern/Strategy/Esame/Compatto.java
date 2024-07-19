public class Compatto implements Messaggio {
    private String testo;

    public Compatto(String t) {
        testo = t.substring(0, 5);
    }

    public String getTesto() {
        return testo;
    }
}