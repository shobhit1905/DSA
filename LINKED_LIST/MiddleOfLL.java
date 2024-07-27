package LINKED_LIST ;

class Node{
    int data ;
    Node next ;

    Node(int data){
        this.data = data ;
        next = null ;
    }
}
public class MiddleOfLL {

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

    public static int findMiddle(Node head){
        if(head == null)
        return -1 ;

        if(head.next == null)
        return head.data ;

        int count = 1 ;
        Node curr = head ;

        while(curr.next != null){
            curr = curr.next ;
            count ++ ;
        }

        count = count/2 + 1 ;
        curr = head ;

        while(count > 1){
            curr = curr.next ;
            count -- ;
        }

        return curr.data ;
    }

    public static Node middleNode(Node head){
        if(head == null)
        return null ;

        if(head.next == null)
        return head ;

        Node fast = head , slow = head ;

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        return slow ;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6} ;
        int[] b = {10,2,80,6,2,7,56} ;
        //int[] c = {} ;
        int[] d = {10} ;

        Node head1 = createLL(a) ;
        Node head2 = createLL(b) ;
        //Node head3 = createLL(c) ;
        Node head4 = createLL(d) ;
        

        System.out.println("Middle of linked list A : " + middleNode(head1).data);
        System.out.println("Middle of linked list B : " + middleNode(head2).data);
        //System.out.println("Middle of linked list C : " + middleNode(head3).data);
        System.out.println("Middle of linked list D : " + middleNode(head4).data);
    }
}
