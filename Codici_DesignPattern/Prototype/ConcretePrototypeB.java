// Classe concreta che implementa l'interfaccia Prototype
class ConcretePrototypeB implements Prototype {
    private int number;

    public ConcretePrototypeB(int number) {
        this.number = number;
    }

    // Implementazione del metodo clone
    @Override
    public Prototype clone() {
        return new ConcretePrototypeB(this.number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB{" +
                "number=" + number +
                '}';
    }
}