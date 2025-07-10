package Collections;

import java.util.ArrayDeque;

public class DequeueDemo {

    public static void main(String[] args) {
        ArrayDeque <Integer> dq = new ArrayDeque<>();
        dq.offer(43); //add at last
        dq.offerFirst(234); //add at firest
        dq.offerLast(32);

        System.out.println(dq);

        System.out.println(dq.poll()); // element should be pop from first
        System.out.println(dq.pollLast());//elemend should be poll form last

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
    }
}
