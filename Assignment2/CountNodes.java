// Count the total number of nodes in a LinkedList. 
// Testcase: 
// Existing LinkedList: [10, 20, 30, 40] 
// Expected Output: Total nodes: 4
class CountNodes{
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
	void count(){
		Node temp =head;
		int count=0;
		if(temp == null){
			System.out.println("Empty LinkedList:");
			return;
		}
		while(temp != null){
			count++;
			temp=temp.next;
		}
		System.out.println("Number of nodes in Linkedlist is:"+count);
	}
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+"----->");
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		CountNodes s = new CountNodes();
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insert(50);
		s.display();
		System.out.println("Count of nodes");
		s.count();
		
	}
}