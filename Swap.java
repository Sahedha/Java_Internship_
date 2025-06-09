//Swapping two numbers using Temporary variable

import java.util.*;
class Swap{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter Value of b: ");
		int b=sc.nextInt();
		System.out.println("Before Swapping a : " +a+ "	b : "+b);
		swap(a,b);
	}
	public static void swap(int x,int y){
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println("Before Swapping a : " +x+ "	b : "+y);
	}
}

/*Output:
D:\Java_FullStack_Internship>java Swap
Enter Value of a:
5
Enter Value of b:
6
Before Swapping a : 5   b : 6
Before Swapping a : 6   b : 5

*/