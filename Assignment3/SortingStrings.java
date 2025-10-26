// Q6. SortingStrings (Lexicographic Order) 
// Write a program to sort an array of strings using any sorting algorithm. 
// Test Cases: 
// • Input: ["apple", "banana", "cherry", "date"] → Output: ["apple", "banana", 
// "cherry", "date"] 
class SortingStrings{
	static void sort(String arr[],int n){
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	static void display(String arr[]){
		for(String ar : arr)
			System.out.print(ar+" ");
	}
	public static void main(String args[]){
		String arr[] = {"cherry", "banana","apple", "date"};
		int n = arr.length;
		System.out.println("Before sorting !!");
		display(arr);
		System.out.println("After sorting !!");
		sort(arr,n);
		display(arr);
	}
}