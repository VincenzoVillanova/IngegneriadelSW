package Classico;

public class Main {
    public static void main(String[] args) {
        CinemaFacade cinemaFacade = new CinemaFacade();

        // Prenotare un biglietto
        cinemaFacade.prenotaBiglietto("Interstellar", "A1");

        // Acquistare uno snack
        cinemaFacade.acquistaSnack("Popcorn");

        // Inviare una notifica
        cinemaFacade.inviaNotifica("email", "Grazie per aver prenotato con noi!");
    }
}