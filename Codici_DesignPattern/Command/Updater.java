// Concrete Command
public class Updater implements Command {
    private Calendario calendario;
    private String azione;

    public Updater(Calendario calendario, String azione) {
        this.calendario = calendario;
        this.azione = azione;
    }

    @Override
    public void execute() {
        switch (azione) {
            case "aggiungi":
                calendario.aggiungi();
                break;
            case "rimuovi":
                calendario.rimuovi();
                break;
            case "stampa":
                calendario.stampa();
                break;
        }
    }

    @Override
    public void unexecute() {
        switch (azione) {
            case "aggiungi":
                calendario.rimuovi();
                break;
            case "rimuovi":
                calendario.aggiungi();
                break;
            // Unexecute per stampa potrebbe non essere necessario
        }
    }
}