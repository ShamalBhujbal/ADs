class StackUsingLL{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	StackUsingLL(){
		Node head = null; // Assigning first Node as head as null in constructor 
	}
	boolean isEmpty(){
		return (head == null);
	}
	void push(int data){
		Node newnode = new Node(data);
		newnode.next=head;
		head=newnode;
	}
	void pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow !!");
			return;
		}else{
			Node temp = head;
			head = head.next;
			temp.next=null;
			temp=null;
		}
	}
	int peek(){
		if(!isEmpty()){
			return head.data;
		}else{
		System.out.println("Stack is Empty !!");
		}
	return -1;
	}
	void display(){
		Node temp =head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		StackUsingLL sl = new StackUsingLL();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		System.out.println("\nPeek of the stack :"+sl.peek());
		sl.display();
		System.out.println("\nAfter Pop !!");
		sl.pop();
		sl.display();
		System.out.println("\nPeek of the stack :"+sl.peek());
	}
	
}