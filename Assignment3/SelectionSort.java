// Q3. SelectionSort 
// Sort an array using Selection Sort. 
// Test Cases: 
// • Input: [64, 25, 12, 22, 11] → Output: [11, 12, 22, 25, 64] 
// • Input: [29, 10, 14, 37, 13] → Output: [10, 13, 14, 29, 37] 

class SelectionSort{
	static void selectionSort(int arr[]){
		int n = arr.length;
        for(int i=0;i<n-1;i++){
			int min = i;//index
			for(int j=i+1;j<n;j++){
				if(arr[j] < arr[min]){
				 min=j;//index
				}
			}
			int temp =arr[i];
			arr[i]=arr[min];
			arr[min] = temp;
		}		
	}
	static void display(int arr[]){
		for(int ar : arr)
			System.out.print(ar+" ");
	}
	public static void main(String args[]){
		int arr[]={64, 25, 12, 22, 11};
		System.out.println("\nBefore sorting");
		display(arr);
		System.out.println("\nAfter selection sorting");
		selectionSort(arr);
		display(arr);
	}
}