// Classe concreta che implementa l'interfaccia Prototype
class ConcretePrototypeA implements Prototype {
    private String attribute;

    public ConcretePrototypeA(String attribute) {
        this.attribute = attribute;
    }

    // Implementazione del metodo clone
    @Override
    public Prototype clone() {
        return new ConcretePrototypeA(this.attribute);
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "attribute='" + attribute + '\'' +
                '}';
    }
}
