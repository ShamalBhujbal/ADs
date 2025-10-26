// . Check if a string of parentheses is balanced using a stack. 
// Example: "({[]})" → Balanced. 
class ParentheseseBalance{
	static final int Max = 5;
	char arr[] = new char[Max];
	int top;
	ParentheseseBalance(){
		top=-1;
	}
	boolean isEmpty(){
		return(top == -1);
	}
	boolean isFull(){
		return(top == Max-1);
	}
	void push(char c){
		if(isFull()){
			System.out.println("Stack is Overflow !!");
			return;
		}
			arr[++top] =c;
	}
	char pop(){
		if(isEmpty()){
			System.out.println("Stack underflow !!");
			return '\0';
		}
		return arr[top--];   
	}
	boolean isMatching(char open,char close){
		return (open == '(' && close == ')') ||
		       (open == '{' && close == '}') ||
			   (open == '[' && close == ']') ;
	}
	boolean isBalance(String str){
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c == '(' || c == '{' || c=='['){
				push(c);
			}else if(c == ')' || c=='}' || c==']'){
				if(isEmpty() || !isMatching(pop(),c)){
					return false;
				}
			}
		}
		return isEmpty();
	}
	public static void main(String args[]){
		ParentheseseBalance stack = new ParentheseseBalance();
		String input = "({[]})";
		if(stack.isBalance(input)){
			System.out.println(input+" -->Balanced ");
		}else{
			System.out.println(input+"---->Not balance");
		}
	}
}