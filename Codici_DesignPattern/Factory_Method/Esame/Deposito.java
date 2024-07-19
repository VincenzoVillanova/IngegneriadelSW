public class Deposito {
    public Busta getBusta() {
        return new Grande();
    }

    public Busta getMini() {
        return new Mini();
    }
}