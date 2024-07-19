public class Adapter implements Disk {
    Memoria m;

    public Adapter() {
        m = new Memoria();
    }

    @Override
    public int getSpazioLibero() {
        return m.getDisponibile();
    }

    @Override
    public int getVelocita() {
        // Supponiamo che la velocità del disco sia la media delle velocità di scrittura
        // e lettura della memoria
        return (m.getVelocitaScrittura() + m.getVelocitaLettura()) / 2;
    }

    @Override
    public int getSpazioTotale() {
        // Supponiamo che lo spazio totale sia una costante o un valore fisso, qui lo
        // fissiamo a 200
        return 200;
    }
}
