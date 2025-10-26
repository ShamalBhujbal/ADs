// Calculate the sum of all array elements. Solve this problem using iterative and recursion method 
// Testcase1: 
// Input: [1, 2, 3, 4, 5] 
// Expected Output: 15
import java.util.Scanner;
class ArraySum{
	
	static int arrSum(int arry[],int i){
		int sum=0;
		if(i == arry.length)
			return 0;
		else{
		    return arry[i]+arrSum(arry,i+1);
		}
		//return sum;
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("ENTER How many nUMBERS you want in array:");
	int n= sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter "+n+" array elements");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<n;i++){
		sum+=arr[i];
	}
	System.out.println("Array sum is:"+sum);
	
	System.out.println("Array sum  Using Recursion is:");
	int arry[] = {10,20,30};
	 int result = arrSum(arry,0);
	 System.out.println(result);
	}
}