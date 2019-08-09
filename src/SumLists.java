import java.util.Queue;

public class SumLists {
	
	
	public static Node recursiveSumLists(Node head1, Node head2, int carryOver) {
		
		if(head1 == null && head2 == null && carryOver == 0) {
			return null;
		}
		
		Node result = new Node();
		
		int value = carryOver;
		
		if(head1 != null) {
			value += head1.data;
		}
		
		if(head2 != null) {
			value += head2.data;
		}
		
		result.data = value % 10;
		
		if(head1 != null || head2 != null) {
			Node more = recursiveSumLists(head1 == null ? null : head1.next, head2 == null ? null : head2.next, value >= 10 ? 1 :0);
			result.next = more;
		}
		
		
		return result;
	}
	
	public static Node sumLists(Node head1, Node head2) {
		Node current = head1;
		Node current2 = head2;
		Node sumHead = null;
		Node sumNext = null;
		int carryOver = 0;
		
		while(current != null && current2 != null) {
			Node next1 = current.next;
			Node next2 = current2.next;
			
			int sum = current.data + current2.data + carryOver ;

			if(sum >= 10) {
				sum = sum - 10;
				carryOver = 1;
			}else {
				carryOver = 0;
			}
			
			Node sumNode = new Node(sum);
			
			if(sumHead == null) {
				sumHead = sumNode;
				sumNext = sumHead;
			}else {
				sumNext.next = sumNode;
				sumNext = sumNode;
			}
			
			current = next1;
			current2 = next2;
		}
		
		return sumHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList myList1 = new LinkedList();
		
		myList1.append(7);
		myList1.append(1);
		myList1.append(6);
		
		LinkedList myList2 = new LinkedList();
		
		myList2.append(5);
		myList2.append(9);
		myList2.append(2);
		
		//Node current = sumLists(myList1.head, myList2.head);
		Node current = recursiveSumLists(myList1.head, myList2.head, 0);
		
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
		//System.out.println(sumLists(myList1.head, myList2.head).data);
		

	}

}
