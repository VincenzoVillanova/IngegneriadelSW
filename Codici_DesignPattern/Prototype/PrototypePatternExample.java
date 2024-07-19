public class PrototypePatternExample {
    public static void main(String[] args) {
        // Creazione dei prototipi originali
        Prototype prototypeA = new ConcretePrototypeA("Original A");
        Prototype prototypeB = new ConcretePrototypeB(42);

        // Clonazione dei prototipi
        Prototype clonedPrototypeA = prototypeA.clone();
        Prototype clonedPrototypeB = prototypeB.clone();

        // Modifica dei cloni
        if (clonedPrototypeA instanceof ConcretePrototypeA) {
            ((ConcretePrototypeA) clonedPrototypeA).setAttribute("Cloned A");
        }

        if (clonedPrototypeB instanceof ConcretePrototypeB) {
            ((ConcretePrototypeB) clonedPrototypeB).setNumber(100);
        }

        // Output
        System.out.println("Original Prototype A: " + prototypeA);
        System.out.println("Cloned Prototype A: " + clonedPrototypeA);
        System.out.println("Original Prototype B: " + prototypeB);
        System.out.println("Cloned Prototype B: " + clonedPrototypeB);
    }
}