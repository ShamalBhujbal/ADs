// 8. First Non-RepeatedCharacter 
// Problem: Write a Java program to find the first non-repeated character in a string. 
// Test Cases: 
// Input: "stress" 
// Output: 't' 
// Input: "aabbcc" 
// Output: null
import java.util.*;
class NonRepeatedCharacter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int count =0;
		System.out.println("Enter string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			for(int j =0;j<str.length();j++){
				if(str.charAt(i)==ch)
				{
				   count++;	
				}
			}
		}
		if(count<0)
		{
			System.out.println(str.charAt(i));
		}else
			System.out.println("null");
		
	}
}