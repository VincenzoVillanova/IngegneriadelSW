public class PizzaWithMozzarella extends PizzaDecorator {
    public PizzaWithMozzarella(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("con mozzarella");
    }
}