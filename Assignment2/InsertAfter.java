// . Insert a new node at a given position in a LinkedList. 
// Testcase: 
// Existing LinkedList: [10, 20, 30, 40] 
// Node to insert: 25 at position 2 
// Expected Output: LinkedList: 10 → 20 → 25 → 30 → 40
class InsertAfter{
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
		Node temp = head;
		Node newnode = new Node(data);
		newnode.next=head;
		head=newnode;
	}
	void insertAfter(Node prev_node,int data){
		if(prev_node == null)
		{
			System.out.println("Insertion not possible");
			return;
		}
		Node newnode = new Node(data);
		newnode.next=prev_node.next;
		prev_node.next=newnode;
	}
	void display(){
		Node temp=head;
		while(temp != null){
			System.out.print(temp.data+"---->");
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		InsertAfter iA = new InsertAfter();
		iA.insert(10);
		iA.insert(20);
		iA.insert(30);
		iA.insert(40);
		iA.display();
		System.out.println("Insert after starts");
		iA.insertAfter(iA.head.next,15);
		iA.display();
	}
}