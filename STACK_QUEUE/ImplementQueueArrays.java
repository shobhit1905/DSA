package STACK_QUEUE;


class ImplQueue{
    private int f = -1 ;
    private int r = -1 ;
    private int[] q ;
    private int capacity ;

    ImplQueue(int capacity){
        this.capacity = capacity ;
        q = new int[capacity] ;
    }

    void push(int x){
        if(r == capacity-1)
        {
            System.out.println("Queue overflow");
            return ;
        }

        if(r == -1 && f == -1){
            f ++ ;
        }

        r = (r+1)%capacity ;
        q[r] = x ;
    }

    void pop(){
        if(r == -1){
            System.out.println("Queue Underflow");
            return ;
        }

        f = (f+1)%capacity ;
    }

    int top(){
        if(r == -1)
        return -1 ;

        return q[f] ;
    }

    void print(){
        for(int i = f ; i <= r ; i ++){
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}
public class ImplementQueueArrays {
    public static void main(String[] args) {
        
        ImplQueue queue = new ImplQueue(6) ;
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.push(60);

        queue.print();
        System.out.println(queue.top()) ;
        
        queue.pop(); 
        queue.pop();
        System.out.println(queue.top()) ;
        queue.print();

    }
}
