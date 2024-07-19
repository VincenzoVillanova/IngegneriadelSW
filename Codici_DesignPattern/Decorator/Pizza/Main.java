public class Main {
    public static void main(String[] args) {
        // Crea una pizza base
        IPizza pizza = new PizzaC();

        // Decora ulteriormente la pizza con pomodoro
        pizza = new PizzaWithTomato(pizza);

        // Decora ulteriormente la pizza con pomodoro
        pizza = new PizzaWithMozzarella(pizza);

        // Mangia la pizza decorata
        pizza.eat();
    }
}