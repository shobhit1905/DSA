package STACK_QUEUE;
import java.util.LinkedList;
import java.util.Queue;

class MyStack<T>{
    private Queue<T> queue ;
    public MyStack(){
        queue = new LinkedList<T>() ;
    }

    public void push(T x){
        queue.add(x) ;

        for(int i=0 ; i<queue.size() - 1 ; i++){
            queue.add(queue.remove()) ;
        }
    }

    public T pop(){
        return queue.remove() ;
    }

    public int size(){
        return queue.size() ;
    }

    public boolean isEmpty(){
        return queue.isEmpty() ;
    }

    public T top(){
        return queue.peek() ;
    }

    public void display(){
        System.out.print("Stack Elements : ");
        for(T x : queue)
            System.out.print(x + " ");
        System.out.println();
    }
}
public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        
        MyStack<String> stack = new MyStack<>() ;

        stack.push("Shobhit");
        stack.push("Rachit");
        stack.push("Rakesh");
        stack.push("Shalini");

        System.out.println(stack.size());
        System.out.println(stack.top());

        stack.display();

        System.out.println(stack.pop());
        System.out.println(stack.top());

        stack.display();
        
    }
}
