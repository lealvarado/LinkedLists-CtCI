
public class LinkedList {
	
	Node head;
	int size;
	
	public int size() {
		return size;
	}
	

	public void append (int data) {
		size++;
		Node current = head; 
		
		
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void prepend(int data) {
		
		Node newHead = new Node(data);
		
		newHead.next = head;
		
		head = newHead;
	}
	
	public void deleteWithValue(int data) {
		
		if(head == null) {
			return;
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head; 
		
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return;
			}
		}
		
		
	}
	
	public int peek() {
		return head.next.data;
	}
	
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		
		myList.append(4);
		myList.append(5);
		//myList.prepend(8);
		myList.deleteWithValue(4);
		System.out.println(myList.peek());
	}

}
