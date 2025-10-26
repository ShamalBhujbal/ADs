import java.util.Scanner;
class  ArmstrongNumber{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any Number:");
	int n = sc.nextInt();//153
	int temp = n;//153
	int armNum=0;
	int i=0;
	while(n>0)//153  // 15 // 1
	{  
		int rem = n % 10;//3  5  1 
	     armNum = armNum+(rem*rem*rem);//0+=3*3*3 = 27+= 5*5*5= 125+27 = 152 152+=1=153
	    n = n/10;//153 / 10 = 15 //10/10 =1
		//i++;
	}
	if(temp == armNum){
	 System.out.println("Armstrong Number is:"+armNum);
	}
	else{
		System.out.println("Not Armstrong Number:"+temp);
	}
	}
}
