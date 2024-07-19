public class Uomo implements Persona {
    private String nominativo;

    public Uomo(String nom) {
        this.nominativo = nom;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nome) {
        this.nominativo = nome;
    }
}