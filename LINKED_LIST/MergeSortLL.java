package LINKED_LIST;

public class MergeSortLL {

    public static Node findMiddle(Node head){
        Node slow = head , fast = head.next ;

        while(fast != null && fast.next == null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }

        return slow ;
    }

    public static Node mergeLL(Node head1 , Node head2){

        Node dNode = new Node(-1) ;
        Node first = head1 , second = head2 , temp = dNode ;

        while(first != null && second != null){
            if(first.data < second.data){
                temp.next = first ;
                temp = first ;
                first = first.next ;
            }
            else{
                temp.next = second ;
                temp = second ;
                second = second.next ;
            }
        }

        if(first != null)
            temp.next = first ;
        if(second != null)
            temp.next = second ;

        return dNode.next ;
    }

    public static Node mergeSort(Node head){
        if(head == null || head.next == null)
        return head ;

        Node middle = findMiddle(head) ;

        Node leftHead = head , rightHead = middle.next ;
        middle.next = null ;

        leftHead = mergeSort(leftHead) ;
        rightHead = mergeSort(rightHead) ;

        return mergeLL(leftHead , rightHead) ;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,10,5,20,32,19} ;

        Node head = CreateSLL.createLL(arr) ;

        System.out.print("Linked List : ");
        SLLTraversal.traversal(head) ;

        head = mergeSort(head) ;

        System.out.print("Sorted Linked List : ");
        SLLTraversal.traversal(head) ;
    }
}
