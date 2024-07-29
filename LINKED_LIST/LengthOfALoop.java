package LINKED_LIST;

import java.util.HashMap;
import java.util.Map;

public class LengthOfALoop {

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

    public static int lengthLoop(Node head){
        if(head == null)
        return 0 ;

        if(head.next == head)
        return 1 ;

        int temp = 1 ;
        Node current = head ;
        Map<Node , Integer> map = new HashMap<>() ;
        while(current != null){
            if(map.containsKey(current))
                return temp - map.get(current) ;
            map.put(current , temp++) ;
            current = current.next ;
        }

        return 0 ;
    }

    public static int length(Node head){
        if(head == null)
        return 0 ;

        if(head.next == head)
        return 1 ;

        Node slow = head , fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;

            if(slow == fast){
                int count = 1 ;
                while(fast.next != slow){
                    count ++;
                    fast = fast.next ;
                }
                return count ;
            }
        }
        return 0 ;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
        int[] brr = {} ;
        int[] crr = {10,20,30} ;
        int[] drr = {-1} ;

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
        Node head4 = createLL(drr) ;

        head4.next = head4 ;

        tail.next = curr ;

        System.out.println(length(head1));
        System.out.println(length(head2));
        System.out.println(length(head3));
        System.out.println(length(head4));
    }
}
