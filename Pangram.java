//?? String Pangram in java 

//Input:  a quickbrown fox jumps over a lazy dog

import java.util.*;
class Pangram{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input String: ");
		String str=sc.nextLine();
		sc.close();
		isPangram(str);
	}
	public static void isPangram(String str){
		String str1=str.trim().toLowerCase();
		Map<Character , Integer> hm=new HashMap<>();
		char arr[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(char x: str1.toCharArray()){
			 if (x >= 'a' && x <= 'z') {
				hm.put(x,hm.getOrDefault(x,0)+1);
			}
		}
		for(char i: arr){
			if(!hm.containsKey(i)){
				System.out.println("Given Input is not a PANAGRAM!!");
				return;
			}
		}
		System.out.println("Given Input string is a PANAGRAM!!");
	}
}
		