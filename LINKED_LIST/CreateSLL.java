package LINKED_LIST;

public class CreateSLL {
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
}
