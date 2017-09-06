public class LinkableItem implements  Linkable<Integer>{
    private int data;
    private Linkable next;

    public LinkableItem(int data) {
        this.data = data;
        this.next = null;
    }

    public LinkableItem(int data, Linkable next) {
        this.data = data;
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Linkable getNext() {
        return next;
    }

    public void setNext(Linkable next) {
        this.next = next;
    }
}
