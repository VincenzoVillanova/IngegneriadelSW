public class Main {
    public static void main(String[] args) {
        Singleton classe = Singleton.getInstance();
        System.out.println(classe.getStringa());
        Singleton classe2 = Singleton.getInstance();
        classe.setStringa("V V");
        System.out.println(classe.getStringa());
        System.out.println(classe2.getStringa());
    }
}
