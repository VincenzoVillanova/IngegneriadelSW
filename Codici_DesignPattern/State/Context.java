public class Context {
    State obj;

    public Context() {
        this.obj = new Stop();
    }

    public void mettiPlay() {
        this.obj = obj.play();
    }

    public void mettiPausa() {
        this.obj = obj.stop();
    }

    public void faiSuonare() {
        this.obj.sound();
    }
}
