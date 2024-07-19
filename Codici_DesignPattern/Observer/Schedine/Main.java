public class Main {
    public static void main(String[] args) {

        System.out.println("Prima prova");

        ConcreateSubject sala = new ConcreateSubject();

        sala.attach(new ConcreateObserber());
        sala.setQuota(1.58);
        sala.attach(new ConcreateObserber());
        sala.attach(new ConcreateObserber());
        sala.setQuota(1.56);

    }
}
