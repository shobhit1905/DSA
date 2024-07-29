package LINKED_LIST;

import java.util.ArrayList;

public class OddEvenLL {

    public static Node oddEven1(Node head){
        if(head == null || head.next == null)
        return head ;

        ArrayList<Integer> list = new ArrayList<>() ;

        Node current = head ;

        // odd index element
        while(current != null && current.next != null){
            list.add(current.data) ;
            current = current.next.next ;
        }
        if(current != null)
        list.add(current.data) ;

        // even index elements
        current = head.next ;

        while(current != null && current.next != null){
            list.add(current.data) ;
            current = current.next.next ;
        }

        if(current != null)
        list.add(current.data) ;

        current = head ;

        for(Integer x : list){
            current.data = x ;
            current = current.next ;
        }

        return head ;
    }

    public static Node oddEven2(Node head){
        if(head == null || head.next == null)
        return head ;

        Node odd = head , even = head.next , evenHead = head.next ;

        while(even != null && even.next != null){
            odd.next = odd.next.next ;
            odd = odd.next ;

            even.next = even.next.next ;
            even = even.next ;
        }

        odd.next = evenHead ;
        return head ;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6} ;
        int[] b = {1,3,4,2,5,6} ;

        Node head1 = CreateSLL.createLL(a) ;
        Node head2 = CreateSLL.createLL(b) ;

        System.out.print("LL1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("LL2 : ");
        SLLTraversal.traversal(head2);

        head1 = oddEven2(head1) ;
        head2 = oddEven2(head2) ;

        System.out.print("New LL1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("New LL2 : ");
        SLLTraversal.traversal(head2);
    }
}
