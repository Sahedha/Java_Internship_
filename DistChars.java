// 🔹	Find all distinct characters in a string. --> Using Store in Set<Character>

import java.util.*;
class DistChars{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input string: " );
		String str=sc.nextLine();
		Set<Character> st = new LinkedHashSet<>();
		for(char ch : str.toCharArray()){
			st.add(ch);
		}
		System.out.println("The Distinct Characters in a given string is : "+ st);
	}
}

//Output:

/*	D:\Java_FullStack_Internship>javac DistChars.java

	D:\Java_FullStack_Internship>java DistChars
	Enter input string:
	programming
	The Distinct Characters in a given string is : [p, r, o, g, a, m, i, n]		*/