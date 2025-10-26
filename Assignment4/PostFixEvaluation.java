// 6. Evaluate a postfix expression using stack. 
// Example: 231*+9- → -4.
class PostFixEvaluation{
	int max = 10;
	int arr[] = new int[max];
	int top;
	PostFixEvaluation(){
		top =-1;
	}
	boolean isEmpty(){
		return (top == -1);
	}
	boolean isFull(){
		return(top == max-1);
	}
	void push(int x){
		if(isFull()){
			System.out.println("stack is overflow !!");
			return;
		}
		arr[++top]=x;
	}
    int pop(){
		if(isEmpty()){
			System.out.println("Stack is underflow !!");
			return 0;
		}
		return (arr[top--]);
	}
	int evaluatePostfix(String str){
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			
			if(Character.isDigit(c)){ //231
				push(c -'0');//converting digit char to in  c-'0' ascii of 0 is 48
			}else{
				int val1 = pop();
				int val2= pop();
				
			switch(c){
				case '+':
				  push(val2 + val1);
				  break;
				case '-':
				  push(val2 - val1);
				break;
				
				case '*':
				   push(val2 * val1);
				break;
				
				case '/':
				   push(val2 / val1);
				break;
			 }
			}
		}
	return pop();
	}
	public static void main(String args[]){
		PostFixEvaluation stack = new PostFixEvaluation();
		String input = "231*+9-";
		System.out.println("Postfix Evaluation of :"+input+"="+stack.evaluatePostfix(input));
	}
}