import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    private Linkable head;
    private Linkable tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtHead(Linkable linkable) {
        if (head == null) {
            head = linkable;
            tail = linkable;
            return;
        }
        linkable.setNext(head);
        head = linkable;
    }

    public void insertAtTail(Linkable item) {
        if (head == null) {
            head = item;
            tail = item;
            return;
        }
        tail.setNext(item);
        tail = item;
    }

    public Linkable removeFromHead() {
        if (head == null) return null;
        Linkable h = head;
        head = head.getNext();
        return h;
    }

}
