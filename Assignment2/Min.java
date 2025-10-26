//find the min element in an array
public class Min
{
	static public int minEl(int arr[] , int n)
	{// {-2,4,6,-7,2,0};
		if(n==0){
			return -1;//
		}
		if (n==1)//false
		{
			return arr[0];
		}
		int min = minEl( arr, n-1);//0
		
		if(arr[n-1] < min) 
			return arr[n-1];
		return min;
	}
	
	    // int arr[] = {10, 25 , 47 , 3, 19};    5
		// int arr[] = {10, 25 , 47 , 3};		  4
		// int arr[] = {10, 25 , 47 };			  3
		// int arr[] = {10, 25  };				  2	
		// int arr[] = {10};					  1
	/*
	{-2,4,6,-7,2,0};
	int min = arr[0];
	for(int i = 0 ; i<n;i++)
	{
		if(arr[i]< min)
		{
			min = arr[i];
		}
	
	return min;
	*/
	
	public static void main(String [] args)
	{
		int arr[] = {-2,4,6,-7,2,0};
		int n = arr.length;
		minEl(arr ,  n);
		int result = minEl(arr ,  n);
		if(result == -1){
			System.out.println("Array is empty:");
		}
		System.out.println(result);
	}
}