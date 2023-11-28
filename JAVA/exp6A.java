import java.util.*;
public class exp6A{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Yash Kanjariya");
System.out.println("Enter Percentage");
double percentage = sc.nextDouble();
if(percentage>=90)
{
System.out.println("Excellent: Grade A");
}
else if(percentage<90 &&percentage>=80)
{
System.out.println("Grade B");
}
else if(percentage<80 && percentage>=70)
{
System.out.println("Grade C");
}
else if(percentage<70 && percentage>=60)
{
System.out.println("Grade D");
}
else if(percentage<60 && percentage>=50)
{
System.out.println("Grade E");
}
else
{
System.out.println("Failed");
}}}
