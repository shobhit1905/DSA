package LINKED_LIST;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLL {

    public static Node mergeLL1(Node head1 , Node head2){
        if(head1 == null && head2 == null)
        return null ;

        if(head1 == null)
        return head2 ;

        if(head2 == null)
        return head1 ;

        ArrayList<Integer> list = new ArrayList<>() ;

        Node first = head1 , second = head2 ;

        while(first != null){
            list.add(first.data) ;
            first = first.next ;
        }

        while(second != null){
            list.add(second.data) ;
            second = second.next ;
        }

        Collections.sort(list) ;

        Node ansHead = new Node(list.get(0)) ;
        Node current = ansHead ;
        for(int i=1 ; i<list.size() ; i++){
            Node temp = new Node(list.get(i)) ;
            current.next = temp ;
            current = temp ;
        }

        return ansHead ;
    }

    public static Node mergeLL2(Node head1 , Node head2){
        if(head1 == null && head2 == null)
        return null ;

        if(head1 == null)
        return head2 ;

        if(head2 == null)
        return head1 ;

        Node ansHead = null ;
        Node p = head1 , q = head2 ;
        if(p.data < q.data){
            ansHead = new Node(p.data) ;
            p = p.next ;
        }
        else if(p.data > q.data){
            ansHead = new Node(q.data) ;
            q = q.next ;
        }
        else{
            ansHead = new Node(p.data) ;
            p = p.next ;
            q = q.next ;
        }
        Node current = ansHead ;

        while(p != null && q != null){
            Node temp = null ;
            if(p.data < q.data){
                temp = new Node(p.data) ;
                current.next = temp ;
                current = temp ;
                p = p.next ;
            }
            else if(p.data > q.data){
                temp = new Node(q.data) ;
                current.next = temp ;
                current = temp ;
                q = q.next ;
            }
            else{
                temp = new Node(p.data) ;
                current.next = temp ;
                current = temp ;
                p = p.next ;
                q = q.next ;
            }
        }

        while(p != null){
            Node temp = new Node(p.data) ;
            current.next = temp ;
            current = temp ;
            p = p.next ;
        }

        while(q != null){
            Node temp = new Node(q.data) ;
            current.next = temp ;
            current = temp ;
            q = q.next ;
        }

        return ansHead ;
    }

    public static Node mergeLL3(Node head1 , Node head2){
        if(head1 == null && head2 == null)
        return null ;

        if(head1 == null)
        return head2 ;

        if(head2 == null)
        return head1 ;

        Node t1 = head1 , t2 = head2 ;
        Node dNode = new Node(-1) ;
        Node temp = dNode ;

        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                temp.next = t1 ;
                temp = t1 ;
                t1 = t1.next ;
            }
            else{
                temp.next = t2 ;
                temp = t2 ;
                t2 = t2.next ;
            }
        }

        if(t1 != null){
            temp.next = t1 ;
        }
        if(t2 != null){
            temp.next = t2 ;
        }

        return dNode.next ;
    }
    public static void main(String[] args) {
        int[] a1 = {1,2,20,41,56,80} ;
        int[] a2 = {19,40,56,79,90} ;

        Node heada1 = CreateSLL.createLL(a1) ;
        Node heada2 = CreateSLL.createLL(a2) ;

        System.out.print("LL1 : ");
        SLLTraversal.traversal(heada1) ;
        System.out.print("LL2 : ");
        SLLTraversal.traversal(heada2) ;

        // Node ans = mergeLL1(heada1 , heada2) ;
        // Node ans = mergeLL2(heada1 , heada2) ;
        Node ans = mergeLL3(heada1 , heada2) ;

        System.out.print("Merged LL : ");
        SLLTraversal.traversal(ans);
    }
}
