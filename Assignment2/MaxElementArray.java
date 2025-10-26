// Find the maximum element in an array.
// solve this problem using iterative and recursion method
//Testcase1: 
// Input: [10, 25, 47, 3, 19] 
// Expected Output: 47 
// Testcase2: 
// Input: [-5, -10, -3, -20, -7] 
// Expected Output: -3 
import java.util.Scanner;
class MaxElementArray{
	
	// Recursive function to find maximum
    public static int findMax(int arr[], int n) {
        // Base case: only one element
        if (n == 1) {
            return arr[0];
        }

        // Recursive case: find max of first (n-1) elements
        int prevMax = findMax(arr, n - 1);

        // Compare last element with previous max
        if (arr[n - 1] > prevMax) {
            return arr[n - 1];
        } else {
            return prevMax;
        }
    }

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element do u want in array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max=0;
		System.out.println("Enter "+n+"elements in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i] > max){
				max=arr[i];
			}
		}
		System.out.println("Max element is:"+max);
		System.out.println("Max element using Recursive:");
		int n = arr.length;
		int result=findMax(arr,n);
		System.out.println("Maximum:"+result);
		
	}
}