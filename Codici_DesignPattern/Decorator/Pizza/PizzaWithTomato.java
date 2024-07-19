public class PizzaWithTomato extends PizzaDecorator {
    public PizzaWithTomato(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("con pomodoro");
    }
}