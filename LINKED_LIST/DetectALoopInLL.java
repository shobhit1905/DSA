package LINKED_LIST;

import java.util.HashMap;
import java.util.Map;

public class DetectALoopInLL {
    public static Node createLL(int[] arr){

        if(arr.length == 0)
        return null ;

        Node head = new Node(arr[0]) ;
        Node curr = head ;

        for(int i=1 ; i<arr.length ; i ++){
            Node temp = new Node(arr[i]) ;
            curr.next = temp ;
            curr = temp ;
        }


        return head ;
    }

    public static boolean detetcLoop(Node head){
        if(head == null)
        return false ;

        Map<Node , Boolean> map = new HashMap<>() ;

        Node current = head ;

        while(current != null){
            if(map.containsKey(current))
                return true ;

            map.put(current,true) ;
            current = current.next ;
        }
        return false ;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
        int[] brr = {} ;
        int[] crr = {10,20,30} ;

        Node head1 = createLL(arr) ;
        Node curr = head1 ;
        Node tail = head1 ;

        for(int i = 1 ; i<=5 ; i ++){
            curr = curr.next ;
        }

        while(tail.next != null){
            tail = tail.next ;
        }

        Node head2 = createLL(brr) ;
        Node head3 = createLL(crr) ;

        tail.next = curr ;

        System.out.println(detetcLoop(head1));
        System.out.println(detetcLoop(head2));
        System.out.println(detetcLoop(head3));
    }
}
