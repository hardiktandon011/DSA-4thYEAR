package Day2;

class Node{
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	public static void main(String[] args){
		Node first = new Node(10);
		Node second = new Node(20);
		
		first.next = second;
 		
		System.out.println("First Node Data: " + first.data);
		System.out.println("Second Node Data: " + first.next.data);
	}
}


