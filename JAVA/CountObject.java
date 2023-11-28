
import java.util.*;
 public class CountObject {
    static int count=0;
    public CountObject(){
    count++;
    }
    static void display(){
    System.out.println("The number of objects are: "+count);
    }
    public static void main(String[] args) { CountObject obj1= new CountObject(); display();
    CountObject obj2=new CountObject(); display();
    CountObject obj3=new CountObject(); display();
    }
    }
    