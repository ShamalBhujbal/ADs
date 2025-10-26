// Create a LinkedList and insert elements at the end. 
// Testcase: 
// Existing LinkedList: [5, 10, 15] 
// Elements to insert: [20, 25] 
// Expected Output: LinkedList: 5 → 10 → 15 → 20 → 25
class InsertLastLL{
	Node head;
	static class Node{
		int data;
		Node next;
		 Node(int data){
			 this.data=data;
			 this.next=null;
		 }
	}
	void insertLast(int data){
		Node newnode = new Node(data);
		newnode.next=null;
		if(head == null)
		{
			head = newnode;
			return;
		}
		Node temp=head;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		temp.next=newnode;	
	}
	void display(){
	Node temp=head;
	if(temp == null){
		System.out.println("LinkedList is empty:");
		return;
	}
	while(temp != null)
	{
		System.out.print(temp.data+"---->");
		temp=temp.next;
	}
	}
	public static void main(String args[]){
		InsertLastLL ll = new InsertLastLL();
		ll.insertLast(5);
		ll.insertLast(10);
		ll.insertLast(15);
		ll.display();
		System.out.println();
		System.out.println("====================================");
		ll.insertLast(20);
		ll.insertLast(25);
		ll.display();
		
	}
	
}