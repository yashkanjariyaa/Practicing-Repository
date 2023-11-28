import java.util.*;

import javax.lang.model.util.ElementScanner14; 
class exp5_2 {
static float area(float s)
{
return(s*s);
}
static float area(float l,float b)
{
return(l*b);
}
 
public static void main(String parms[]) { 
int choice;
float n1,n2;
Scanner sc=new Scanner(System.in); System.out.println("1.Square\n2.Rectangle\nEnter your choice:");
choice=sc.nextInt(); 
if(choice==1)
{
System.out.println("Enter the side length "); 
n1=sc.nextFloat(); 
System.out.println("Area="+area(n1));
}
else if(choice==2)
{
System.out.println("Enter the length and breadth"); n1=sc.nextFloat();
n2=sc.nextFloat(); System.out.println("Area="+ area(n1,n2));
}
else
System.out.println("Invalid choice");
}
}
