//Pattern Triangle LEFT
import java.util.*;

class Star{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n = sc.nextInt();
		

		for(int i=1;i<=n;i++){

			//spaces
			for(int k=1 ;k<=n-i;k++){
				System.out.print(" ");
			}
			
			//stars
			for(int j=1; j<=i;j++){
				System.out.print("*");
			
			}

			System.out.println();

		}
		


	}



}

/*OUTPUT:

D:\Java_FullStack_Internship>java Star
Enter no of rows:
4
   *
  **
 ***
****

*/