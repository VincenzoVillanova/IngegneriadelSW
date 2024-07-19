public class Auto_Decorator implements IAuto {
    private IAuto obj;

    public Auto_Decorator(IAuto obj) {
        this.obj = obj;
    }

    public void operation() {
        obj.operation();
    }
}
