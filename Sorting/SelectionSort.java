class SelectionSort{
	static void selectionSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] < arr[min]){
					min=j;
				}
			}
			int temp = arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
		}
	}
	static void display(int arr[]){
		for(int ar : arr){
			System.out.print(ar+" ");
		}
	}
	public static void main(String args[]){
		int arr[] = {11,25,22,64,10};
		display(arr);
		System.out.println("After selection sort:");
		selectionSort(arr);
		display(arr);
	}
}