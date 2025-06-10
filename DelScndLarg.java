// 🔹 Find the second largest element in a list using  Sort or traverse twice

import java.util.*;
class DelScndLarg{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elememts:");
		int n=sc.nextInt();
		List<Integer> li=new ArrayList<>();
		System.out.println("Enter list elements:");
		for(int i=0;i<n;i++){
			int num=sc.nextInt();
			li.add(num);
		}
		delEle(li,n);
	}
	public static void delEle(List<Integer> li, int n){
		li.sort(null);
		int ele = li.remove(n-2);
		System.out.println("The 2nd largest element in list is : "+ele);
	}
} 
		
//Output:
/*	D:\Java_FullStack_Internship>javac DelScndLarg.java

	D:\Java_FullStack_Internship>java DelScndLarg
	Enter no.of elememts:
	6
	Enter list elements:
	2 5 1 8 3 9
	The 2nd largest element in list is : 8	*/