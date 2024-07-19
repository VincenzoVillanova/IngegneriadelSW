public class Client {
    public static void main(String[] args) {
        FacadeCalcolatore obj;

        obj = new FacadeCalcolatore(512, 3, 50, "SSD", "1080", 250, 3, 8, "m1", 300);

        int costotot = obj.getcostoTot();

        System.out.println("STU COSU COSTA : " + costotot);

        obj.addMemoria(512, 3, 50, "SSD");

        costotot = obj.getcostoTot();

        System.out.println("STU COSU COSTA : " + costotot);
    }
}
