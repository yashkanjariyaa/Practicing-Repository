import java.util.*;
public class Complex{
    float r,i;
    public Complex add(Complex c2){
        Complex c3 = new Complex();
        c3.r = c2.r + r;
        c3.i = c2.i + i;
        return c3;
    }
    public Complex sub(Complex c2){
        Complex c4 = new Complex();
        c4.r = c2.r - r;
        c4.i = c2.i - i;
        return c4;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        System.out.println("Enter real part and imaginary part of your first complex number");
        c1.r = sc.nextInt();
        c1.i = sc.nextInt();
        System.out.println("Enter real part and imaginary part of your second complex number");
        c2.r = sc.nextInt();
        c2.i = sc.nextInt();
        System.out.print("1 for add, 2 for sub");
        int operator = sc.nextInt();
        if(operator == 1){
            Complex c3 = c1.add(c2);
            System.out.println(c3.r+"+i("+c3.i+")");
        }else if(operator == 2){
            Complex c4 = c1.sub(c2);
            System.out.println(c4.r+"+i("+c4.i+")");
        }
    }
}