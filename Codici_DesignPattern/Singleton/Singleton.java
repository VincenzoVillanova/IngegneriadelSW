class Singleton {
    private String nome = "Vincenzo Villanova";
    private static Singleton istanza;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (istanza == null) {
            istanza = new Singleton();
        }
        return istanza;
    };

    public String getStringa() {
        return nome;
    }

    public void setStringa(String nome) {
        this.nome = nome;
    }

}