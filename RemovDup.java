//Remove duplicates from a list while preserving order 

import java.util.*;
class RemovDup{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elememts:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		removeDuplc(arr,n);
	}
	public static void removeDuplc(int arr[],int n){
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();    //LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
		for(int i=0;i<n;i++){
			hs.add(arr[i]);
		}
		System.out.println("After Removing Duplicates: " + hs);
	}
}
				
//oUTPUT:

/*	D:\Java_FullStack_Internship>javac RemovDup.java

	D:\Java_FullStack_Internship>java RemovDup
	Enter no.of elememts:
	6
	Enter array elements:
	1 2 5 1 7 5
	After Removing Duplicates: [1, 2, 5, 7]	  */