package LINKED_LIST.DoublyLinkedList;

public class DeletionInDLL {

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

    public static Node deleteHead(Node head){
        if(head == null)
        return null ;

        if(head.next == null && head.prev == null)
        return null ;

        head.next.prev = null ;
        return head.next ;
    }

    public static Node deleteTail(Node head){
        if(head == null)
        return null ;

        if(head.next == null && head.prev == null)
        return null ;

        Node curr = head ;

        while(curr.next != null)
        curr = curr.next ;

        curr.prev.next = null ;
        curr.prev = null ;

        return head ;
    }

    public static Node deleteKthNode(Node head , int k){
        if(head == null)
        return null ;

        if(head.next == null && head.prev == null){
            if(k == 1){
                return null ;
            }
            return head ;
        }

        if(k == 1){
            head.next.prev = null ;
            return head.next ;
        }

        int counter = 0 ;
        Node curr = head , previous = null ;

        while(curr != null && counter < k-1){
            counter ++ ;
            previous = curr ;
            curr = curr.next ;
        }

        if(curr == null)
        return head ;

        if(curr.next == null){
            previous.next = null ;
            curr.prev = null ;
            return head ;
        }

        curr.next.prev = previous ;
        previous.next = curr.next ;
        curr.next = null ;
        curr.prev = null ;

        return head ;
    }

    public static void deleteNode(Node node){
        if(node == null)
        return ;

        if(node.next == null){
            node.prev.next = null ;
            node.prev = null ;
            return ;
        }

        node.next.prev = node.prev ;
        node.prev.next = node.next ;
        node.next = null ;
        node.prev = null ;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50} ;
        Node head = createDLL(arr) ;

        System.out.print("Linked List : ");
        traversal(head);
        
        //head = deleteHead(head) ;
        //head = deleteTail(head) ;
        //head = deleteKthNode(head, 5) ;

        deleteNode(head.next.next);
        System.out.print("New Linked List : ");
        traversal(head);
        
    }
}
