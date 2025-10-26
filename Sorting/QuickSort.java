class QuickSort{
	static void quickSort(int arr[],int l,int h){
		if(l<h){ //{20,2,7,12,15,1,6,8}; 8 0<7
			int pi = partition(arr,l,h);
			//pi 
			quicksort(arr, l, pi-1);
			quickSort(arr,pi+1,h);
		}
	}
	static int partition(int arr[],int l,int h){//0,7
		int pivote = arr[h];//pi = 8
		int i = (l-1);//-1
		for(int j=l;j<=h-1;j++){ //j =0 1 2
			if(arr[j] < pivote){// 20 < 8 2 < 8 7<8 
				i++;//0 ->20 
				swap(arr,i,j);//20 ->2 //2,20,7,12,15,1,6,8     2,7,20,12,15,1,6,8
			}                          //i  i++               //   i  
		}
		swap(arr,i+1,h); //pivote place milega
		return i+1;
	}
	static void swap(int arr[],int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	static void display(int arr[]){
		for(int ar : arr){
			System.out.print(ar+" ");
		}
	}
	public static void main(String args[]){
		int arr[] = {20,2,7,12,15,1,6,8};
		int n = arr.length;
		display(arr);
		System.out.println("After sorting");
		quickSort(arr,0,n-1);
		display(arr);
	}
}