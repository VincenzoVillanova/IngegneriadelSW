import java.util.*;

public class Subject {
    List<Observer> lista;

    public Subject() {
        lista = new ArrayList<>();
    }

    public void attach(Observer l) {
        lista.add(l);
    }

    public void detach(Observer l) {
        lista.remove(l);
    }

    public void notify(double quota) {
        for (Observer l : lista) {
            l.update(quota);
        }
    }
}
