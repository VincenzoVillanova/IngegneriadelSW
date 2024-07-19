import java.util.*;

public class Context {
    private Materia materia;

    public Context(Materia mat) {
        materia = mat;
    }

    public void setState(Esame attuale) {
        materia.setState(attuale);
    }

    public void prenota() {
        materia.getState().Prenota();
    }

    public void registra() {
        materia.getState().registra();
    }
}
