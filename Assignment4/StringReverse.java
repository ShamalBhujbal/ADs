 // Reverse a string using stack. 
class StringReverse{
	   int max;
	   char arr[];
	   int top;
	   StringReverse(int size){
		   max=size;
		   arr=new char[max];
		   top =-1;
	   }
	   boolean isEmpty(){
		   return(top == -1);
	   }
	   boolean isFull(){
		   return(top == max-1);
	   }
	   void push(char c){
		   if(isFull()){
			   System.out.println("Stack Overflow !!");
			   return ;
		   }else
		   {
			   arr[++top]=c;
		   }
	   }
	   char pop(){
		   if(isEmpty()){
			   System.out.println("Stack underflow!!");
			   return '\0';
		   }else{
			 //  char c = arr[top];
			  return arr[top--];
		   }
	   }
	  void reverse(String str){
		  for(int i=0;i<str.length();i++){
			push(str.charAt(i));
		   }
			String result=" ";
			while(!isEmpty()){
				result+=pop();
			}
		return result;
		  }
	  
	 public static void main(String args[]){
		 String input = "Shamal";
		 StringReverse stack = new StringReverse(input.length());
         String rev = stack.reverse(input);
		 System.out.println("Original :"+input);
		 System.out.println("Reverse :"+rev);
		 
	 }
 }