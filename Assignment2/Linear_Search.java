// Search for an element in the array (linear search). 
// Testcase1: 
// Input: [10, 20, 30, 40, 50], Search Element: 30 
// Expected Output: Element found at index 2
class Linear_Search{
	public static void main(String args[]){
		int arr[]={10,11,12,13,14,15,16,17,18,19,20,21};
		int search = 16;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == search)
			{
				System.out.println("Element found at : "+i);
				break;
			}
		}
	}
}