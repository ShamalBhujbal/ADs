class InsertionSort{
	static void insertionSort(int arr[])
	{//12,11,13,5,6
	//  j   i(k)
		for(int i=1;i<arr.length;i++){
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key){ //j index   arr[j]=value
				arr[j+1]=arr[j];//j 5k 11,12 13,6
				j=j-1;           //j      13
			}
			arr[j+1]=key;
		}
	}
	static void display(int arr[]){
	for(int ar : arr){
		System.out.print(ar+" ");
	}
	}
	public static void main(String args[]){
		int arr[]={12,11,13,5,6};
		display(arr);
		System.out.println("After Insertion sort:");
		insertionSort(arr);
		display(arr);
	}
}