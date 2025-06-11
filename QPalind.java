// 🔹	Check if a string is a palindrome. - - > Compare front and rear.

import java.util.*;
class QPalind{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		isPalindrome(s);
	}
	public static void isPalindrome(String s){
		Deque<Character> dq=new LinkedList<>();
		for(char x: s.toCharArray()){
			dq.add(x);
		}
		while(dq.size() > 1){
			if(dq.pollFirst() != dq.pollLast()){
				System.out.println(s+" is not a Palindrome.");
				return;
			}
		}
		System.out.println(s+" is a Palindrome.");
	}
}

//Output:
/*	D:\Java_FullStack_Internship>javac QPalind.java

	D:\Java_FullStack_Internship>java QPalind
	Enter String:
	sushihsus
	sushihsus is a Palindrome.

	D:\Java_FullStack_Internship>java QPalind
	Enter String:
	hello
	hello is not a Palindrome.		*/