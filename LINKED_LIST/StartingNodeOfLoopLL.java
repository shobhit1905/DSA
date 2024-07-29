package LINKED_LIST;

import java.util.HashMap;
import java.util.Map;

public class StartingNodeOfLoopLL {

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

    public static Node startingNode(Node head){
        if(head == null)
        return null ;

        if(head.next == head)
        return head ;

        Map<Node , Boolean> map = new HashMap<>() ;
        Node current = head ;

        while(current != null){
            if(map.containsKey(current)){
                return current ;
            }
            map.put(current,true) ;
            current = current.next ;
        }

        return null ;
    }

    public static Node startingLoopNode(Node head){
        if(head == null)
        return null ;

        if(head.next == head)
        return head ;

        Node slow = head , fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;

            if(slow == fast){
                slow = head ;
                while(slow != fast){
                    slow = slow.next ;
                    fast = fast.next ;
                }
                return slow ;
            }
        } 
        return null ;
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

        System.out.println(startingLoopNode(head2));
        System.out.println(startingLoopNode(head1).data);
        System.out.println(startingLoopNode(head3));
        System.out.println(startingLoopNode(head4).data);

    }
}
