public class Button implements Handler {
    private Handler next;

    public Button(Handler h) {
        next = h;
    }

    @Override
    public void handleRequest() {
        if (next != null)
            next.handleRequest();
        else
            System.out.println("Button: assistenza");
    }

    @Override
    public void activate() {
        System.out.println("sono un frammento di testo");
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
}