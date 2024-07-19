public abstract class PizzaDecorator extends Pizza {
    protected IPizza pizza;

    public PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void eat() {
        pizza.eat();
    }
}