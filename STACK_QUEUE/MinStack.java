package STACK_QUEUE;

import java.util.ArrayDeque;

class MyMinStack{
    ArrayDeque<Integer> ms ;
    ArrayDeque<Integer> as ;

    MyMinStack(){
        ms = new ArrayDeque<>() ;
        as = new ArrayDeque<>() ;
    }

    void push(int x){
        if(ms.isEmpty()){
            ms.push(x) ;
            as.push(x);
        }
        else{
            ms.push(x) ;
            if(ms.peek() < as.peek())
            as.push(x) ;
        }
    }

    int pop(){
        if(ms.isEmpty())
        return -1 ;

        if(ms.peek() == as.peek())
        as.pop() ;

        return ms.pop() ;
    }

    int size(){
        return ms.size() ;
    }

    int getMin(){
        if(ms.isEmpty())
        return -1 ;

        return as.peek() ;
    }
}
public class MinStack {
    public static void main(String[] args) {
        MyMinStack stack =  new MyMinStack() ;

        stack.push(13);
        stack.push(15) ;
        stack.push(12) ;
        stack.push(14) ;
        stack.push(16) ;
        stack.push(8) ;
        stack.push(6) ;
        stack.push(4) ;
        stack.push(10) ;

        System.out.println(stack.getMin());
        stack.pop() ;
        stack.pop() ;
        System.out.println(stack.getMin());
    }
}
