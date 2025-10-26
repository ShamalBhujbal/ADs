// Q1. Bubble Sort 
// Write a program to implement Bubble Sort on an integer array. 
// Test Cases: 
// • Input: [5, 2, 9, 1, 5, 6] → Output: [1, 2, 5, 5, 6, 9] 
// • Input: [3, 2, 1] → Output: [1, 2, 3] 
// • Input: [1, 2, 3] → Output: [1, 2, 3]

class BubbleSort{
	static void bubbleSort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			for(int j =0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	static void display(int arr[]){
		for(int ar : arr)
			System.out.print(ar+" ");
	}
	public static void main(String args[]){
		int arr[]={5, 2, 9, 1, 5, 6};
		display(arr);
		System.out.println("\nAfter Bubble Sorting :");
		bubbleSort(arr);
		display(arr);
	}
}