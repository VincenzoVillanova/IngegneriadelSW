public interface Handler {
    public void handleRequest();

    public void activate();

    public void setNext(Handler next);
}