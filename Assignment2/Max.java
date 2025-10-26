/*1. Find the maximum element in an array. Solve this problem using iterative and recursion method
Testcase1:
Input: [10, 25, 47, 3, 19]
Expected Output: 47
Testcase2:
Input: [-5, -10, -3, -20, -7]
Expected Output: -3 */

public class Max
{
	static public int maxElem(int arr[] , int n)
	{
		if(n==0)
		{
			return -1;
		}
		if(n==1)
		{
			return arr[0];
		}
		int max = maxElem(arr , n-1);
		
		if (arr [n-1] > max)
		{
			return arr[n-1];
		}
		return max;
	}
	/*
	static public int maxElem(int arr[] )
	{
		int n =arr.length;
		int max= arr[0];
		for(int i = 0 ; i< n-1 ; i++)
		{
			if(arr[i] > max )
				max = arr[i];
				return max;
		}
		return max;
	}
	*/
	public static void main(String [] args)
	{
		//int arr[] = {10, -25 , 47 , -3, 19};
		int arr[] = {};
		int n = arr.length;
		int result = maxElem(arr , n);
		if(result == -1){
			System.out.println("Array is empty:");
		}
		System.out.println(result);
	
		
	}
}
// Testcase 1: Positive Numbers

// Input: [15, 8, 22, 5, 19]

// Expected Output: 5

// Testcase 2: Negative Numbers

// Input: [-4, -15, -7, -2, -30]

// Expected Output: -30

// Testcase 3: Mixed Positive & Negative

// Input: [10, -20, 30, -5, 25]

// Expected Output: -20

// Testcase 4: All Same Elements

// Input: [7, 7, 7, 7, 7]

// Expected Output: 7

// Testcase 5: Single Element

// Input: [42]

// Expected Output: 42

// Testcase 6: Sorted Ascending

// Input: [1, 2, 3, 4, 5]

// Expected Output: 1

// Testcase 7: Sorted Descending

// Input: [50, 40, 30, 20, 10]

// Expected Output: 10

// Testcase 8: Large Values

// Input: [999999, 123456, 987654, 111111]

// Expected Output: 111111

// Testcase 9: Includes Zero

// Input: [0, 5, -1, 10]

// Expected Output: -1

// Testcase 10: Edge Case – Empty Array

// ⚠️ Your code does not handle empty array (n=0).

// Input: []

// Expected Output: Program should throw error or handle gracefully.
// 👉 Suggestion: Add a condition in main() before processing.