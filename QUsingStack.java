//🔹 Implement a queue using two stacks Stack logic, enqueue/dequeue

import java.util.*;
class QUsingStack{
	Stack<Integer> st1=new Stack<Integer>();
	Stack<Integer> st2=new Stack<Integer>();
	public void enqueue(int x){
		st1.add(x);
	}
	public int dequeue(){
		if(st2.isEmpty()){
			while(!st1.isEmpty()){
				st2.add(st1.pop());
			}
		}
		return(st2.isEmpty() ? -1 : st2.pop());
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		QUsingStack queue=new QUsingStack();
		System.out.println("Enter no.of Elements: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++){
			int num=sc.nextInt();
			queue.enqueue(num);
		}
		System.out.println("popped element from queue : "+queue.dequeue());
		queue.enqueue(5);
		System.out.println("popped element from queue : "+queue.dequeue());
	}
}
	
		
	
//Output:
/*	D:\Java_FullStack_Internship>javac QUsingStack.java

	D:\Java_FullStack_Internship>java QUsingStack
	Enter no.of Elements:
	5
	Enter 5 Elements:
	1
	3
	6
	8
	10
	popped element from queue : 1
	popped element from queue : 3	*/