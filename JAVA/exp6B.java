import java.util.*;
public class exp6B{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Yash Kanjariya");
System.out.println("Enter Marks");
int marks=sc.nextInt();
switch(marks/10)
{
case 10:System.out.println("Grade A");
break;
case 9:System.out.println("Grade A");
break;
case 8:System.out.println("Grade A");
break;
case 7:System.out.println("Grade B");
break;
case 6:System.out.println("Grade C");
break;
case 5:System.out.println("Grade D");
break;
case 4:System.out.println("Grade E");
break;
case 3:System.out.println("Fail");
break;
case 2:System.out.println("Fail");
break;
case 1:System.out.println("Fail");
break;
default:System.out.println("Enter valid marks");
}
}
}
