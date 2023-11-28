import java.util.*;
import java.lang.*;
public class patternAgain{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int m = 64 + n;
        int temp = 65;
        int count=2;
        for(int i = 1; i <= n; i++){
            if(i%2!=0){
                for(int j = 0; j < i; j++){
                    System.out.print(j+1);
                }
            System.out.println(" ");
            }else{
                for(int j = i; j > 0 ; j--){
                    System.out.print(j);
                }
            System.out.println(" ");
            }
        }
        System.out.println(" ");
        for(int i = 64; i < m; i++){
            for(int j = m-i; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = temp ; j > i; j--){
                if(temp==i){
                    break;
                }else{
                    System.out.print((char)j);
                }
            }
            temp=temp+count;
            count++;
            System.out.println(" ");
        }
    }
}