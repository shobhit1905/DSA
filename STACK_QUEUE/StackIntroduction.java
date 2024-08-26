package STACK_QUEUE ;
import java.util.ArrayDeque;

public class StackIntroduction {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>() ;

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
