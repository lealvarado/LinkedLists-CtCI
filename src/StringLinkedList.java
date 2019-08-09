
public class StringLinkedList {
	
	StringNode head;
	int size = 0;
	
	public void append (String data) {
		size++;
		
		StringNode current = head; 
		
		if(head == null) {
			head = new StringNode(data);
			return;
		}
		
		while(current.next != null) {
			current = current.next;
		}
		current.next = new StringNode(data);
	}
	
	public void prepend(String data) {
		
		StringNode newHead = new StringNode(data);
		
		newHead.next = head;
		
		head = newHead;
	}
	
	public void deleteWithValue(String data) {
		
		if(head == null) {
			return;
		}
		
		if(head.data.equalsIgnoreCase(data)) {
			head = head.next;
			return;
		}
		
		StringNode current = head; 
		
		while(current.next != null) {
			if(current.next.data.equalsIgnoreCase(data)) {
				current.next = current.next.next;
				return;
			}
		}
		
		
	}
	
	public String peek() {
		return head.next.data;
	}
	
	public static void main(String[] args) {
		StringLinkedList myList = new StringLinkedList();
		
		myList.append("4");
		myList.append("5");
		//myList.prepend(8);
		myList.deleteWithValue("4");
		System.out.println(myList.peek());
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
