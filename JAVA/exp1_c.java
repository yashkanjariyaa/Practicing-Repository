import java.util.*;
public class exp1_c{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}