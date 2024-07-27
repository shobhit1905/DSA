package LINKED_LIST.SinglyLinkedList;

public class InsertionInSLL {

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

    public static Node insertBegin(Node head , int data){
        Node newNode = new Node(data) ;
        newNode.next = head ;
        return newNode ;
    }

    public static Node insertLast(Node head , int data){
        Node n = new Node(data) ;

        if(head == null)
        return n ;

        if(head.next == null)
        {
            head.next = n ;
            return head ;
        }

        Node curr = head ;
        while(curr.next != null){
            curr = curr.next ;
        }

        curr.next = n ;
        return head ;
    }

    public static Node insertPosition(Node head , int pos , int data){
        Node n = new Node(data) ;

        if(pos == 1)
        {
            n.next = head ;
            return n ;
        }

        int i = 0 ;
        Node curr = head ;
        while(curr != null && i < pos-2){
            i ++ ;
            curr = curr.next ;
        }

        if(curr == null)
        return head ;

        n.next = curr.next ;
        curr.next = n ;
        return head ;
    }

    public static Node insertBefore(Node head , int val , int data){
        Node n = new Node(data) ;
        if(head.data == val){
            n.next = head ;
            return n ;
        }

        Node curr = head ;
        while(curr != null && curr.next != null && curr.next.data != val){
            curr = curr.next ;
        }

        if(curr.next == null)
        return head ;
        
        n.next = curr.next ;
        curr.next = n ;

        return head ;
    }
    public static void main(String[] args) {
        int[] arr = {60,50,40,30,20,10} ;

        Node head = createLL(arr) ;

        System.out.print("Linked List : ");
        traversal(head);

        //head = insertBegin(head,10) ;
        //head = insertLast(head , 100) ;
        //head =insertPosition(head, 6, -1) ;
        head = insertBefore(head, 0, 0) ;
        System.out.print("New Linked List : ");
        traversal(head);
    }
}
