import java.util.*;
    public class exp1_f{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            float sum = 0;
            for(int i = 1; i<=n ; i++){
                float product = i*i;
                sum = sum + (1/(product));
            }
            System.out.println(sum);
        }
    }