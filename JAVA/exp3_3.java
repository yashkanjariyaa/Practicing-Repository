import java.util.Scanner;
class exp3_3
{
public static void main(String arg[])
{
String str,strrev="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string :");
str=sc.next();
for(int i=str.length()-1;i>=0;i--)
{
strrev=strrev+str.charAt(i);
}
System.out.println("Reverse of a string is : "+strrev);
if(strrev.equalsIgnoreCase(str))
System.out.println("Entered string is palindrome");
else
System.out.println("Entered string is not a palindrome number ");
}
}

