class DoublyLinkedlist{
	Node head;
	static class Node{
		int data;
		Node prev=null;
		Node next=null;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}//create node
	void insert(int data){
		Node newnode= new Node(data);
		newnode.next=head;
		if(head != null)
		{
		  head.prev=newnode;
		}
		head=newnode;
	}
	void insertAfter(Node prev_node,int data){
		Node temp=head;
		Node newnode = new Node(data);
		if(prev_node == null){
			System.out.println("Insertion not possible:");
			return;
		}else
		{
			newnode.next=prev_node.next;
			prev_node.next=newnode;
			newnode.prev=prev_node;
			if(newnode.next != null)
			  newnode.next.prev=newnode;
		}	
	}
	void insertLast(int data){
		Node temp = head;
		Node newnode = new Node(data);
		newnode.next=null;
		while(temp.next != null){
			temp=temp.next;
		}
		temp.next=newnode;
		
	}
	void display(){
		Node temp=head;
		while(temp != null)
		{
			System.out.print(temp.data+"<---->");
			temp=temp.next;
		}
	}
	void displayLast(){
		Node temp=head;
		Node last = null;
		while(temp != null){
			last = temp;
			temp=temp.next;
		}
		System.out.println("Backward display !!");
		while(last != null)
		{
			System.out.print(last.data+"<-------->");
			last=last.prev;
		}
	}
	void deleteNode(Node del){
		Node temp=head;
		if(temp == null && del == null ){
			return;
		}
		if(temp == del){
			head=temp.next;
		}
		if(del.next != null){
			del.next.prev = del.prev;
		}
		if(del.prev != null){
			del.prev.next=del.next;
		}
		return;
	}
	public static void main(String[] args)
	{
		DoublyLinkedlist dll = new DoublyLinkedlist();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.displayLast();
		
		System.out.println("Insert After operation...!!");
		System.out.println("---------------------------");
		dll.display();
		dll.insertAfter(dll.head,15);
		System.out.println("---------------------------");
		dll.display();
		dll.insertLast(100);
		System.out.println("---------------------------");
		dll.deleteNode(dll.head.next);
		System.out.println("---------------------------");
		dll.display();
		//System.out.println("Insert Last operation...!!");
		//dll.display();
		
	}
}