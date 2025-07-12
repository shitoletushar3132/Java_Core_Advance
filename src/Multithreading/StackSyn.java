package Multithreading;

public class StackSyn {
    private int[] array;
    private int stackTop;
    // only a one thread should get a that lock
    // if one thread should hold that lock then
    // not another hold that after releasing that will
    // hold by another
    // so who will hold that lock should be able to do any task following
    Object lock;


    public StackSyn(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public int peekTop() {
        if (isEmpty()) return Integer.MAX_VALUE;
        return array[stackTop];
    }


    public boolean push(int element) {
        synchronized (lock) {
            if (isFull()) return false;
            ++stackTop;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            ;
            array[stackTop] = element;
            return true;
        }
    }

    public int pop() {
        synchronized (lock) {
            if (isEmpty()) return Integer.MAX_VALUE;
            int obj = array[stackTop];
            array[stackTop] = Integer.MAX_VALUE;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            stackTop--;
            return obj;
        }
    }

    public boolean isFull() {
        return stackTop == array.length - 1;
    }

}
