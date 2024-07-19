// Concrete class: Documento Word
public class DocumentoWord extends Documento {
    @Override
    protected void apri() {
        System.out.println("Apro il documento Word.");
    }

    @Override
    protected void scriviContenuti() {
        System.out.println("Scrivo contenuti nel documento Word.");
    }

    @Override
    protected void salva() {
        System.out.println("Salvo il documento Word.");
    }

    @Override
    protected void chiudi() {
        System.out.println("Chiudo il documento Word.");
    }
}