// Q5. QuickSort 
// Implement Quick Sort using the last element as the pivot. 
// Test Cases: 
// • Input: [10, 7, 8, 9, 1, 5] → Output: [1, 5, 7, 8, 9, 10] 
// • Input: [1, 1, 1, 1] → Output: [1, 1, 1, 1] 

class QuickSort{
	static void quickSort(int arr[],int l,int h){
		if(l < h){
			int pi = partition(arr,l,h);
			quickSort(arr,l,pi-1);
			quickSort(arr,pi+1,h);
		}
		
	}
	static int partition(int arr[],int l,int h){
		int pivot = arr[h];
		int i = l-1;
		for(int j=l;j<=h-1;j++){
			if(arr[j] < pivot){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,h);
		return i+1;	
	}
	static void swap(int arr[],int i,int j){
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void display(int arr[]){
		for(int ar : arr)
			System.out.print(ar+" ");
	}
	public static void main(String args[]){
		int arr[] = {10, 7, 8, 9, 1, 5};
		int n = arr.length;
		System.out.println("\nBefore sorting :");
		display(arr);
		System.out.println("\nAfter sorting :");
		quickSort(arr,0,n-1);
		display(arr);
	}
}