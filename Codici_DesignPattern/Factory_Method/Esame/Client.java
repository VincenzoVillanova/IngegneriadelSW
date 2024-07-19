
public class Client {
    public static void main(String[] args) {
        Deposito objDeposito = new Deposito();
        Busta obj = objDeposito.getMini();

        System.out.println(obj.getTipo());
        System.out.println(obj.getPeso());
    }
}
