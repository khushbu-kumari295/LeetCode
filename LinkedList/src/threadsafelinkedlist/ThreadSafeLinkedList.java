package threadsafelinkedlist;

public interface ThreadSafeLinkedList {

    void addAtPosition(int index, int element);

    void removeAtPosition(int index, int element);

    int getFirst();

    int getLast();

    int size();
}
