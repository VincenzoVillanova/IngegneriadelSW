public class Sospensioni extends Auto_Decorator {

    public Sospensioni(IAuto obj) {
        super(obj);
    }

    public void operation() {
        super.operation();
        System.out.println("Ho delle sospensioni maggiorate!!");
    }
}
