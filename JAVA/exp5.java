import java.util.*;
public class exp5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Yash Kanjariya");
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
System.out.println("Press 1 for addition");
System.out.println("Press 2 for subtraction");
System.out.println("Press 3 for multiplication");
System.out.println("Press 4 for division");
System.out.println("Enter choice");
int choice = sc.nextInt();
switch(choice)
{
case 1:System.out.println(n1+n2);
break;
case 2:System.out.println(n1-n2);
break;
case 3:System.out.println(n1*n2);
break;
case 4:System.out.println(n1/n2);
break;
default:
System.out.println("not valid");
}}}
