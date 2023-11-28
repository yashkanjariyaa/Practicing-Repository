
import java.util.*;
import java.util.Vector; 
public class exp4_1 {
public static void main(String[] args) { 
    Vector<String>v=new Vector<String>(); 
    for(int i=0;i<=args.length-1;i++)
    {
        v.addElement(args[i]);
    }
    for(int i=0;i<=v.size()-1;i++)
    {
        System.out.println(v.elementAt(i));
    }
    }
}
