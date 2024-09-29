import java.util.LinkedList;

public class MyCircularDeque {
    private int maxSize;
    private int currentSize;
    private LinkedList<Integer> deque;
    public MyCircularDeque(int k) {
        maxSize = k;
        deque = new LinkedList<>();
    }

    public boolean insertFront(int value) {
        if (currentSize == maxSize) {
            return false;
        }
        if (currentSize == 0){
            deque.add(value);
            currentSize++;
            return true;
        }
        deque.addFirst(value);
        currentSize++;
        return true;
    }

    public boolean insertLast(int value) {
        if (currentSize == maxSize) {
            return false;
        }
        if (currentSize == 0){
            deque.add(value);
            currentSize++;
            return true;
        }
        deque.addLast(value);
        currentSize++;
        return true;
    }

    public boolean deleteFront() {
        if (currentSize == 0) {
            return false;
        }
        deque.removeFirst();
        currentSize--;
        return true;
    }

    public boolean deleteLast() {
        if (currentSize == 0) {
            return false;
        }
        deque.removeLast();
        currentSize--;
        return true;
    }

    public int getFront() {
        if (currentSize == 0) {
            return -1;
        }
        return deque.getFirst();
    }

    public int getRear() {
        if (currentSize == 0) {
            return -1;
        }
        return deque.getLast();
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }
}
