import java.util.Scanner;
class ArmstrongNumberRecursion{
	static int NumbCount(int numb){
		if(numb == 0)//
		{
			return 0;	
		}
		int digit = numb%10; //153 %0 = 3
		return (digit * digit * digit)+ NumbCount(numb/10);//15+27
		
		// int count =0;
		
	}

	public static void main(String args[]){
	      ArmstrongNumberRecursion armNo  = new ArmstrongNumberRecursion();
		  //System.out.println("Armstrong number is:"+NumbCount(15));
		  Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Number");	
		 int n = sc.nextInt();		 
		 int result = NumbCount(n);
		 if(n == result){
			 System.out.println("Armstrong number is:");
		 }else
			 System.out.println("Not Armstrong number is:");
	
	}
}
