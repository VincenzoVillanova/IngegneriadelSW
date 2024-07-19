public class Context {
    private Ordinamento strategia;

    public void setStrategia(Ordinamento strategia) {
        this.strategia = strategia;
    }

    public void eseguiStrategia(int[] numeri) {
        strategia.ordina(numeri);
    }
}
