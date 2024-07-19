public class Turbina extends Auto_Decorator {

    public Turbina(IAuto obj) {
        super(obj);
    }

    public void operation() {
        super.operation();
        System.out.println("Ho una turbina!!");
    }
}
