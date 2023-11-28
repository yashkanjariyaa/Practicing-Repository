import java.util.*;
import java.lang.*;
public class count {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        if(count>=10){
            System.out.println("error");
        }else{
        System.out.println(count);
        }
    }
}