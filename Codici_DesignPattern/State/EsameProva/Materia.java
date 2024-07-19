public class Materia {
    private String nomeEsame, dataEsame;
    private Esame obj;

    public Materia(String nomeEsame, String dataEsame) {
        this.nomeEsame = nomeEsame;
        this.dataEsame = dataEsame;
        obj = new Nuovo();
    }

    public String nomeEsame() {
        return nomeEsame;
    }

    public String dataEsame() {
        return dataEsame;
    }

    public Esame getState() {
        return obj;
    }

    public void setState(Esame objNuovo) {
        this.obj = objNuovo;
    }
}