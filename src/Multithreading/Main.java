package Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        Thread t = new Thread2("Thread");

//        t.setDaemon(true);
//        t.start();


        //always use the runnable interface
//        Thread t2 = new Thread(new Thread(()-> {
//            for(int i=0; i<10; i++) {
//                System.out.println("hello "+Thread.currentThread()+" "+i);
//            }
//        }),"runnable");
//
//        t2.start();

        StackSyn stack = new StackSyn(5);
        new Thread(()->{
            int counter = 0;
            while(++counter<10){
                System.out.println("Pushed: "+ stack.push(100+counter));
            }
        },"Pusher").start();

        new Thread(()->{
            int counter = 0;
            while(++counter<10){
                System.out.println("Popped: "+ stack.pop());
            }
        },"Popper").start();

        System.out.println("Main is exiting");
    }
}