package threadsafelinkedlist;

public class LinkListOperations extends Thread {

    private final LinkedList list;
    private final int threadNum;

    public LinkListOperations(LinkedList list, int threadNum) {
        this.list = list;
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        list.addAtPosition(0, 5);
        list.addAtPosition(0, 6);
        list.addAtPosition(0, 7);
        list.addAtPosition(1, 10);
        int firstData = list.getFirst();
        System.out.printf("Thread Num %s , first value of data: %s%n", threadNum, firstData);
        int lastData = list.getLast();
        System.out.printf("Thread Num %s , last value of data: %s%n", threadNum, lastData);
        list.removeAtPosition(0, 3);
        System.out.printf("Thread Num %s , list %s%n", threadNum, list);

        int size = list.size();
        System.out.printf("Thread Num %s , size of list: %s%n", threadNum, size);
    }
}
