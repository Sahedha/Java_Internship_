import java.util.*;
class NNConsec{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		countConseq(arr, n);
	}
	public static void countConseq(int arr[], int n){
		int i=0, j=i+1;
		int cc=0;
		//if(arr[i]==1){
		//	cc=1;
		//	i=j; j++;
		//}
		while(i<n){
			int num=arr[i];
			int numCount=1;
			for(int k=1;k<num;k++){
				if(j<n && arr[i] == arr[j]){
					j++;
					numCount++;
				}
			}
			if(numCount == num){
				cc++;
			}
			i=j; j++;
		}
		System.out.println("Total count of consequtive blocks of identical length is: "+cc);
	}
}


//Output: /*D:\Java_FullStack_Internship>java NNConsec
/*	Enter no.of elements:
	11
	Enter array elements:
	2 3 3 3 2 2 6 4 4 4 4
	Total count of consequtive blocks of identical length is: 3		*/
/*	D:\Java_FullStack_Internship>javac NNConsec.java

	D:\Java_FullStack_Internship>java NNConsec
	Enter no.of elements:
	16
	Enter array elements:
	1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6
	Total count of consequtive blocks of identical length is: 5		*/
			
