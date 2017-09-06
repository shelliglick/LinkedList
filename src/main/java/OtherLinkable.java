public class OtherLinkable implements Linkable<String> {

    private String data;
    private Linkable next;

    public OtherLinkable(String d) {
        this.data = d;
    }

    public String getData() {
        return data;
    }

    public void setData(String d) {
        this.data = data;
    }

    public Linkable getNext() {
        return this.next;
    }

    public void setNext(Linkable next) {
        this.next = next;
    }
}
