
import java.util.*; public class Shape {
    int s; float l,b;
    public static void main(String[] args) { 
        Shape s=new Shape();
        Shape s1=new Shape(6);
        Shape s2=new Shape(2.1f,5.1f); 
        Shape s3=new Shape(s2);
    }
    Shape(){
        Scanner sc=new Scanner(System.in); System.out.println("Enter the side of the square: "); int s=sc.nextInt();
        System.out.println("The area of square: "+(s*s));
    }
    Shape(int a){ 
        s=a;
        System.out.println("The area of square= "+(s*s));
    }
    Shape(float x,float y){ 
        l=x;
        b=y;
        System.out.println("Area of the recttangle= "+(l*b));
    }
        Shape(Shape s2){ 
            l=s2.l;
             b=s2.b;
        System.out.println("Area of rectangle= "+(l*b));
    }
    
    }
    