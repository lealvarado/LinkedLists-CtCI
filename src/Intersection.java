
public class Intersection {

	Node findIntersection(Node list1, Node list2) {
		if(list1 == null || list2 == null) {
			return null;
		}
		
		//Get tail and sizes
		Result firstTail = getTail(list1);
		Result secondTail = getTail(list2);
		
		//If different then no intersection 
		if(firstTail.tail != secondTail.tail) {
			return null;
		}
		
		//Set pointers to the start of each linked list
		
		Node shorter = firstTail.size < secondTail.size ? list1 : list2;
		Node longer = firstTail.size < secondTail.size ? list2 : list1;
		
		//Advance the pointer for the longer linked list by difference in lengths 
		longer = getKthNode(longer, Math.abs(firstTail.size - secondTail.size));
		
		//Move both pointers until collision 
		
		while(shorter != longer) {
			shorter = shorter.next;
			longer = longer.next;
		}
		
		//Return 
		return longer;

	}

	
	Node getKthNode(Node head, int k) {
		Node current = head;
		
		while(k > 0 && current != null) {
			current = current.next;
			k--;
		}
		
		return current;
	}
	public Result getTail(Node list) {
		if(list == null) {
			return null;
		}
		
		int size = 1;
		Node current = list; 
		while(current.next != null) {
			size++;
			current = current.next;
		}
		
		return new Result(current, size);
		
	}
}
