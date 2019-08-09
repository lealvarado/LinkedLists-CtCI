
public class LoopDetection {
	
	public Node isLoop(Node head) {
		if(head == null) {
			return null;
		}
		
		Node fast = head.next;
		Node slow = head;
		
		while(fast != null && slow != null && fast.next != null) {
			if(fast == slow) {
				return fast;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return null;
	}
	
	public Node loopNodeBook(Node head) {
		
		Node slow = head; 
		Node fast = head; 
		
		//Find meeting point. this will be loopsize - k steps into the linkedlist
		while(fast != null && fast.next != null) {
			slow = slow.next; 
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		//no meeting point and therefore no loop
		if(fast == null || fast.next == null) {
			return null;
		}
		
		//Move slow to head, keep fast at Meeting point Each are k steps from the loop start, if they move at
		//at same pace they must meet at Loop start
		
		slow = head; 
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
