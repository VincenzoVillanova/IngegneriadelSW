public class Client {
    public static void main(String[] args) {
        Target obj = new Adapter(50);

        System.out.println("Io ho " + obj.getDollari() + " dollari!");
        System.out.println("Effettuando la conversione ho " + obj.getEuro() + " euro");
    }
}
