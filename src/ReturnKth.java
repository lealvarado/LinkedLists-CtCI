
public class ReturnKth {
	
	public static Node returnKth(LinkedList myList) {
		Node current = myList.head;
		Node next = current.next;
		
		while(current.next.next != null) {
			current = current.next;
		}
		return current;
	}
	
	public static int returnKthRecurse(Node head, int k) {
		if(head == null) {
			return 0;
		}
		
		int index = returnKthRecurse(head.next, k) + 1;
		if(index == k) {
			System.out.println(k + "th element is " + head.data);
		}
		
		return index; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList();
		
		myList.append(4);
		myList.append(4);
		myList.append(7);
		myList.append(10);
		myList.append(5);
		//runnerRemoveDupes(myList);
		System.out.println(returnKthRecurse(myList.head, 4));
	}

}
