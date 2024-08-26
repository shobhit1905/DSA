package STACK_QUEUE;
import java.util.Stack ;

class MyQueue<T>{
    private Stack<T> s1 ;
    private Stack<T> s2 ;
    private int size = 0 ;

    public MyQueue(){
        s1 = new Stack<T>() ;
        s2 = new Stack<T>() ;
    }

    public void push(T x){
        s1.push(x) ;
        size ++ ;
    }

    public T pop(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                T x = s1.peek() ;
                s2.push(x) ;
                s1.pop() ;
            }
        }

        T ans = s2.peek() ;
        s2.pop();
        size -- ;
        return ans ;
    }

    public T top(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.peek()) ;
                s1.pop() ;
            }
        }

        return s2.peek() ;
    }

    public int size(){
        return size ;
    }

    public void display(){
        if(s1.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.peek()) ;
                s1.pop() ;
            }
        }

        System.out.println(s2);
    }
}

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>() ;

        queue.push("Shobhit");
        queue.push("99");
        queue.push("World");
        queue.push("10982.3");
        queue.push("Hello");

        System.out.println(queue.top());
        queue.display();
    }
}
