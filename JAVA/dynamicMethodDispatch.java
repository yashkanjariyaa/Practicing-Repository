import java.util.*;
import java.lang;
class A {
    void method(){
        System.out.println("This is method of class A");
    }
}
class B extends A {
    void method(){
        System.out.println("This is method of class B");
    }
}
public class dynamicMethodDispatch{
    public static void main(String args[]){
        A obj = new B();
        obj.method();
    }
}