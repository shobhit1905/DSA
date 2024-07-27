package LINKED_LIST.DoublyLinkedList;

public class InsertionInDLL {

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

    public static Node insertBeforeHead(Node head , int data){
        if(head == null)
        return new Node(data) ;

        Node newNode = new Node(data) ;
        newNode.next = head ;
        head.prev = newNode ;
        return newNode ;
    }

    public static Node insertAfterHead(Node head , int data){
        if(head == null)
        return new Node(data) ;

        Node newNode = new Node(data) ;

        if(head.next == null){
            head.next = newNode ;
            newNode.prev = head ;
            return head ;
        }

        head.next.prev = newNode ;
        newNode.next = head.next ;
        head.next = newNode ;
        newNode.prev = head ;

        return head ;
    }

    public static Node insertLast(Node head , int data){
        if(head == null)
        return new Node(data) ;

        if(head.next == null){
            Node newNode = new Node(data) ;
            head.next = newNode ;
            newNode.prev = head ;
            return head ;
        }

        Node current = head ;

        while(current.next != null){
            current = current.next ;
        }

        Node newNode = new Node(data) ;

        current.next = newNode ;
        newNode.prev = current ;

        return head ;
    }

    public static Node insertSecondLast(Node head , int data){
        if(head == null)
        return new Node(data) ;

        if(head.next == null){
            Node newNode = new Node(data) ;
            newNode.next = head ;
            head.prev = newNode ;
            return newNode ;
        }

        Node current = head ;

        while(current.next.next != null){
            current = current.next ;
        }

        Node newNode = new Node(data) ;
        newNode.next = current.next ;
        current.next.prev = newNode ;
        current.next = newNode ;
        newNode.prev = current ;

        return head ;

    }

    public static Node insertAtK(Node head , int data , int k){
        if(head == null)
        return null ;

        if(head.next == null && head.prev == null){
            if(k == 1){
                Node nn = new Node(data) ;
                nn.next = head ;
                head.prev = nn ;
                return nn ;
            }
            return head ;
        }

        if(k == 1){
            Node nn = new Node(data) ;
            nn.next = head ;
            head.prev = nn ;
            return nn ;
        }

        Node newNode = new Node(data) ;
        Node current = head ;
        int i = 0 ;

        while(current != null && i < k-2){
            current = current.next ;
            i ++ ;
        }

        if(current == null)
        return head ;

        if(current.next == null){
            current.next = newNode ;
            newNode.prev = current ;
            return head ;
        }

        current.next.prev = newNode ;
        newNode.next = current.next ;
        newNode.prev = current ;
        current.next = newNode ;

        return head ;
    }

    public static Node insertBeforeK(Node head , int data , int k){
        if(head == null)
        return null ;

        if(head.next == null && head.prev == null){
            if(k == 1){
                Node nn = new Node(data) ;
                nn.next = head ;
                head.prev = nn ;
                return nn ;
            }
            return head ;
        }

        k = k-1 ;

        return insertAtK(head, data, k) ;
    }

    public static Node insertAfterK(Node head , int data , int k){
        if(head == null)
        return null ;

        if(head.next == null && head.prev == null){
            if(k == 1){
                Node nn = new Node(data) ;
                head.next = nn ;
                nn.prev = head ;
                return head ;
            }
            return head ;
        }

        k = k+1 ;

        return insertAtK(head, data, k) ;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,100,9,20,8,50,3} ;

        Node head = createDLL(arr) ;

        System.out.print("Linked List : ");
        traversal(head);

        //head = insertBeforeHead(head, -1) ;
        //head = insertAfterHead(head, -1) ;
        //head = insertLast(head, -1) ;
        //head = insertSecondLast(head, -1) ;
        //head = insertAtK(head, -1, 10) ;
        //head = insertBeforeK(head, 999, 6) ;
        head = insertAfterK(head, 888, 6) ;
        System.out.print("New Linked List : ");
        traversal(head);
    }
}
