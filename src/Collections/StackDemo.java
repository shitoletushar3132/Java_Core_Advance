package Collections;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Tushar");
        stack.push("kunal");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack);


    }
}
