package STACK_QUEUE;

class QueueLL{
    private int size = 0 ;
    private Node start = null , end = null ;

    void push(int x){
        Node t = new Node(x) ;

        if(start == null && end == null){
            start = t ;
            end = t ;
            return ;
        }

        end.next = t ;
        end = t ;
        size ++ ;
    }

    void pop(){
        if(start == null){
            System.out.print("Queue Underflow");
            return ;
        }

        Node temp = start ;
        start = start.next ;
        temp.next = null ;

        if(start == null){
            end = null ;
        }
        size -- ;
    }

    void display(){
        Node temp = start ;
        if(temp == null){
            System.out.println("Queue is empty");
            return ;
        }
        while(temp != end.next){
            System.out.print(temp.data + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    int size(){
        return size ;
    }

    boolean isEmpty(){
        if(start == null)
        return true ;
        return false ;
    }

}
public class ImplementQueueLL {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL() ;

        queue.display();
        queue.push(3) ;
        queue.push(13) ;
        queue.push(8) ;
        queue.push(27) ;
        queue.push(5) ;
        queue.push(29) ;
        queue.display();
        System.out.println(queue.size());

        queue.pop();
        queue.pop();
        queue.pop();

        queue.display();

        Long x = Long.MAX_VALUE ;
        System.out.println(x);

        long a = 10 ;
        int b = 10 ;
        System.out.println(a == b);
    }
}
