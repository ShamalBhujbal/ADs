// Reverse a LinkedList. 
// Testcase: 
// Existing LinkedList: [10, 20, 30, 40] 
// Expected Output: LinkedList: 40 → 30 → 20 → 10 
// Existing LinkedList: [] 
// Expected Output: LinkedList: (empty
class ReverseLinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	void insert(int data){
		Node newnode = new Node(data);
		newnode.next=head;
		head = newnode;
		
	}
	void display(){
		Node temp = head;
		while(temp!= null){
			System.out.print(temp.data+"----->");
			temp=temp.next;
		}
	}
	void reverse(){
		Node prev=null;
		Node next=null;
		Node curr = head;
		while(curr != null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;	
		}
		head=prev;
	}
	public static void main(String args[]){
		ReverseLinkedList rll = new ReverseLinkedList();
		rll.insert(10);
		rll.insert(20);
		rll.insert(30);
		rll.insert(40);
		rll.insert(50);
		rll.display();
		rll.reverse();
		System.out.println("\nAfter reversing the linkdelist:");
		rll.display();
	}
}