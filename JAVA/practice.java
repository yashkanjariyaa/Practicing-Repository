import java.util.*;
import java.lang.*;
class superClass {
    protected void finalize() throws Throwable{
        System.out.println("Objecte deleted");
    }
}
public class practice {
    public static void main(String[] args){
        superClass obj = new superClass();
        obj = null;
        System.gc();
    }
}