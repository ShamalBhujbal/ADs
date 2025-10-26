// DisplayDuplicate elements from an array. 
// Testcase1: 
// Input: [1, 2, 3, 4, 2, 5, 1] 
// Expected Output: 1, 2 
// Testcase2: 
// Input: [10, 20, 30, 40, 50] 
// Expected Output: No duplicates found
import java.util.Scanner;
class DisplayDuplicate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many array elemnts do u want:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter "+n+" elements in array:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		boolean found = false;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
					found = true;
					break;
				}
			}
		}
		if(!found)
		  System.out.println("No duplicate Found !!");
	}
 }