package LINKED_LIST.SinglyLinkedList;

public class DeletionInLL {

    public static Node createLL(int[] arr) {

        if (arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            curr.next = temp;
            curr = temp;
        }

        return head;
    }

    public static void traversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;

        return head.next;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null)
            return null;

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
        return head;
    }

    public static Node deleteKthNode(Node head, int k) {
        if (head == null)
            return null;

        if (k == 1)
            return head.next;

        int pos = 0;
        Node curr = head;
        Node prev = null;

        while (curr != null && pos <= k - 2) {
            pos++;
            prev = curr;
            curr = curr.next;
        }

        if(curr == null)
        return head ;

        prev.next = curr.next ;
        return head ;
    }

    public static Node deleteNodeWithGivenValue(Node head , int val){
        if(head == null)
        return null ;

        if(head.data == val)
        return head.next ;

        Node curr = head ;
        Node prev = null ;

        while(curr != null && curr.data != val){
            prev = curr ;
            curr = curr.next ;
        }

        if(curr == null)
        return head ;

        prev.next = curr.next ;
        return head ;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };

        Node head = createLL(arr);

        System.out.print("Linked List : ");
        traversal(head);
        // head = deleteHead(head) ;
        // head = deleteTail(head) ;

        //head = deleteKthNode(head, 7);

        head = deleteNodeWithGivenValue(head, 0) ;
        System.out.print("New Linked List : ");
        traversal(head);

    }
}
