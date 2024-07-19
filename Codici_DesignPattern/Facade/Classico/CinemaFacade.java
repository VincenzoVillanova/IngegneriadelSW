package Classico;

public class CinemaFacade {
    private PrenotazioneBiglietti prenotazioneBiglietti;
    private GestioneSnack gestioneSnack;
    private SistemaNotifiche sistemaNotifiche;

    public CinemaFacade() {
        this.prenotazioneBiglietti = new PrenotazioneBiglietti();
        this.gestioneSnack = new GestioneSnack();
        this.sistemaNotifiche = new SistemaNotifiche();
    }

    public void prenotaBiglietto(String film, String posto) {
        prenotazioneBiglietti.selezionaFilm(film);
        prenotazioneBiglietti.scegliPosto(posto);
        prenotazioneBiglietti.paga();
        sistemaNotifiche.inviaEmail("Prenotazione confermata per il film " + film + " nel posto " + posto);
    }

    public void acquistaSnack(String snack) {
        gestioneSnack.acquistaSnack(snack);
    }

    public void inviaNotifica(String tipo, String messaggio) {
        if ("email".equalsIgnoreCase(tipo)) {
            sistemaNotifiche.inviaEmail(messaggio);
        } else if ("sms".equalsIgnoreCase(tipo)) {
            sistemaNotifiche.inviaSMS(messaggio);
        } else {
            System.out.println("Tipo di notifica non supportato.");
        }
    }
}
