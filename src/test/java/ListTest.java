import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest {
    @Test
    public void insertAtHead() throws Exception {
        LinkedList list = new LinkedList();
        list.insertAtHead(new LinkableItem(2));
        list.insertAtHead(new LinkableItem(3));
        list.insertAtHead(new OtherLinkable("1"));
        Assert.assertEquals(list.removeFromHead().getData(), "1");
        Assert.assertEquals(list.removeFromHead().getData(), 3);
        Assert.assertEquals(list.removeFromHead().getData(), 2);
        Assert.assertNull(list.removeFromHead());
    }

    @Test
    public void insertAtTail() throws Exception {
        LinkedList list = new LinkedList();
        list.insertAtTail(new LinkableItem(1));
        list.insertAtTail(new LinkableItem(2));
        list.insertAtTail(new OtherLinkable("3"));
        Assert.assertEquals(list.removeFromHead().getData(), 1);
        Assert.assertEquals(list.removeFromHead().getData(), 2);
        Assert.assertEquals(list.removeFromHead().getData(), "3");
        Assert.assertNull(list.removeFromHead());
    }

    @Test
    public void removeFromHead() throws Exception {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 6; i++) {
            list.insertAtTail(new LinkableItem(1));
            list.insertAtTail(new OtherLinkable("2"));
        }
        for (int i = 0; i < 6; i++) {
            Assert.assertEquals(list.removeFromHead().getData(), 1);
            Assert.assertEquals(list.removeFromHead().getData(), "2");
        }
        Assert.assertNull(list.removeFromHead());
    }

    @Test
    public void removeFromHeadEmptyList() {
        LinkedList list = new LinkedList();
        Assert.assertNull(list.removeFromHead());
    }

}