package LINKED_LIST;

public class Sort012LL {

    public static Node sort(Node head){
        if(head == null || head.next == null)
        return head ;

        int countZero = 0 , countOne = 0 , countTwo = 0 ;

        Node current = head ;

        while(current != null){
            if(current.data == 0)
                countZero++ ;
            else if(current.data == 1)
                countOne ++ ;
            else
                countTwo++ ;
            current = current.next ;
        }

        current = head ;

        while(countZero > 0){
            current.data = 0 ;
            countZero -- ;
            current = current.next ;
        }
        while(countOne > 0){
            current.data = 1 ;
            countOne -- ;
            current = current.next ;
        }
        while(countTwo > 0){
            current.data = 2 ;
            countTwo -- ;
            current = current.next ;
        }

        return head ;
    }

    public static Node sort1(Node head){
        if(head == null || head.next == null)
        return head ;

        Node dZero = new Node(0) ;
        Node dOne = new Node(1) ;
        Node dTwo = new Node(2) ;

        Node current = head , t0 = dZero , t1 = dOne , t2 = dTwo ;

        while(current != null){
            if(current.data == 0){
                t0.next = current ;
                t0 = current ;
            }
            else if(current.data == 1){
                t1.next = current ;
                t1 = current ;
            }
            else{
                t2.next = current ;
                t2 = current ;
            }
            current = current.next ;
        }

        if(dOne.next != null){
            t0.next = dOne.next ;
            if(dTwo.next != null)
                t1.next = dTwo.next ;
        }
        else{
            if(dTwo.next != null)
                t0.next = dTwo.next ;
        }

        t2.next = null ;

        return dZero.next ;
    }
    public static void main(String[] args) {
        int[] a = {1,2,0,0,2,1,0,2,2,0} ;
        int[] b = {0,0,0} ;
        int[] c = {1,1} ;
        int[] d = {2,2,2,2} ;
        int[] e = {0,1,0,1,0,1} ;
        int[] f = {1,2,1,2,1,2,2,2,1} ;
        int[] g = {0,2,2,2,2,0,0,2,0,2,2} ;

        Node head1 = CreateSLL.createLL(a) ;
        Node head2 = CreateSLL.createLL(b) ;
        Node head3 = CreateSLL.createLL(c) ;
        Node head4 = CreateSLL.createLL(d) ;
        Node head5 = CreateSLL.createLL(e) ;
        Node head6 = CreateSLL.createLL(f) ;
        Node head7 = CreateSLL.createLL(g) ;
        

        System.out.print("LL1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("LL2 : ");
        SLLTraversal.traversal(head2);
        System.out.print("LL3 : ");
        SLLTraversal.traversal(head3);
        System.out.print("LL4 : ");
        SLLTraversal.traversal(head4);
        System.out.print("LL5 : ");
        SLLTraversal.traversal(head5);
        System.out.print("LL6 : ");
        SLLTraversal.traversal(head6);
        System.out.print("LL7 : ");
        SLLTraversal.traversal(head7);

        head1 = sort1(head1) ;
        head2 = sort1(head2) ;
        head3 = sort1(head3) ;
        head4 = sort1(head4) ;
        head5 = sort1(head5) ;
        head6 = sort1(head6) ;
        head7 = sort1(head7) ;

        System.out.print("Sorted LL1 : ");
        SLLTraversal.traversal(head1);
        System.out.print("Sorted LL2 : ");
        SLLTraversal.traversal(head2);
        System.out.print("Sorted LL3 : ");
        SLLTraversal.traversal(head3);
        System.out.print("Sorted LL4 : ");
        SLLTraversal.traversal(head4);
        System.out.print("Sorted LL5 : ");
        SLLTraversal.traversal(head5);
        System.out.print("Sorted LL6 : ");
        SLLTraversal.traversal(head6);
        System.out.print("Sorted LL7 : ");
        SLLTraversal.traversal(head7);
    }
}
