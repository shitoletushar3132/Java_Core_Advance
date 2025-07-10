package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(23);
        queue.add(25);
        queue.offer(32);
        queue.remove();
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue.element());

        queue.offer(232);
        queue.offer(3453);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
