public class Client {
    public static void main(String[] args) {
        Target temp1 = new Adapter(15);
        System.out.println(temp1.getTempCelsius() + "°C");
        System.out.println(temp1.getTempKelvin() + "K");
    }
}
