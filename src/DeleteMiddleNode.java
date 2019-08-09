
public class DeleteMiddleNode {
	
	public static boolean deleteMiddle(Node node) {
		if(node == null || node.next == null) {
			return false;
		}
		Node newMiddle = node.next; 
		node.data = newMiddle.data;
		node.next = newMiddle.next;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList myList = new LinkedList();
		myList.append(1);
		myList.append(2);
		myList.append(3);
		myList.append(4);
		myList.append(5);
		
		Node head = myList.head;
		
		for(int i = 0; i < 4; i++) {
			if(head.data == 2) {
				deleteMiddle(head);
			}
			System.out.println(head.data);
			head = head.next;
		}

	}

}
