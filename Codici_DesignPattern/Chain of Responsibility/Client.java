public class Client {
    public static void main(String[] args) {
        Text t = new Text(null);
        Button b = new Button(t);
        t.activate();
        b.handleRequest();
        b.activate();
        t.handleRequest();
    }
}