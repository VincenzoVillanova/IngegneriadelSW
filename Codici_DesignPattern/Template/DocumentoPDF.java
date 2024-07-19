public class DocumentoPDF extends Documento {
    @Override
    protected void apri() {
        System.out.println("Apro il documento PDF.");
    }

    @Override
    protected void scriviContenuti() {
        System.out.println("Scrivo contenuti nel documento PDF.");
    }

    @Override
    protected void salva() {
        System.out.println("Salvo il documento PDF.");
    }

    @Override
    protected void chiudi() {
        System.out.println("Chiudo il documento PDF.");
    }
}