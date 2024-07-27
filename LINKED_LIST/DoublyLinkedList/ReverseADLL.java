package LINKED_LIST.DoublyLinkedList;

public class ReverseADLL {
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


    // Naive approach
    // TC = O(n) + O(n)
    // AS + O(1)
    public static Node reverseDLL(Node head){
        Node start = head ;
        Node end = head ;
        int s = 1 ;
        int e = 1 ;

        while(end.next != null){
            end = end.next ;
            e++ ;
        }

        while(s < e){
            start.data = start.data + end.data ;
            end.data = start.data - end.data ;
            start.data = start.data - end.data ;
            start = start.next ;
            s++ ;
            end = end.prev ;
            e -- ;
        }

        return head ;
    }

    public static Node reversedLL(Node head){
        if(head == null)
        return null ;

        if(head.next == null)
        return head ;

        Node last = null ;
        Node current = head ;

        while(current != null){
            last = current.prev ;
            current.prev = current.next ;
            current.next = last ;
            last = current ;
            current = current.prev ;
        }

        return last ;
    }
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6} ;

        Node head = createDLL(arr) ;
        System.out.print("Linked List : ");
        traversal(head);

        head = reversedLL(head) ;

        System.out.print("Reversed Linked List : ");
        traversal(head);
    }
}
