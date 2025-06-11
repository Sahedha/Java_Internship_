// 🔹 Print binary numbers from 1 to N. Using Queue to simulate number building

import java.util.*;
class BinaryNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number until you want to print Binary numbers: ");
		int n=sc.nextInt();
		bNum(n);
	}
	public static void bNum(int n){
		Queue<String> queue=new LinkedList<>();
		queue.add("1");
		for(int i=0;i<n;i++){
			String cur=queue.poll();
			System.out.println(cur);
			queue.add(cur +"0");
			queue.add(cur +"1");
		}
	}
}

/*O/P:
 D:\Java_FullStack_Internship>java BinaryNum
 Enter number until you want to print Binary numbers:
 1
 1

 D:\Java_FullStack_Internship>java BinaryNum
 Enter number until you want to print Binary numbers:
 5
 1
 10
 11
 100
 101		*/