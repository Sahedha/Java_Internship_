import java.util.*;
class FiveStar{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			//spaces
			for(int k=1 ;k<=(n-i);k++){
				System.out.print(" ");
			}
			//stars
			for(int j=1; j<=(i+(i-1));j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//oUTPUT:D:\Java_FullStack_Internship>java FiveStar
/*Enter no of rows:
5
    *
   ***
  *****
 *******
*********

*/