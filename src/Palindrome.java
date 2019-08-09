import java.util.Stack;


public class Palindrome {
	
	public static boolean checkPalindrome(StringLinkedList list) {
		
		Stack<String> myStack = new Stack<String>();
		
		StringNode current = list.head;
		
		while(current != null) {
			myStack.add(current.data);
			current = current.next;
		}
		
		current = list.head;
		String info = current.data;
		
		
		
		while(!myStack.isEmpty() && current.next != null) {
			String val = myStack.pop();
			if(val.equals(info)) {
				current = current.next;
				info = current.data;
			}else {
				return false;
			}
			
		}
		
		
		
		
		
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringLinkedList myList = new StringLinkedList();
		myList.append("r");
		myList.append("a");
		myList.append("c");
		myList.append("e");
		myList.append("c");
		myList.append("a");
		
		System.out.println(checkPalindrome(myList));
		

	}

}
