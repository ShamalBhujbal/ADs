// 5. FindGCD 
// Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two 
// numbers. 
// Test Cases: 
// Input: a = 54, b = 24 
// Output: 6 
// Input: a = 17, b = 13 
// Output: 1
import java.util.*;
class FindGCD {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number:");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		int n2 = sc.nextInt();
		 int max =1;
		for(int i=1;i<n1 && i<n2;i++){
			if(n1 % i== 0 && n2 % i == 0)
			{  
				max=i;
			}
		}
		System.out.println(max);
	}
}