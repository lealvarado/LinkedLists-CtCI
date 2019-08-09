
public class Partition {

	
	
	public static Node partition(Node head, int num) {
		Node beforeHead = null;
		Node beforeTail = null; 
		Node afterHead = null;
		Node afterTail = null;

		Node current = head;
		
		while(current != null) {
			Node next = current.next;
			current.next = null;
			if(current.data < num) {
				if(beforeHead == null) {
					beforeHead = current;
					beforeTail = beforeHead;
				}else {
					beforeTail.next = current; 
					beforeTail = current;
				}
			}else {
				if(afterHead == null) {
					afterHead = current; 
					afterTail = afterHead;
				}else {
					afterTail.next = current;
					afterTail = current;
				}
			}
			current = next;
		}
		
		if(beforeHead == null) {
			return afterHead;
		}
		
		beforeTail.next = afterHead;
		return beforeHead;

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList newList = new LinkedList();
		
		newList.append(3);
		newList.append(5);
		newList.append(8);
		newList.append(5);
		newList.append(10);
		newList.append(2);
		newList.append(1);
		
		partition(newList.head, 8);

	}

}
