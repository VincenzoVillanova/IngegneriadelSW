public class Context {
    private Messaggio mess;

    public void setMess(Messaggio obj) {
        this.mess = obj;
    }

    public void esegui() {
        System.out.println(this.mess.getTesto());
    }
}
