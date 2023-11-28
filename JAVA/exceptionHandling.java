import java.util.*;
import java.lang.*;
public class exceptionHandling{
    public static void main(String args[]){
        int a = 10, b = 9, c= 0;
        int calc;
        int[] myArray = {1,2,3,4};
        try {
            calc = a*b/c;
            System.out.println(calc); 
        }catch(ArithmeticException e){
            System.out.println(e);
        }try{
            for(int i = 0; i< 6; i++){
                System.out.println(myArray[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            int x = Integer.parseInt(null);
            System.out.println(x);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}