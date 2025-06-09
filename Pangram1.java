import java.util.*;

class Pangram1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        sc.close(); 
        
        boolean res = checkPangram(s);
        System.out.println(s + (res ? " is a pangram" : " is not a pangram"));
    }

    public static boolean checkPangram(String s) {
        s = s.toLowerCase();
        Set<Character> set = new HashSet<>(); 
        
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        
        return set.size() == 26; 
    }
}