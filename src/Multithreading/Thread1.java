package Multithreading;

public class Thread1 implements Runnable {

    @Override
    public void run() {
        infi();
    }

    void infi() {
        int i=0;
        while (i<10) {
            System.out.println(Thread.currentThread()+""+i);
            i++;
        }
    }
}
