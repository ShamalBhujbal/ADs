// Copy elements of one array into another. 
// Testcase: 
// Input: Source Array: [1, 2, 3, 4, 5] 
// Expected Output: Destination Array: [1, 2, 3, 4, 5]
class Copy_Array{
	public static void main(String args[]){
		int arr1[]={10,11,12,13,14,15,16,17,18,19,20,21};
		int size = arr1.length;
		int arr2[]=new int[size];
		for(int i=0;i<size;i++){
			arr2[i]=arr1[i];
		}
		for(int ar : arr2){
			System.out.print(ar+" ");
		}
		
	}
}