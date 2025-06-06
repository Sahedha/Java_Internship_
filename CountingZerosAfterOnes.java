//2) Counting Zeros after ones

//1)Using Nested Loop: O(n^2)
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the array elements (0/1)");
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int count =0;
       for(int i=0;i<n;i++){
           if(arr[i] == 1){
               for(int j=i+1;j<n;j++){
                   if(arr[j] ==0){
                       count++;
                   }
               }
           }
       }
       
       System.out.println("Zeros count is:"+count);
    }
}
