package LINKED_LIST;

public class SLLTraversal {
    public static void traversal(Node head){
        if(head == null)
        return ;

        Node current = head ;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next ;
        }
        System.out.println();
    }
}
