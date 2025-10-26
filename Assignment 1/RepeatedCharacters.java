// Find RepeatedCharacters in a String 
// Problem: Write a Java program to find all repeated characters in a string. 
// Test Cases: 
// Input: "programming" 
// Output: ['r', 'g', 'm'] 
// Input: "hello" 
// Output: ['l'] 
import java.util.*;
		// static void repeated(String str){
			// if(str.length() <=1 || str == null)
			// //	System.out.print(str.charAt());
			// else
				// for(int i =0;i<str.length();i++){
				// char ch = str.charAt(i);
				// }
			    
			
		// }
class RepeatedCharacters{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String do u want:");
		String str = sc.nextLine().toLowerCase();
		System.out.println("Repeated characters:");
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int count=0;
			
			for(int j =0;j<str.length();j++){
			if(str.charAt(j)==ch){
				count++;
			}
		}
		if(count >1 && str.indexOf(ch)==i){
			System.out.println(ch+" ");
		}
		}
		
	}
}