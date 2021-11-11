package threadsafelinkedlist;

public class LinkNode {
    private int data;
    private LinkNode next;

    public LinkNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

    public String toString() {
        if (next == null) {
            return data + " -> null";
        }
        return data + " -> " + next;
    }

    public int size() {
        if (next == null) {
            return 1;
        }
        return 1 + next.size();
    }
}
