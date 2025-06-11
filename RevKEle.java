// 🔹	Reverse first K elements of a queue. --> Use Deque to rotate

import java.util.*;
class RevKEle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements: ");
		int n=sc.nextInt();
		System.out.println("To which index should reverse :");
		int k=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++){
			al.add(sc.nextInt());
		}
		System.out.println("Before Reversing the elements elements: "+al);
		System.out.print("After Reversing first "+k+" elements: ");

		Rev(n, al, k);
		
	}
	public static void Rev(int n, ArrayList<Integer>al, int k){
		Deque<Integer> dq=new LinkedList<>();
		for(int i=0;i<k;i++){
			dq.add(al.get(i));
		}
		for(int i=0;i<k;i++){
			System.out.print(dq.pollLast()+" ");
		}
		for(int i=k;i<n;i++){
			System.out.print(al.get(i)+" ");
		}
		return;
	}
}
		
//O/P;
/*	D:\Java_FullStack_Internship>java RevKEle
	Enter no.of elements:
	6
	To which index should reverse :
	3
	Enter elements:
	1 2 3 4 5 6
	Before Reversing the elements elements: [1, 2, 3, 4, 5, 6]
	After Reversing first 3 elements: 3 2 1 4 5 6		*/
		 		