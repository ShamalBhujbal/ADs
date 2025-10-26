// Find the average of array elements 
// Testcase1: 
// Input: [10, 20, 30, 40, 50] 
// Expected Output: 30.0 
// Testcase2: 
// Input: [-5, 10, 15, -10, 5] 
// Expected Output: 3.0 
import java.util.Scanner;

class AverageArray{
	// static int findAvg(int arry[],int i){
		// if(arr.length == 0)
			// return;
		// else
			
	// }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many array elements do u want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elemets");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int avg=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			avg = sum/n;
		}
		System.out.println("Average is:"+avg);
	}
	
}