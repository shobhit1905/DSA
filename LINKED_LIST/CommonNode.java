package LINKED_LIST;

import java.util.HashMap;
import java.util.Map;

public class CommonNode {

    public static Node commonNode(Node head1 , Node head2){
        if(head1 == null && head2 == null)
        return null ;

        if(head1 == null || head2 == null)
        return null ;

        Map<Node , Boolean> map = new HashMap<>() ;
        Node current = head1 ;

        while(current != null){
            map.put(current,false) ;
            current = current.next ;
        }

        current = head2 ;

        while(current != null){
            if(map.containsKey(current)){
                return current ;
            }
            map.put(current,false) ;
            current = current.next ;
        }

        // for(Map.Entry<Node,Boolean> e : map.entrySet()){
        //     if(e.getValue())
        //     return e.getKey() ;
        // }

        return null ;
    }

    public static int length(Node head){
        if(head == null)
        return 0 ;

        return 1 + length(head.next) ;
    }

    public static Node common(Node head1 , Node head2){
        if(head1 == null && head2 == null)
        return null ;

        if(head1 == null || head2 == null)
        return null ;

        Node t1 = head1 , t2 = head2 ;
        int n1 = length(head1) ;
        int n2 = length(head2) ;

        if(n1 > n2){
            int d = n1 - n2 ;
            while(d > 0){
                t1 = t1.next ;
                d-- ;
            }
        }
        else{
            int d = n2 - n1 ;
            while(d > 0){
                t2 = t2.next ;
                d -- ;
            }
        }

        while(t1 != null){
            if(t1 == t2)
            return t1 ;

            t1 = t1.next ;
            t2 = t2.next ;
        }

        return null ;
    }
    public static void main(String[] args) {
        int[] a = {10,20,30,40,4,5,6,7} ;
        int[] b = {2,3,4,5,6} ;

        Node head1 = CreateSLL.createLL(a) ;
        Node head2 = CreateSLL.createLL(b) ;

        Node tail = head2 ;
        Node node = head1 ;
        int i = 2 ;
        while(i > 0){
            node = node.next ;
            i-- ;
        }
        while(tail.next!=null){
            tail = tail.next ;
        }

        tail.next = node ;

        System.out.print("LL1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("LL2 : ");
        SLLTraversal.traversal(head2);
        System.out.println("Intersection Node = " + common(head1 , head2).data);
    }
}
