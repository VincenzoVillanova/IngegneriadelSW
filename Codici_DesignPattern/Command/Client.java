// Client
public class Client {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();

        Command aggiungiNota = new Updater(calendario, "aggiungi");
        Command rimuoviNota = new Updater(calendario, "rimuovi");
        Command stampaNote = new Updater(calendario, "stampa");

        Menu menu = new Menu();

        // Aggiungere una nota
        menu.setCommand(aggiungiNota);
        menu.executeCommand();

        // Rimuovere una nota
        menu.setCommand(rimuoviNota);
        menu.executeCommand();

        // Stampare le note
        menu.setCommand(stampaNote);
        menu.executeCommand();
    }
}