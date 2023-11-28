 import java.io.*;
import java.util.*;
 
class exp3_2
{
    public static void main(String args[])
    {
	Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
	String s=sc.nextLine();
	System.out.println("Enter the Character");
	char c=sc.next().charAt(0);
	int res = 0;
 
        for (int i=0; i<s.length(); i++)
        {
            
            if (s.charAt(i) == c)
            res++;
        }
        System.out.println(s+","+res);
     }
     
}
