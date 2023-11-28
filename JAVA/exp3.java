import java.util.*;
public class exp3{
	public static void main(String args[]){
int n1,n2,n3,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Yash Kanjariya");
		System.out.println("Enter the first number");
		n1 = sc.nextInt();
		System.out.println("Enter the second number");
		 n2 = sc.nextInt();
		System.out.println("Enter the third number");
		 n3 = sc.nextInt();
 max=(n1>=n2&&n1>=n3)?n1:(n2>=n1&&n2>=n3)?n2:n3;
System.out.println(max+"IS GREATEST");
}
}
