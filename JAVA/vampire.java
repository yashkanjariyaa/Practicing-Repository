import java.util.*;
    public class vampire{
        public static void main(String[] args){
            int n, count=0;
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            while(n>0){
                n/=10;
                count++;
            }
            char[] digits = String.valueOf(n).toCharArray();
            System.out.println(count);
            for(int i = 0; i<n; i++){
                System.out.println(digits[i]);
            }     
        }
    }