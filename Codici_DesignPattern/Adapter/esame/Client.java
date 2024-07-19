public class Client {
    public static void main(String[] args) {
        Disk disk = new Adapter();

        System.out.println("Spazio Libero: " + disk.getSpazioLibero());
        System.out.println("Velocita: " + disk.getVelocita());
        System.out.println("Spazio Totale: " + disk.getSpazioTotale());
    }
}