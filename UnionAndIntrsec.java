// 🔹 Find the union and intersection of two sets Using addAll() and retainAll()

import java.util.*;
class UnionAndIntrsec{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elememts in set1:");
		int n=sc.nextInt();
		System.out.println("Enter no.of elememts in set2:");
		int m=sc.nextInt();
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		System.out.println("Enter Set1 elements: ");
		for(int i=0;i<n;i++){
			int num=sc.nextInt();
			set1.add(num);
		}
		System.out.println("Enter Set2 elements: ");
		for(int i=0;i<m;i++){
			int num=sc.nextInt();
			set2.add(num);
		}
		Set<Integer> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		Set<Integer> intersectionSet = new HashSet<>(set1);
		intersectionSet.retainAll(set2);
		System.out.println("Set 1 : "+ set1);
		System.out.println("Set 2 : "+ set2);
		System.out.println("Union of set1 and set2 : "+ unionSet);
		System.out.println("intersection of set1 and set2 : "+ intersectionSet);
	}
}

//Output: 
/*	D:\Java_FullStack_Internship>javac UnionAndIntrsec.java

	D:\Java_FullStack_Internship>java UnionAndIntrsec
	Enter no.of elememts in set1:
	4
	Enter no.of elememts in set2:
	3
	Enter Set1 elements:
	1 2 3 4
	Enter Set2 elements:
	4 5 6
	Set 1 : [1, 2, 3, 4]
	Set 2 : [4, 5, 6]
	Union of set1 and set2 : [1, 2, 3, 4, 5, 6]
	intersection of set1 and set2 : [4]		*/