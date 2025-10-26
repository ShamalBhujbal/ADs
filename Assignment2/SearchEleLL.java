// Search for an element in a LinkedList. 
// Testcase: 
// Existing LinkedList: [10, 20, 30, 40] 
// Element to search: 30 
// Expected Output: Element found at index 2 
class SearchEleLL{
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
	void search(int key){
		Node temp =head;
		int i=1;
		while(temp.data != key){
			temp=temp.next;
			i++;
		}
		System.out.println("Element found at"+i);
	}
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+"----->");
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		SearchEleLL s = new SearchEleLL();
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insert(50);
		s.display();
		System.out.println("Searching 30");
		s.search(30);
		
	}
}