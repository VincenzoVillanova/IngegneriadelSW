// Client
public class Client {
    public static void main(String[] args) {
        Documento documentoWord = new DocumentoWord();
        documentoWord.creaDocumento();
        System.out.println();

        Documento documentoPDF = new DocumentoPDF();
        documentoPDF.creaDocumento();
    }
}