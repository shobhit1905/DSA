package LINKED_LIST;

import java.util.Stack;

public class PallindromeLL {
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

    public static boolean isPallindrome(Node head){
        if(head == null || head.next == null)
        return true ;

        Node current = head ;
        Stack<Integer> stack = new Stack<>() ;

        while(current != null){
            stack.push(current.data) ;
            current = current.next ;
        }

        current = head ;

        while(current != null){
            if(stack.peek() != current.data)
            return false ;
            current = current.next ;
            stack.pop() ;
        }

        return true ;
    }

    public static boolean pallindromeLL(Node head){
        if(head == null || head.next == null)
        return true ;

        Node slow = head , fast = head ;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        Node newHead = reverseLL(slow.next) ;

        Node first = head , second = newHead ;
        boolean ans = true ;
        while(second != null){
            if(first.data != second.data){
                ans = false ;
                break ;
            }
            first = first.next ;
            second = second.next ;
        }

        newHead = reverseLL(newHead) ;
        return ans ;
    }

    public static Node reverseLL(Node head){
        if(head == null)
        return null ;

        if(head.next == null)
        return head ;

        Node curr = head , prev = null ;
        Node front = null ;

        while(curr != null){
            front = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = front ;
        }

        return prev ;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,4,3,2,1} ;
        int[] b = {1,2,-3,-3,1} ;
        int[] c = {-1,-2,-3,-4,-5} ;
        int[] d = {} ;
        int[] e = {10} ;

        Node head1 = createLL(a) ;
        Node head2 = createLL(b) ;
        Node head3 = createLL(c) ;
        Node head4 = createLL(d) ;
        Node head5 = createLL(e) ;

        System.out.println(isPallindrome(head1));
        System.out.println(isPallindrome(head2));
        System.out.println(isPallindrome(head3));
        System.out.println(isPallindrome(head4));
        System.out.println(isPallindrome(head5));
    }
}
