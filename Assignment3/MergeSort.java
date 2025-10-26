// Q4. MergeSort 
// Write a recursive program to implement Merge Sort. 
// Test Cases: 
// • Input: [38, 27, 43, 3, 9, 82, 10] → Output: [3, 9, 10, 27, 38, 43, 82] 
// • Input: [5, 4, 3, 2, 1] → Output: [1, 2, 3, 4, 5]

class MergeSort{
	static void mergeSort(int arr[],int l,int r){
		if(l < r){
			int mid = l+(r-l)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	static void merge(int arr[],int l,int mid,int r){
		int n1 = mid-l+1; //finding total no of elem in left side
		int n2 = r-mid; //finding total no of elem in right side;
		
		int L[]= new int[n1];//creating array to store left side values.
		int R[]=new int[n2];//creating array to store right side values.
		
		for(int i=0;i<n1;i++){
			L[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++){
			R[j]=arr[mid+1+j];
		}
		int i=0,j=0;
		int k =l;
		while(i < n1 && j < n2){
			if(L[i] <= R[j]){
				arr[k]=L[i];
				i++;
			}else{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i < n1){
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k]=R[j];
			j++;
			k++;
		}
		
	}
	static void display(int arr[]){
		for(int ar : arr)
			System.out.print(ar+" ");
	}
    public static void main(String args[]){
		int arr[] = {38, 27, 43, 3, 9, 82, 10};
		int n = arr.length;
		System.out.print("\nBefore Merge sort:");
		display(arr);
		
		System.out.print("\nAfter Merge sort:");
		mergeSort(arr,0,n-1);
		display(arr);
	}	
}