package Classico;

public class SistemaNotifiche {
    public void inviaEmail(String messaggio) {
        System.out.println("Email inviata: " + messaggio);
    }

    public void inviaSMS(String messaggio) {
        System.out.println("SMS inviato: " + messaggio);
    }
}