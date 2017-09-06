public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 5; i++) {
            list.insertAtHead(new LinkableItem(i));
        }
        for (int i = 0; i < 5; i++) {
            list.insertAtTail(new OtherLinkable("other " + i));
        }
        for (int i = 0; i < 10; i++) {
            Linkable current = list.removeFromHead();
            System.out.println(current.getData());
        }

    }
}
