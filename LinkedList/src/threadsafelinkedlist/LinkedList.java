package threadsafelinkedlist;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * code to implement Thread safe LinkedList
 */
public class LinkedList implements ThreadSafeLinkedList {
    private LinkNode head;

    ReentrantReadWriteLock listLock = new ReentrantReadWriteLock(true);

    public LinkedList() {
        this.head = null;
    }

    public LinkNode getHead() {
        return head;
    }

    public void setHead(LinkNode head) {
        this.head = head;
    }

    @Override
    public void addAtPosition(int index, int element) {
        listLock.writeLock().lock();
        int position = 0;
        LinkNode temp = this.head;
        LinkNode prev = null;
        while (position < index && temp != null) {
            prev = temp;
            temp = temp.getNext();
            position++;
        }
        LinkNode elementToBeInserted = new LinkNode(element);
        elementToBeInserted.setNext(temp);
        if (prev != null) {
            prev.setNext(elementToBeInserted);
        } else {
            this.head = elementToBeInserted;
        }
        listLock.writeLock().unlock();
    }

    @Override
    public void removeAtPosition(int index, int element) {
        listLock.writeLock().lock();
        if (this.head == null) {
            return;
        }
        LinkNode temp = head;
        LinkNode prev = null;
        for (int i = index; i > 0 && temp != null; i--) {
            prev = temp;
            temp = temp.getNext();
        }
        if (prev == null) {
            this.head = this.head.getNext();
        } else {
            if (temp != null) {
                prev.setNext(temp.getNext());
            }
        }
        listLock.writeLock().unlock();
    }

    @Override
    public int getFirst() {
        listLock.readLock().lock();
        if (head == null) {
            return -1;
        }
        int data = this.head.getData();
        listLock.readLock().unlock();
        return data;
    }

    @Override
    public int getLast() {
        listLock.readLock().lock();
        if (head == null) {
            return -1;
        }
        LinkNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        int data = temp.getData();
        listLock.readLock().unlock();
        return data;
    }

    @Override
    public int size() {
        listLock.readLock().lock();
        int size = this.head.size();
        listLock.readLock().unlock();
        return size;
    }

    public String toString() {
        return this.head.toString();
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 2; i++) {
            LinkListOperations operations = new LinkListOperations(list, i);
            operations.start();
        }
    }
}
