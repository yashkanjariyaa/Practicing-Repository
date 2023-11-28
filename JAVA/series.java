import java.util.*;
import java.lang.*;
public class series{
    public static void main(String args[]){
        double sum = 0;
        int n = Integer.parseInt(args[0]);
        for( int i = 0; i < n; i++){
            sum += 1/Math.pow((i+1),2);
        }
        System.out.println(sum);
    }
}