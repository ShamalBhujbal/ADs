// . Delete a node by its value in a LinkedList. 
// Testcase: 
// Existing LinkedList: [10, 20, 30, 40] 
// Node to delete: 30 
// Expected Output: LinkedList: 10 → 20 → 40
class DeleteValueLL{
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
		head=newnode;
	}
	void deleteValue(int data){
	Node temp = head;
	Node prev=null;
	while(temp.data != data)
	{
		prev=temp;
		temp=temp.next;
	}
	prev.next=temp.next;
	}
	void display(){
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+"----->");
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		DeleteValueLL dll = new DeleteValueLL();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		dll.display();
		System.out.println("\nAfter deleting value:");
		dll.deleteValue(30);
		dll.display();
	}
}