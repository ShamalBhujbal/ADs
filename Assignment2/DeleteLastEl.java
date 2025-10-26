 // Delete the last node of a LinkedList. 
// Testcase: 
// Existing LinkedList: [10, 20, 30, 40] 
// Expected Output: LinkedList: 10 → 20 → 30 
class DeleteLastEl{
	
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
	void deletLast(){
		Node temp=head;
		Node prev=null;
		while(temp.next != null)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		
	}
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data+"----->");
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		DeleteLastEl dl = new DeleteLastEl();
		dl.insert(10);
		dl.insert(20);
		dl.insert(30);
		dl.insert(40);
		dl.insert(50);
		dl.display();
		System.out.println("After deleting last element:");
		dl.deletLast();
		dl.display();
	}
}