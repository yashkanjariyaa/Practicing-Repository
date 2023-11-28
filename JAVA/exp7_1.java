import java.lang.*; 
class A {
    A() {
    super();
    }
    }
    class B extends A { 
        B() {
            super();
            System.out.println("In the Constructor of Class B");
        }
    
    B(int a, int b) {
    this();
    System.out.println("Addition of " + a + " + " + b + " = " + (a + b));
    }
    }
    class C extends B { 
        C() {
        super(10, 20);
        }
    C(int a) {
    this();// this() method is used to call the overloaded constructor of the same class System.out.println("Value of a = " + a);
    System.out.println(a);
    }
    }
    
    public class exp7_1 { 
        public static void main(String args[]) {
        C obj = new C(20);
    }
    }
    