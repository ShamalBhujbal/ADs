class BubbleSort{
	static void bubbleSort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	static void display(int arr[]){
		for(int ar : arr){
			System.out.print(ar+" ");
		}
	}
	public static void main(String args[]){
		int arr[]={5,8,9,1,2,4,0,8};
		display(arr);
		bubbleSort(arr);
		System.out.println("After sorting:");
		display(arr);
	}
}