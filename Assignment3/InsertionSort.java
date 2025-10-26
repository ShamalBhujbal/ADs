// Q2. InsertionSort 
// Implement Insertion Sort to arrange elements in ascending order. 
// Test Cases: 
// • Input: [12, 11, 13, 5, 6] → Output: [5, 6, 11, 12, 13] 
// • Input: [4, 3, 2, 10, 12] → Output: [2, 3, 4, 10, 12]
class InsertionSort{ //best case TC: 0(n) ,worst caste o(n^2)
	static void insertionSort(int arr[]){
		int n = arr.length;
		for(int i=1;i<n;i++){
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key){
				arr[j+1]=arr[j];//arr[j] means value
				j= j-1; //j means indexx
			}
			arr[j+1]=key;
		}
	}
	static void display(int arr[]){
		for(int ar : arr)
			System.out.print(ar+" ");
	}
	public static void main(String args[]){
		int arr[]={12, 11, 13, 5, 6};
		System.out.println("\nBefore Insertion sort:");
		display(arr);
		System.out.println("\nAfter Insertion sort:");
		insertionSort(arr);
		display(arr);
	}
}