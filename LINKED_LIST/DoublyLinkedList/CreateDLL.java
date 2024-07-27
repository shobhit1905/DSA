package LINKED_LIST.DoublyLinkedList ;
public class CreateDLL {

    public static Node createDLL(int[] arr){
        if(arr.length == 0)
        return null ;

        Node head = new Node(arr[0]) ;
        Node curr = head ;

        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i]) ;
            curr.next = temp ;
            temp.prev = curr ;
            curr = temp ;
        }

        return head ;
    }

    public static void traversal(Node head){
        if(head == null){
            System.out.println("List is empty");
            return ;
        }

        Node curr = head ;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next ;
        }

        System.out.println();
    }

    public static void reverseTraversal(Node tail){
        if(tail == null){
            System.out.println("List is empty");
            return ;
        }

        while(tail != null){
            System.out.print(tail.data + " ");
            tail = tail.prev ;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,2,20,3,6,30} ;

        Node head = createDLL(arr) ;
        System.out.print("Linked List :");
        traversal(head);

        Node tail = head ;
        while(tail.next != null){
            tail = tail.next ;
        }
        System.out.print("Reversed Linked List : ");
        reverseTraversal(tail);
    }
}
