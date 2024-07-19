public class Context {
    private State obj;

    public Context() {
        this.obj = new Spento();
    }

    public void accendi() {
        this.obj = obj.accendi();
    }

    public void spegni() {
        this.obj = obj.spegni();
    }
}
