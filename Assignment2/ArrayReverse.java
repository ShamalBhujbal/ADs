// Print array elements in reverse order. 
// Testcase1: 
// Input: [1, 2, 3, 4, 5] 
// Expected Output: [5, 4, 3, 2, 1] 
// Testcase2: 
// Input: [-1, 2, -3, 4, -5] 
// Expected Output: [-5, 4, -3, 2, -1]
import java.util.Scanner;
           
class ArrayReverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Array elements");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter "+n+"arry elemnts");
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		System.out.println(" array :");
		for(int ar : arr){
			System.out.print(ar+" ");
		}
		System.out.println("Reverse array :");
		for(int i=arr.length-1;i>=0;--i){
			System.out.print(arr[i]+" ");
		}
	}
}