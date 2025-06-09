//Prime Or Not 
import java.util.*;
class PrimeOrNot{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int c=1;
		for(int i=2;i<n;i++){
			if(n%i == 0){
				c++;
			}
		}
		if(c>2){
			System.out.println(n+" is Not a Prime Number.");
		}
		else{
			System.out.println(n+" is a Prime Number.");
		}
	}
}


/*OutPut: 
D:\Java_FullStack_Internship>javac PrimeOrNot.java

D:\Java_FullStack_Internship>java PrimeOrNot
Enter Number:
12
12 is Not a Prime Number.

D:\Java_FullStack_Internship>java PrimeOrNot
Enter Number:
17
17 is a Prime Number.

*/