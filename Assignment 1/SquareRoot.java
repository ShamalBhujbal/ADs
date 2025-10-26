// . Find SquareRoot 
// Problem: Write a Java program to find the square root of a given number (using 
// integer approximation). 
// Test Cases: 
// Input: x = 16 
// Output: 4 
// Input: x = 27 
// Output: 5
import java.util.*;
class SquareRoot{
	static int SquareRoot(int num,int i){
		    if(i*i=num){
				return i;
			}
			if(i * i > n){
				return -1;
			}
			return SquareRoot(num,i+1);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		for(int i=1;i<=n/2;i++){
			int temp =i;
			if(i * i == n)
				System.out.println("Square Root of :"+n+" is: "+i);
		}
}
}
