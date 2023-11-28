import Desktop.packages.vol;
import java.util.*;
import java.lang.*;
public class cylinder2 {
    public static void main(String args[]){
        double l, r;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter height and radius of cylinder");
        l = sc.nextDouble();
        r = sc.nextDouble();
        Cylinder obj = new Cylinder(l,r);
        System.out.println(obj.display());
    }
}