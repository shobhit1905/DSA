package LINKED_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Pair<T,S>{
    T num ;
    S node ;

    Pair(T num , S node){
        this.num = num ;
        this.node = node ;
    }
}

public class MergeKSortedLL {

    public static Node mergeKLL(List<Node> heads){
        if(heads == null)
        return null ;

        ArrayList<Integer> list = new ArrayList<>() ;

        for(int i=0 ; i<heads.size() ; i ++){
            Node current = heads.get(i) ;
            while(current != null){
                list.add(current.data) ;
                current = current.next ;
            }
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

    public static Node merge(Node a , Node b){
        if(a == null && b == null)
        return null ;

        if(a == null)
        return b ;

        if(b == null)
        return a ;

        Node t1 = a , t2 = b ;
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

        if(t1 != null)
            temp.next = t1 ;
        if(t2 != null)
            temp.next = t2 ;

        return dNode.next ;
    }

    public static Node mergeLL(List<Node> heads){
        if(heads == null)
        return null ;

        Node head = heads.get(0) ;

        for(int i=1 ; i<heads.size() ; i++){
            head = merge(head,heads.get(i)) ;
        }

        return head ;
    }

    public static Node mergeKSortedLL(List<Node> heads){
        if(heads == null)
        return null ;

        Comparator<Pair<Integer,Node>> comparator = (p1,p2) -> p1.num.compareTo(p2.num) ;

        PriorityQueue<Pair<Integer,Node>> pq = new PriorityQueue<>(comparator) ;

        for(int i=0 ; i<heads.size() ; i++){
            Pair<Integer,Node> p = new Pair<>(heads.get(i).data , heads.get(i)) ;
            pq.add(p) ;
        }

        Node dNode = new Node(-1) ;
        Node temp = dNode ;

        while(pq.isEmpty() != true){
            Pair<Integer,Node> p = pq.peek() ;
            temp.next = p.node ;
            pq.poll();
            if(p.node.next != null){
                Pair<Integer,Node> q = new Pair<>(p.node.next.data , p.node.next) ;
                pq.add(q) ;
            }

            temp = temp.next ;
        }

        return dNode.next ;
    }

    public static Node findMiddle(Node head){
        if(head == null || head.next == null)
        return head ;

        Node slow = head , fast = head ;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        return slow ;
    }


    public static void main(String[] args) {
        int[] a = {1,3,5,7,9} ;
        int[] b = {2,4,6,8,10} ;
        int[] c = {10,20,30,40} ;
        int[] d = {13,19,25,27,31,60} ;

        Node head1 = CreateSLL.createLL(a) ;
        Node head2 = CreateSLL.createLL(b) ;
        Node head3 = CreateSLL.createLL(c) ;
        Node head4 = CreateSLL.createLL(d) ;

        System.out.print("LL1 : ");
        SLLTraversal.traversal(head1) ;
        System.out.print("LL2 : ");
        SLLTraversal.traversal(head2) ;
        System.out.print("LL3 : ");
        SLLTraversal.traversal(head3) ;
        System.out.print("LL4 : ");
        SLLTraversal.traversal(head4) ;

        List<Node> headList = new ArrayList<>() ;
        headList.add(head1);
        headList.add(head2);
        headList.add(head3);
        headList.add(head4);

        Node ans = mergeKSortedLL(headList) ;

        System.out.print("Ans LL : ");
        SLLTraversal.traversal(ans);
    }
}
