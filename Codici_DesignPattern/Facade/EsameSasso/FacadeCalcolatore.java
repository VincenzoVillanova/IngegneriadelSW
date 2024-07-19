import java.util.ArrayList;
import java.util.List;

public class FacadeCalcolatore {
    private CPU cpu;
    private List<Memoria> mem = new ArrayList<>();
    private SchedaGrafica sg;

    public FacadeCalcolatore(int capienzaMemoria, int velocitàMemoria, int costoMemoria, String tipoMemoria,
            String risoluzioneSchedaGrafica, int costoSchedaGrafica, float frequenzaCpu, int numeroCoreCpu,
            String idCpu, int costoCpu) {
        addMemoria(capienzaMemoria, velocitàMemoria, costoMemoria, tipoMemoria);
        sg = new SchedaGrafica(risoluzioneSchedaGrafica, costoSchedaGrafica);
        cpu = new CPU(frequenzaCpu, numeroCoreCpu, idCpu, costoCpu);
    }

    public int getcostoTot() {
        int cont = 0;
        for (Memoria memoria : mem) {
            cont += memoria.costo();
        }

        cont += sg.costo();
        cont += cpu.costo();

        return cont;
    }

    public void addMemoria(int capienzaMemoria, int velocitàMemoria, int costoMemoria, String tipoMemoria) {
        mem.add(new Memoria(capienzaMemoria, velocitàMemoria, costoMemoria, tipoMemoria));
    }
}
