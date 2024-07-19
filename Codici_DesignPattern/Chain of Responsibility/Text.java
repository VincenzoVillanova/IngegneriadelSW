public class Text implements Handler {
    private Handler next;

    public Text(Handler h) {
        next = h;
    }

    @Override
    public void handleRequest() {
        if (next != null)
            next.handleRequest();
        else
            System.out.println("Text: assistenza");
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