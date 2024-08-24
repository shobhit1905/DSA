package LINKED_LIST ;
public class AddOneToLL {

    public static Node reverseLL(Node head){
        if(head == null || head.next == null)
        return head ;

        Node current = head , previous = null , front = null ;

        while(current != null){
            front = current.next ;
            current.next = previous ;
            previous = current ;
            current = front ;
        }

        return previous ;
    }

    public static Node addOne(Node head){
        if(head == null)
        return null ;

        head = reverseLL(head) ;

        Node temp = head ;
        int carry = 1 ;

        while(temp != null && carry == 1){
            int d = temp.data ;
            d = d + carry ;
            if(d > 9){
                temp.data = d%10 ;
                carry = 1 ;
            }
            else{
                temp.data = d ;
                carry = 0 ;
            }

            temp = temp.next ;
        }

        head = reverseLL(head) ;

        if(carry == 1){
            Node newNode = new Node(1) ;
            newNode.next = head ;
            return newNode ;
        }
        else
            return head ;
    }

    public static int helper(Node head){
        if(head == null)
        return 1 ;

        int carry = helper(head.next) ;

        head.data = head.data + carry ;

        if(head.data < 10)
        return 0 ;

        head.data = 0 ;
        return 1 ;
    }

    public static Node addOneToLL(Node head){
        if(head == null)
        return null ;

        int carry = helper(head) ;

        if(carry == 1){
            Node temp = new Node(1) ;
            temp.next = head ;
            return temp ;
        }

        return head ;
    }
    public static void main(String[] args) {
        int[] a = {9,0} ;
        int[] b = {1,9} ;
        int[] c = {9,9,9,9} ;

        Node head1 = CreateSLL.createLL(a) ;
        Node head2 = CreateSLL.createLL(b) ;
        Node head3 = CreateSLL.createLL(c) ;

        System.out.print("LL1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("LL2 : ");
        SLLTraversal.traversal(head2);
        System.out.print("LL3 : ");
        SLLTraversal.traversal(head3);

        head1 = addOneToLL(head1) ;
        head2 = addOneToLL(head2) ;
        head3 = addOneToLL(head3) ;


        System.out.print("New LL1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("New LL2 : ");
        SLLTraversal.traversal(head2);
        System.out.print("New LL3 : ");
        SLLTraversal.traversal(head3);
    }
}
