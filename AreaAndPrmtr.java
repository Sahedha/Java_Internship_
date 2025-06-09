//Calculating Area and Perimeter of a Triangle

import java.util.*;
class AreaAndPrmtr{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 sides of Triangle: ");
	double a=sc.nextInt();
	double b=sc.nextInt();
	double c=sc.nextInt();
	System.out.println("Perimeter of Triangle is : " +(a+b+c));
	double sp=((a+b+c)/2);
	System.out.println("Area of Triangle is :  "+ Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c)));
	}
}

/* Output:

D:\Java_FullStack_Internship>javac AreaAndPrmtr.java

D:\Java_FullStack_Internship>java AreaAndPrmtr
Enter 3 sides of Triangle:
3
4
3
Perimeter of Triangle is : 10.0
Area of Triangle is :  4.47213595499958

*/