package LINKED_LIST;

import java.util.Stack;

class Node{
    int data ;
    Node next ;

    Node(int data){
        this.data = data ;
        next = null ;
    }
}

public class ReverseASLL {

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

    public static void traversal(Node head){
        Node curr = head ;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next ;
        }
        System.out.println();
    }

    public static Node reverseSLL(Node head){
        if(head == null)
        return null ;

        if(head.next == null)
        return head ;

        Stack<Integer> stack = new Stack<>() ;

        Node curr = head ;

        while(curr != null){
            stack.push(curr.data) ;
            curr = curr.next ;
        }

        curr = head ;

        while(stack.isEmpty()!=true){
            curr.data = stack.peek() ;
            curr = curr.next ;
            stack.pop() ;
        }

        return head ;
    }

    public static Node reverse(Node head){
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

    public static Node recursiveReversal(Node head){
        if(head == null || head.next == null)
        return null ;

        Node newHead = recursiveReversal(head.next) ;

        Node front = head.next ;
        front.next = head ;
        head.next = null ;
        return newHead ;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6} ;
        int[] b = {10,2,80,6,2,7,56} ;
        int[] c = {} ;
        int[] d = {10} ;

        Node head1 = createLL(a) ;
        Node head2 = createLL(b) ;
        Node head3 = createLL(c) ;
        Node head4 = createLL(d) ;

        System.out.print("Linked List 1 : ");
        traversal(head1);
        System.out.print("Linked List 2 : ");
        traversal(head2);
        System.out.print("Linked List 3 : ");
        traversal(head3);
        System.out.print("Linked List 4 : ");
        traversal(head4);

        head1 = recursiveReversal(head1) ;
        head2 = recursiveReversal(head2) ;
        head3 = recursiveReversal(head3) ;
        head4 = recursiveReversal(head4) ;


        System.out.print("New Linked List 1 : ");
        traversal(head1);
        System.out.print("New Linked List 2 : ");
        traversal(head2);
        System.out.print("New Linked List 3 : ");
        traversal(head3);
        System.out.print("New Linked List 4 : ");
        traversal(head4);
    }
}
