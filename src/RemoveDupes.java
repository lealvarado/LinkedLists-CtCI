import java.util.Hashtable;

public class RemoveDupes {
	
	public static void removeDupes(LinkedList myList) {
		Hashtable<Integer, Integer> myHash = new Hashtable<Integer, Integer>();
		Node current = myList.head; 
		
		while(current != null) {
			if(!myHash.containsKey(current.data)) {
				myHash.put(current.data, 1);
				current = current.next;
			}else {
				myHash.put(current.data, (myHash.get(current.data) + 1));
				current = current.next;
			}
		}
		current = myList.head;
		
		while(current != null) {
			while(myHash.get(current.data) > 1) {
				myList.deleteWithValue(current.data);
				myHash.put(current.data, (myHash.get(current.data) - 1));
				
			}
			current = current.next;
		}
		
		
	}
	
	public static void refactorRemoveDupes(LinkedList myList) {
		Hashtable<Integer, Integer> myHash = new Hashtable<Integer, Integer>();
		Node current = myList.head; 
		
		while(current != null) {
			if(!myHash.containsKey(current.data)) {
				myHash.put(current.data, 1);
				current = current.next;
			}else {
				myList.deleteWithValue(current.data);
				current = current.next;
			}
		}
	}
	
	public static void runnerRemoveDupes(LinkedList myList) {
		
		Node current = myList.head;
		
		while(current != null) {
			Node runner = current.next;
			while(runner != null) {
				if(runner.data == current.data) {
					myList.deleteWithValue(current.data);
					runner = runner.next;
				}else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		
		myList.append(4);
		myList.append(4);
		myList.append(5);
		runnerRemoveDupes(myList);
		System.out.println(myList.peek());
		// TODO Auto-generated method stub

	}

}
