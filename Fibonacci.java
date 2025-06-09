//Fibonacci Series

import java.util.*;
class Fibonacci{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int a=0, b=1;
		int c=0;
		for(int i=2;i<=n;i++){
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(n+"th Fibonacci number is: "+c);
	}
}

/*OutPut:
D:\Java_FullStack_Internship>javac Fibonacci.java

D:\Java_FullStack_Internship>java Fibonacci
Enter number:
6
6th Fibonacci number is: 8
*/