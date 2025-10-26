 // Delete the first node of a LinkedList 
// Testcase: 
// Existing LinkedList: [10, 20, 30, 40] 
// Expected Output: LinkedList: 20 → 30 → 40 

class DeleteFirstLL{
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
	void deleteFirst(int key){
		Node temp=head;
		if(temp != null && temp.data == key)
		{
			temp=temp.next;
			head = temp;
		}
	}
	void display(){
		Node temp=head;
		while(temp != null){
			System.out.print(temp.data+"----->");
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		DeleteFirstLL df = new DeleteFirstLL();
		df.insert(10);
		df.insert(20);
		df.insert(30);
		df.insert(40);
		df.insert(50);
		df.display();
		System.out.println();
		System.out.println("After deleting first element:");
		df.deleteFirst(50);
		df.display();
	}
}