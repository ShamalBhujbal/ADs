class QueueUisngLL{
	int f,r;
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	QueueUisngLL(){
		f=-1;
		r=-1;
	}
	boolean isEmpty(){
		return(head == null);
	}
	void enQueue(int data){
		Node newnode = new Node(data);
		if(head == null){
		head = newnode;
		return;//10 
		}
		Node curr = head;
		while(curr.next != null)
		{
			curr = curr.next;
		}
		curr.next=newnode;
	}
	void deQueue(){
		if(isEmpty()){
			System.out.println("Queue is Empty !!");
			return;
		}else{
			Node temp =head;
			Node prev= null;
			while(temp.next != null){
				prev=temp;
				temp=temp.next;
			}
			prev.next=null;
			temp=null;
		}
	}
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}	
	public static void main(String args[]){
		QueueUisngLL ql = new QueueUisngLL();
		ql.enQueue(10);
		ql.enQueue(20);
		ql.enQueue(30);
		ql.display();
		
	}
	
}