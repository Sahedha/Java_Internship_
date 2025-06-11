// 🔹	Find duplicate elements in an array. Using  Check set.contains() before adding.

import java.util.*;
class DupInArr{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elememts:");
		int n=sc.nextInt();
		Integer arr[]=new Integer[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Duplicates in given array : "+duplicates(arr,n));
	}
	public static ArrayList<Integer> duplicates(Integer arr[], int n){
		Set<Integer> lhs=new LinkedHashSet<>(Arrays.asList(arr));
		ArrayList<Integer> res=new ArrayList<>();
		for(int x : arr){
			if(lhs.contains(x)){
				lhs.remove(x);
			}
			else{
				res.add(x);
			}
		}
		return res;
	}
}

//Set<Integer> seen = new HashSet<>();
//Set<Integer> duplicates = new LinkedHashSet<>(); // Preserves order

//for (int num : arr) {
//    if (!seen.add(num)) { // If already seen, it's a duplicate
 //       duplicates.add(num);
  //  }
//}
				
//Output: 
/*	D:\Java_FullStack_Internship>javac DupInArr.java

	D:\Java_FullStack_Internship>java DupInArr
	Enter no.of elememts:
	7
	Enter array elements:
	2 5 6 2 4 5 7
	Duplicates in given array : [2, 5] 	*/