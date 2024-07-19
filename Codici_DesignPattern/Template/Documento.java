public abstract class Documento {
    // Template method
    public final void creaDocumento() {
        apri();
        scriviContenuti();
        salva();
        chiudi();
    }

    // Passaggi dell'algoritmo
    protected abstract void apri();

    protected abstract void scriviContenuti();

    protected abstract void salva();

    protected abstract void chiudi();
}