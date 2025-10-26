import java.util.*;
class Prime{
	// static boolean isPrime(int number){
		// if(n <= 2)
			// return;
	    // if(n % i == 0)
			// return false;
		// if(i * i > n){
			
		// }
		// }
		
	// }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			if(n % i == 0)
			{
				count++;
			}
		}
		if(count <= 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime");
		
	}
}