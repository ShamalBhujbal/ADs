class HeapSort2{//50,30,40,20,10
	static void heapSort(int arr[]){
		int n = arr.length;//5 //1.5
		for(int i = n/2-1;i>=0;i--){ //get half elements / subtree  the heap 
			heapify(arr,n,i); //check it will follows the max/min heap property or not.
		}
		for(int i=n-1;i>0;i--){  //it swaps the root with the child
			int temp = arr[0];    
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
		//check balance after swapping root with smallest child.
	}
	static void heapify(int arr[],int n ,int i){
		int largest = i;//pos of parent
		int l = 2*i+1;//finds left child //2*1+1=2+1=3
		int r = 2*i+2; ///find right child
		if(l<n && arr[l] > arr[largest])
		{
			largest=l;      
		}
		if(r < n && arr[r] > arr[largest])
		{
			largest=r;
		}
		if(largest != i){  //when root dont have largest value swap it.
			int temp = arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,n,largest);
		}
		
	}
	static void display(int arr[]){
		for(int ar : arr){
			System.out.print(ar+" ");
		}
	}
	public static void main(String args[]){
		int arr[] = {50,30,40,20,10};
		display(arr);
		System.out.print("After Heap sort !!");
		heapSort(arr);
		display(arr);
	}
} 