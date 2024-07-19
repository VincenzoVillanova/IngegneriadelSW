public class Main {
    public static void main(String[] args) {
        Context obj = new Context();
        Messaggio mess1 = new Compatto("Si troppu fotti");
        obj.setMess(mess1);
        obj.esegui();
        obj.setMess(new Esteso("Si troppu fotti"));
        obj.esegui();

    }
}
