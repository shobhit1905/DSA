package STACK_QUEUE;

class StackLL{
    private Node top = null ;
    private int size = 0 ;
    private Node head = null ;

    void push(int x){
            Node temp = new Node(x) ;
            temp.next = top ;
            top = temp ;
            size ++ ;
            head = top ;
    }

    void pop(){
        if(top == null)
        {
            System.out.print("Stack Underflow");
            return ;
        }

        Node temp = top ;
        top = top.next ;
        head = top ;
        temp.next = null ;
        size-- ;
    }

    int size(){
        System.out.println();
        return size ;
    }

    boolean isEmpty(){
        if(top == null)
        return true ;
        return false ;
    }

    void display(){
        System.out.println();
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next ;
        }
        System.out.println();
    }

    int top(){
        if(top == null){
            System.out.print("Stack empty");
            return -1;
        }
        System.out.println();
        return top.data ;
    }
}
public class ImplementStackLL {
    public static void main(String[] args) {
        StackLL st = new StackLL() ;

        st.push(10) ;
        st.push(30) ;
        st.push(50) ;
        st.push(60) ;
        st.push(40) ;
        st.push(20) ;

        st.display();
        System.out.println();
        System.out.print(st.top());
        st.pop() ;
        st.pop() ;
        st.pop() ;
        st.display();
        System.out.print(st.top());
        System.out.println(st.size());
    }
}
