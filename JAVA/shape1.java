import java.util.*;
import java.lang;
abstract class Shape{
    int a;
    int b;
    abstract void area();
}
class rectangle extends Shape {
    Scanner sc = new Scanner(System.in);
    void area(){
        System.out.println("Enter sides of rectangle");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Area of rectangle is "+(a*b));
    }
}
class triangle extends Shape {
    Scanner sc = new Scanner(System.in);
    void area(){
         System.out.println("Enter hieght and base of triangle");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Area of triangle is "+(a*b*0.5));
    }
}
class circle extends Shape {
    Scanner sc = new Scanner(System.in);
    void area(){
        System.out.println("Enter radius of circle");
        a = sc.nextInt();
        System.out.println("Area of circle is "+(a*a*3.14));
    }
}
public class shape1{
    public static void main(String args[]){
        rectangle rect = new rectangle();
        rect.area();
        triangle tri = new triangle();
        tri.area();
        circle cir = new circle();
        cir.area();
    }
}