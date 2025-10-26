 // 4. FibonacciSeries 
// Problem: Write a Java program to print the first n numbers in the Fibonacci series. 
// Test Cases: 
// Input: n = 5 
// Output: [0, 1, 1, 2, 3] 
// Input: n = 8 
// Output: [0, 1, 1, 2, 3, 5, 8, 13]
import java.util.Scanner;
class FibonacciSeries{
	static int fibo(int number){
		if(number==0)
		{
		return 0;	
		}
		if(number==1)
		{
		return 1;	
		}
		return fibo(number-1) + fibo(number-2);
		
	 }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int a =0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++)
		{
			
			c = a+b;
			a=b;
			b=c;
			System.out.print(" "+c+" ");
			
		}
		System.out.println("Using recursion");
		System.out.println("Enter Number");
		int number = sc.nextInt();
		for(int i=0;i<number;i++){
			System.out.print(fibo(i)+" ");
		}
		   
	}
}