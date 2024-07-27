package LINKED_LIST.SinglyLinkedList;

public class CreateALinkedList {
    public static void main(String[] args) {
        Node head = new Node(10) ;
        Node n1 = new Node(20) ;
        Node n2 = new Node(30) ;
        Node n3 = new Node(40) ;

        head.next = n1 ;
        n1.next = n2 ;
        n2.next = n3 ;

        System.out.println(head.data);
        System.out.println(n1.data);
        System.out.println(n2.data);
        System.out.println(n3.data);

        System.out.println(head.next);
        System.out.println(n1);
        System.out.println(n1.next);
        System.out.println(n2.next);
        System.out.println(n3.next);
    }
}
