package LINKED_LIST;

public class DeleteMiddleNode {

    public static Node deleteMiddle(Node head){
        if(head == null || head.next == null)
        return null ;

        Node current = head ;
        int len = 0 ;
        while(current != null){
            len++ ;
            current = current.next ;
        }

        len = len/2 - 1 ;
        current = head ;
        while(len > 0){
            current = current.next ;
            len-- ;
        }

        current.next = current.next.next ;
        return head ;
    }

    public static Node deleteMiddleNode(Node head){
        if(head == null || head.next == null)
        return null ;

        Node fast = head , slow = head , previous = null ;

        while(fast != null && fast.next != null){
            previous = slow ;
            slow = slow.next ;
            fast = fast.next.next ;
        }

        previous.next = slow.next ;
        slow.next = null ;
        return head ;
    }
    public static void main(String[] args) {
        int[] a = {} ;
        int[] b = {1,2,3,4,5} ;
        int[] c = {10,20,30,40,50,60} ;
        int[] d = {1,2} ;

        Node head1 = CreateSLL.createLL(a) ;
        Node head2 = CreateSLL.createLL(b) ;
        Node head3 = CreateSLL.createLL(c) ;
        Node head4 = CreateSLL.createLL(d) ;

        System.out.print("LL 1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("LL 2 : ");
        SLLTraversal.traversal(head2);
        System.out.print("LL 3 : ");
        SLLTraversal.traversal(head3);
        System.out.print("LL 4 : ");
        SLLTraversal.traversal(head4);

        head1 = deleteMiddleNode(head1) ;
        head2 = deleteMiddleNode(head2) ;
        head3 = deleteMiddleNode(head3) ;
        head4 = deleteMiddleNode(head4) ;

        System.out.print("LL 1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("LL 2 : ");
        SLLTraversal.traversal(head2);
        System.out.print("LL 3 : ");
        SLLTraversal.traversal(head3);
        System.out.print("LL 4 : ");
        SLLTraversal.traversal(head4);
    }
}
