// Count even and odd elements in an array. 
// Testcase1: 
// Input: [1, 2, 3, 4, 5, 6] 
// Expected Output: Even: 3, Odd: 3 
// Input: [2, 4, 6, 8] 
// Expected Output: Even: 4, Odd: 0 
import java.util.Scanner;
class EvenOddArray{
	public static void main(String args[]){
		int arr[]={10,11,12,13,14,15,16,17,18,19,20,21};
		int evCount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 == 0)
			{
				evCount++;
			}
			else{
				oddCount++;
			}
		}
	System.out.println("Even Numbers: "+evCount+" Odd Numbers: "+oddCount);
	}
}