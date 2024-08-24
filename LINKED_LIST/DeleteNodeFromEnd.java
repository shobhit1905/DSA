package LINKED_LIST;

public class DeleteNodeFromEnd {
    public static Node deleteFromEnd(Node head , int n){
        if(head == null)
        return null ;

        if(head.next == null){
            if(n == 1)
            return null ;
            return head ;
        }

        int count = 0 ;
        Node current = head ;

        while(current != null){
            count ++;
            current = current.next ;
        }

        if(count == n)
        return head.next ;

        int res = count - n ;

        current = head ;

        while(current != null){
            res -- ;
            if(res == 0)
            break ;
            current = current.next ;
        }

        current.next = current.next.next ;
        return head ;
    }

    public static Node deleteNodeFromLast(Node head , int n){
        if(head == null)
        return null ;

        if(head.next == null){
            if(n == 1)
            return null ;
            return head ;
        }

        Node fast = head , slow = head ;

        while(n > 0){
            fast = fast.next ;
            n -- ;
            if(fast == null)
            return head.next ;
        }

        while(fast.next != null){
            slow = slow.next ;
            fast = fast.next ;
        }

        slow.next = slow.next.next ;
        return head ;
    }
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60} ;
        int[] b = {10} ;
        int[] c = {} ;

        Node head1 = CreateSLL.createLL(a) ;
        Node head2 = CreateSLL.createLL(b) ;
        Node head3 = CreateSLL.createLL(c) ;

        System.out.print("LL1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("LL2 : ");
        SLLTraversal.traversal(head2);
        System.out.print("LL3 : ");
        SLLTraversal.traversal(head3);

        head1 = deleteNodeFromLast(head1, 4) ;
        head2 = deleteNodeFromLast(head2, 1) ;
        head3 = deleteNodeFromLast(head3, 2) ;

        System.out.print("New LL1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("New LL2 : ");
        SLLTraversal.traversal(head2);
        System.out.print("New LL3 : ");
        SLLTraversal.traversal(head3);
    }
}
