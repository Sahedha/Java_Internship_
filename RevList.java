//  🔹Reverse a list without using  Collections.reverse() --> Using Loop and swap

import java.util.*;
class RevList{
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
		System.out.println("Before Reversing a List: "+li);
		System.out.println("After Reversing a list: "+ reverse(li,n));
	}
	public static List<Integer> reverse(List<Integer> li, int n){
		int i=0, j=n-1;
		while(i<j){
			int temp=li.get(i);
			li.set(i, li.get(j));
			li.set(j, temp);
			
			i++; j--;
		}
		return li;
	}
}

//Output: 
/*	D:\Java_FullStack_Internship>javac RevList.java

	D:\Java_FullStack_Internship>java RevList
	Enter no.of elememts:
	6
	Enter list elements:
	1 2 3 4 5 6
	Before Reversing a List: [1, 2, 3, 4, 5, 6]
	After Reversing a list: [6, 5, 4, 3, 2, 1]   */