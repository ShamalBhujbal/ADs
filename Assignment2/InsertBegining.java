// Insert a new node at the beginning of a LinkedList. 
// Testcase: 
// Existing LinkedList: [10, 20, 30] 
// Node to insert: 5 
// Expected Output: LinkedList: 5 → 10 → 20 → 30 
class InsertBegining{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next=null;
		}
	}
	void insert(int data){
		Node newnode = new Node(data);
		newnode.next=head;
		head=newnode;
	}
	void display(){
		Node temp=head;
		while(temp != null)
		{
			System.out.print(temp.data+"------>");
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		InsertBegining ib = new InsertBegining();
		ib.insert(10);
		ib.insert(20);
		ib.insert(30);
		System.out.println("Existed linkedlist:");
		ib.display();
		ib.insert(5);
		System.out.println("new linkedlist:");
		ib.display();
	}
}