class MergeSort{
	static void mergeSort(int arr[],int l,int r){
		if(l < r){   //44 55 11 89 23 21 60 77 88 // 0 <9
			int mid = (l+(r-l)/2);//0+(9-0)/2 = 4.5 = 4 23 44 55 11 89
			mergeSort(arr,l,mid); //left side partition 
			mergeSort(arr,mid+1,r);//right side partition.
			merge(arr,l,mid,r);//function used to merge left and right arrays.
		}
	}
	static void merge(int arr[],int l,int mid,int r){
		//1:find left side
		int n1 = mid-l+1;//No of left subtree ele
		int n2 = r-mid;//No of right subtree ele
		int lsub[] = new int[n1];//creating array to store left subtree
		int rsub[] = new int[n2];
		
		for(int i=0;i<n1;i++){
			lsub[i]= arr[l+i];
		}
		for(int j =0;j<n2;j++){
			rsub[j]=arr[mid+1+j];
		}
		int i=0,j=0;
		int k = l;
		while(i < n1 && j < n2){
			if(lsub[i] <= rsub[j])
			{
				arr[k] = lsub[i];
				i++;
			}else{
				arr[k] = rsub[j];
			    j++;
		 	}
	
		 k++;
	}
		 while(i < n1)
		 {
			 arr[k]=lsub[i];
			i++;
			k++;
		 }
		 while(j < n2)
		 {
			 arr[k]=rsub[j];
			 j++;
			 k++;
		 }
	}	
	static void display(int arr[]){
		for(int ar : arr){
			System.out.print(ar+" ");
		}
	}
	public static void main(String args[]){
		int arr[] = {44,55,11,89,23,21,60,77,88};
		int n = arr.length;
		display(arr);
		mergeSort(arr,0,n-1);
		System.out.println("After Merge sort:");
		display(arr);
	}

}