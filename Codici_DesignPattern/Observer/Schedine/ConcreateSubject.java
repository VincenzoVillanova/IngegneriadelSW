public class ConcreateSubject extends Subject {
    double quota;

    public void setQuota(double quota) {
        this.quota = quota;
        super.notify(quota);
    }

    public double getQuota() {
        return quota;
    }
}
