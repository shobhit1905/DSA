package LINKED_LIST.SinglyLinkedList;

public class CreateLLFromArray {

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

    public static int lengthLL(Node head){
        if(head == null)
        return 0 ;

        if(head.next == null)
        return 1 ;

        int count = 0 ;

        Node curr = head ;

        while(curr != null){
            count ++ ;
            curr = curr.next ;
        }

        return count ;
    }

    public static boolean searchInLL(Node head , int element){
        if(head == null)
        return false ;

        Node curr = head ;

        while(curr != null){
            if(curr.data == element)
            return true ;
            curr = curr.next ;
        }

        return false ;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,6,20,8,50,60,8} ;

        Node head = createLL(arr) ;

        traversal(head) ;
        System.out.println(lengthLL(head));
        System.out.println(searchInLL(head, 0));
        System.out.println(searchInLL(head, 10));
        System.out.println(searchInLL(head, 6));
    }
}
