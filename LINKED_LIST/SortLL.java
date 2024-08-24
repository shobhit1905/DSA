package LINKED_LIST;

import java.util.Iterator;
import java.util.TreeSet;
public class SortLL {

    public static Node sortLL(Node head){
        if(head == null || head.next == null)
        return head ;

        TreeSet<Integer> set = new TreeSet<>() ;

        Node current = head ;

        while(current != null){
            set.add(current.data) ;
            current = current.next ;
        }

        current = head ;
        // for(Integer x : set){
        //     current.data = x ;
        //     current = current.next ;
        // }

        Iterator<Integer> iterator = set.iterator() ;
        while(iterator.hasNext() == true && current != null){
            current.data = iterator.next() ;
            current = current.next ;
        }
        return head ;
    }
    public static void main(String[] args) {
        int[] a = {} ;
        int[] b = {10} ;
        int[] c = {23,43,10,6,9,25,67,8,1,17} ;

        Node head1 = CreateSLL.createLL(a) ;
        Node head2 = CreateSLL.createLL(b) ;
        Node head3 = CreateSLL.createLL(c) ;


        System.out.print("LL 1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("LL 2 : ");
        SLLTraversal.traversal(head2);
        System.out.print("LL 3 : ");
        SLLTraversal.traversal(head3);

        head1 = sortLL(head1) ;
        head2 = sortLL(head2) ;
        head3 = sortLL(head3) ;

        System.out.print("LL 1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("LL 2 : ");
        SLLTraversal.traversal(head2);
        System.out.print("LL 3 : ");
        SLLTraversal.traversal(head3);

    }
}
