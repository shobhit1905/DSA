package LINKED_LIST.SinglyLinkedList;

public class SearchInSLL {

    public static int findNode(Node head, int n) {
		if(head.data == n)
		return 0 ;

		if(head.next == null){
			if(head.data == n)
			return 0 ;
			else
			return -1 ;
		}

		int count = 0 ;
		Node curr = head ;

		while(curr != null){
			if(curr.data == n){
				return count ;
			}
			count ++ ;
			curr = curr.next ;
		}

		return -1 ;
	}
    public static void main(String[] args) {
        Node head = new Node(-1) ;

        System.out.println(findNode(head, 0));
    }
}
