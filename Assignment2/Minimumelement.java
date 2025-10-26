 // Find the minimumelement in an array. 
// Testcases1: 
// Input: [15, 8, 22, 5, 19] 
// Expected Output: 5 
// Testcase2: 
// Input: [-4, -15, -7, -2, -30] 
// Expected Output: -30
import java.util.Scanner;
class Minimumelement{
	// Recursive function to find minimum
    public static int findMin(int arr[], int n) {
        // Base case: only one element
        if (n == 1) {//n==0
            return arr[0];
        }

        // Recursive case: find min of first (n-1) elements
        int prevMin = findMin(arr, n - 1);

        // Compare last element with previous min
        if (arr[n - 1] < prevMin) {
            return arr[n - 1];
        } else {
            return prevMin;
        }
    }

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of arrayElements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter"+n+" elements in array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<n;i++){
			
			if(arr[i] < min)
				min=arr[i];
		}
		System.out.println("Minimum elements in array is:"+min);
		System.out.println("Min element using Recursive:");
		int n = arr.length;
		int min = findMin(arr, n);
		 System.out.println("Minimum: " + min);
	}
}