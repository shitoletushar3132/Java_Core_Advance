package Multithreading;

public class Thread2 extends Thread{

    public Thread2(String name){
        super(name);
    }

    void infi(){
        int i =0;
        while (i<10){
            System.out.println("Inside"+ Thread.currentThread()+i);
            i++;
        }
    }

    @Override
    public void run(){
        infi();
    }

}
