public class Client {
    public static void main(String[] args) {
        Persona utente = StCreator.getPersona();
        utente.setNominativo("Turi ");
        System.out.println("E' arrivato : " + utente.getNominativo());

        StCreator.setA(false);
        Persona utente2 = StCreator.getPersona();
        utente2.setNominativo("Cammela");
        if (StCreator.getA() == false) {
            System.out.println("E' arrivata : " + utente2.getNominativo());
        } else {
            System.out.println("E' arrivato : " + utente2.getNominativo());
        }

    }
}