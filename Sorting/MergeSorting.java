class MergeSorting{
	static void mergeSort(int arr[],int l,int r){
		if(l < r){
			int mid = l+(r-l)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	static void merge(int arr[],int l,int mid,int r){
		int n1 = mid-l+1; // number of elements in left part
		int n2 = r-mid;//number of elements in right part.
		
		int L[]=new int[n1];
		int R[]= new int[n2];
		
		for(int i=0;i<n1;i++){
			L[i]=arr[l+i];//copies elemets from original array till ith location
		}
		for(int j=0;j<n2;j++){
		   R[j]=arr[mid+1+j]; //copies the right array from origanal are from mid+1 +j th location
		}
		int i=0,j=0;
		int k =l;
		while(i < n1 && j < n2){
			if(L[i] <= R[j]){
				arr[k]=L[i];
				i++;
			}
			else{
				arr[k]=R[j];
				j++;
			}
		 k++;
        while(i<n1){
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j <n2){
			arr[k] = R[j];
			j++;
			k++;
		}	
		}
	}
	static void display(int arr[]){
		for(int ar : arr){
			System.out.print(ar+" ");
		}
	}
	public static void main(String args[]){
		int arr[] = {44,11,9,55,6,35,80,99,23};
		int n= arr.length;
		display(arr);
		System.out.println("After sorting !!");
		mergeSort(arr,0,n-1);
		display(arr);
		
	}
}