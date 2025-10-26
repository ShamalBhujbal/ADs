class StackUsingArray{
	static final int Max=5;//in array we defined size
	int s[] = new int[Max];
	int top;
	StackUsingArray(){
		top=-1; //setting top as -1 initially
	}
	boolean isEmpty(){ //cheking for an underflow condition
		return(top == -1);
	}
	boolean isFull(){
		//Cheking overflow conditions
		return (top == Max - 1);
	}
	void push(int x){ //for inserting elem in stack;
		if(isFull()){
			System.out.println("Stack is Full");
			return;
		}else{
			s[++top]=x;
			System.out.println(x+"Inserted into stack");
		}
	}
	int pop(){ //for deleting elem from stack
		if(isEmpty()){
			System.out.println("\nStack Underflow !!");
			return -1;
		}else{
			int x = s[top--];
			//top--;
			System.out.println(x+"Deleted from stack !!");
			return x;
		}
		
	}
	void peek(){
		//it display the top of he
	}
	// void display(){
		// for(int i=0;i<s.length;i++)
			// System.out.print(s[i]+" ");
	// }
	public static void main(String args[]){
		StackUsingArray st = new StackUsingArray();
		System.out.println("\n Push operation!!");
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		//st.display();
		System.out.println("\n after pop operation!!");
		st.pop();
		//st.display();
		st.pop();
		//st.display();
	}
}