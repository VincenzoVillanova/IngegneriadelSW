public class Donna implements Persona {
    private String nominativo;

    public Donna(String nom) {
        this.nominativo = nom;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nome) {
        this.nominativo = nome;
    }
}