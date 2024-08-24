package STACK_QUEUE;

class ImplStack{
    private int top = -1 ;
    private int[] st ;
    private int capacity ;

    ImplStack(int capacity){
        this.capacity = capacity ;
        st = new int[capacity] ;
    }

    void push(int x){
        if(top == capacity-1){
            System.out.println("Stack Overflow");
            return ;
        }

        top++ ;
        st[top] = x ;
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return ;
        }

        top-- ;
    }

    int size(){
        return top+1 ;
    }

    boolean empty(){
        if(top == -1)
            return true ;
        return false ;
    }

    void print(){
        for(int i=0 ; i<=top ; i++)
        System.out.print(st[i] + " ");
        System.out.println();
    }

    int top(){
        return st[top] ;
    }
}
public class ImplementStackArrays {
    public static void main(String[] args) {
        ImplStack st = new ImplStack(10) ;

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        st.print();
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());

    }
}
